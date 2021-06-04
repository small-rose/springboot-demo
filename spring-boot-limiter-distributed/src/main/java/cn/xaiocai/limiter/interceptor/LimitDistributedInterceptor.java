package cn.xaiocai.limiter.interceptor;

import cn.xiaocai.limiter.distributed.invoker.RateLimitDistributedPredicate;
import com.example.temp.interceptor.RateLimitDistributedInterceptor;
import com.example.temp.interceptor.RateLimitFallBackMethodInterceptor;
import com.example.temp.interceptor.RateLimitGlobalInterceptor;
import com.example.temp.service.RateLimitHandlerPredicate;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-02 11:14
 **/
@Slf4j
public class LimitDistributedInterceptor extends RateLimitGlobalInterceptor {

    @Override
    public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
        boolean result = RateLimitDistributedPredicate.getInstance().invoke(joinPoint);
        if (result) {
            // 如果是分布式限流 走分布式限流拦截
            log.info("RateLimitGlobalInterceptor invoke distributed rate limiter ! result : "+ true);
            this.setRateLimitInterceptor(new RateLimitDistributedInterceptor(result));
        }else{
            // 走本地的限流拦截
            result = RateLimitHandlerPredicate.getInstance().invoke(joinPoint);
            log.info("RateLimitGlobalInterceptor invoke rate limiter result : "+ true);
            // 责任链传递，看是否需要执行 RateLimitXXX的 failBack()降级方法
            this.setRateLimitInterceptor(new RateLimitFallBackMethodInterceptor(result));
        }
        return rateLimitInterceptor.invoke(joinPoint);
    }
}
