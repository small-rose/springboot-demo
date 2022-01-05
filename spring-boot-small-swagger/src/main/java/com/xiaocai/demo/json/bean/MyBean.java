package com.xiaocai.demo.json.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ MyBean ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/22 14:46
 * @Version ： 1.0
 **/
@Data
public class MyBean {

    @JSONField(name = "FLAG")
    private String status ;

    @JSONField(name = "RETURN_MSG")
    private String returnMsg ;
}
