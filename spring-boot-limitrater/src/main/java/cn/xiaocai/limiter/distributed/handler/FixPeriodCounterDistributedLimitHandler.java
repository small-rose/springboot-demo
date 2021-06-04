package cn.xiaocai.limiter.distributed.handler;

import com.example.temp.annotation.RateLimitFCL;
import com.example.temp.handler.AbstractRateLimitHandler;
import com.example.temp.handler.LimitHandler;
import com.example.temp.limit.FixPeriodCountRateLimiter;
import com.example.temp.limit.IRateLimiter;
import com.example.temp.service.RateLimiterContext;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-26 14:25
 **/
@Slf4j
public class FixPeriodCounterDistributedLimitHandler  extends AbstractRateLimitHandler implements LimitHandler {

    private RateLimiterContext rateLimiterContext;

    public FixPeriodCounterDistributedLimitHandler(RateLimiterContext rateLimiterContext) {
        this.rateLimiterContext = rateLimiterContext;
    }

    @Override
    public boolean handler(Method method) {
        return defaultHandler(method);
    }

    @Override
    public IRateLimiter registry(Method method) {
        String methodName = method.toString();
        RateLimitFCL rateLimit = method.getAnnotation(RateLimitFCL.class);
        IRateLimiter rateLimiter = CACHE_LIMIT.get(methodName);
        if (Objects.isNull(rateLimiter)){
            synchronized(this) {
                log.info("FixPeriodRateLimiter will registry newInstance ... ");
                IRateLimiter fclLimiter = new FixPeriodCountRateLimiter(rateLimit.maxLimited(), rateLimit.period(), rateLimit.timeUnit()) ;
                CACHE_LIMIT.put(methodName, fclLimiter);
            }
        }
        log.info("cache map : " + CACHE_LIMIT.toString());
        return CACHE_LIMIT.get(methodName);
    }
}
