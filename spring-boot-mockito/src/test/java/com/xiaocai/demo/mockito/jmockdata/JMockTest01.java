package com.xiaocai.demo.mockito.jmockdata;

import com.github.jsonzou.jmockdata.JMockData;
import com.github.jsonzou.jmockdata.TypeReference;
import com.xiaocai.demo.mockito.jmockdata.bean.BasicBean;
import com.xiaocai.demo.mockito.jmockdata.bean.UserInfo;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ JMockTest01 ] 说明：无
 * @Function :  功能说明： https://github.com/jsonzou/jmockdata.git
 * @Date ：2022/7/11 19:10
 * @Version ： 1.0
 **/

public class JMockTest01 {

    /**
     * 测试模拟简单List<String>
     */
    @Test
    public void mockTest_BaseType() {
        // 基础数据类型
        System.out.println(JMockData.mock(byte.class));
        System.out.println(JMockData.mock(int.class));
        System.out.println(JMockData.mock(long.class));
        System.out.println(JMockData.mock(double.class));
        System.out.println(JMockData.mock(float.class));
        System.out.println(JMockData.mock(String.class));
        System.out.println(JMockData.mock(BigDecimal.class));
        System.out.println(JMockData.mock(Date.class));
        System.out.println(JMockData.mock(Timestamp.class));
        System.out.println(JMockData.mock(Object.class));

        // 基础数据类型的数组
        System.out.println(JMockData.mock(byte[].class));
        System.out.println(JMockData.mock(int[].class));
        System.out.println(JMockData.mock(long[].class));
        System.out.println(JMockData.mock(double[].class));
        System.out.println(JMockData.mock(float[].class));
        System.out.println(JMockData.mock(String[].class));
        System.out.println(JMockData.mock(BigDecimal[].class));
    }

    /**
     * 测试模拟简单List<String>
     */
    @Test
    public void mockTest_User() {
        UserInfo mockData = JMockData.mock(UserInfo.class);
        System.out.println(mockData);
    }

    /**
     * 测试模拟简单 bean
     */
    @Test
    public void mockTest_Bean() {
        //调用模拟数据的方法模拟Java对象
        BasicBean basicBean = JMockData.mock(BasicBean.class);
        System.out.println(basicBean);
    }




}
