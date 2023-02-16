package com.small.o2o.comp.module.service.metadata;


import com.small.o2o.comp.module.facade.FilePickService;
import com.small.o2o.comp.module.service.ob.ObMetaDataService;
import com.small.o2o.comp.module.service.oracle.OracleMetaDataService;
import com.small.o2o.comp.module.utils.FileRWUtils;
import com.small.o2o.comp.module.vo.ObTableInfoVO;
import com.small.o2o.comp.module.vo.ObTablePrimaryKeyVO;
import com.small.o2o.comp.module.vo.OracleTablePrimaryKeyVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author xiaocai
 */
@Slf4j
@Service
public class TablePrimaryKeyService {

    @Autowired
    private ObMetaDataService obMetaDataService;
    @Autowired
    private OracleMetaDataService oracleMetaDataService;
    @Autowired
    private FilePickService filePickService;

    String DROP_DDL = "ALTER TABLE %s DROP CONSTRAINT %S;";
    String ADD_DDL = "ALTER TABLE %s ADD CONSTRAINT %s PRIMARY KEY( %s );";


    /**
     * 表索引对比
     *
     * @return
     */
    public List<OracleTablePrimaryKeyVO> getTablePrimaryKey(String mytableName) {

        List<OracleTablePrimaryKeyVO> resultList = new ArrayList<>();

        List<String> tableList = new ArrayList<>();
        List<String> ddlList = new ArrayList<>();

        boolean onlychayi = false;
        if (onlychayi){
            //tableList = filePickService.getChayiListTable();
        }else{
            List<ObTableInfoVO> obObjList2 = obMetaDataService.queryTableInfo(mytableName);;
            for (ObTableInfoVO tableInfoVO : obObjList2) {
                tableList.add(tableInfoVO.getTableName());
            }
        }


        // 146张不要的表
        List<String> table = filePickService.get146Table();
        Map<String, String> tableMap = new HashMap<>();
        for (String t : table) {
            tableMap.put(t,t);
        }
        int i = 0 ;
        for (String tableName : tableList) {

            if (tableMap.get(tableName)!=null){
                continue;
            }
            List<ObTablePrimaryKeyVO> obObjList = obMetaDataService.queryTablePrimaryKeyVO(tableName);
            List<ObTablePrimaryKeyVO> oraObjList = oracleMetaDataService.queryTablePrimaryKeyVO(tableName);
            System.out.println(i+" Table primary key  "+tableName+"  ob primarykey " +obObjList.size() +" oracle primarykey " +oraObjList.size());
            i++;
            if (obObjList.size()==0 && oraObjList.size()==0){
                continue;
            }
            List<String> allIndexs = new ArrayList<>();

            Map<String, ObTablePrimaryKeyVO> obObjMap = obObjList.stream().collect(
                    Collectors.toMap(ObTablePrimaryKeyVO::getConstraintName, (p) -> p));

            Map<String, ObTablePrimaryKeyVO> oracleObjMap = oraObjList.stream().collect(
                    Collectors.toMap(o -> o.getConstraintName(), Function.identity()));

            for (ObTablePrimaryKeyVO p : oraObjList) {
                if (!allIndexs.contains(p.getConstraintName())) {
                    allIndexs.add(p.getConstraintName());
                }
            }
            for (ObTablePrimaryKeyVO p : obObjList) {
                if (!allIndexs.contains(p.getConstraintName())) {
                    allIndexs.add(p.getConstraintName());
                }
            }

            OracleTablePrimaryKeyVO object = null;
            int indexNo = 1;
            for (String n : allIndexs) {
                object = new OracleTablePrimaryKeyVO();
                object.setNo(String.valueOf(indexNo));
                object.setNo2(String.valueOf(indexNo));

                ObTablePrimaryKeyVO tmpob = obObjMap.get(n);
                ObTablePrimaryKeyVO tmpora = oracleObjMap.get(n);
                //if (obList.size() > 0){
                if (tmpob != null) {
                    ObTablePrimaryKeyVO ob = tmpob;
                    object.setTableName(ob.getTableName());
                    object.setConstraintName(ob.getConstraintName());
                    object.setColumnName(ob.getColumnName());

                }
                if (tmpora != null) {
                    ObTablePrimaryKeyVO oracle = tmpora;
                    object.setTableName2(oracle.getTableName());
                    object.setConstraintName2(oracle.getConstraintName());
                    object.setColumnName2(oracle.getColumnName());
                }

                // ORACLE 有， OB 沒有，--有能是名字不一样
                if (tmpora!=null && tmpob==null){
                    String ddl = String.format(DROP_DDL, tmpora.getTableName(), tmpora.getConstraintName());
                    ddlList.add(ddl);
                    object.setSql(ddl);
                }
                // ORACLE 没有有， OB 有，--有能是名字不一样，直接修改主键名称
                if (tmpora==null && tmpob!=null){
                    String ddl = String.format(ADD_DDL, tmpob.getTableName(), tmpob.getConstraintName(), tmpob.getColumnName());
                    ddlList.add(ddl);
                    object.setSql(ddl);
                }

                if (tmpora!=null && tmpob!=null){
                    if (tmpob.getTableName().equals(tmpora.getTableName()) &&
                    tmpob.getConstraintName().equals(tmpora.getConstraintName()) &&
                    !tmpob.getColumnName().equals(tmpora.getColumnName())){
                        String ddld = String.format(DROP_DDL, tmpora.getTableName(), tmpora.getConstraintName());
                        ddlList.add(ddld);
                        String ddla = String.format(ADD_DDL, tmpob.getTableName(), tmpob.getConstraintName(), tmpob.getColumnName());
                        ddlList.add(ddla);
                        object.setSql(ddld + ddla);
                    }

                }
                resultList.add(object);
                indexNo++;
            }
            allIndexs.clear();
        }

        String path = "E:\\obgenerator\\ORA_DDL_PRIMARY_KEY.SQL";
        FileRWUtils.fileWriter(path, ddlList);
        return resultList;
    }


}
