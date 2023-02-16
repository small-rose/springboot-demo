package com.small.o2o.comp.module.facade;


import cn.hutool.core.io.file.FileReader;
import com.small.o2o.comp.module.constants.OBConstants;
import com.small.o2o.comp.module.exception.QueryException;
import com.small.o2o.comp.module.service.ob.ObMetaDataService;
import com.small.o2o.comp.module.vo.ObProcedureVO;
import com.small.o2o.comp.module.vo.ObTableInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Slf4j
@Service
public class CompareMetaDataService {

    @Autowired
    private ObMetaDataService obMetaDataService ;

    public void compareTable(){
        // 数据库里的表
        List<ObTableInfoVO> tableInfo = obMetaDataService.queryTableInfo(OBConstants.SheetNameEnum.TABLE_INFO.getCode());

        Map<String, String> collect = tableInfo.stream().collect(Collectors.toMap(ObTableInfoVO::getTableName, ObTableInfoVO::getTableName, (key1, key2) -> key2));
        List<String> dbTableList= new ArrayList<>(collect.keySet());

        List<String> sqlTables = new ArrayList<>();
        getSQLTable(sqlTables);
        System.out.println("SQL 表数据量" + sqlTables.size());
        System.out.println("AMS 表数据量" + dbTableList.size());
        List<String> retainTables = new ArrayList<>(sqlTables);
        retainTables.removeAll(dbTableList);
        System.out.println("表相差数据" + retainTables.size());
        retainTables.forEach(System.out::println);

        getTableSQL(retainTables);
    }



    public void compareProcedures(){
        // 数据库里的表
        List<ObProcedureVO> tableInfo = obMetaDataService.queryProcedureVO(OBConstants.SheetNameEnum.PACKAGE.getCode());

        Map<String, String> collect = tableInfo.stream().collect(Collectors.toMap(ObProcedureVO::getObjectName, ObProcedureVO::getObjectName, (key1, key2) -> key2));
        List<String> dbTableList= new ArrayList<>(collect.keySet());

        List<String> sqlTables = new ArrayList<>();
        getSQLPackageBody(sqlTables);
        System.out.println("SQL 存过包数据量" + sqlTables.size());
        System.out.println("AMS 存过包数据量" + dbTableList.size());
        List<String> retainTables = new ArrayList<>(dbTableList);
        retainTables.removeAll(sqlTables);
        System.out.println("存过包相差数据" + retainTables.size());
        retainTables.forEach(System.out::println);

    }



    public static String PACKAGE_BODY = "PACKAGE BODY ";
    public static String PROCEDURE = "PROCEDURE ";

    public void getSQLPackageBody(List<String> packageList){
        String path = "E:\\obgenerator\\AMSDB01\\PACKAGE BODY-schema.sql";
        File file = new File(path);
        if (!file.exists()){
            throw new QueryException("找不到文件！");
        }
        FileReader reader = new FileReader(file);
        List<String> allLines = reader.readLines();
        //List<String> tableList = new ArrayList<>();
        AtomicInteger countBody = new AtomicInteger(0);

        allLines.forEach(l->{
            if ( l.toUpperCase().contains(PACKAGE_BODY)){
                countBody.incrementAndGet();
            }


            String packageName = "";
            if (l.toUpperCase().contains(PACKAGE_BODY)){
                packageName = l.toUpperCase().substring(l.toUpperCase().indexOf(PACKAGE_BODY) + PACKAGE_BODY.length(), l.toUpperCase().indexOf(" IS"));
                System.out.println(l);
                packageName = packageName.replaceAll("\"", "");
                packageName = packageName.trim();
                System.out.println("packageName = " +packageName);
                packageList.add(packageName);
            }
        });

    }


    public void getSQLTable(List<String> tableList){
        String path = "E:\\obgenerator\\AMSDB01\\TABLE-schema.sql";
        File file = new File(path);
        if (!file.exists()){
            throw new QueryException("找不到文件！");
        }
        FileReader reader = new FileReader(file);
        List<String> allLines = reader.readLines();
        //List<String> tableList = new ArrayList<>();
        allLines.forEach(l->{
            if (l.toUpperCase().contains("CREATE TABLE")){
                //System.out.println(l);
                String tableName = l.replaceAll("CREATE TABLE \"AMSDB01\".\"","");
                tableName = tableName.replaceAll("\" \\(","");
                //System.out.println(tableName);
                tableList.add(tableName);
            }
        });

    }


    public void getTableSQL(List<String> tableList){
        String path = "E:\\obgenerator\\AMSDB01\\TABLE-schema.sql";
        File file = new File(path);
        if (!file.exists()){
            throw new QueryException("找不到文件！");
        }
        FileReader reader = new FileReader(file);
        List<String> allLines = reader.readLines();
        //List<String> tableList = new ArrayList<>();
        StringBuilder tableSQL = new StringBuilder("");
        allLines.forEach(l->{

            if (tableSQL.length()>1 && l.endsWith(");")){
                tableSQL.append(l);
                System.out.println(tableSQL);
                tableSQL.setLength(0);
            }
            if (tableSQL.length()>1){
                tableSQL.append(l);
            }
            if (l.toUpperCase().contains("CREATE TABLE")){
                //System.out.println(l);
                String tableName = l.replaceAll("CREATE TABLE \"AMSDB01\".\"","");
                tableName = tableName.replaceAll("\" \\(","");
                if (tableList.contains(tableName)){
                    tableSQL.append(l);
                }
            }
            if (l.toUpperCase().contains("CREATE INDEX")){
                //System.out.println(l);
                tableSQL.append(l);
            }
            if (l.toUpperCase().contains("CREATE INDEX")){
                //System.out.println(l);
                tableSQL.append(l);
            }
        });

    }
}
