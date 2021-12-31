package com.xiaocai.demo.excel.platUrl;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.xiaocai.demo.excel.common.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ PlatExcelReadListener ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/27 11:28
 * @Version ： 1.0
 **/
public class PlatExcelReadForUpdateListener extends AnalysisEventListener<PlatIndexOrNameData> {


    private final List<String> tableInsertList = new ArrayList<>();
    private Map<String, String> subcompany = new HashMap<>();

    private int index = 1;
    // 生成SQL路径
    private String sqlPath ;
    // 表注释修改SQL格式
    private String insert_sql;

    public PlatExcelReadForUpdateListener() {
    }

    public void setSqlPath(String sqlPath) {
        File file = new File(sqlPath);
        if (!file.exists()){
            file.mkdirs();
        }else {
            FileUtils.Delete(sqlPath);
        }
        this.sqlPath = sqlPath;
    }

    public void setInsert_sql(String insert_sql) {
        this.insert_sql = insert_sql;
    }

    public void setSubcompany(Map<String, String> subcompany) {
        this.subcompany = subcompany;
    }

    @Override
    public void invoke(PlatIndexOrNameData platData, AnalysisContext analysisContext) {
        System.out.println(index+" DATA :" + platData);

        if (platData!=null && !"86".equals(platData.getDept())){

            String desc = subcompany.get(platData.getDept());
            // 商业险
            String switchedsys = "VEHICLE_INSURANCE_AUTHENTICATION_URL";
            if ("0360".equals(platData.getProduct())){
                // 交强险
                switchedsys = "CLIVTA_AUTHENTICATION_URL";
                desc += "(0360)交强险";
            }else{
                desc += "("+platData.getProduct()+")商业险";
            }
            String product = platData.getProduct();
            if (!product.startsWith("0")){
                product = "0"+product;
            }
            String subcompany = platData.getDept().concat(product);

            String platUrl = platData.getUrl().concat("=").concat(platData.getUser()).concat("=").concat(platData.getPass());
            String insert = String.format(insert_sql, platUrl, subcompany, switchedsys);
            System.out.println(index +"> " +insert);
            if (!tableInsertList.contains(insert)) {
                tableInsertList.add(insert);
            }

        }
        index++ ;
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        String sheetName = context.readSheetHolder().getSheetName();
        System.out.println(String.format("-----------%s sheet 页解析完毕！--------------",sheetName));

        // tableInsertList.stream().forEach((s)-> FileUtils.Write(sqlPath, s));
        tableInsertList.stream().forEach((s)-> System.out.println(s));

        tableInsertList.clear();
        System.out.println(String.format("--文件生成成功：%s-----",sqlPath));
    }

}
