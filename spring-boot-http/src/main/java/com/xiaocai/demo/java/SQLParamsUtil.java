package com.xiaocai.demo.java;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ SQLParamsUtil ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/19 16:10
 * @Version ： 1.0
 **/
public class SQLParamsUtil {

    @Setter
    private String preparing;//对应带?的jdbc sql语句
    @Setter
    private String parameters;//对应所有的参数字符串
    private Integer updates;//对应受影响的行数
    private List<String> params;//对应所有的参数集合
    @Getter
    private String resultSql;//对应输出的sql



    /**
     * 解析sql
     * @param content mybatis日志sql打印部分
     * @return 输出的sql
     */
    public String parseSql(String content){
        String preParingPn = "==>  Preparing: (.*?)\n";
        Pattern r = Pattern.compile(preParingPn);
        Matcher m = r.matcher(content);
        if(m.find()){
            preparing = m.group(1);
        }
        System.out.println("preparing : " +preparing);
        String parametersPn = "==> Parameters: (.*?)\n";
        r = Pattern.compile(parametersPn);
        m = r.matcher(content);
        if(m.find()){
            parameters = m.group(1);
        }
        System.out.println("parameters : " +parameters);

        String updatesPn = "<==    Updates: (\\d+)\n";
        r = Pattern.compile(updatesPn);
        m = r.matcher(content);
        if(m.find()){
            updates = Integer.valueOf(m.group(1));
        }
        parseParameters();
        return resultSql;
    }


    /**
     * 正则匹配所有的参数
     */
    private void parseParameters(){
        parameters = parameters+ ",";
        String pattern = "([^,]*?)\\((.*?)\\),|null,";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(parameters);
        params = new ArrayList<>();
        while(m.find()){
            String param = m.group(1);
            //System.out.println(" param == " +param);
            String type = m.group(2);
            //System.out.println(" type == " +type);

           if(param == null) {
                params.add("null");
            }else{
               if("String".equals(type)){
                   params.add("\'"+param.trim()+"\'");
               }else if("Timestamp".equals(type) ){
                   params.add("TIMESTAMP'"+param.trim()+"'");
               }else {
                   params.add(param.trim());
               }
            }
        }
        resultSql = preparing;
        for (String param : params) {
            resultSql = resultSql.replaceFirst("\\?", param);
        }
    }


    public String fill() {
        parseParameters();
        return resultSql;
    }
}
