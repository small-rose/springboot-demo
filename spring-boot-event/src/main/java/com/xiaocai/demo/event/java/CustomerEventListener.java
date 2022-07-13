package com.xiaocai.demo.event.java;

import java.util.EventListener;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ CustomerEventListener ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/13 7:44
 * @Version ： 1.0
 **/
public class CustomerEventListener implements EventListener {

    //事件发生后的回调方法
    public void fireCusEvent(CustomerEvent  e){
        EventSourceObject eObject = (EventSourceObject)e.getSource();
        System.out.println("My name has been changed!");
        System.out.println("I got a new name,named \""+eObject.getName()+"\"");    }
}
