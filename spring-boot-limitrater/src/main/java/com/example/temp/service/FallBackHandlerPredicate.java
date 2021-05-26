package com.example.temp.service;

import com.example.temp.annotation.ExceptionFallBack;
import com.example.temp.fallback.ExceptionFallBackHandler;
import com.example.temp.fallback.ruls.FallBackRule;
import com.example.temp.fallback.ruls.NoFallBackRule;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：  验证是否需要执行降级服务
 * @author: 张小菜
 * @date: 2021/5/23 18:53
 * @version: v1.0
 */
public class FallBackHandlerPredicate extends AspectPredicatePreparatory {

    private static final FallBackHandlerPredicate INSTANCE = new FallBackHandlerPredicate();

    private FallBackHandlerPredicate() {
    }

    public static FallBackHandlerPredicate getInstance() {
        return INSTANCE;
    }


    /**
     * 验证注解，判断是否需要进行异常降级，如果需要则构造默认的降级处理器
     * @param point
     * @return
     * @throws Throwable
     */
    @Override
    public boolean invoke(ProceedingJoinPoint point) throws Throwable {
        final MethodSignature signature = (MethodSignature) point.getSignature();
        final Method method = signature.getMethod();
        final ExceptionFallBack fallBack = method.getAnnotation(ExceptionFallBack.class);
        if (!Objects.isNull(fallBack)){

            if (!ruleHandlerMap.keySet().contains(method.toString())){
                // 构造异常降级规则
                ExceptionFallBackHandler fallBackHandler = new ExceptionFallBackHandler(true);
                addFallBackRules(fallBack, fallBackHandler);

                ruleHandlerMap.put(method.toString(), fallBackHandler);
            }
            System.out.println(ruleHandlerMap);
            return true;
        }
        return false;
    }



    /**
     *  添加降级规则
     * @param fallBack
     * @param fallBackHandler
     */
    private void addFallBackRules(final ExceptionFallBack fallBack, ExceptionFallBackHandler fallBackHandler){
        Class<? extends Throwable>[] classes = fallBack.fallbackFor();
        for (Class<?> clazz : classes){
            fallBackHandler.getRuleList().add(new FallBackRule(clazz));
        }
        String[] classNames = fallBack.fallbackForClassName();
        for (String  clazzName: classNames){
            fallBackHandler.getRuleList().add(new FallBackRule(clazzName));
        }
        Class<? extends Throwable>[] noFallBackClazz = fallBack.fallbackFor();
        for (Class<?> clazz : noFallBackClazz){
            fallBackHandler.getRuleList().add(new NoFallBackRule(clazz));
        }
        String[] noFallBackNames = fallBack.noFallbackForClassName();
        for (String  clazzName: noFallBackNames){
            fallBackHandler.getRuleList().add(new NoFallBackRule(clazzName));
        }
    }
}
