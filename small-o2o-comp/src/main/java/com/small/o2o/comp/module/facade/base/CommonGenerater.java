package com.small.o2o.comp.module.facade.base;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.small.o2o.comp.module.excel.CheckCellHandler;
import com.small.o2o.comp.module.excel.MultipleSheelPropety;
import com.small.o2o.comp.module.facade.FilePickService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Slf4j
public abstract class CommonGenerater {

    protected FilePickService commmonFilePickService ;


    public void generaterExcel(String filePath, List<MultipleSheelPropety> excelList) {


        log.info("开始生成Excel ...");
        if (!filePath.endsWith(".xlsx")) {
            String fileName = "元数据收集".concat(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMddHHmm"))).concat(".xlsx");
            filePath = filePath + fileName;
        }


        ExcelWriter excelWriter = null;
        try {
            List<String> whiteListTable = commmonFilePickService.getWhiteListTable();
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
}
