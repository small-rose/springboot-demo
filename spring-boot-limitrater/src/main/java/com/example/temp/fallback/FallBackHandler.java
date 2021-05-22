package com.example.temp.fallback;

import com.example.temp.annotation.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/22 14:54
 * @version: v1.0
 */
public class FallBackHandler {

    private static final FallBackHandler INSTANCE = new FallBackHandler();

    public static final Map<String, Class<? extends Annotation>> annotationMap = new HashMap<>();

    static {
        annotationMap.put(LimitTypeEnum.RateLimitFCL.name(), RateLimitFCL.class);
        annotationMap.put(LimitTypeEnum.RateLimitSWL.name(), RateLimitSWL.class);
        annotationMap.put(LimitTypeEnum.RateLimitTBL.name(), RateLimitTBL.class);
    }

    private FallBackHandler() {

    }


    public static FallBackHandler getInstance() {
        return INSTANCE;
    }

    /**
     * 处理 fallback 调用
     * @param joinPoint
     * @return
     */
    public Object fallBackHandler(ProceedingJoinPoint joinPoint) {

        try {
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            Method method = signature.getMethod();
            Class<?> returnType = method.getReturnType();
            String methodName = null;
            final RateLimitFCL rateLimitFCL = method.getAnnotation(RateLimitFCL.class);
            final RateLimitSWL rateLimitSWL = method.getAnnotation(RateLimitSWL.class);
            final RateLimitTBL rateLimitTBL = method.getAnnotation(RateLimitTBL.class);

            if (!Objects.isNull(rateLimitFCL)){ methodName = rateLimitFCL.failBack();}
            if (!Objects.isNull(rateLimitSWL)){ methodName = rateLimitSWL.failBack();}
            if (!Objects.isNull(rateLimitTBL)){ methodName = rateLimitTBL.failBack();}
            //return  "api limit ......";
            Class[] types = signature.getParameterTypes();
            Method methodInvoke = joinPoint.getTarget().getClass().getMethod(methodName, types);
            try {
                Object o2 = methodInvoke.invoke(joinPoint.getTarget(), joinPoint.getArgs());

                return o2;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return null;
    }



}
