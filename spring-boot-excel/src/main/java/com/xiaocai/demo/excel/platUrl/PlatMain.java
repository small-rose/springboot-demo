package com.xiaocai.demo.excel.platUrl;

import com.alibaba.excel.EasyExcel;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ PlatMain ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/27 11:31
 * @Version ： 1.0
 **/
public class PlatMain {

    static Map<String, String> subcompany = new LinkedHashMap<>();

    static String SEPARATOR = File.separator ;

    static final String targetSqlPath = "D:"+SEPARATOR+"AnCheng"+ SEPARATOR+"db_plat_update.sql";

    //static String sql = "INSERT INTO MM_SWITCHCONTROL_TC (SUBCOMPANY, SWITCHEDSYS, IFVALID, DESCRIPTION, TIMESTAMP, SWITCHINFO, INTFTYPE) values ('%s', '%s', '1', '%s实名认证地址', sysdate, '%s', '=');";
    static String sql = "UPDATE MM_SWITCHCONTROL_TC SET SWITCHINFO= '%s' WHERE SUBCOMPANY='%s' AND SWITCHEDSYS = '%s';";

    static String sourceFile = "D:"+SEPARATOR+"Ancheng"+ File.separator+"ac_plat_prod_urls.xlsx";

    
    static {
        subcompany.put("11", "北京");
        subcompany.put("13", "河北");
        subcompany.put("13", "河北");
        subcompany.put("14", "山西");
        subcompany.put("14_k", "山西");
        subcompany.put("31", "上海");
        subcompany.put("32", "江苏");
        subcompany.put("33", "浙江");
        subcompany.put("34", "安徽");
        subcompany.put("37", "山东");
        subcompany.put("41", "河南");
        subcompany.put("44", "广东");
        subcompany.put("50", "重庆");
        subcompany.put("51", "四川");
        subcompany.put("52", "贵州");
        subcompany.put("53", "云南");
        subcompany.put("61", "陕西");
        subcompany.put("62", "甘肃");
        subcompany.put("83", "深圳");
        subcompany.put("83_del", "深圳");

        subcompany.put("84", "青岛");
        subcompany.put("85", "宁波");
    }

    public static void main(String[] args) {
        //PlatExcelReadListener platListener = new PlatExcelReadListener();
        PlatExcelReadForUpdateListener platListener = new PlatExcelReadForUpdateListener();
        platListener.setInsert_sql(sql);
        platListener.setSqlPath(targetSqlPath);
        platListener.setSubcompany(subcompany);

        // 被读取的文件绝对路径
        EasyExcel.read(sourceFile, PlatIndexOrNameData.class, platListener).sheet().doRead();
    }


}
