package cn.xaiocai.limiter.aop;

import cn.xaiocai.limiter.distributed.repository.RedisRepository;
import cn.xaiocai.limiter.interceptor.LimitDistributedInterceptor;
import com.example.temp.aop.SpringRateLimitAspect;
import jdk.nashorn.internal.codegen.CompilerConstants;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-02 11:06
 **/
@Slf4j
public class SpringRateLimitDistributedAspect extends SpringRateLimitAspect {

    private final LimitDistributedInterceptor interceptor = new LimitDistributedInterceptor();

    private final RedisRepository redisRepository;

    public SpringRateLimitDistributedAspect(RedisRepository redisRepository) {
        super();
        this.redisRepository = redisRepository;
    }

    /**
     *   拦截处理限流注解
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Override
    @Around(value = "SWLLimitInterceptor() || FCLLimitInterceptor() || TBLLimitInterceptor() || LBLLimitInterceptor()")
    public Object rateLimitMethod(final ProceedingJoinPoint joinPoint) throws Throwable {
        // 启动的时候借助 RateLimiterContext 验证，此处可以不重复验证
        // checkAnnotationCompatible(joinPoint);
        log.trace("----分布式限流切面----" );

        return interceptor.invoke(joinPoint);
    }

}
