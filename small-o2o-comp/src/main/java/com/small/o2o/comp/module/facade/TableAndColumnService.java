package com.small.o2o.comp.module.facade;


import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import com.small.o2o.comp.module.exception.QueryException;
import com.small.o2o.comp.module.service.ob.ObMetaDataService;
import com.small.o2o.comp.module.service.oracle.OracleMetaDataService;
import com.small.o2o.comp.module.vo.ObTableInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

@Slf4j
@Service
public class TableAndColumnService {

    @Autowired
    private ObMetaDataService obMetaDataService ;
    @Autowired
    private OracleMetaDataService oracleMetaDataService ;


    /**
     * 找出OB 有但是 oracle 沒有的表
     */
    public List<String> chaBiao_ObMore(){
        List<String> obNames = new ArrayList<>();
        List<String> oraNames = new ArrayList<>();

        List<ObTableInfoVO> obObjList = obMetaDataService.queryTableInfo("");
        List<ObTableInfoVO> oraObjList = oracleMetaDataService.queryTableInfo("");

        obObjList.stream().forEach(p->obNames.add(p.getTableName()));
        oraObjList.stream().forEach(p->oraNames.add(p.getTableName()));

        obNames.removeAll(oraNames);

        obNames.forEach(System.out::println);
        return obNames ;
    }


    /**
     * 找出oracle 有但是 ob 沒有的表
     */
    public List<String> chaBiao_OracleMore(){
        List<String> obNames = new ArrayList<>();
        List<String> oraNames = new ArrayList<>();

        List<ObTableInfoVO> obObjList = obMetaDataService.queryTableInfo("");
        List<ObTableInfoVO> oraObjList = oracleMetaDataService.queryTableInfo("");

        obObjList.stream().forEach(p->obNames.add(p.getTableName()));
        oraObjList.stream().forEach(p->oraNames.add(p.getTableName()));

        oraNames.removeAll(obNames);

        oraNames.forEach(System.out::println);
        return oraNames ;
    }

    /**
     * 提取差表SQL
     */
    public void chaBiaoSQL(String type){
        List<String> chaBiao = new ArrayList<>();
        switch (type){
            case "ob":
                chaBiao = chaBiao_ObMore();
                break;
            case "90":
                chaBiao = chaBiao_90();
                type = "chayi-90";
                break;
            default:
                type = "oracle";
                chaBiao = chaBiao_OracleMore();
        }

        List<String> sqlList = new ArrayList<>();

        List<String> newList = chaBiao.stream().distinct().collect(Collectors.toList());
        for (String tableName : newList) {
            getSQLTable(tableName, sqlList);
        }
        //getSQLTable(chaBiao.get(0), sqlList);

        String target = "E:\\obgenerator\\AMSDB01\\ChaBiao-"+type+"-20230106.sql";
        File file = new File(target);
        if (file.exists()){file.delete() ;}
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.appendLines(sqlList);
        //sqlList.clear();
    }

    private List<String> chaBiao_90() {
        String path = "E:\\obgenerator\\chayi.txt";

        File file = new File(path);
        FileReader reader = new FileReader(file);
        List<String> allLines = reader.readLines();
        return allLines;
    }

    public void getSQLTable(String tableName, List<String> sqlList){
        String path = "E:\\obgenerator\\AMSDB01\\TABLE-schema.sql";

        File file = new File(path);
        if (!file.exists()){
            throw new QueryException("找不到文件！");
        }
        FileReader reader = new FileReader(file);
        List<String> allLines = reader.readLines();

        sqlList.add(" -- 表 "+tableName);
        StringBuilder sb = new StringBuilder("");
        AtomicBoolean isTable = new AtomicBoolean(false);
        int index = 0 ;
        for (String  l: allLines){
            index++;
            if (l.trim().equals("")){
                continue;
            }
            if (isTable.get() && l.endsWith(";")){
                sb.append("\n").append(l);
                isTable.set(false);
                System.out.println(sb.toString());
                sqlList.add(sb.toString());
                sb.setLength(0);
            }

            if (isTable.get()){
                sb.append("\n").append(l);
            }
            if (61375==index){
                System.out.println(l);
            }
            if (l.toUpperCase().contains(tableName.toUpperCase())){
                //System.out.println(l);
                sb.append(l);
                isTable.set(true);
            }

        };


    }
}
