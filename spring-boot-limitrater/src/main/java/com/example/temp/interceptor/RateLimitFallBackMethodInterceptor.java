package com.example.temp.interceptor;

import com.example.temp.fallback.RateLimitFallBackHandler;
import lombok.Setter;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：  限流降级处理器
 * @author: 张小菜
 * @date: 2021/5/22 14:10
 * @version: v1.0
 */
@Setter
public class RateLimitFallBackMethodInterceptor extends RateLimitInterceptor{

    private boolean isOverLimit = false;

    public boolean isOverLimit() {
        return isOverLimit;
    }

    public void setOverLimit(boolean overLimit) {
        isOverLimit = overLimit;
    }

    public RateLimitFallBackMethodInterceptor(boolean isOverLimit) {
        this.setOverLimit(isOverLimit);
    }

    /**
     *
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(final ProceedingJoinPoint joinPoint) throws Throwable {
        if (this.isOverLimit()){
            return RateLimitFallBackHandler.getInstance().fallBackHandler(joinPoint);
        }

        setRateLimitInterceptor(new ExceptionFallBackCheckInterceptor());
        return rateLimitInterceptor.invoke(joinPoint);
    }
}
