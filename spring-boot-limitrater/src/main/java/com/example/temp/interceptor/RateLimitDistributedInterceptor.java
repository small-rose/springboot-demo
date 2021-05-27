package com.example.temp.interceptor;

import cn.xiaocai.limiter.distributed.invoker.RateLimitDistributedPreparatory;
import com.example.temp.handler.LimitHandler;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @program: springboot-limiter
 * @description
 * @function: 验证是否启用了分布式限流
 * @author: zzy
 * @create: 2021-05-26 12:10
 **/
@Slf4j
public class RateLimitDistributedInterceptor extends RateLimitInterceptor  {

    private boolean distributed ;

    public RateLimitDistributedInterceptor(boolean distributed) {
        this.distributed = distributed;
    }

    @Override
    public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
        boolean result = false ;
        if (distributed){
            // 分布式限流验证
            result = RateLimitDistributedPreparatory.getInstance().invoke(joinPoint);
        }
        // 责任链传递，看是否需要执行 RateLimitXXX的 failBack()降级方法
        this.setRateLimitInterceptor(new RateLimitFallBackMethodInterceptor(result));

        return rateLimitInterceptor.invoke(joinPoint);
    }
}
