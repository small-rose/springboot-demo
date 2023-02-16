package com.small.o2o.comp.module.facade;


import com.alibaba.excel.metadata.Sheet;
import com.cppic.obgenerator.small.constants.OBConstants;
import com.cppic.obgenerator.small.excel.MultipleSheelPropety;
import com.cppic.obgenerator.small.service.OracleMetaDataService;
import com.cppic.obgenerator.small.vo.ORATablePrimaryKeyVO;
import com.cppic.obgenerator.small.vo.ObTablePrimaryKeyVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class OraclePkRepairService  extends com.cppic.obgenerator.small.facade.CommonGenerater {


    @Autowired
    private OracleMetaDataService oracleMetaDataService;
    @Autowired
    private com.cppic.obgenerator.small.facade.FilePickService filePickService;

    @PostConstruct
    public void init(){
        commmonFilePickService = filePickService ;
    }


    public void listPkList(String filePath){
        List<MultipleSheelPropety> excelList  = getDatas();
        generaterExcel(filePath, excelList);
    }

    private List<MultipleSheelPropety>  getDatas() {
        ArrayList<MultipleSheelPropety> excelList = new ArrayList<>();
        for (OBConstants.SheetNameEnum sheetEnum : OBConstants.SheetNameEnum.values()) {

            if (12 == sheetEnum.getIndex()) {
                log.info("开始查 " + sheetEnum.getCode());
                List<ORATablePrimaryKeyVO> typeList = getSomeList(sheetEnum.getCode());
                Sheet sheet = new Sheet(sheetEnum.getIndex(), 0);
                sheet.setSheetName("ORA表主键");
                MultipleSheelPropety multipleSheelPropety = new MultipleSheelPropety();
                multipleSheelPropety.setData(typeList);
                multipleSheelPropety.setSheet(sheet);
                excelList.add(multipleSheelPropety);
            }
        }
        return excelList;
    }

    private List<ORATablePrimaryKeyVO> getSomeList(String code) {
        List<ORATablePrimaryKeyVO> resultList = new ArrayList<>();
        // 需要处理主键的表
        List<String> tableList = filePickService.getTestOracleTable();

        ORATablePrimaryKeyVO object = null;
        int indexNo = 1;
        for (String tableName : tableList) {
            if (!StringUtils.hasText(tableName)){
                continue;
            }
            List<ObTablePrimaryKeyVO> oraObjList = oracleMetaDataService.queryTablePrimaryKeyVO(tableName);

            for (ObTablePrimaryKeyVO test : oraObjList) {
                object = new ORATablePrimaryKeyVO();
                object.setNo(String.valueOf(indexNo));

                object.setTableName(test.getTableName());
                object.setConstraintName(test.getConstraintName());
                object.setColumnName(test.getColumnName());
                resultList.add(object);
                indexNo++ ;
            }

        }

        return resultList;
    }


}
