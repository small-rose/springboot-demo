package com.xiaocai.demo.excel.dropdown.utils;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Project : businessVehicleIntelligent
 * @Author : zengfangling
 * @Description : [ ReflectionUtil ] 说明：无
 * @Function :  功能说明：无
 * @Date : 2022/10/10 18:08
 * @Version ： 1.0
 **/
@Slf4j
public class ReflectionUtil {

    public static Map<String, Field> getFieldMap(Object object) {
        Map<String, Field> fieldMap = new ConcurrentHashMap<>();
        refReflectionField(object, fieldMap);
        return fieldMap;
    }

    private static void refReflectionField(Object object, Map<String, Field> fieldMap) {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            fieldMap.put(field.getName(), field);
        }
        Class<?> superclass = object.getClass().getSuperclass();
        if (superclass != null && !"java.lang.Object".equals(superclass.getName())) {
            refReflectionField(superclass, fieldMap);
        }
    }

    public static Object getMethod(String methodFullName, Object obj, Map<String, Object> map) throws InvocationTargetException, IllegalAccessException {
        int lastIndex = methodFullName.lastIndexOf('.');
        String className = methodFullName.substring(0, lastIndex);
        String methodName = methodFullName.substring(lastIndex + 1);
        log.info("className:{},methodName:{}",className,methodName);
        try {
            Class<?> clazz = Class.forName(className);
            Method method = null;
            try {
                 method = clazz.getMethod(methodName);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
//            Method[] methods = clazz.getMethods();
//            for (Method methodObject : methods) {
//                if (methodObject.getName().equals(methodName)) {
//                    return methodObject.invoke(obj, map);
//                }
//            }
            try {
                Object invoke = method.invoke(clazz.newInstance());
                log.info("invoke 的值：{}",invoke);
                return invoke;
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
