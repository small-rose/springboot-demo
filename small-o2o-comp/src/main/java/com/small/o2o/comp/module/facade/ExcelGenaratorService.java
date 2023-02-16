package com.small.o2o.comp.module.facade;


import cn.hutool.core.io.file.FileWriter;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.cppic.obgenerator.small.constants.OBConstants;
import com.cppic.obgenerator.small.excel.CheckCellHandler;
import com.cppic.obgenerator.small.excel.MultipleSheelPropety;
import com.cppic.obgenerator.small.exception.QueryException;
import com.cppic.obgenerator.small.service.ObMetaDataService;
import com.cppic.obgenerator.small.service.OracleMetaDataService;
import com.cppic.obgenerator.small.service.metadata.ObjectInfoService;
import com.cppic.obgenerator.small.service.metadata.ProcedureListService;
import com.cppic.obgenerator.small.service.metadata.SequencesService;
import com.cppic.obgenerator.small.service.metadata.TableColumnService;
import com.cppic.obgenerator.small.service.metadata.TableIndexService;
import com.cppic.obgenerator.small.service.metadata.TableListService;
import com.cppic.obgenerator.small.service.metadata.TypeListService;
import com.cppic.obgenerator.small.vo.ObTableColumnFullVO;
import com.cppic.obgenerator.small.vo.ObTableColumnVO;
import com.cppic.obgenerator.small.vo.ObTableInfoVO;
import com.cppic.obgenerator.small.vo.ObTableViewVO;
import com.cppic.obgenerator.small.vo.OracleObjectInfoVO;
import com.cppic.obgenerator.small.vo.OracleProcedureVO;
import com.cppic.obgenerator.small.vo.OracleSequencesVO;
import com.cppic.obgenerator.small.vo.OracleTableColumnFullVO;
import com.cppic.obgenerator.small.vo.OracleTableColumnVO;
import com.cppic.obgenerator.small.vo.OracleTableIndexVO;
import com.cppic.obgenerator.small.vo.OracleTableInfoVO;
import com.cppic.obgenerator.small.vo.OracleTableViewVO;
import com.cppic.obgenerator.small.vo.OracleTypesVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

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
public class ExcelGenaratorService {

    @Autowired
    private ObMetaDataService obMetaDataService;
    @Autowired
    private OracleMetaDataService oracleMetaDataService;
    @Autowired
    private FilePickService filePickService;
    @Autowired
    private ObjectInfoService objectInfoService ;
    @Autowired
    private TableListService tableListService ;
    @Autowired
    private TableColumnService tableColumnService ;
    @Autowired
    private TableIndexService tableIndexService ;
    @Autowired
    private SequencesService sequencesService ;
    @Autowired
    private TypeListService typeListService ;
    @Autowired
    private ProcedureListService procedureListService ;


