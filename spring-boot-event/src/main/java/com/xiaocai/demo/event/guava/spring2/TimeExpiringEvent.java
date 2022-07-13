package com.xiaocai.demo.event.guava.spring2;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ TimeExpiringEvent ] 说明：无
 * @Function :  功能说明：
 *              （2） 定义消息体
 *                     一个消息总线可以支持多种消息的订阅和发送，不同的消息通过类名来区分。
 *                      消息体使用一个简单的Java DO，本身不需要继承或实现EventBus的接口。
 * @Date ：2022/7/13 10:29
 * @Version ： 1.0
 **/
public class TimeExpiringEvent {

    private TimeTask timeTask;

    public TimeExpiringEvent(TimeTask lifeTimeTask){
        this.timeTask = lifeTimeTask;
    }

    public TimeTask getLifeTimeTask() {
        return timeTask;
    }

    public void setLifeTimeTask(TimeTask lifeTimeTask) {
        this.timeTask = lifeTimeTask;
    }
}
