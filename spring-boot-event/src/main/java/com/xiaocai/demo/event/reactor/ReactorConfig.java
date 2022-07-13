package com.xiaocai.demo.event.reactor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.Environment;
import reactor.core.Reactor;
import reactor.core.spec.Reactors;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ ReactorConfig ] 说明：无
 * @Function :  功能说明：
 *                  实例化Reactor Bean,这里采用内部 Bean 方式实现，
 *                  其他方式也可以，保证能够供其它类注入即可
 * @Date ：2022/7/13 11:29
 * @Version ： 1.0
 **/

@Configuration
public class ReactorConfig {

    @Bean
    Environment env() {
        return new Environment();
    }

    @Bean
    Reactor createReactor(Environment env) {
        return Reactors.reactor()
                .env(env)
                .dispatcher(Environment.THREAD_POOL)
                .get();
    }
}
