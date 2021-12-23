package cn.xiaocai.demo.tkbase.aspect;

/** @Aspect 注解依赖 aop 组件
 * @author Xiaocai.Zhang
 */

import cn.xiaocai.demo.tkbase.web.common.message.CommonResult;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class MyLogAspect {

    @Order(2)
    @Pointcut("@annotation(cn.xiaocai.demo.tkbase.annotation.MyLog)")
    public void logPoint(){};

    @Before(value = "logPoint()")
    public void logBefore(){
        log.info("--log before ");

    }

    @After(value = "logPoint()")
    public void logAfter(){
        log.info("--log After ");

    }

    @Around(value = "logPoint()")
    public void logAround(ProceedingJoinPoint joinPoint){
        log.info("--log  Around  1 --");
        // 获取方法名称
        String methodName = joinPoint.getSignature().getName();
        // 获取入参
        Object[] param = joinPoint.getArgs();
        log.info("--methodName {},  param {}", methodName, param);
        // 继续执行方法
        try {
            joinPoint.proceed();

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        log.info("--log  Around  2 --");
    }
    @AfterReturning(value = "logPoint()", returning = "result")
    public void checkAfterReturn(CommonResult result){
        log.info("--log after return   ---");
        log.info("result : {}", JSONObject.toJSONString(result));
    }

    @AfterThrowing(value = "logPoint()")
    public void afterThrow(){
        log.info("--log  afterThrow ");

    }
}
