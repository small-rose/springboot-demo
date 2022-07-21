package com.xiaocai.demo.convertor.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ Head ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/21 14:11
 * @Version ： 1.0
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Head {

    @JacksonXmlProperty(localName = "UserName")
    private String userName ;

    @JacksonXmlProperty(localName = "Pass")
    private String password ;

    @JacksonXmlProperty(localName = "TraceNo")
    private String traceId ;
}
