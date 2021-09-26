package com.xiaocai.demo.json.parse;

import com.alibaba.fastjson.JSON;
import com.xiaocai.demo.json.bean.MyBean;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ ParseTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/22 14:48
 * @Version ： 1.0
 **/
public class ParseTest {

    public static void main(String[] args) {

        String data = "{\"FLAG\":\"0\",\"RETURN_MSG\":\"SUCCESS\"}";
        MyBean request = JSON.parseObject(data, MyBean.class);
        System.out.println(request);
    }
}
