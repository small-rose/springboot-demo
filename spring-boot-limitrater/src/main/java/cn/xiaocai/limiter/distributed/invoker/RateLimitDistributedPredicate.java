package cn.xiaocai.limiter.distributed.invoker;

import com.example.temp.annotation.*;
import com.example.temp.handler.*;
import com.example.temp.service.AspectPredicatePreparatory;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.AnnotationUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-26 12:18
 **/
@Slf4j
public class RateLimitDistributedPredicate extends AspectPredicatePreparatory {

    private static final RateLimitDistributedPredicate INSTANCE = new RateLimitDistributedPredicate();

    private RateLimitDistributedPredicate() {
    }

    public static RateLimitDistributedPredicate getInstance() {
        return INSTANCE;
    }




    @Override
    public boolean invoke(ProceedingJoinPoint joinPoint) throws Throwable {
        final MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        final Method method = signature.getMethod();
        boolean distributed = false ;

        if (null != AnnotationUtils.findAnnotation(method, RateLimitFCL.class)) {
            RateLimitFCL rateLimit = method.getAnnotation(RateLimitFCL.class);
            distributed = rateLimit.distributed();
        }
        if (null != AnnotationUtils.findAnnotation(method, RateLimitSWL.class)) {
            RateLimitSWL rateLimit = method.getAnnotation(RateLimitSWL.class);
            distributed = rateLimit.distributed();
        }
        if (null != AnnotationUtils.findAnnotation(method, RateLimitTBL.class)) {
            RateLimitTBL rateLimit = method.getAnnotation(RateLimitTBL.class);
            distributed = rateLimit.distributed();
        }
        if (null != AnnotationUtils.findAnnotation(method, RateLimitLBL.class)) {
            RateLimitLBL rateLimit = method.getAnnotation(RateLimitLBL.class);
            distributed = rateLimit.distributed();
        }
        return distributed;
        /*
        if (null != AnnotationUtils.findAnnotation(method, RateLimitSWL.class)) {
            RateLimitSWL rateLimit = method.getAnnotation(RateLimitSWL.class);
            distributed = rateLimit.distributed();
            if (distributed){
                Class<LimitHandler> handler = (Class<LimitHandler>) ANNOTATION_MAP.get(rateLimit.annotationType());
                LimitHandler limitHandler = handler.newInstance();
                return limitHandler.handler(method);
            }
        }
         */

    }
}
