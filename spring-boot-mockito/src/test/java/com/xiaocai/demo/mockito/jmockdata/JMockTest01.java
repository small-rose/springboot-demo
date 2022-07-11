package com.xiaocai.demo.mockito.jmockdata;

import com.github.jsonzou.jmockdata.JMockData;
import com.xiaocai.demo.mockito.jmockdata.bean.UserInfo;
import org.junit.jupiter.api.Test;
/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ JMockTest01 ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/11 19:10
 * @Version ： 1.0
 **/

public class JMockTest01 {


    /**
     * 测试模拟简单List<String>
     */
    @Test
    public void mockTest_User() {
        UserInfo mockData = JMockData.mock(UserInfo.class);
        System.out.println(mockData);
    }


}
