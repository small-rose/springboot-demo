package com.xiaocai.demo.event.guava.original;

import com.google.common.eventbus.Subscribe;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ SimpleListener ] 说明：无
 * @Function :  功能说明：Guava event bus
 * @Date ：2022/7/13 9:00
 * @Version ： 1.0
 **/
public class SimpleListener {

    @Subscribe
    public void task(String s) {
        System.out.println("do task(" + s + ")");
    }
}
