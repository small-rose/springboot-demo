package com.xiaocai.demo.event.java;

import org.junit.Test;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ EventMainTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/13 13:14
 * @Version ： 1.0
 **/
public class EventMainTest {

    /**
     *Java 自带的事件测试
     */
    @Test
    public  void main() {
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
