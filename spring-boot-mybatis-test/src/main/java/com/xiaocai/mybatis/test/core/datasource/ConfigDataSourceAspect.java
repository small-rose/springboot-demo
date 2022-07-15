package com.xiaocai.mybatis.test.core.datasource;


import com.xiaocai.mybatis.test.core.datasource.annotation.TargetDataSource;
import com.xiaocai.mybatis.test.core.exception.DynamicDataSourceSwitchException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;

/**
 * 动态切换数据源相关切面
 *
 */
@Aspect
@Order(2)
@Component
public class ConfigDataSourceAspect {
	
	private final Logger logger = LoggerFactory.getLogger(ConfigDataSourceAspect.class);
 
	/**
	 * 直接根据注解来识别数据源切换，不限制在service层
	 */
 	@Pointcut("@annotation(com.xiaocai.mybatis.test.core.datasource.annotation.TargetDataSource) " +
			"|| @within(com.xiaocai.mybatis.test.core.datasource.annotation.TargetDataSource)")
	public void targetDsPointCut()  {
	}
	/**
	 * 方法上有@TargetDataSource 注解，并且是com.fenet下的Service类或com.fndsoft下的Service类
	 */
	@Around(" targetDsPointCut() && @annotation(targetDataSource)")
	public Object around(ProceedingJoinPoint joinPoint, TargetDataSource targetDataSource){

		String oldDataSource = DataSourceContextHolder.getDataSource();
		logger.debug("原数据源："+oldDataSource);
		try{
			Method targetMethod = this.getTargetMethodSimple(joinPoint);
			Class<?> targetClass1 = joinPoint.getTarget().getClass();
			//优先方法注解 zzy 修改
			TargetDataSource targetDataSourceA = targetMethod.getAnnotation(TargetDataSource.class);
			String newDbType = DataSourceContextHolder.getDefaultDataSource();
			if (targetDataSourceA!=null) {
				newDbType = targetDataSourceA.target().name();
			}else{
				// 类注解支持 zzy 修改
				Class<?> targetClass = joinPoint.getTarget().getClass();
				TargetDataSource targetDataSourceB =  targetClass.getAnnotation(TargetDataSource.class);

				newDbType = targetDataSourceB.target().name();
			}
			DataSourceContextHolder.setDataSource(newDbType);
			logger.debug("设置数据源："+ newDbType);


			try {//执行具体的业务方法
				return joinPoint.proceed();
			} catch (Throwable e) {
				//logger.error(e.getMessage(),e);
				throw new DynamicDataSourceSwitchException(e);
			}
		}catch (NoSuchMethodException e){
			e.printStackTrace();
			throw new DynamicDataSourceSwitchException("找不到切换数据源的方法", e);
		}finally{
			//执行完成之后，还原成默认数据源
			if(StringUtils.hasText(oldDataSource)){
				DataSourceContextHolder.setDataSource(oldDataSource);
				logger.debug("事务处理之后数据源："+oldDataSource);
			}
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

	/**
	 * 获取TargetDataSource的注解配置要切换的数据源key
	 * @param joinPoint
	 * @return
	 */
	protected String getTargetDataSourceKey(ProceedingJoinPoint joinPoint) {

		String newDbType = null;//要切换的新的数据源标志

		Object target = joinPoint.getTarget();
		String className = joinPoint.getTarget().getClass().toString();//获取目标类名
		String method = joinPoint.getSignature().getName();

		Class<?>[] classz = target.getClass().getInterfaces();

		Class<?>[] parameterTypes = ((MethodSignature) joinPoint.getSignature())
				.getMethod().getParameterTypes();
		try {
			Method m = classz[0].getMethod(method, parameterTypes);
			if (m != null && m.isAnnotationPresent(TargetDataSource.class)) {
				//获取TargetDataSource的注解配置对象
				TargetDataSource targetDataSource = m
						.getAnnotation(TargetDataSource.class);

				newDbType = targetDataSource.target().name();
			}
		} catch (Exception e) {
			logger.error("获取TargetDataSource注解配置失败："+e.getMessage(),e);
			throw new DynamicDataSourceSwitchException(e);
		}


		return newDbType;
	}

}
