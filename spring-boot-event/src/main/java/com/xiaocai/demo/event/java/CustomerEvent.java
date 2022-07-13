package com.xiaocai.demo.event.java;

import java.util.EventObject;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ CustomerEvent ] 说明：事件类,用于封装事件源及一些与事件相关的参数.
 * @Function :  功能说明：无
 * @Date ：2022/7/13 7:43
 * @Version ： 1.0
 **/
public class CustomerEvent extends EventObject {

    private static final long serialVersionUID = 1L;
    private Object source;//事件源

    public CustomerEvent(Object source){
        super(source);
        this.source = source;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }
}
