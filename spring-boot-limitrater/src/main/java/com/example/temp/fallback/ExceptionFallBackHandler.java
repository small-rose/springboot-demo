package com.example.temp.fallback;

import com.example.temp.annotation.ExceptionFallBack;
import com.example.temp.fallback.ruls.FallBackRule;
import com.example.temp.fallback.ruls.NoFallBackRule;
import com.example.temp.interceptor.RateLimitInterceptor;
import com.sun.istack.internal.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：   处理 @ExceptionFallBack 服务降级处理器
 * @author: 张小菜
 * @date: 2021/5/23 15:19
 * @version: v1.0
 */
@Slf4j
public class ExceptionFallBackHandler extends RateLimitInterceptor implements FallBackHandler {

    protected boolean isFallBack  = false;

    @NotNull
    protected List<FallBackRule> ruleList = new ArrayList<>();

    public List<FallBackRule> getRuleList() {
        return ruleList;
    }

    public void setRuleList(List<FallBackRule> ruleList) {
        this.ruleList = ruleList;
    }

    public ExceptionFallBackHandler(boolean isFallBack) {
        this.isFallBack = isFallBack;
    }

    @Override
    public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable  {
        log.trace("----异常降级处理器----");
        Throwable ex;
        try {
            return proceed(joinPoint);
        } catch (Throwable e) {
            ex = e;
        }
        return callDefaultFallBack(joinPoint, ex);
    }

    @Override
    public Object callDefaultFallBack(final ProceedingJoinPoint joinPoint, Throwable throwable) throws Throwable {
        if (!isFallBack) {
            // 没有使用注解处理就原样抛出去
            throw throwable;
        }

        FallBackRule winner = null;
        int deepest = Integer.MAX_VALUE;

        if (ruleList != null) {
            for (FallBackRule rule : ruleList) {
                int depth = rule.getDepth(throwable);
                if (depth >= 0 && depth < deepest) {
                    deepest = depth;
                    winner = rule;
                }
            }
        }
        if (log.isTraceEnabled()) {
            log.trace("Winning fallback rule is: " + winner);
        }

        // User superclass behavior (rollback on unchecked) if no rule matches.
        if (winner == null) {
            log.trace("No relevant fallback rule found: applying default rules");
            return fallbackOn(throwable);
        }
        if (!(winner instanceof NoFallBackRule)) {
            return callFallBack(joinPoint, throwable);
        }
        return setResult(null);
    }

    protected boolean fallbackOn(Throwable ex) {
        return (ex instanceof RuntimeException || ex instanceof Error);
    }


    protected Object callFallBack(final ProceedingJoinPoint joinPoint, final Throwable throwable) {

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        // Class<?> returnType = method.getReturnType();
        String methodName = null;
        final ExceptionFallBack exceptionFallBack = method.getAnnotation(ExceptionFallBack.class);

        if (!Objects.isNull(exceptionFallBack)) {
            methodName = exceptionFallBack.fallback();
        }
        if (DEFAULT_FALL_BACK.equals(methodName)) {
            return setResult(throwable);
        }
        //return  "api limit ......";
        Class[] types = signature.getParameterTypes();
        Method methodInvoke = null;
        Object o2 = null;
        try {
            if(log.isDebugEnabled()){
                log.debug("It will call fallback method "+methodName);
            }
            methodInvoke = joinPoint.getTarget().getClass().getMethod(methodName, types);
        } catch ( NoSuchMethodException ex) {
            ex.printStackTrace();

        }
        try{
            o2 = methodInvoke.invoke(joinPoint.getTarget(), joinPoint.getArgs());
            return o2;
        } catch (IllegalAccessException | InvocationTargetException ex) {
            ex.printStackTrace();
        }
        return setResult(throwable);
    }

    @Override
    public Object setResult(final Throwable throwable) {
        resultMap.clear();
        resultMap.put("code", 500);
        resultMap.put("message", "系统异常，请稍后再试");
        if (!Objects.isNull(throwable)) {
            resultMap.put("info", throwable.toString());
        }
        return resultMap;
    }



    /*
    @Override
    public Object callDefaultFallBack(final ProceedingJoinPoint joinPoint, Throwable throwable) throws Throwable {

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        ExceptionFallBack annotation = method.getAnnotation(ExceptionFallBack.class);
        if (logger.isTraceEnabled()) {
            logger.trace("Winning rollback rule is: " + winner);
        }
        Class<? extends Throwable>[] exceptionClazz = annotation.fallbackFor();
        if (exceptionClazz.length > 0) {
            for (Class<? extends Throwable> temp : exceptionClazz) {
                if (temp.equals(throwable.getClass())) {
                    return callFallBack(joinPoint, throwable);
                }
            }
        }
        String[] exceptionNames = annotation.fallbackForClassName();
        if (exceptionNames.length > 0) {
            for (String temp : exceptionNames) {
                if (temp.equals(throwable.getClass().getSimpleName())) {
                    return callFallBack(joinPoint, throwable);
                }
            }
        }
        Class<? extends Throwable>[] throwExceptionClazz = annotation.noFallbackFor();

        if (throwExceptionClazz.length > 0) {
            for (Class<? extends Throwable> temp : throwExceptionClazz) {
                System.out.println(temp);
                System.out.println(throwable.getClass());
                if (temp.equals(throwable.getClass())) {
                    throw throwable;
                }
            }
        }
        String[] throwExceptionNames = annotation.noFallbackForClassName();
        if (throwExceptionNames.length > 0) {
            for (String temp : throwExceptionNames) {
                if (temp.equals(throwable.getClass().getSimpleName())) {
                    throw throwable;
                }
            }
        }
        return setResult(throwable);
    }*/
}

