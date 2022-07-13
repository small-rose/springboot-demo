package com.xiaocai.demo.event.reactor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.Reactor;

import static reactor.event.selector.Selectors.$;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ ReactorService ] 说明：无
 * @Function :  功能说明：
 *                      实现InitializingBean接口，以便将发送的事件绑定到指定的监听器
 * @Date ：2022/7/13 11:35
 * @Version ： 1.0
 **/
@Service
public class ReactorService implements InitializingBean {

    @Autowired
    private Reactor reactor;

    @Autowired
    private AppListener appListener;
    @Autowired
    private EmailListener emailListener;

    @Override
    public void afterPropertiesSet() throws Exception {

        reactor.on($("eventHandler"), appListener);
        reactor.on($("emailHandler"), emailListener);

    }
}
