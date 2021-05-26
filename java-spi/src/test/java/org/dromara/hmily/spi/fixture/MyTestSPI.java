package org.dromara.hmily.spi.fixture;


import cn.xiaocai.spi.demo.MySPI;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-26 17:54
 **/
@MySPI()
public class MyTestSPI implements  HmilyTestSPI{
    @Override
    public String sayHello() {
        return "THIS IS MY TEST SPI";
    }

    @Override
    public void init() {

    }
}
