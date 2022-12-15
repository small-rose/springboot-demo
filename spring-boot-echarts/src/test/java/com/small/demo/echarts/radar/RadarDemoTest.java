package com.small.demo.echarts.radar;

import com.small.demo.echarts.EchartsApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ RadarDemoTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/12/15 15:22
 * @Version ： 1.0
 **/
public class RadarDemoTest extends EchartsApplicationTests {
    @Autowired
    private RadarDemo radarDemo ;

    @Test
    public void radarTest(){

        radarDemo.radar();
    }

}
