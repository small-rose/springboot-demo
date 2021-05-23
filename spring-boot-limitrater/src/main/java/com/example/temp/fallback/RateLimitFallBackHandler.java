package com.example.temp.fallback;

import com.example.temp.annotation.LimitTypeEnum;
import com.example.temp.annotation.RateLimitFCL;
import com.example.temp.annotation.RateLimitSWL;
import com.example.temp.annotation.RateLimitTBL;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 处理 @RateLimitFCL  @RateLimitSWL @RateLimitTBL 限流时执行的 降级处理器
 * @author: 张小菜
 * @date: 2021/5/22 14:54
 * @version: v1.0
 */
public class RateLimitFallBackHandler implements FallBackHandler{



    private static final RateLimitFallBackHandler INSTANCE = new RateLimitFallBackHandler();

    public static final Map<String, Class<? extends Annotation>> annotationMap = new HashMap<>();



    static {
        annotationMap.put(LimitTypeEnum.RateLimitFCL.name(), RateLimitFCL.class);
        annotationMap.put(LimitTypeEnum.RateLimitSWL.name(), RateLimitSWL.class);
        annotationMap.put(LimitTypeEnum.RateLimitTBL.name(), RateLimitTBL.class);
    }

    private RateLimitFallBackHandler() {
    }

    public static RateLimitFallBackHandler getInstance() {
        return INSTANCE;
    }

    /**
     * 处理 fallback 调用
     * @param joinPoint
     * @return
     */
    public Object fallBackHandler(final ProceedingJoinPoint joinPoint) {

        try {
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            Method method = signature.getMethod();
            // Class<?> returnType = method.getReturnType();
            String methodName = null;
            final RateLimitFCL rateLimitFCL = method.getAnnotation(RateLimitFCL.class);
            final RateLimitSWL rateLimitSWL = method.getAnnotation(RateLimitSWL.class);
            final RateLimitTBL rateLimitTBL = method.getAnnotation(RateLimitTBL.class);

            if (!Objects.isNull(rateLimitFCL)){ methodName = rateLimitFCL.failBack();}
            if (!Objects.isNull(rateLimitSWL)){ methodName = rateLimitSWL.failBack();}
            if (!Objects.isNull(rateLimitTBL)){ methodName = rateLimitTBL.failBack();}
            if (DEFAULT_FALL_BACK.equals(methodName)){
                return setResult(null);
            }
            //return  "api limit ......";
            Class[] types = signature.getParameterTypes();
            Method methodInvoke = joinPoint.getTarget().getClass().getMethod(methodName, types);
            try {
                Object o2 = methodInvoke.invoke(joinPoint.getTarget(), joinPoint.getArgs());

                return o2;
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return resultMap ;
    }


    @Override
    public Object callDefaultFallBack(ProceedingJoinPoint joinPoint, Throwable throwable) throws InstantiationException, IllegalAccessException {
        return resultHandler(joinPoint, throwable);
    }

    @Override
    public Object setResult(Throwable throwable) {
        HashMap<String,Object> map = new HashMap();
        map.put("code", "500-13");
        map.put("msg","系统繁忙，请稍后再试");
        return map;
    }


    public Object resultHandler(final ProceedingJoinPoint joinPoint, Throwable throwable) throws IllegalAccessException, InstantiationException {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Class<?> returnType = method.getReturnType();
        Object object = returnType.newInstance();

        if (object instanceof String){
            object =  FallBackHandler.DEFAULT_FALL_MAG;
        }else{
            ((HashMap) object).put("code", "500");
            ((HashMap) object).put("msg", FallBackHandler.DEFAULT_FALL_MAG);
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
