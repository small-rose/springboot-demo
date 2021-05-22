package com.example.temp.interceptor;

import com.example.temp.fallback.FallBackHandler;
import lombok.Setter;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/22 14:10
 * @version: v1.0
 */
@Setter
public class FallBackMethodInterceptor extends RateLimitInterceptor{

    public FallBackMethodInterceptor() {
        this.setOverLimit(true);
    }

    public Object invoke(final ProceedingJoinPoint joinPoint) throws Throwable {
        if (getOverLimit()){
            return FallBackHandler.getInstance().fallBackHandler(joinPoint);
        }
        return proceed(joinPoint);
    }
}
