package cn.xiaocai.limiter.distributed.handler;

import com.example.temp.handler.AbstractRateLimitHandler;
import com.example.temp.handler.LimitHandler;
import com.example.temp.limit.IRateLimiter;
import com.example.temp.service.RateLimiterContext;

import java.lang.reflect.Method;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-26 14:25
 **/
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
    protected IRateLimiter registry(Method method) {

        return null;
    }
}
