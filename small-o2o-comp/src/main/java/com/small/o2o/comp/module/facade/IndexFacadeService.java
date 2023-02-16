package com.small.o2o.comp.module.facade;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.cppic.obgenerator.small.constants.OBConstants;
import com.cppic.obgenerator.small.excel.CheckCellHandler;
import com.cppic.obgenerator.small.excel.MultipleSheelPropety;
import com.cppic.obgenerator.small.service.metadata.ObjectInfoService;
import com.cppic.obgenerator.small.service.metadata.TableIndexService;
import com.cppic.obgenerator.small.service.metadata.TablePrimaryKeyService;
import com.cppic.obgenerator.small.vo.OracleObjectInfoVO;
import com.cppic.obgenerator.small.vo.OracleTableIndexVO;
import com.cppic.obgenerator.small.vo.OracleTablePrimaryKeyVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.servlet.http.HttpServletResponse;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class IndexFacadeService {
    @Autowired
    private ObjectInfoService objectInfoService ;
    @Autowired
    private TableIndexService tableIndexService ;
    @Autowired
    private TablePrimaryKeyService tablePrimaryKeyService ;
    @Autowired
    private FilePickService filePickService ;


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



    public void  doHandle(String filePath) {
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


    private void getDatas(ArrayList<MultipleSheelPropety> excelList) {

        List<Integer> indexList = Arrays.asList(0, 4, 12);
        //List<Integer> indexList = Arrays.asList(0, 4);
        for (int index : indexList) {

            OBConstants.SheetNameEnum sheetEnum = OBConstants.SheetNameEnum.getSheetNameEnum(index);
            if (sheetEnum==null){
                continue;
            }
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
            }
            if (12 == sheetEnum.getIndex()) {
                log.info("开始查主键");
                //第二个sheet数据    此处数据集为手动创建数据  -- 实际开发替换为具体业务逻辑数据
                List<OracleTablePrimaryKeyVO>  primaryKeyVOList = tablePrimaryKeyService.getTablePrimaryKey("");
                Sheet sheet = new Sheet(sheetEnum.getIndex(), 0);
                sheet.setSheetName(sheetEnum.getDesc());
                MultipleSheelPropety multipleSheelPropety = new MultipleSheelPropety();
                multipleSheelPropety.setData(primaryKeyVOList);
                multipleSheelPropety.setSheet(sheet);
                excelList.add(multipleSheelPropety);
            }
        }
    }

}
