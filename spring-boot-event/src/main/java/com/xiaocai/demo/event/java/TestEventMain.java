package com.xiaocai.demo.event.java;

import org.junit.Test;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ TestEventMain ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/13 7:46
 * @Version ： 1.0
 **/
public class TestEventMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        EventSourceObject object = new EventSourceObject();
        //注册监听器
            object.addCusListener(new CustomerEventListener(){
            @Override
            public void fireCusEvent(CustomerEvent e) {
                super.fireCusEvent(e);
            }
        });
        //触发事件
        object.setName("eric");
    }



}
