package com.xiaocai.demo.quartz.tasks.emun;

import java.io.Serializable;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ JobOperateEnum ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/18 17:44
 * @Version ： 1.0
 **/
public enum JobOperateEnum {

    START(1, "启动"),
    PAUSE(2, "暂停"),
    DELETE(3, "删除");

    private final Integer value;
    private final String desc;

    JobOperateEnum(final Integer value, final String desc) {
        this.value = value;
        this.desc = desc;
    }

    public Serializable getValue() {
        return this.value;
    }

    // Jackson 注解为 JsonValue 返回中文 json 描述
    public String getDesc() {
        return this.desc;
    }

    public String getEnumName() {
        return name();
    }
}
