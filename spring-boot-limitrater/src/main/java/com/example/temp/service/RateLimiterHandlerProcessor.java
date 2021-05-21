package com.example.temp.service;

import com.example.temp.annotation.RateLimitFCL;
import com.example.temp.annotation.RateLimitSWL;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/20 21:06
 * @version: v1.0
 */
@Component
@Slf4j
public class RateLimiterHandlerProcessor implements ApplicationContextAware {



    /**
     * 获取所有的策略Beanclass 加入HandlerOrderContext属性中
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        List<Class<?>> inClassList = new ArrayList<>();

        //获取到所有包含@RestController 或者 @Controller的bean
        Map<String, Object> beanList = applicationContext.getBeansWithAnnotation(RestController.class);
        beanList.putAll(applicationContext.getBeansWithAnnotation(Controller.class));
        beanList.putAll(applicationContext.getBeansWithAnnotation(Service.class));

        beanList.forEach((k, v) -> inClassList.add(applicationContext.getType(k)));
        List<Class<? extends Annotation>> annotationList = new ArrayList<>(2);
        annotationList.add(RateLimitSWL.class);
        annotationList.add(RateLimitFCL.class);
        for (Class<? extends Annotation> annotation : annotationList) {
            getMethodsWithAnnotationFromAllClasses(inClassList, annotation, RateLimiterContext.containsMap);
        }

        // 打印数据
        RateLimiterContext.containsMap.forEach((k,v) -> {
            System.out.println("class : " +k);
            v.forEach(m -> System.out.println("method : "+ m));
        });
    }
    /**
     * 获取类里所有包含annotation的方法名
     *
     * @param inClassList  需过滤其中方法的class集合
     * @param annotation   注解class
     * @param map          包含该annotation的map,key为controller类，集合中为方法
     */
    private void getMethodsWithAnnotationFromAllClasses(List<Class<?>> inClassList,
                                                        Class<? extends Annotation> annotation,
                                                        Map<Class<?>, Set<Method>> map) {
        for (Class<?> myClasss : inClassList) {
            Method[] methods = myClasss.getMethods();
            Set<Method> methodList = new HashSet<>();
            for (Method method : methods) {
                //findAnnotation也可以拿到其父类是否包含该注解
                if (null != method && null != AnnotationUtils.findAnnotation(method, annotation)) {
                    try {
                        methodList.add(method);
                    }catch (Exception e){
                        log.error(e.toString());
                    }
                }
            }

            if (methodList.size() > 0) {
                map.put(myClasss, methodList);
            }

        }
    }
        /*
        void test(ApplicationContext applicationContext){
            //获取所有策略注解的Bean
            Map<String, Object> orderStrategyMap = applicationContext.getBeansWithAnnotation(RateLimiter.class);
            orderStrategyMap.forEach((k,v)->{
                //获取策略实现类
                Class<IRateLimiter> limiterClass = (Class<IRateLimiter>) v.getClass();
                //获取策略实现类的注解值。
                //LimitTypeEnum type = limiterClass.getAnnotation(RateLimiter.class).value();
                //将class加入HandlerOrderContext的map中,type作为key
                //RateLimiterContext.getStrategyMap().put(type, limiterClass);
            });
            RateLimiterContext.getStrategyMap().forEach((k,v) -> {
                System.out.println("已限流策略： key = "+k +" , value = "+v);

            });
        }
    */
}
