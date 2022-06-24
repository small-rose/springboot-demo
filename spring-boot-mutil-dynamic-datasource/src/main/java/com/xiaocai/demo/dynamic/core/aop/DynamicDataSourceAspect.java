package com.xiaocai.demo.dynamic.core.aop;

import com.xiaocai.demo.dynamic.common.annotation.DataSource;
import com.xiaocai.demo.dynamic.common.enums.DataSourcesType;
import com.xiaocai.demo.dynamic.core.datasource.DynamicDataSourceContextHolder;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/3/12 15:14
 * @version: v1.0
 */

@Aspect
@Component
@Order(-1) // 保证该AOP在@Transactional之前执行
public class DynamicDataSourceAspect {

    /**
     * @target和@within也只接受注解类名作为入参
     */
    @Pointcut("@annotation(com.xiaocai.demo.dynamic.common.annotation.DataSource)"
            + "|| @within(com.xiaocai.demo.dynamic.common.annotation.DataSource)")
    public void dsPointCut()  {
    }

    @Around("dsPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Method targetMethod = this.getTargetMethod(point);
        DataSource dataSource = targetMethod.getAnnotation(DataSource.class);//获取要切换的数据源
        if (dataSource != null)  {
            DynamicDataSourceContextHolder.setDataSourceType(dataSource.source().name());
        }else{
            DynamicDataSourceContextHolder.setDataSourceType(DataSourcesType.MASTER.name());
        }
        try {
            return point.proceed();
        }
        finally  {
            // 销毁数据源 在执行方法之后
            DynamicDataSourceContextHolder.removeDataSourceType();
        }
    }

    /**
     * 获取直接目标方法、支持mapper接口
     */
    private Method getTargetMethodSimple(ProceedingJoinPoint pjp) throws NoSuchMethodException {
        Signature signature = pjp.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method agentMethod = methodSignature.getMethod();
        return agentMethod;
    }

    /**
     * 获取目标方法
     */
    private Method getTargetMethod(ProceedingJoinPoint pjp) throws NoSuchMethodException {
        Signature signature = pjp.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method agentMethod = methodSignature.getMethod();
        return pjp.getTarget().getClass().getMethod(agentMethod.getName(), agentMethod.getParameterTypes());
    }

}
