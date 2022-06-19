package com.xiaocai.demo.java;

//import com.fenet.insurance.core.exception.BusinessException;

import org.apache.commons.lang.ArrayUtils;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pgl
 * @ClassName ConditionAppendSqlUtils
 * @Description
 * @date:2022/5/20
 */
public class ConditionAppendSqlUtils {

    private final static int MAX_IN_LENGTH = 10 ;


    @Test
    public void test_01(){

        //String s = ConditionAppendSqlUtils.addOneConditionByNameMap("p", "name", "12356");
        //String s = ConditionAppendSqlUtils.addOneConditionByNameMap("p", "name", "12356", "=");
        //String s = ConditionAppendSqlUtils.addOneConditionByNameMap("p", "name", "123:156", "=");
        //String s = ConditionAppendSqlUtils.addOneConditionByNameMap("p", "name", "123,156", "=");
        //String s = ConditionAppendSqlUtils.addOneConditionByNameMap("p", "name", "123,156,137,144,128,151,167,223,218,101,67", "=");
        String s = ConditionAppendSqlUtils.addOneConditionByNameMap("p", "name", "123,156,137,144,128,151,167,223,218,101", "=");
        System.out.println(s);

        StringBuffer sb = new StringBuffer("select * from d_userpower  d where d.TRADETYPE in ( ");
        List<String> data = Arrays.asList("A0","B0","C0","10","20","30","W0","V0","D0");
        int len = data.size();
        int index = 0;
        for (int i = 0; i < 2000 ; i++) {

            sb.append("'").append("A").append(i).append("', ");

        }
        sb.append(")");
        System.out.println("----------\n " + sb.toString());
    }

    public static void main(String[] args) {
        //String s = ConditionAppendSqlUtils.addOneConditionByNameMap("p", "name", "123:156", "=");
        //String s = ConditionAppendSqlUtils.addOneConditionByNameMap("p", "name", "123,156", "=");
        String s = ConditionAppendSqlUtils.addOneConditionByNameMap("p", "name", "123,156,137,144,128,151,167,223,218,101,67", "=");
        System.out.println(s);


    }



    public static <T> String addOneConditionByNameMap(String tableAlias, String name, T value) {
        return addOneConditionByNameMap(tableAlias,name,value,"=");
    }

    /**
     * 拼接SQL
     *
     * @param tableAlias 表的别名
     * @param name       字段名称
     * @param value      字段值（参数值）
     * @param operator
     * @param <T>
     * @return
     */
    public static <T> String addOneConditionByNameMap(String tableAlias, String name, T value, String operator) {
        StringBuilder sb = new StringBuilder();
        if (!StringUtils.hasText(operator)) {
            operator = "=";
        }
        if (value != null && !"".equals(value)) {
            String preffix = null;
            sb.append(" AND  ");
            // 拼接表的别名
            if (StringUtils.hasText(tableAlias)) {
                preffix = tableAlias + "." + name;
            } else {
                preffix = name;
            }

            if (value instanceof String) {
                String tempValue = (String) value;
                // 参数值中冒号分隔符特殊处理
                if (tempValue.contains(":")) {
                    String[] valueArray = tempValue.split(":");
                    if (valueArray.length != 2) {
                        //throw new BusinessException("字段" + name + "使用冒号的格式不对！");
                    }
                    sb.append(preffix).append(" BETWEEN '").append(valueArray[0].trim()).append("' AND '").append(valueArray[1].trim()).append("'");

                    return String.valueOf(sb);
                } else if (tempValue.contains(",")) {
                    // 参数值中逗号分隔符特殊处理
                    String[] valueArray = tempValue.split(",");

                    if (valueArray.length <= MAX_IN_LENGTH) {
                        sb.append(preffix).append(" IN (");
                        for (int i = 0; i <= valueArray.length - 1; i++) {
                            sb.append("'").append(valueArray[i].trim()).append("', ");
                        }
                        sb.append(")");
                        return String.valueOf(sb.deleteCharAt(sb.lastIndexOf(",")));
                    } else {

                        // oracle/mysql 数据库查询,IN 的个数限制1000
                        int len = valueArray.length / MAX_IN_LENGTH + 1; //批次

                        for (int i = 0; i < len; i++) {
                            if (i==0){
                                sb.append(" ( ").append(preffix).append(" IN ( ");
                            }else{
                                sb.append(" OR ").append(preffix).append(" IN ( ");
                            }

                            //取出1个批次的条数
                            String[] subarray = (String[]) ArrayUtils.subarray(valueArray, 0, MAX_IN_LENGTH);

                            for (int x = 0; x < subarray.length; x++) {

                                sb.append("'").append(subarray[x].trim()).append("'");
                                if (x!=subarray.length-1){
                                    sb.append(",");
                                }
                            }
                            sb.append(")");

                            valueArray = (String[]) ArrayUtils.subarray(valueArray, MAX_IN_LENGTH, valueArray.length);
                        }

                        sb.append(" )");
                        return String.valueOf(sb);
                    }
                } else {
                    sb.append(preffix).append(" ").append(operator).append(" '").append(tempValue).append("'");
                    return String.valueOf(sb);
                }
            } else {
                sb.append(preffix).append(" ").append(operator).append(" '").append(value).append("'");
                return String.valueOf(sb);
            }
        } else {
            return "";
        }
    }


