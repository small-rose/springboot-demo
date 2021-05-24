package com.example.temp.aop;

import com.example.temp.excepion.LimitConflictException;
import com.example.temp.interceptor.RateLimitGlobalInterceptor;
import com.example.temp.interceptor.RateLimitInterceptor;
import com.example.temp.service.RateLimitHandlerAspectInvoker;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Set;

/**
 * @program: springboot-limitRater
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-18 17:36
 **/
@Slf4j
@Aspect
public abstract class AbstractRateLimiterAop {

    private final RateLimitInterceptor interceptor = new RateLimitGlobalInterceptor();
/*
    @Autowired
    private RateLimiterContext context;
*/


    @Pointcut(value = "@annotation(com.example.temp.annotation.RateLimitSWL)")
    public void SWLLimitInterceptor(){};

    @Pointcut(value = "@annotation(com.example.temp.annotation.RateLimitFCL)")
    public void FCLLimitInterceptor(){};

    @Pointcut(value = "@annotation(com.example.temp.annotation.RateLimitTBL)")
    public void TBLLimitInterceptor(){};

    @Pointcut(value = "@annotation(com.example.temp.annotation.RateLimitLBL)")
    public void LBLLimitInterceptor(){};
    /**
     *   拦截处理限流注解
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around(value = "SWLLimitInterceptor() || FCLLimitInterceptor() || TBLLimitInterceptor() || LBLLimitInterceptor()")
    public Object rateLimitMethod(final ProceedingJoinPoint joinPoint) throws Throwable {
        // 启动的时候借助 RateLimiterContext 验证，此处可以不重复验证
        // checkAnnotationCompatible(joinPoint);
        log.trace("----限流切面----");
        return interceptor.invoke(joinPoint);
    }


    protected  void checkAnnotationCompatible(ProceedingJoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Annotation[] annotations = method.getAnnotations();
        Set<String> annotationMap = RateLimitHandlerAspectInvoker.handlerMap.keySet();
        int x = 0 ;
        for (Annotation annotation : annotations){
            if(annotationMap.contains(annotation.annotationType().getSimpleName())){
                x++;
            }
            if (x>1){
                throw new LimitConflictException("Limit Annotations [ @RateLimitFCL @RateLimitSWL @RateLimitTBL ] must be only one on a method.");
            }
        }
    }


}
