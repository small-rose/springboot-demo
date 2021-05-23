package com.example.temp.fallback;


import org.aspectj.lang.ProceedingJoinPoint;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * TODO 描述：  定义执行降级接口
 * @author: 张小菜
 * @date: 2021/5/23 15:19
 * @version: v1.0
 */
public interface FallBackHandler {

    Map<String, Object> resultMap = new HashMap<>();

    String DEFAULT_FALL_BACK = "defaultFallBack";

    String DEFAULT_FALL_MAG = "Api was limited , please try it later !";

    /**
     *
     * @return
     */
    Object callDefaultFallBack(ProceedingJoinPoint joinPoint, Throwable throwable) throws Throwable;


    /**
     * 设置自定义服务降级的返回
     * @return
     */
    Object setResult(Throwable throwable);



}
