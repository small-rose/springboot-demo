package cn.small.demo.qlexpress.java;

import org.springframework.util.StringUtils;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ BeanExample ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/11/4 14:55
 * @Version ： 1.0
 **/
public class BeanExample {

    /**
     * class static method
     * @param str
     * @return
     */
    public static String upper(String str){
        if (!StringUtils.hasText(str)){
            return str;
        }
        return str.toUpperCase();
    }

    /**
     * service method
     * @param str1
     * @param str2
     * @return
     */
    public  boolean anyContains(String str1, String str2){
        if (!StringUtils.hasText(str1) || !StringUtils.hasText(str2)){
            return false;
        }
        char[] s = str2.toCharArray();
        for (char c : s) {
            if (str1.contains(c+"")) {
                return true;
            }
        }
        return false;
    }

}
