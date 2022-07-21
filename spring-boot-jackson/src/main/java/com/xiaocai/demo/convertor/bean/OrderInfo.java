package com.xiaocai.demo.convertor.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ OrderInfo ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/21 13:55
 * @Version ： 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@JacksonXmlRootElement(localName = "Root")
public class OrderInfo {

    @JacksonXmlProperty(localName = "Head")
    Head head ;


    @JacksonXmlElementWrapper(localName = "PolicyList")
    @JacksonXmlProperty(localName = "policy")
    List<Policy> policyList;
}
