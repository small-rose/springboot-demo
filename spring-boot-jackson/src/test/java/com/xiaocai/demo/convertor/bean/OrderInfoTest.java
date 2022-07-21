package com.xiaocai.demo.convertor.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.UUID;

public class OrderInfoTest {


    @Test
    public void test_9(){

        XmlMapper xmlMapper = new XmlMapper();
        //字段为null，自动忽略，不再序列化
        xmlMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        OrderInfo orderInfo = new OrderInfo();
        Head head = new Head();
        Policy policy1 = new Policy("10001","33334343",new BigDecimal("100.00"),"202207210001");
        Policy policy2 = new Policy("10001","33334343",new BigDecimal("100.00"),"202207210001");
        head.setUserName("TX-01");
        head.setPassword("TX01234");
        head.setTraceId(UUID.randomUUID().toString());
        orderInfo.setHead(head);
        orderInfo.setPolicyList(Lists.newArrayList(policy1, policy2));

        try {
            //对象转xml
            String xml = xmlMapper.writeValueAsString(orderInfo);
            //<Root><Head><UserName>TX-01</UserName><Pass>TX01234</Pass><TraceNo>1b2026b6-0ddb-4a29-aa55-2c16198e576b</TraceNo></Head><PolicyList><policy><policyNo>10001</policyNo><idNo>33334343</idNo><amount>100.00</amount><applyNo>202207210001</applyNo></policy><policy><policyNo>10001</policyNo><idNo>33334343</idNo><amount>100.00</amount><applyNo>202207210001</applyNo></policy></PolicyList></Root>
            //xml转对象
            OrderInfo dep = xmlMapper.readValue(xml, OrderInfo.class);

            System.out.println("返回的xml：" + xml);
            System.out.println("返回的实体：" + dep);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}