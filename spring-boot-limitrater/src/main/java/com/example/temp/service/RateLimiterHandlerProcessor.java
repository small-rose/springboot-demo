package com.example.temp.service;

import com.example.temp.annotation.RateLimitFCL;
import com.example.temp.annotation.RateLimitSWL;
import com.example.temp.annotation.RateLimitTBL;
import com.example.temp.excepion.LimitConflictException;
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

    private static List<Class<? extends Annotation>> annotationList = new ArrayList<>(3);

    static {
        annotationList.add(RateLimitFCL.class);
        annotationList.add(RateLimitSWL.class);
        annotationList.add(RateLimitTBL.class);
    }

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
        beanList.putAll(applicationContext.getBeansWithAnnotation(Component.class));

        beanList.forEach((k, v) -> inClassList.add(applicationContext.getType(k)));

        for (Class<? extends Annotation> annotation : annotationList) {
            getMethodsWithAnnotationFromAllClasses(inClassList, annotation, RateLimiterContext.containsMap);
        }

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
                        checkAnnotations(method);
                        methodList.add(method);
                    }catch (LimitConflictException e){
                        throw  new LimitConflictException(e.getMessage());
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

    private void checkAnnotations(Method method) {
        //System.out.println("check method : "+method);
        int x = 0 ;
        Annotation[] annotations = method.getDeclaredAnnotations();
        System.out.println(annotationList);
        System.out.println(annotations);

        for (Class<? extends Annotation> annotation : annotationList){
            System.out.println(annotation);
            if (null != method && null != AnnotationUtils.findAnnotation(method, annotation)) {
                //System.out.println("--------" +annotation);
                x++;
            }
            if (x>1){
                throw new LimitConflictException("[the "+method+" of RateLimitXXX Annotations [ @RateLimitFCL @RateLimitSWL @RateLimitTBL ] must be only one on a method.");
            }
        }
    }

}
