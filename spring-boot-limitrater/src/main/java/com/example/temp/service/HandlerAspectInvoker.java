package com.example.temp.service;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：  抽象执行器
 * @author: 张小菜
 * @date: 2021/5/23 18:53
 * @version: v1.0
 */

public interface HandlerAspectInvoker {

    /**
     *  执行主体流程
     * @param point
     * @return
     * @throws Throwable
     */
    boolean invoke(final ProceedingJoinPoint point) throws Throwable;
}
