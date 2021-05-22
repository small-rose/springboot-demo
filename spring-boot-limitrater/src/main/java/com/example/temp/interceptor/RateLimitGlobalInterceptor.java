package com.example.temp.interceptor;

import com.example.temp.service.RateLimitHandlerAspectInvoker;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-21 13:47
 **/
@Slf4j
public class RateLimitGlobalInterceptor extends RateLimitInterceptor {

    @Override
    public Object invoke(final ProceedingJoinPoint joinPoint) throws Throwable {
        boolean result = RateLimitHandlerAspectInvoker.getInstance().invoke(joinPoint);
        log.info("RateLimitGlobalInterceptor invoke result : "+result);
        if (result){
            this.setRateLimitInterceptor(new FallBackMethodInterceptor());
            return rateLimitInterceptor.invoke(joinPoint);
            //return resultHandler(joinPoint) ;
        }
        return proceed(joinPoint);
    }



    public Object resultHandler(final ProceedingJoinPoint joinPoint) throws IllegalAccessException, InstantiationException {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Class<?> returnType = method.getReturnType();
        Object object = returnType.newInstance();

        if (object instanceof String){
            object = "api limit";
        }
        if (object instanceof Map){
            ((HashMap) object).put("limit","api limit");
        }
        if (object instanceof List){
            ((ArrayList) object).add(0,"api limit");
        }
        return object;
    }

    public static JavaType getMethodReturn(ProceedingJoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Type type = method.getGenericReturnType();
        return getJavaType(type);
    }

    public static JavaType getMethodReturnJavaType(Method method) {
        Type type = method.getGenericReturnType();
        return getJavaType(type);
    }

    private static JavaType getJavaType(Type type) {
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType)type).getActualTypeArguments();
            //获取泛型类型
            Class rowClass = (Class)((ParameterizedType)type).getRawType();
            JavaType[] javaTypes = new JavaType[actualTypeArguments.length];
            for (int i = 0; i < actualTypeArguments.length; i++) {
                //泛型也可能带有泛型，递归处理
                javaTypes[i] = getJavaType(actualTypeArguments[i]);
            }
            return TypeFactory.defaultInstance().constructParametricType(rowClass, javaTypes);
        } else {
            //简单类型直接用该类构建
            return TypeFactory.defaultInstance().constructParametricType((Class)type, new JavaType[0]);
        }
    }
}
