package com.small.o2o.comp.module.service.metadata;


import com.small.o2o.comp.module.facade.FilePickService;
import com.small.o2o.comp.module.service.ob.ObMetaDataService;
import com.small.o2o.comp.module.service.oracle.OracleMetaDataService;
import com.small.o2o.comp.module.utils.FileRWUtils;
import com.small.o2o.comp.module.vo.IndexExpressions;
import com.small.o2o.comp.module.vo.ObTableIndexVO;
import com.small.o2o.comp.module.vo.ObTableInfoVO;
import com.small.o2o.comp.module.vo.OracleTableIndexVO;
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
public class TableIndexService {

    @Autowired
    private ObMetaDataService obMetaDataService;
    @Autowired
    private OracleMetaDataService oracleMetaDataService;
    @Autowired
    private FilePickService filePickService;

    String DROP_DDL = "DROP INDEX %s  ;";
    String ADD_DDL = "CREATE %s INDEX %s ON %s ( %s ) tablespace AMS_DATA  pctfree 10  initrans 2 maxtrans 255 storage (  initial 64K next 1M minextents 1 maxextents unlimited );";
    /**
     * 表索引对比
     *
     * @return
     */
    public List<OracleTableIndexVO> getTableIndexs(String mytableName) {
        List<String> ddlList = new ArrayList<>();
        List<OracleTableIndexVO> resultList = new ArrayList<>();

        List<String> tableList = new ArrayList<>();

        boolean onlychayi = false;
        if (onlychayi){
            //tableList = filePickService.getChayiListTable();
        }else{
            List<ObTableInfoVO> obObjList2 = obMetaDataService.queryTableInfo(mytableName);;
            for (ObTableInfoVO tableInfoVO : obObjList2) {
                tableList.add(tableInfoVO.getTableName());
            }
        }
        List<IndexExpressions> obieList = obMetaDataService.queryTableIndexExpressions("");
        List<IndexExpressions> oraieList = oracleMetaDataService.queryTableIndexExpressions("");
        Map<String, String> obFunIndexMap = obieList.stream().collect(
                Collectors.toMap(IndexExpressions::getIndexName, IndexExpressions::getColumnExpression));
        Map<String, String> oracleFunIndexMap = oraieList.stream().collect(
                Collectors.toMap(IndexExpressions::getIndexName, IndexExpressions::getColumnExpression));

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
            List<ObTableIndexVO> obObjList = obMetaDataService.queryTableIndexVO(tableName);
            List<ObTableIndexVO> oraObjList = oracleMetaDataService.queryTableIndexVO(tableName);
            System.out.println(i+" Table "+tableName+"  ob indexs " +obObjList.size() +" oracle indexs " +oraObjList.size());
            i++;
            if (obObjList.size()==0 && oraObjList.size()==0){
                continue;
            }
            List<String> allIndexs = new ArrayList<>();

            Map<String, ObTableIndexVO> obObjMap = obObjList.stream().collect(
                    Collectors.toMap(o -> o.getIndexName(), (p) -> p));

            Map<String, ObTableIndexVO> oracleObjMap = oraObjList.stream().collect(
                    Collectors.toMap(o -> o.getIndexName(), Function.identity()));

            for (ObTableIndexVO p : oraObjList) {
                if (!allIndexs.contains(p.getIndexName())) {
                    allIndexs.add(p.getIndexName());
                }
            }
            for (ObTableIndexVO p : obObjList) {
                if (!allIndexs.contains(p.getIndexName())) {
                    allIndexs.add(p.getIndexName());
                }
            }


            OracleTableIndexVO object = null;
            int indexNo = 1;
            for (String n : allIndexs) {
                object = new OracleTableIndexVO();
                object.setNo(String.valueOf(indexNo));
                object.setNo2(String.valueOf(indexNo));

                ObTableIndexVO tmpob = obObjMap.get(n);
                ObTableIndexVO tmpora = oracleObjMap.get(n);
                //if (obList.size() > 0){
                if (tmpob != null) {
                    ObTableIndexVO ob = tmpob;
                    object.setTableName(ob.getTableName());
                    object.setIndexName(ob.getIndexName());
                    object.setColumnName(ob.getColumnName());
                    if (ob.getIndexType()!=null && ob.getIndexType().startsWith("FUNCTION-")){
                        String columnName = obFunIndexMap.get(ob.getIndexName());
                        String result = ob.getColumnName().replaceAll("SYS_NC\\d+\\$", columnName);
                        object.setColumnName(result);
                    }
                    object.setIndexType(ob.getIndexType());
                    object.setUniqueness(ob.getUniqueness());
                }
                if (tmpora != null) {
                    ObTableIndexVO oracle = tmpora;
                    object.setTableName2(oracle.getTableName());
                    object.setIndexName2(oracle.getIndexName());
                    object.setColumnName2(oracle.getColumnName());
                    if (oracle.getIndexType()!=null && oracle.getIndexType().startsWith("FUNCTION-")){
                        String columnName = oracleFunIndexMap.get(oracle.getIndexName());
                        String result = object.getColumnName2().replaceAll("SYS_NC\\d+\\$", columnName);
                        object.setColumnName2(result);
                    }
                    object.setIndexType2(oracle.getIndexType());
                    object.setUniqueness2(oracle.getUniqueness());
                }


                // ORACLE 有， OB 沒有，--有能是名字不一样
                if (tmpora!=null && tmpob==null){
                    String ddl = String.format(DROP_DDL, tmpora.getIndexName());
                    ddlList.add(ddl);
                    object.setSql(ddl);
                }
                // ORACLE 没有， OB 有，--有能是名字不一样，直接修改主键名称
                if (tmpora==null && tmpob!=null){
                    String unique = "UNIQUE".equals(tmpob.getUniqueness()) ? tmpob.getUniqueness() : "";
                    String ddl = String.format(ADD_DDL, unique, tmpob.getIndexName(), tmpob.getTableName(), object.getColumnName());
                    ddlList.add(ddl);
                    object.setSql(ddl);
                }

                if (tmpora!=null && tmpob!=null){
                    if (tmpob.getTableName().equals(tmpora.getTableName()) &&
                            tmpob.getIndexName().equals(tmpora.getIndexName()) &&
                            !tmpob.getColumnName().equals(tmpora.getColumnName())){
                        String ddld = String.format(DROP_DDL, tmpora.getIndexName());
                        ddlList.add(ddld);
                        String unique = "UNIQUE".equals(tmpora.getUniqueness()) ? tmpora.getUniqueness() : "";
                        String ddla = String.format(ADD_DDL, unique, tmpob.getIndexName(), tmpob.getTableName(), object.getColumnName());
                        ddlList.add(ddla);
                        object.setSql(ddld + ddla);
                    }

                }
                resultList.add(object);
                indexNo++;
            }
            allIndexs.clear();
        }

        String path = "E:\\obgenerator\\ORA_DDL_INDEX.SQL";
        FileRWUtils.fileWriter(path, ddlList);
        return resultList;
    }


}
