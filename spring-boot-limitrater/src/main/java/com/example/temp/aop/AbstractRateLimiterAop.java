package com.example.temp.aop;

import com.example.temp.excepion.LimitConflictException;
import com.example.temp.interceptor.RateLimitGlobalInterceptor;
import com.example.temp.interceptor.RateLimitInterceptor;
import com.example.temp.service.RateLimitHandlerAspectInvoker;
import com.example.temp.service.RateLimiterContext;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;

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
@Aspect
public abstract class AbstractRateLimiterAop {

    private final RateLimitInterceptor interceptor = new RateLimitGlobalInterceptor();

    @Autowired
    private RateLimiterContext context;

    /**
     * Order 代表优先级，数字越小优先级越高
     */

    @Pointcut(value = "@annotation(com.example.temp.annotation.RateLimitSWL)")
    public void SWLLimitInterceptor(){};

    @Pointcut(value = "@annotation(com.example.temp.annotation.RateLimitFCL)")
    public void FCLLimitInterceptor(){};

    @Pointcut(value = "@annotation(com.example.temp.annotation.RateLimitTBL)")
    public void TBLLimitInterceptor(){};

    /**
     *   拦截处理限流注解
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around(value = "SWLLimitInterceptor() || FCLLimitInterceptor() || TBLLimitInterceptor()")
    public Object rateLimitMethod(final ProceedingJoinPoint joinPoint) throws Throwable {
        checkAnnotationCompatible(joinPoint);
        return interceptor.invoke(joinPoint);
        /* Object commonResult = null;
        // 获取方法名称
        Method method = ((MethodSignature)joinPoint.getSignature()).getMethod();;
        // 注解拦截处理
        boolean isOver = RateLimitHandlerAspectInvoker.getInstance().invoke(joinPoint);
        log.info("is over : " + isOver);
        if (isOver){
            return "API Limit ";
        }*/
        // 继续执行请求方法
        // return  joinPoint.proceed() ;
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
