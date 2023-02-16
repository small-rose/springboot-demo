package com.small.o2o.comp.module.service.metadata;


import com.small.o2o.comp.module.facade.FilePickService;
import com.small.o2o.comp.module.service.ob.ObMetaDataService;
import com.small.o2o.comp.module.service.oracle.OracleMetaDataService;
import com.small.o2o.comp.module.vo.ObTableColumnFullVO;
import com.small.o2o.comp.module.vo.ObTableInfoVO;
import com.small.o2o.comp.module.vo.OracleTableColumnFullVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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
public class TableColumnService {

    @Autowired
    private ObMetaDataService obMetaDataService;
    @Autowired
    private OracleMetaDataService oracleMetaDataService;
    @Autowired
    private FilePickService filePickService;



    String DDL_ADD = "ALTER TABLE %s ADD %s %s %s;";
    String DDL_MODIFY = "ALTER TABLE %s MODIFY %s %s ";
    /**
     * 表的列对比
     *
     * @return
     */
    public List<OracleTableColumnFullVO> getTableColumnFulls(String mytableName, boolean onlychayi) {
        List<String> ddlList = new ArrayList<>();
        String ddlpath = "E:\\obgenerator\\ora_ddl.sql";

        List<OracleTableColumnFullVO> resultList = new ArrayList<>();
        //List<String> tableList = allTables;//getAllTables();
        List<String> tableList = new ArrayList<>();


        if (onlychayi){
            tableList = filePickService.getChayiListTable();
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
        List<String> allNames = new ArrayList<>();
        int tableNo = 1;
        OracleTableColumnFullVO object = null;
        StringBuilder sb = new StringBuilder("");
        for (String tableName : tableList) {

            List<ObTableColumnFullVO> obObjList = obMetaDataService.queryTableColmnFullVO(tableName);
            List<ObTableColumnFullVO> oraObjList = oracleMetaDataService.queryTableColmnFullVO(tableName);

            Map<String, ObTableColumnFullVO> obObjMap = obObjList.stream().collect(
                    Collectors.toMap(o -> o.getTableName().concat(o.getColumnName()), (p) -> p));

            Map<String, ObTableColumnFullVO> oracleObjMap = oraObjList.stream().collect(
                    Collectors.toMap(o -> o.getTableName().concat(o.getColumnName()), Function.identity()));

            for (ObTableColumnFullVO p : obObjList) {
                allNames.add(p.getTableName().concat(p.getColumnName()));
            }
            for (ObTableColumnFullVO p : oraObjList) {
                if (!allNames.contains(p.getTableName().concat(p.getColumnName()))) {
                    allNames.add(p.getTableName().concat(p.getColumnName()));
                }
            }

            int indexNo = 1;
            log.info("{} Table - {} 取并集Column 大小为 {}", tableNo, tableName, allNames.size());
            tableNo++;
            for (String n : allNames) {
                object = new OracleTableColumnFullVO();

                ObTableColumnFullVO tmpob = obObjMap.get(n);
                ObTableColumnFullVO tmpora = oracleObjMap.get(n);
                //if (obList.size() > 0){
                if (tmpob != null) {
                    ObTableColumnFullVO ob = tmpob;
                    object.setTableName(ob.getTableName());
                    object.setColumnName(ob.getColumnName());
                    object.setDataType(ob.getDataType());
                    object.setExtend(ob.getExtend());
                    object.setNullable(ob.getNullable());
                    object.setDataDefault(ob.getDataDefault());
                    tableName = ob.getTableName();
                }
                //if (oraList.size() > 0 ){
                if (tmpora != null) {
                    //ObTableColumnVO oracle = oraList.get(0);
                    ObTableColumnFullVO oracle = tmpora;
                    object.setTableName2(oracle.getTableName());
                    object.setColumnName2(oracle.getColumnName());
                    object.setDataType2(oracle.getDataType());
                    String ext2 = oracle.getExtend();
                    //System.out.println("db :" + ext2);
                    if (StringUtils.hasText(oracle.getExtend()) && oracle.getExtend().contains("%")) {
                        if (oracle.getDataDefault()!=null && oracle.getDataDefault().startsWith("0.00")){
                            oracle.setDataDefault("0");
                        }
                        if (oracle.getDataDefault()!=null && oracle.getDataDefault().equals("000000000000")){
                            oracle.setDataDefault("0");
                        }
                        ext2 = String.format(oracle.getExtend(), oracle.getDataDefault().trim());
                    }
                    //System.out.println(ext2);
                    object.setExtend2(ext2);
                    object.setNullable2(oracle.getNullable());
                    object.setDataDefault2(oracle.getDataDefault());
                    tableName = oracle.getTableName();
                }

                object.setNo(String.valueOf(indexNo));
                object.setNo2(String.valueOf(indexNo));
                //System.out.println(object);
                resultList.add(object);
                indexNo++;
                /*if (resultList.size() % 5000 == 0) {
                    System.out.println(" ---- size ---" + resultList.size());
                }*/
                /*
                if (tableMap.get(tableName)!=null) {
                    continue;
                }
                if (StringUtils.hasText(object.getTableName()) && StringUtils.hasText(object.getTableName2()) &&StringUtils.hasText(object.getColumnName()) && !StringUtils.hasText(object.getColumnName2())) {
                    // ob 有 oracle 没有,需要补全
                    String format = StrUtil.format("表 {} 的列 {} OB有 ORACLE 没有 ！！！ 缺列！！！", object.getTableName(), object.getColumnName());
                    System.out.println(format);
                    String ddl = String.format(DDL_ADD, tableName, object.getColumnName(), object.getDataType(), object.getExtend());
                    ddlList.add(ddl);
                }
                if (!StringUtils.hasText(object.getTableName()) && !StringUtils.hasText(object.getColumnName()) && StringUtils.hasText(object.getColumnName2())) {
                    // ob 没有 oracle 有,需要确认，然后删除或同步
                    String format = StrUtil.format("-- 表 {} 的列 {} OB沒有 ORACLE 有 ！！！ 多列！！！", object.getTableName2(), object.getColumnName2());
                    System.out.println(format);
                    ddlList.add(format);
                }
                sb.setLength(0);
                if (object.getTableName()!=null && object.getTableName().equals(object.getTableName2()) && object.getColumnName().equals(object.getColumnName2())) {
                    if (object.getColumnName().equals(object.getColumnName2()) && !object.getDataType().equals(object.getDataType2())) {
                        String format = StrUtil.format("表 {} 的列 {} 类型不一致 OB : {}  ORACLE : {} 类型長度差异", object.getTableName(), object.getColumnName(), object.getDataType(), object.getDataType2());
                        System.out.println(format);
                        String ddl = String.format(DDL_MODIFY, tableName, object.getColumnName(), object.getDataType());
                        sb.append(ddl);
                        if (StringUtils.hasText(object.getDataDefault()) && !object.getDataDefault().equals(object.getDataDefault2())){
                            sb.append(" DEFAULT ").append(object.getDataDefault());
                        }
                        if (!object.getNullable().equals(object.getNullable2()) && "N".equals(object.getNullable())){
                            sb.append(" NOT NULL ");
                        }
                        sb.append(";");
                        ddlList.add(sb.toString());
                    }
                }*/
            }
            allNames.clear();
            //ddlList.add("-- " + tableName);
            //ddlList.add("-- ");
        }
/*
        File ddl = new File(ddlpath);
        if (ddl.exists()) {
            ddl.delete();
        }
        FileWriter fileWriter = new FileWriter(ddl);
        fileWriter.appendLines(ddlList);
*/

        return resultList;
    }



}
