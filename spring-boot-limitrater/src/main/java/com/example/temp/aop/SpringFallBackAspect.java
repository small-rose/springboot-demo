package com.example.temp.aop;

import org.springframework.core.Ordered;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：用于注入的类
 * @author: 张小菜
 * @date: 2021/5/23 17:40
 * @version: v1.0
 */
public class SpringFallBackAspect  extends AbstractFallBackAop implements Ordered {

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}
