package com.xiaocai.demo.event.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ EventSourceObject ] 说明： 事件源.
 * @Function :  功能说明：无
 * @Date ：2022/7/13 7:45
 * @Version ： 1.0
 * learn link  https://www.pudn.com/news/628f82ecbf399b7f351e5785.html
 **/
public class EventSourceObject {

    private String name;
    //监听器容器
    private Set<CustomerEventListener > listener;
    public EventSourceObject(){
        this.listener = new HashSet<CustomerEventListener>();
        this.name = "defaultname";
    }
    //给事件源注册监听器
    public void addCusListener(CustomerEventListener cel){
        this.listener.add(cel);
    }
    //当事件发生时,通知注册在该事件源上的所有监听器做出相应的反应（调用回调方法）
    protected void notifies(){
        CustomerEventListener cel = null;
        Iterator<CustomerEventListener> iterator = this.listener.iterator();
        while(iterator.hasNext()){
            cel = iterator.next();
            cel.fireCusEvent(new CustomerEvent(this));
        }
    }
    public String getName() {
        return name;
    }

    //模拟事件触发器，当成员变量name的值发生变化时，触发事件。
    public void setName(String name) {
        if(!this.name.equals(name)){
            this.name = name;
            notifies();
        }
    }
}
