package com.xiaocai.demo.event.guava.spring;

import com.xiaocai.demo.event.guava.spring.event.BuzEvent;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ BuzSubscriber ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/13 9:26
 * @Version ： 1.0
 **/
public interface BuzSubscriber {

    public String doBuz(BuzEvent event);
}
