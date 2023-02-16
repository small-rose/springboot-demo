package com.small.o2o.comp.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.small.o2o.comp.SmallO2oCompApplicationTests;
import com.small.o2o.comp.module.service.oracle.OracleMetaDataService;
import com.small.o2o.comp.module.vo.OraTableYasuoVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SQLGenTest extends SmallO2oCompApplicationTests {

    @Autowired
    private OracleMetaDataService oracleMetaDataService;

    String targetPath = "";

    @Test
    public void dropSql(){
        // 写法2：
        String fileName = "E:\\Users\\small-rose\\Desktop\\表和列的差异清单.xlsx";

        // 刪表
//        ExcelReader excelReader = EasyExcel.read(fileName, DropTableVo.class, new TableListener()).build();
//        ReadSheet readSheet = EasyExcel.readSheet(0).build();
//        excelReader.read(readSheet);
//        excelReader.finish();

        List<OraTableYasuoVo> oraTableYasuoVos = oracleMetaDataService.queryTableYasuo("");

/*        Map<String, String> tableMap = oraTableYasuoVos.stream().collect(
                Collectors.toMap(OraTableYasuoVo::getTableName, OraTableYasuoVo::getCompression, (key1, key2) -> key2));*/

        Map<String, String> tableMap = new HashMap<>();
        for (OraTableYasuoVo yasuoVo : oraTableYasuoVos) {
            tableMap.put(yasuoVo.getTableName(), yasuoVo.getCompression());
        }
        // 刪列
        ExcelReader excelReader2 = EasyExcel.read(fileName,  DropColumnVo.class, new  TableColumnListener(tableMap)).build();
        ReadSheet readSheet2 = EasyExcel.readSheet(1).build();
        excelReader2.read(readSheet2);
        // 这里千万别忘记关闭，读的时候会创建临时文件，到时磁盘会崩的
        excelReader2.finish();
    }
}
