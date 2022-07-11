package com.xiaocai.demo.java.utils;

import java.io.*;

public class StringUtils {

    public static BufferedReader getBufferedReader(String filePath) {
        File file = new File(filePath);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // todo
        }
        return reader;
    }

    public static BufferedWriter getBufferedWriter(String filePath) {
        File file = new File(filePath);
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // todo
        }
        return writer;
    }
    /**
     * 去右空格
     * @param str
     * @return
     */
    public static String trimRight(String str) {
        if (str == null || str.equals("")) {
            return str;
        } else {
            return str.replaceAll("[　 ]+$", "");
        }
    }

    /**
     * 去左空格
     * @param str
     * @return
     */
    public static String trimLeft(String str) {
        if (str == null || str.equals("")) {
            return str;
        } else {
            return str.replaceAll("^[　 ]+", "");
        }
    }

    /**
     * 首字母小写
     * @param str
     * @return
     */
    public static String lowerFirstCase(String str){
        char[] chars = str.toCharArray();
        //首字母小写方法，大写会变成小写，如果小写首字母会消失
        chars[0] +=32;
        return String.valueOf(chars);
    }

    /**
     * 首字母大写
     * @param str
     * @return
     */
    public static String upperFirstCase(String str){
        char[] chars = str.toCharArray();
        //首字母小写方法，大写会变成小写，如果小写首字母会消失
        chars[0] -=32;
        return String.valueOf(chars);
    }

    /**
     * 方法参数全替换
     * @param str  ：(@Param("in_id")String in_id, @Param("in_amount")BigDecimal in_amount, @Param("opdate")Date opdate,@Param("map") Map<String,Object> map)
     * @return
     */
    public static String changeParams(String str){
        //当方法是空参时
        if (str.length() == 2){
            return "();";
        }
        //当方法只有一个参数时
        if (!str.contains(",")){
            String param = getParam(str);
            return "(" + param + ");";
        }

        String[] params = str.split(",");
        StringBuilder sb = new StringBuilder("(");
        for (String param : params) {
            //当方法参数有  Map<String,Object> 对这种情况的处理
            if(param.contains(">") && !param.contains("<")) {
                continue;
            }
            sb.append(getParam(param)).append(",");
        }
        //删除最后多余的逗号
        sb = sb.deleteCharAt(sb.length() - 1);
        return sb.append(");").toString();
    }


    public static String getParam(String str){
        //当包含有Map,List 时，先处理,不先处理 Map<String  或List<String> list 这种情况会被赋值为 "1";
        if (str.contains("Map") || str.contains("List")) {
            return null;
        }

        if (str.contains("String")) {
            return "\"1\"";
        } else if (str.contains("Date")){
            return "new Date()";
        } else if (str.contains("Integer") || str.contains("int")) {
            return "1";
        } else if (str.contains("Long") || str.contains("long")) {
            return "1L";
        } else if (str.contains("BigDecimal")) {
            return "new BigDecimal(\"1.00\")";
        } else {
            //其他类型返回null,后再手动处理
            return null;
        }

    }


    public static void main(String[] args) {
        String s = "(@Param(\"subcompany\") String subcompany,@Param(\"startdate\") Date startdate,@Param(\"cst_type\") Integer cst_type,@Param(\"map\") Map<String,Object> map,List<String> list)";

        String a = "(String a)";
        String b = "()";
        System.out.println(changeParams(s));
        System.out.println(changeParams(a));
        System.out.println(changeParams(b));
    }

}
