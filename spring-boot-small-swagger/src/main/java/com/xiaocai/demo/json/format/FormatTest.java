package com.xiaocai.demo.json.format;

import com.alibaba.fastjson.JSONObject;
import com.xiaocai.demo.json.bean.MyBean;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ FormatTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/22 15:00
 * @Version ： 1.0
 **/
public class FormatTest {

    public static void main(String[] args) {

        MyBean bean = new MyBean();
        bean.setStatus("1");
        bean.setReturnMsg("你的参数没有输入");
        String data = JSONObject.toJSONString(bean);
        System.out.println(data);
    }
}
