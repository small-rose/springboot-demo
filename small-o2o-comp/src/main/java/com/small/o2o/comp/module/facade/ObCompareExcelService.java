package com.small.o2o.comp.module.facade;


import cn.hutool.core.io.file.FileWriter;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.small.o2o.comp.module.constants.OBConstants;
import com.small.o2o.comp.module.excel.CheckCellHandler;
import com.small.o2o.comp.module.excel.MultipleSheelPropety;
import com.small.o2o.comp.module.exception.QueryException;
import com.small.o2o.comp.module.service.ob.ObMetaDataService;
import com.small.o2o.comp.module.service.ob03.Ob03MetaDataService;
import com.small.o2o.comp.module.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ObCompareExcelService {

    @Autowired
    private ObMetaDataService obMetaDataService;
    @Autowired
    private Ob03MetaDataService ob03MetaDataService;
    @Autowired
    private FilePickService filePickService;

    public void doHandle(HttpServletResponse response) {
        ArrayList<MultipleSheelPropety> excelList = new ArrayList<>();

        getDatas(excelList);

        log.info("开始生成Excel ...");
        String fileName = new String("OB元数据收集.xlsx".getBytes(), StandardCharsets.ISO_8859_1);
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        ExcelWriter excelWriter = null;
        try {
            excelWriter = EasyExcel.write(response.getOutputStream()).build();
            for (int i = 0; i < excelList.size(); i++) {
                if (!CollectionUtils.isEmpty(excelList.get(i).getData())) {

                    //这里 需要指定写用哪个class去写
                    WriteSheet writeSheet = EasyExcel.writerSheet(i, excelList.get(i).getSheet().getSheetName()).head(excelList.get(i).getData().get(0).getClass()).build();
                    excelWriter.write(excelList.get(i).getData(), writeSheet);

                }
            }
            //千万别忘记finish 会帮忙关闭流
            excelWriter.finish();
        } catch (Exception e) {
            e.printStackTrace();
            log.info(e.getMessage());
        }
    }


    public void doHandle(String filePath) {
        ArrayList<MultipleSheelPropety> excelList = new ArrayList<>();

        getDatas(excelList);

        log.info("开始生成Excel ...");
        if (!filePath.endsWith(".xlsx")) {
            String fileName = "OB元数据收集".concat(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMddHHmm"))).concat(".xlsx");
            filePath = filePath + fileName;
        }


        ExcelWriter excelWriter = null;
        try {
            List<String> whiteListTable = filePickService.getWhiteListTable();
            excelWriter = EasyExcel.write(filePath).build();
            for (int i = 0; i < excelList.size(); i++) {
                if (!CollectionUtils.isEmpty(excelList.get(i).getData())) {

                    //这里 需要指定写用哪个class去写
                    WriteSheet writeSheet = EasyExcel.writerSheet(i, excelList.get(i).getSheet().getSheetName())
                            .head(excelList.get(i).getData().get(0).getClass())
                            .registerWriteHandler(new CheckCellHandler(whiteListTable)).build();
                    excelWriter.write(excelList.get(i).getData(), writeSheet);

                }
            }
            //千万别忘记finish 会帮忙关闭流
            excelWriter.finish();
            log.info("文件生成成功！" + filePath);
        } catch (Exception e) {
            e.printStackTrace();
            log.info(e.getMessage());
        }
    }



    public void doHandleOnlyCol(String filePath, String tableName, boolean onlychayi) {
        ArrayList<MultipleSheelPropety> excelList = new ArrayList<>();

        log.info("开始查表和列");
        //第二个sheet数据    此处数据集为手动创建数据  -- 实际开发替换为具体业务逻辑数据
        long a = System.currentTimeMillis();
        //List<OracleTableColumnVO> tableColumnVOList = getTableColumns();
        List<OracleTableColumnFullVO> tableColumnVOList = getTableColumnFulls(tableName, onlychayi);
        long b = System.currentTimeMillis();
        log.info("取数据耗时" + (b - a) / 100 + " s");
        Sheet sheet = new Sheet(0, 0);
        sheet.setSheetName("表对应的列");
        MultipleSheelPropety multipleSheelPropety = new MultipleSheelPropety();
        multipleSheelPropety.setData(tableColumnVOList);
        multipleSheelPropety.setSheet(sheet);
        excelList.add(multipleSheelPropety);

        log.info("开始生成Excel ...");
        if (!filePath.endsWith(".xlsx")) {
            String fileName = "Ob_db01_db03元数据收集".concat(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMddHHmm"))).concat(".xlsx");
            filePath = filePath + fileName;
        }


        ExcelWriter excelWriter = null;
        try {
            List<String> whiteListTable = filePickService.getWhiteListTable();
            excelWriter = EasyExcel.write(filePath).build();
            for (int i = 0; i < excelList.size(); i++) {
                if (!CollectionUtils.isEmpty(excelList.get(i).getData())) {

                    //这里 需要指定写用哪个class去写
                    WriteSheet writeSheet = EasyExcel.writerSheet(i, excelList.get(i).getSheet().getSheetName())
                            .head(excelList.get(i).getData().get(0).getClass())
                            .registerWriteHandler(new CheckCellHandler(whiteListTable)).build();
                    excelWriter.write(excelList.get(i).getData(), writeSheet);

                }
            }
            //千万别忘记finish 会帮忙关闭流
            excelWriter.finish();
            log.info("文件生成成功！" + filePath);
        } catch (Exception e) {
            e.printStackTrace();
            log.info(e.getMessage());
        }
    }

    private void getDatas(ArrayList<MultipleSheelPropety> excelList) {

        for (OBConstants.SheetNameEnum sheetEnum : OBConstants.SheetNameEnum.values()) {

            if (0 == sheetEnum.getIndex()) {
                log.info("开始查0 " + sheetEnum.getDesc());
                //第二个sheet数据    此处数据集为手动创建数据  -- 实际开发替换为具体业务逻辑数据
                List<OracleObjectInfoVO> tableInfoList = getObjectInfo();
                Sheet sheet = new Sheet(sheetEnum.getIndex(), 0);
                sheet.setSheetName(sheetEnum.getDesc());
                MultipleSheelPropety multipleSheelPropety = new MultipleSheelPropety();
                multipleSheelPropety.setData(tableInfoList);
                multipleSheelPropety.setSheet(sheet);
                excelList.add(multipleSheelPropety);
            } else if (1 == sheetEnum.getIndex()) {
                log.info("开始查1 " + sheetEnum.getDesc());
                //第二个sheet数据    此处数据集为手动创建数据  -- 实际开发替换为具体业务逻辑数据
                List<OracleTableInfoVO> tableInfoList = getTableInfo(sheetEnum.getCode());
                Sheet sheet = new Sheet(sheetEnum.getIndex(), 0);
                sheet.setSheetName(sheetEnum.getDesc());
                MultipleSheelPropety multipleSheelPropety = new MultipleSheelPropety();
                multipleSheelPropety.setData(tableInfoList);
                multipleSheelPropety.setSheet(sheet);
                excelList.add(multipleSheelPropety);
            } else if (2 == sheetEnum.getIndex()) {
                log.info("开始查表和列");
                //第二个sheet数据    此处数据集为手动创建数据  -- 实际开发替换为具体业务逻辑数据
                long a = System.currentTimeMillis();
                //List<OracleTableColumnVO> tableColumnVOList = getTableColumns();
                List<OracleTableColumnFullVO> tableColumnVOList = getTableColumnFulls("", false);
                long b = System.currentTimeMillis();
                log.info("取数据耗时" + (b - a) / 100 + " s");
                Sheet sheet = new Sheet(sheetEnum.getIndex(), 0);
                sheet.setSheetName(sheetEnum.getDesc());
                MultipleSheelPropety multipleSheelPropety = new MultipleSheelPropety();
                multipleSheelPropety.setData(tableColumnVOList);
                multipleSheelPropety.setSheet(sheet);
                excelList.add(multipleSheelPropety);
            } else if (3 == sheetEnum.getIndex()) {
                log.info("开始查" + sheetEnum.getDesc());
                //第二个sheet数据    此处数据集为手动创建数据  -- 实际开发替换为具体业务逻辑数据
                List<OracleTableViewVO> tableInfoList = getUserViewList();
                Sheet sheet = new Sheet(sheetEnum.getIndex(), 0);
                sheet.setSheetName(sheetEnum.getDesc());
                MultipleSheelPropety multipleSheelPropety = new MultipleSheelPropety();
                multipleSheelPropety.setData(tableInfoList);
                multipleSheelPropety.setSheet(sheet);
                excelList.add(multipleSheelPropety);
            }
            if (4 == sheetEnum.getIndex()) {
                log.info("开始查索引");
                //第二个sheet数据    此处数据集为手动创建数据  -- 实际开发替换为具体业务逻辑数据
                List<OracleTableIndexVO> tableIndexs = getTableIndexs();
                Sheet sheet = new Sheet(sheetEnum.getIndex(), 0);
                sheet.setSheetName(sheetEnum.getDesc());
                MultipleSheelPropety multipleSheelPropety = new MultipleSheelPropety();
                multipleSheelPropety.setData(tableIndexs);
                multipleSheelPropety.setSheet(sheet);
                excelList.add(multipleSheelPropety);
            } else if (5 == sheetEnum.getIndex()) {
                log.info("开始查序列");
                //第二个sheet数据    此处数据集为手动创建数据  -- 实际开发替换为具体业务逻辑数据
                List<OracleSequencesVO> sequencesList = getSequences();
                Sheet sheet = new Sheet(sheetEnum.getIndex(), 0);
                sheet.setSheetName(sheetEnum.getDesc());
                MultipleSheelPropety multipleSheelPropety = new MultipleSheelPropety();
                multipleSheelPropety.setData(sequencesList);
                multipleSheelPropety.setSheet(sheet);
                excelList.add(multipleSheelPropety);
            } else if (6 == sheetEnum.getIndex()) {
                log.info("开始查 TYPE ");
                List<OracleTypesVO> typeList = getTypeList();
                Sheet sheet = new Sheet(sheetEnum.getIndex(), 0);
                sheet.setSheetName(sheetEnum.getDesc());
                MultipleSheelPropety multipleSheelPropety = new MultipleSheelPropety();
                multipleSheelPropety.setData(typeList);
                multipleSheelPropety.setSheet(sheet);
                excelList.add(multipleSheelPropety);

            } else if (9 == sheetEnum.getIndex() || 7 == sheetEnum.getIndex() || 8 == sheetEnum.getIndex()) {
                log.info("开始查 " + sheetEnum.getCode());
                List<OracleProcedureVO> typeList = getProcedureList(sheetEnum.getCode());
                Sheet sheet = new Sheet(sheetEnum.getIndex(), 0);
                sheet.setSheetName(sheetEnum.getDesc());
                MultipleSheelPropety multipleSheelPropety = new MultipleSheelPropety();
                multipleSheelPropety.setData(typeList);
                multipleSheelPropety.setSheet(sheet);
                excelList.add(multipleSheelPropety);
            }else if (10 == sheetEnum.getIndex()) {
                log.info("开始查 10 " + sheetEnum.getDesc());
                List<OracleTableInfoVO> typeList = chaBiao();
                Sheet sheet = new Sheet(sheetEnum.getIndex(), 0);
                sheet.setSheetName(sheetEnum.getDesc());
                MultipleSheelPropety multipleSheelPropety = new MultipleSheelPropety();
                multipleSheelPropety.setData(typeList);
                multipleSheelPropety.setSheet(sheet);
                excelList.add(multipleSheelPropety);
            }else if (11 == sheetEnum.getIndex()) {
                log.info("开始查 11 " + sheetEnum.getDesc());
                List<OracleTableColumnFullVO> typeList = getChaTableColumn();
                Sheet sheet = new Sheet(sheetEnum.getIndex(), 0);
                sheet.setSheetName(sheetEnum.getDesc());
                MultipleSheelPropety multipleSheelPropety = new MultipleSheelPropety();
                multipleSheelPropety.setData(typeList);
                multipleSheelPropety.setSheet(sheet);
                excelList.add(multipleSheelPropety);
            }
        }
    }

    private List<OracleTableColumnFullVO> getChaTableColumn() {
        List<ObTableInfoVO> allTables = obMetaDataService.queryTableInfo("TABLE");
        List<String> tables = new ArrayList<>();
        for (ObTableInfoVO tableInfoVO : allTables) {
            tables.add(tableInfoVO.getTableName());
        }
        List<OracleTableColumnFullVO> resultList = new ArrayList<>();
        OracleTableColumnFullVO object = null ;
        int all = tables.size();
        log.info("合计循环 " +tables.size());
        for (String tableName : tables){

            List<ObTableColumnFullVO> obObjList = obMetaDataService.queryTableColmnFullVO(tableName);
            List<ObTableColumnFullVO> oraObjList = ob03MetaDataService.queryTableColmnFullVO(tableName);


            Map<String, ObTableColumnFullVO> obObjMap = obObjList.stream().collect(
                    Collectors.toMap(o -> o.getTableName().concat(o.getColumnName()), (p) -> p));

            Map<String, ObTableColumnFullVO> oracleObjMap = oraObjList.stream().collect(
                    Collectors.toMap(o -> o.getTableName().concat(o.getColumnName()), Function.identity()));

            if (obObjMap!=null && oracleObjMap !=null && obObjMap.size()==oracleObjMap.size()
                && obObjMap.keySet().containsAll(oracleObjMap.keySet())){
                all--;
                System.out.println("all : "+all);
                continue;
            }
            List<String> allNames = new ArrayList<>();
            if (obObjMap.size()!=oracleObjMap.size()){
                for (ObTableColumnFullVO p : obObjList) {
                    allNames.add(p.getTableName().concat(p.getColumnName()));
                }
                for (ObTableColumnFullVO p : oraObjList) {
                    if (!allNames.contains(p.getTableName().concat(p.getColumnName()))) {
                        allNames.add(p.getTableName().concat(p.getColumnName()));
                    }
                }
            }
            int indexNo = 1;
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
                    if (oracle.getExtend()!=null && oracle.getExtend().contains("%")) {
                        if (oracle.getDataDefault()!=null && oracle.getDataDefault().startsWith("0.00")){
                            oracle.setDataDefault("0 ");
                        }
                        ext2 = String.format(oracle.getExtend(), oracle.getDataDefault());
                    }
                    //System.out.println(ext2);
                    object.setExtend2(ext2);
                    object.setNullable2(oracle.getNullable());
                    object.setDataDefault2(oracle.getDataDefault());
                 }

                object.setNo(String.valueOf(indexNo));
                object.setNo2(String.valueOf(indexNo));
                resultList.add(object);
                indexNo++;

            }
            allNames.clear();
            all--;
            if (all%10==0) {
                System.out.println("剩余待循环" + all);
            }
        }

        log.info("查询完成！");
        return resultList;
    }

    private List<OracleTableInfoVO>  chaBiao(){
        List<String> obNames = new ArrayList<>();
        List<String> oraNames = new ArrayList<>();
        List<ObTableInfoVO> obObjList = obMetaDataService.queryTableInfo("TABLE");
        List<ObTableInfoVO> oraObjList = ob03MetaDataService.queryTableInfo("TABLE");

        for (ObTableInfoVO tableInfoVO : obObjList) {
            obNames.add(tableInfoVO.getTableName());
        }

        for (ObTableInfoVO tableInfoVO : oraObjList) {
            oraNames.add(tableInfoVO.getTableName());
        }
        List<String> chaBiao = new ArrayList<>(oraNames);
        chaBiao.removeAll(obNames);
        List<OracleTableInfoVO> resultList = new ArrayList<>();
        List<String> whiteListTable = filePickService.getWhiteListTable();
        Map<String,String> whiteMap = new HashMap<>();
        for (String s : whiteListTable) {
            if (s.contains("--")){
                continue;
            }
            whiteMap.put(s, s);
        }
        OracleTableInfoVO object = null;
        int indexNo = 1;
        for (String table : chaBiao){
            object = new OracleTableInfoVO();
            object.setNo(String.valueOf(indexNo));
            object.setNo2(String.valueOf(indexNo));
            object.setTableName2(table);
            if (whiteMap.containsKey(table)){
                object.setTableComment("保留表");
                object.setTableComment2("保留表");
            }
            resultList.add(object);
            indexNo++;
        }

        return resultList ;
    }

    public List<OracleObjectInfoVO> getObjectInfo() {
        List<String> obNames = new ArrayList<>();
        List<String> oraNames = new ArrayList<>();

        List<ObObjectInfoVO> typesVOList = obMetaDataService.queryObjectInfo();
        List<ObObjectInfoVO> typesVOList2 = ob03MetaDataService.queryObjectInfo();

        typesVOList.stream().forEach(p -> obNames.add(p.getObjectType()));
        typesVOList2.stream().forEach(p -> oraNames.add(p.getObjectType()));

        List<String> allNames = new ArrayList<>();
        //获取一个包含了oldIds和newIds的总结合,但是没有去重
        allNames.addAll(obNames);
        allNames.addAll(oraNames);
        //去重，获取并集 对象 新集合
        List<String> joinNames = allNames.stream().distinct().collect(Collectors.toList());

        List<OracleObjectInfoVO> resultList = new ArrayList<>();
        OracleObjectInfoVO object = null;
        int indexNo = 1;
        log.info("getProcedureList 取并集大小为：" + joinNames.size());

        for (String n : joinNames) {
            object = new OracleObjectInfoVO();
            object.setNo(String.valueOf(indexNo));
            object.setNo2(String.valueOf(indexNo));

            List<ObObjectInfoVO> obList = typesVOList.stream().parallel().filter(p -> p.getObjectType().equals(n)).collect(Collectors.toList());

            List<ObObjectInfoVO> oraList = typesVOList2.stream().parallel().filter(p -> p.getObjectType().equals(n)).collect(Collectors.toList());
            if (obList.size() > 0) {
                ObObjectInfoVO ob = obList.get(0);
                object.setObjectType(ob.getObjectType());
                object.setCount(ob.getCount());
            }
            if (oraList.size() > 0) {
                ObObjectInfoVO oracle = oraList.get(0);
                object.setObjectType2(oracle.getObjectType());
                object.setCount2(oracle.getCount());
            }
            resultList.add(object);
            indexNo++;
        }
        ;
        return resultList;
    }

    public List<OracleTypesVO> getTypeList() {
        List<String> obNames = new ArrayList<>();
        List<String> oraNames = new ArrayList<>();

        List<ObTypesVO> typesVOList = obMetaDataService.queryTypesVO("");
        List<ObTypesVO> typesVOList2 = ob03MetaDataService.queryTypesVO("");

        typesVOList.stream().forEach(p -> obNames.add(p.getTypeName()));
        typesVOList2.stream().forEach(p -> oraNames.add(p.getTypeName()));

        List<String> allNames = new ArrayList<>();
        //获取一个包含了oldIds和newIds的总结合,但是没有去重
        allNames.addAll(obNames);
        allNames.addAll(oraNames);
        //去重，获取并集 对象 新集合
        List<String> joinNames = allNames.stream().distinct().collect(Collectors.toList());

        List<OracleTypesVO> resultList = new ArrayList<>();
        OracleTypesVO object = null;
        int indexNo = 1;
        log.info("getProcedureList 取并集大小为：" + joinNames.size());

        for (String n : joinNames) {
            object = new OracleTypesVO();
            object.setNo(String.valueOf(indexNo));
            object.setNo2(String.valueOf(indexNo));
            if (indexNo == 1) {
                object.setCount1(String.valueOf(typesVOList.size()));
                object.setCount2(String.valueOf(typesVOList2.size()));
            }
            List<ObTypesVO> obList = typesVOList.stream().parallel().filter(p -> p.getTypeName().equals(n)).collect(Collectors.toList());

            List<ObTypesVO> oraList = typesVOList2.stream().parallel().filter(p -> p.getTypeName().equals(n)).collect(Collectors.toList());
            if (obList.size() > 0) {
                ObTypesVO ob = obList.get(0);
                object.setTypeName(ob.getTypeName());
                object.setTypecode(ob.getTypecode());
            }
            if (oraList.size() > 0) {
                ObTypesVO oracle = oraList.get(0);
                object.setTypeName(oracle.getTypeName());
                object.setTypecode(oracle.getTypecode());
            }
            resultList.add(object);
            indexNo++;
        }
        ;
        return resultList;
    }

    public List<OracleProcedureVO> getProcedureList(String type) {

        List<String> obNames = new ArrayList<>();
        List<String> oraNames = new ArrayList<>();

        List<ObProcedureVO> procedureVOS = obMetaDataService.queryProcedureVO(type);
        List<ObProcedureVO> procedureVOS2 = ob03MetaDataService.queryProcedureVO(type);

        procedureVOS.stream().forEach(p -> obNames.add(p.getObjectName().concat(p.getProcedureName() == null ? "" : p.getProcedureName())));
        procedureVOS2.stream().forEach(p -> oraNames.add(p.getObjectName().concat(p.getProcedureName() == null ? "" : p.getProcedureName())));

        List<String> allNames = new ArrayList<>();
        //获取一个包含了oldIds和newIds的总结合,但是没有去重
        allNames.addAll(obNames);
        allNames.addAll(oraNames);
        //去重，获取并集 对象 新集合
        List<String> joinNames = allNames.stream().distinct().collect(Collectors.toList());

        List<OracleProcedureVO> resultList = new ArrayList<>();
        OracleProcedureVO procedure = null;
        int indexNo = 1;
        log.info("getProcedureList 取并集大小为：" + joinNames.size());

        for (String n : joinNames) {
            procedure = new OracleProcedureVO();
            procedure.setNo(String.valueOf(indexNo));
            procedure.setNo2(String.valueOf(indexNo));
            if (indexNo == 1) {
                procedure.setCount1(String.valueOf(procedureVOS.size()));
                procedure.setCount2(String.valueOf(procedureVOS2.size()));
            }
            List<ObProcedureVO> obList = procedureVOS.stream().parallel().filter(p -> (p.getObjectName().concat(p.getProcedureName() == null ? "" : p.getProcedureName()).equals(n))).collect(Collectors.toList());

            List<ObProcedureVO> oraList = procedureVOS2.stream().parallel().filter(p -> (p.getObjectName().concat(p.getProcedureName() == null ? "" : p.getProcedureName()).equals(n))).collect(Collectors.toList());
            if (obList.size() > 0) {
                ObProcedureVO ob = obList.get(0);
                procedure.setObjectType(ob.getObjectType());
                procedure.setObjectName(ob.getObjectName());
                procedure.setProcedureName(ob.getProcedureName());
            }
            if (oraList.size() > 0) {
                ObProcedureVO oracle = oraList.get(0);
                procedure.setObjectType2(oracle.getObjectType());
                procedure.setObjectName2(oracle.getObjectName());
                procedure.setProcedureName2(oracle.getProcedureName());
            }
            resultList.add(procedure);
            indexNo++;
        }
        ;
        return resultList;
    }


    public List<OracleSequencesVO> getSequences() {

        List<String> allNames = new ArrayList<>();

        List<ObSequencesVO> obObjList = obMetaDataService.querySequencesVO();
        List<ObSequencesVO> oraObjList = ob03MetaDataService.querySequencesVO();

        obObjList.forEach(p -> allNames.add(p.getSequenceName()));
        oraObjList.forEach(p -> {
            if (allNames.contains(p.getSequenceName())) {
                allNames.add(p.getSequenceName());

            }
        });

        List<OracleSequencesVO> resultList = new ArrayList<>();
        OracleSequencesVO sequences = null;
        int indexNo = 1;
        log.info("getSequences 取并集大小为：" + allNames.size());

        for (String n : allNames) {
            sequences = new OracleSequencesVO();
            sequences.setNo(String.valueOf(indexNo));
            sequences.setNo2(String.valueOf(indexNo));

            if (indexNo == 1) {
                sequences.setCount1(String.valueOf(obObjList.size()));
                sequences.setCount2(String.valueOf(oraObjList.size()));
            }

            List<ObSequencesVO> obList = obObjList.stream().parallel().filter(p -> p.getSequenceName().equals(n)).collect(Collectors.toList());

            List<ObSequencesVO> oraList = oraObjList.stream().parallel().filter(p -> p.getSequenceName().equals(n)).collect(Collectors.toList());
            if (obList.size() > 0) {
                ObSequencesVO ob = obList.get(0);
                sequences.setSequenceName(ob.getSequenceName());
                sequences.setLastNumber(ob.getLastNumber());
            }
            if (oraList.size() > 0) {
                ObSequencesVO oracle = oraList.get(0);
                sequences.setSequenceName2(oracle.getSequenceName());
                sequences.setLastNumber2(oracle.getLastNumber());
            }
            resultList.add(sequences);
            indexNo++;
        }
        ;
        return resultList;
    }

    List<String> allTables = new ArrayList<>();

    /**
     * 表-视图 对比
     *
     * @return
     */
    public List<OracleTableInfoVO> getTableInfo(String tableType) {

        //        List<String> obNames = new ArrayList<>();
        //        List<String> oraNames = new ArrayList<>();

        List<ObTableInfoVO> obObjList = obMetaDataService.queryTableInfo(tableType);
        List<ObTableInfoVO> oraObjList = ob03MetaDataService.queryTableInfo(tableType);

        //OB 查分区数
        List<ObTablePartitionVO> obTablePartitionList = obMetaDataService.queryTablePartitionVO();
        Map<String, Long> obPartMap = obTablePartitionList.stream().collect(Collectors.toMap(ObTablePartitionVO::getTableName, ObTablePartitionVO::getCount));
        //OB 查记录数
        List<ObTablePartitionVO> obRecordList = obMetaDataService.queryTableReCords();
        Map<String, Long> obRecordMap = obRecordList.stream().collect(Collectors.toMap(ObTablePartitionVO::getTableName, ObTablePartitionVO::getCount));

        //ORACLE 查分区数
        List<ObTablePartitionVO> oraTablePartitionList = ob03MetaDataService.queryTablePartitionVO();
        Map<String, Long> oraPartMap = oraTablePartitionList.stream().collect(Collectors.toMap(ObTablePartitionVO::getTableName, ObTablePartitionVO::getCount));
        //ORACLE 查记录数
        List<ObTablePartitionVO> oraRecordList = ob03MetaDataService.queryTableReCords();
        //Map<String, Long> oraRecordMap = oraRecordList.stream().collect(Collectors.toMap(ObTablePartitionVO::getTableName, ObTablePartitionVO::getCount));
        Map<String, Long> oraRecordMap = new HashMap<>();
        for (ObTablePartitionVO obTablePartitionVO : oraRecordList) {
            oraRecordMap.put(obTablePartitionVO.getTableName(), obTablePartitionVO.getCount());
        }

        obObjList.stream().forEach(p -> allTables.add(p.getTableName()));
        oraObjList.stream().forEach(p -> {
            if (!allTables.contains(p.getTableName())) {
                allTables.add(p.getTableName());
            }
        });

        List<OracleTableInfoVO> resultList = new ArrayList<>();
        OracleTableInfoVO object = null;
        int indexNo = 1;
        log.info("getTableInfo 取并集大小为：" + allTables.size());
        for (String n : allTables) {
            object = new OracleTableInfoVO();
            object.setNo(String.valueOf(indexNo));
            object.setNo2(String.valueOf(indexNo));
            List<ObTableInfoVO> obList = obObjList.stream().parallel().filter(p -> p.getTableName().equals(n)).collect(Collectors.toList());

            List<ObTableInfoVO> oraList = oraObjList.stream().parallel().filter(p -> p.getTableName().equals(n)).collect(Collectors.toList());
            if (obList.size() > 0) {
                ObTableInfoVO ob = obList.get(0);
                object.setTableName(ob.getTableName());
                object.setTableComment(ob.getTableComment());
                if (obPartMap.get(object.getTableName()) != null) {
                    object.setPartitions(obPartMap.get(object.getTableName()));
                }
                if (obRecordMap.get(object.getTableName()) != null) {
                    object.setCountRows(obRecordMap.get(object.getTableName()));
                }

            }
            if (oraList.size() > 0) {
                ObTableInfoVO oracle = oraList.get(0);
                object.setTableName2(oracle.getTableName());
                object.setTableComment2(oracle.getTableComment());

                if (oraPartMap.get(object.getTableName2()) != null) {
                    object.setPartitions2(obPartMap.get(object.getTableName2()));
                }
                if (oraRecordMap.get(object.getTableName2()) != null) {
                    object.setCountRows2(obRecordMap.get(object.getTableName2()));
                }
            }
            resultList.add(object);
            indexNo++;
        }
        ;
        return resultList;
    }

    /**
     * 表索引对比
     *
     * @return
     */
    public List<OracleTableIndexVO> getTableIndexs() {

        List<ObTableIndexVO> obObjList = obMetaDataService.queryTableIndexVO("");
        List<ObTableIndexVO> oraObjList = ob03MetaDataService.queryTableIndexVO("");

        List<String> obNames = new ArrayList<>(obObjList.size());
        List<String> oraNames = new ArrayList<>(oraObjList.size());

        obObjList.stream().forEach(p -> obNames.add(p.getIndexName()));
        oraObjList.stream().forEach(p -> oraNames.add(p.getIndexName()));

        List<String> allNames = new ArrayList<>();
        //获取一个包含了oldIds和newIds的总结合,但是没有去重
        allNames.addAll(obNames);
        allNames.addAll(oraNames);
        //去重，获取并集 对象 新集合
        List<String> joinNames = allNames.stream().distinct().collect(Collectors.toList());

        List<OracleTableIndexVO> resultList = new ArrayList<>();
        OracleTableIndexVO object = null;
        int indexNo = 1;
        for (String n : joinNames) {
            object = new OracleTableIndexVO();
            object.setNo(String.valueOf(indexNo));
            object.setNo2(String.valueOf(indexNo));
            List<ObTableIndexVO> obList = obObjList.stream().parallel().filter(p -> p.getIndexName().equals(n)).collect(Collectors.toList());

            List<ObTableIndexVO> oraList = oraObjList.stream().parallel().filter(p -> p.getIndexName().equals(n)).collect(Collectors.toList());
            if (obList.size() > 0) {
                ObTableIndexVO ob = obList.get(0);
                object.setTableName(ob.getTableName());
                object.setIndexName(ob.getIndexName());
                object.setIndexType(ob.getIndexType());
            }
            if (oraList.size() > 0) {
                ObTableIndexVO oracle = oraList.get(0);
                object.setTableName2(oracle.getTableName());
                object.setIndexName2(oracle.getIndexName());
                object.setIndexType2(oracle.getIndexType());
            }
            resultList.add(object);
            indexNo++;
        }
        ;
        return resultList;
    }


    public List<String> getAllTables() {
        List<String> obNames = new ArrayList<>();
        List<ObTableInfoVO> obObjList = obMetaDataService.queryTableInfo("TABLE");
        List<ObTableInfoVO> oraObjList = ob03MetaDataService.queryTableInfo("TABLE");

        obObjList.forEach(p -> obNames.add(p.getTableName()));
        oraObjList.forEach(p -> {
            if (!obNames.contains(p.getTableName())) {
                obNames.add(p.getTableName());
            }
        });

        return obNames;
    }



    /**
     * 表索引对比
     *
     * @return
     */
    public List<OracleTableColumnVO> getTableColumns() {
        List<String> ddlList = new ArrayList<>();
        String ddlpath = "E:\\obgenerator\\ora_ddl.sql";

        List<OracleTableColumnVO> resultList = new ArrayList<>();
        List<String> tableList = allTables;//getAllTables();
        // 146张不要的表
        List<String> table = filePickService.get146Table();

        List<String> allNames = new ArrayList<>();
        int tableNo = 1;
        for (String tableName : tableList) {

            List<ObTableColumnVO> obObjList = obMetaDataService.queryTableColumnVO(tableName);
            List<ObTableColumnVO> oraObjList = ob03MetaDataService.queryTableColumnVO(tableName);

            Map<String, ObTableColumnVO> obObjMap = obObjList.stream().collect(
                    Collectors.toMap(o -> o.getTableName().concat(o.getColumnName()), (p) -> p));

            Map<String, ObTableColumnVO> oracleObjMap = oraObjList.stream().collect(
                    Collectors.toMap(o -> o.getTableName().concat(o.getColumnName()), Function.identity()));
            for (ObTableColumnVO p : obObjList) {
                allNames.add(p.getTableName().concat(p.getColumnName()));
            }
            for (ObTableColumnVO p : oraObjList) {
                if (!allNames.contains(p.getTableName().concat(p.getColumnName()))) {
                    allNames.add(p.getTableName().concat(p.getColumnName()));
                }
            }
            OracleTableColumnVO object = null;
            String lastTableName = "";
            int indexNo = 1;
            log.info("{} Table - {} 取并集Column 大小为 {}", tableNo, tableName, allNames.size());
            tableNo++;
            for (String n : allNames) {
                object = new OracleTableColumnVO();

                //List<ObTableColumnVO> obList = obObjList.stream().parallel().filter(p -> (p.getTableName().concat(p.getColumnName()).equals(n))).collect(Collectors.toList());
                ObTableColumnVO tmpob = obObjMap.get(n);
                //List<ObTableColumnVO> oraList = oraObjList.stream().parallel().filter(p->(p.getTableName().concat(p.getColumnName()).equals(n))).collect(Collectors.toList());
                ObTableColumnVO tmpora = oracleObjMap.get(n);
                //if (obList.size() > 0){
                if (tmpob != null) {

                    //ObTableColumnVO ob = obList.get(0);
                    ObTableColumnVO ob = tmpob;
                    object.setTableName(ob.getTableName());
                    object.setColumnName(ob.getColumnName());
                    object.setDataType(ob.getDataType());
                    object.setDataLength(ob.getDataLength());

                    tableName = ob.getTableName();
                }
                //if (oraList.size() > 0 ){
                if (tmpora != null) {
                    //ObTableColumnVO oracle = oraList.get(0);
                    ObTableColumnVO oracle = tmpora;
                    object.setTableName2(oracle.getTableName());
                    object.setColumnName2(oracle.getColumnName());
                    object.setDataType2(oracle.getDataType());
                    object.setDataLength2(oracle.getDataLength());
                    //tableName = oracle.getTableName();
                }
                object.setNo(String.valueOf(indexNo));
                object.setNo2(String.valueOf(indexNo));
                resultList.add(object);
                indexNo++;
                if (resultList.size() % 5000 == 0) {
                    System.out.println(" ---- size ---" + resultList.size());
                }
            }
            allNames.clear();
        }

        File ddl = new File(ddlpath);
        if (ddl.exists()) {
            ddl.delete();
        }
        FileWriter fileWriter = new FileWriter(ddl);
        fileWriter.appendLines(ddlList);

        return resultList;
    }

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
            List<ObTableColumnFullVO> oraObjList = ob03MetaDataService.queryTableColmnFullVO(tableName);

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

    public List<OracleTableViewVO> getUserViewList() {

        List<ObTableViewVO> obObjList = obMetaDataService.queryTableView();
        List<ObTableViewVO> oraObjList = ob03MetaDataService.queryTableView();

        List<String> obNames = new ArrayList<>(obObjList.size());
        List<String> oraNames = new ArrayList<>(oraObjList.size());

        obObjList.stream().forEach(p -> obNames.add(p.getViewName()));
        oraObjList.stream().forEach(p -> oraNames.add(p.getViewName()));

        List<String> allNames = new ArrayList<>();
        //获取一个包含了oldIds和newIds的总结合,但是没有去重
        allNames.addAll(obNames);
        allNames.addAll(oraNames);
        //去重，获取并集 对象 新集合
        List<String> joinNames = allNames.stream().distinct().collect(Collectors.toList());

        List<OracleTableViewVO> resultList = new ArrayList<>();
        OracleTableViewVO object = null;
        int indexNo = 1;
        for (String n : joinNames) {
            object = new OracleTableViewVO();
            object.setNo(String.valueOf(indexNo));
            object.setNo2(String.valueOf(indexNo));
            List<ObTableViewVO> obList = obObjList.stream().parallel().filter(p -> p.getViewName().equals(n)).collect(Collectors.toList());

            List<ObTableViewVO> oraList = oraObjList.stream().parallel().filter(p -> p.getViewName().equals(n)).collect(Collectors.toList());
            if (obList.size() > 0) {
                ObTableViewVO ob = obList.get(0);
                object.setViewName(ob.getViewName());
                object.setTextLength(ob.getTextLength());
                object.setText(ob.getText());
            }
            if (oraList.size() > 0) {
                ObTableViewVO oracle = oraList.get(0);
                object.setViewName2(oracle.getViewName());
                object.setTextLength2(oracle.getTextLength());
                object.setText2(oracle.getText());
            }
            resultList.add(object);
            indexNo++;
        }
        ;
        return resultList;
    }

    @Transactional(rollbackFor = Exception.class)
    public void delObj(String obj) {
        switch (obj) {
            case "table":
                obMetaDataService.deleteAllTables("TABLE");
                break;
            case "view":
                obMetaDataService.deleteAllTables("VIEW");
                break;
            case "index":
                obMetaDataService.deleteAllIndex();
                break;
            case "proc":
                obMetaDataService.deleteProcedures("PROCEDURE");
                break;
            case "func":
                obMetaDataService.deleteProcedures("FUNCTION");
                break;
            case "package":
                obMetaDataService.deleteProcedures("PACKAGE");
                break;
            default:
                throw new QueryException("枚举值非法");
        }

    }
}