    @Test
    public void setInStringTest() {

        String sql = setInString("1,2,3,4,5", "age", new ArrayList());
        System.out.println(sql);
        //age=? or age=? or age=? or age=? or  age=?
        String ageSql = ConditionAppendSqlUtils.addOneConditionByNameMap("", "age", "1,2,3,4,5");
        System.out.println(ageSql);
    }

    private String setInString(String s, String field, List<Object> params) {
        String[] tempparam = s.split(",");

        String tempString = "";
        int i=1;
        if (tempparam.length == 0) {
            tempString = null;
        } else {

            for (String temp : tempparam) {

                if (tempparam.length == i) {
                    tempString = tempString + " " + field + "=?";
                } else {
                    tempString = tempString + field + "=?" + " or ";
                }
                i++;
                params.add(temp == null ? temp : temp.trim());
            }
        }

        return tempString;
    }


    private Boolean checkQuerytype(String s) {
        int i = s.lastIndexOf(",");
        int j = s.lastIndexOf(":");

        Boolean flag;
        if (i == -1 && j == -1) {
            flag = true;
        } else {
            if (i != -1) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    private String setInString(String s, String field) {
        String[] tempparam = s.split(",");

        String tempString = "";
        if (tempparam.length == 0) {
            tempString = null;
        } else {
            for (String temp : tempparam) {
                tempString = tempString + " or " + field + "= '" + (temp == null ? temp : temp.trim()) + "'" ;
            }
        }

        return tempString;
    }

    private String setBetweenString(String s, String field) {
        String[] tempparam = s.split(":");
        StringBuilder tempString = new StringBuilder("");

        if (tempparam.length != 2) {
            throw new RuntimeException("between格式不对！");
        } else {
            tempString.append(field
                    + " between  '"
                    + (tempparam[0] == null ? tempparam[0] : tempparam[0]
                    .trim())
                    + "'"
                    + " and "
                    + "'"
                    + (tempparam[1] == null ? tempparam[1] : tempparam[1]
                    .trim()) + "'");
        }
        return tempString.toString();
    }

    @Test
    public void test_(){
        String policyList  = "123" ;
        String sql = checkQuerytype(policyList) ?
                (" and (1!=1" + setInString(policyList, "policyno") + ")") : ("and ("
                + setBetweenString(policyList, "policyno")
                + ")");
        System.out.println(sql);

        policyList  = "123:456" ;
        sql = checkQuerytype(policyList) ?
                (" and (1!=1" + setInString(policyList, "policyno") + ")") : ("and ("
                + setBetweenString(policyList, "policyno")
                + ")");
        System.out.println(sql);

        policyList  = "123,124,135" ;
        sql = checkQuerytype(policyList) ?
                (" and (1!=1" + setInString(policyList, "policyno") + ")") : ("and ("
                + setBetweenString(policyList, "policyno")
                + ")");
        System.out.println(sql);
    }
}
