package cn.xiaocai.limiter.spi.fixture;


import cn.xiaocai.limiter.spi.RateLimitSPI;
import cn.xiaocai.limiter.spi.ScopeType;
import cn.xiaocai.limiter.spi.fixture.HmilyTestSPI;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-26 17:54
 **/
@RateLimitSPI(value = "myTest", order = 1, scopeType = ScopeType.SINGLETON)
public class MyTestSPI implements HmilyTestSPI {
    @Override
    public String sayHello() {
        return "THIS IS MY TEST SPI";
    }

    @Override
    public void init() {

    }
}