    public void doHandle(HttpServletResponse response) {
        ArrayList<MultipleSheelPropety> excelList = new ArrayList<>();

        getDatas(excelList);

        log.info("开始生成Excel ...");
        String fileName = new String("元数据收集.xlsx".getBytes(), StandardCharsets.ISO_8859_1);
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
            String fileName = "元数据收集".concat(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMddHHmm"))).concat(".xlsx");
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
        List<OracleTableColumnFullVO> tableColumnVOList = tableColumnService.getTableColumnFulls(tableName, onlychayi);
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
            String fileName = "元数据收集".concat(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMddHHmm"))).concat(".xlsx");
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

            /*if (sheetEnum.getIndex() > 1){
                continue;
            }*/
            if (0 == sheetEnum.getIndex()) {
                log.info("开始查0 " + sheetEnum.getDesc());
                //第二个sheet数据    此处数据集为手动创建数据  -- 实际开发替换为具体业务逻辑数据
                List<OracleObjectInfoVO> tableInfoList = objectInfoService.getObjectInfo();
                Sheet sheet = new Sheet(sheetEnum.getIndex(), 0);
                sheet.setSheetName(sheetEnum.getDesc());
                MultipleSheelPropety multipleSheelPropety = new MultipleSheelPropety();
                multipleSheelPropety.setData(tableInfoList);
                multipleSheelPropety.setSheet(sheet);
                excelList.add(multipleSheelPropety);
            } else if (1 == sheetEnum.getIndex()) {
                log.info("开始查1 " + sheetEnum.getDesc());
                //第二个sheet数据    此处数据集为手动创建数据  -- 实际开发替换为具体业务逻辑数据
                List<OracleTableInfoVO> tableInfoList = tableListService.getTableInfo(sheetEnum.getCode());
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
                List<OracleTableColumnFullVO> tableColumnVOList = tableColumnService.getTableColumnFulls("", false);
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
                List<OracleTableIndexVO> tableIndexs = tableIndexService.getTableIndexs("");
                Sheet sheet = new Sheet(sheetEnum.getIndex(), 0);
                sheet.setSheetName(sheetEnum.getDesc());
                MultipleSheelPropety multipleSheelPropety = new MultipleSheelPropety();
                multipleSheelPropety.setData(tableIndexs);
                multipleSheelPropety.setSheet(sheet);
                excelList.add(multipleSheelPropety);
            } else if (5 == sheetEnum.getIndex()) {
                log.info("开始查序列");
                //第二个sheet数据    此处数据集为手动创建数据  -- 实际开发替换为具体业务逻辑数据
                List<OracleSequencesVO> sequencesList = sequencesService.getSequences();
                Sheet sheet = new Sheet(sheetEnum.getIndex(), 0);
                sheet.setSheetName(sheetEnum.getDesc());
                MultipleSheelPropety multipleSheelPropety = new MultipleSheelPropety();
                multipleSheelPropety.setData(sequencesList);
                multipleSheelPropety.setSheet(sheet);
                excelList.add(multipleSheelPropety);
            } else if (6 == sheetEnum.getIndex()) {
                log.info("开始查 TYPE ");
                List<OracleTypesVO> typeList = typeListService.getTypeList();
                Sheet sheet = new Sheet(sheetEnum.getIndex(), 0);
                sheet.setSheetName(sheetEnum.getDesc());
                MultipleSheelPropety multipleSheelPropety = new MultipleSheelPropety();
                multipleSheelPropety.setData(typeList);
                multipleSheelPropety.setSheet(sheet);
                excelList.add(multipleSheelPropety);

            } else if (9 == sheetEnum.getIndex() || 7 == sheetEnum.getIndex() || 8 == sheetEnum.getIndex()) {
                log.info("开始查 " + sheetEnum.getCode());
                List<OracleProcedureVO> typeList = procedureListService.getProcedureList(sheetEnum.getCode());
                Sheet sheet = new Sheet(sheetEnum.getIndex(), 0);
                sheet.setSheetName(sheetEnum.getDesc());
                MultipleSheelPropety multipleSheelPropety = new MultipleSheelPropety();
                multipleSheelPropety.setData(typeList);
                multipleSheelPropety.setSheet(sheet);
                excelList.add(multipleSheelPropety);
            }else if (13 == sheetEnum.getIndex() ) {
                log.info("开始查 " + sheetEnum.getCode());
                List<OracleProcedureVO> typeList = procedureListService.getProcedurePkgList(sheetEnum.getCode());
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
            List<ObTableColumnFullVO> oraObjList = oracleMetaDataService.queryTableColmnFullVO(tableName);


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
        List<ObTableInfoVO> oraObjList = oracleMetaDataService.queryTableInfo("TABLE");

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

    List<String> allTables = new ArrayList<>();




    public List<String> getAllTables() {
        List<String> obNames = new ArrayList<>();
        List<ObTableInfoVO> obObjList = obMetaDataService.queryTableInfo("TABLE");
        List<ObTableInfoVO> oraObjList = oracleMetaDataService.queryTableInfo("TABLE");

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
            List<ObTableColumnVO> oraObjList = oracleMetaDataService.queryTableColumnVO(tableName);

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


    public List<OracleTableViewVO> getUserViewList() {

        List<ObTableViewVO> obObjList = obMetaDataService.queryTableView();
        List<ObTableViewVO> oraObjList = oracleMetaDataService.queryTableView();

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

    public void procedure(String type) {

    }
}
