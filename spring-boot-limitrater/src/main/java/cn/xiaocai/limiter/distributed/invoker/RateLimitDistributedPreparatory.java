package cn.xiaocai.limiter.distributed.invoker;

import cn.xiaocai.limiter.distributed.handler.FixPeriodCounterDistributedLimitHandler;
import com.example.temp.annotation.RateLimitFCL;
import com.example.temp.annotation.RateLimitLBL;
import com.example.temp.annotation.RateLimitSWL;
import com.example.temp.annotation.RateLimitTBL;
import com.example.temp.handler.FixPeriodCounterLimitHandler;
import com.example.temp.handler.LimitHandler;
import com.example.temp.service.AspectPredicatePreparatory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.AnnotationUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-26 14:16
 **/
public class RateLimitDistributedPreparatory  extends AspectPredicatePreparatory {

    private static final RateLimitDistributedPreparatory INSTANCE = new RateLimitDistributedPreparatory();

    private RateLimitDistributedPreparatory() {
    }

    public static RateLimitDistributedPreparatory getInstance() {
        return INSTANCE;
    }

    public static final Map<Class<? extends Annotation>, Class<? extends LimitHandler>> ANNOTATION_MAP = new HashMap<>();
    static {
        ANNOTATION_MAP.put(RateLimitFCL.class, FixPeriodCounterDistributedLimitHandler.class);
        ANNOTATION_MAP.put(RateLimitSWL.class, FixPeriodCounterLimitHandler.class);
        ANNOTATION_MAP.put(RateLimitTBL.class, FixPeriodCounterLimitHandler.class);
        ANNOTATION_MAP.put(RateLimitLBL.class, FixPeriodCounterLimitHandler.class);
    }


    @Override
    public boolean invoke(ProceedingJoinPoint point) throws Throwable {
        final MethodSignature signature = (MethodSignature) point.getSignature();
        final Method method = signature.getMethod();
        boolean distributed = false ;

        if (null != AnnotationUtils.findAnnotation(method, RateLimitFCL.class)) {
            RateLimitFCL rateLimit = method.getAnnotation(RateLimitFCL.class);
            distributed = rateLimit.distributed();
            if (distributed){
                Class<LimitHandler> handler = (Class<LimitHandler>) ANNOTATION_MAP.get(rateLimit.annotationType());
                LimitHandler limitHandler = handler.newInstance();
                return limitHandler.handler(method);
            }
        }
        if (null != AnnotationUtils.findAnnotation(method, RateLimitSWL.class)) {
            RateLimitSWL rateLimit = method.getAnnotation(RateLimitSWL.class);
            distributed = rateLimit.distributed();
            if (distributed){
                Class<LimitHandler> handler = (Class<LimitHandler>) ANNOTATION_MAP.get(rateLimit.annotationType());
                LimitHandler limitHandler = handler.newInstance();
                return limitHandler.handler(method);
            }
        }
        if (null != AnnotationUtils.findAnnotation(method, RateLimitTBL.class)) {
            RateLimitTBL rateLimit = method.getAnnotation(RateLimitTBL.class);
            distributed = rateLimit.distributed();
            if (distributed){
                Class<LimitHandler> handler = (Class<LimitHandler>) ANNOTATION_MAP.get(rateLimit.annotationType());
                LimitHandler limitHandler = handler.newInstance();
                return limitHandler.handler(method);
            }
        }
        if (null != AnnotationUtils.findAnnotation(method, RateLimitLBL.class)) {
            RateLimitLBL rateLimit = method.getAnnotation(RateLimitLBL.class);
            distributed = rateLimit.distributed();
            if (distributed){
                Class<LimitHandler> handler = (Class<LimitHandler>) ANNOTATION_MAP.get(rateLimit.annotationType());
                LimitHandler limitHandler = handler.newInstance();
                return limitHandler.handler(method);
            }
        }
        return false;
    }
}
