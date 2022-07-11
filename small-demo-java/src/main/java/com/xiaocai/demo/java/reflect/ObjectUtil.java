package com.xiaocai.demo.java.reflect;

import com.xiaocai.demo.java.utils.StringUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ ObjectUtil ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/6/28 14:21
 * @Version ： 1.0
 **/
public class ObjectUtil {


    public Class getObject(Object object){
        //获取类信息，要先获取类的类型
        Class<? extends Object> clazz1 = object.getClass();
        System.out.println("类的名字: " + clazz1.getName());
        System.out.println("类的名字: " + clazz1.getSimpleName());
        return clazz1 ;
    }

    /**
     * Method类，方法
     * @param claszz1
     * @return
     */
    public void printMethod(Class claszz1){
        //获取方法信息，获取所有public的函数，包括父类继承的
        Method[] pubMethods = claszz1.getMethods();
        for (Method pubMethod : pubMethods) {

            //得到方法的返回值类型
            Class<?> returnType = pubMethod.getReturnType();
            System.out.print("方法的返回值类型 ：" + returnType.getTypeName());

            //得到方法的名字
            String name = pubMethod.getName();
            System.out.println("方法的名字 ：" + name);

            //得到方法的参数类型
            Class<?>[] parameterTypes = pubMethod.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("参数类型 ：" + parameterType.getTypeName());
                System.out.println("参数类型名字 ：" + parameterType.getName());
            }
            System.out.println(returnType.getName() +" " +name +"(");
            for (Class<?> parameterType : parameterTypes) {
                System.out.print(parameterType.getName()+" "+ StringUtils.lowerFirstCase(parameterType.getName())+",");
            }
            System.out.println(")");

            //得到方法上指定的注解
            //Setter annotation = pubMethod.getAnnotation(Setter.class);

            //得到参数的注解
            Annotation[][] parameterAnnotations = pubMethod.getParameterAnnotations();
            for (Annotation[] annotations : parameterAnnotations) {
                for (Annotation annotation : annotations) {
                    Class<? extends Annotation> aClass = annotation.annotationType();
                }
            }

        }
        //获取方法信息，获取所有函数，public/protect/private/friendly
        //Method[] allMethods = claszz1.getDeclaredMethods();

        printField(claszz1);
    }

    private void printField(Class claszz1) {

        //获取所有public成员变量的信息
        Field[] fields = claszz1.getFields();

        System.out.println(" 成员变量列表 ：");
        //获取自己声明的成员变量
        Field[] declaredFields = claszz1.getDeclaredFields();
        for (Field dcField : declaredFields) {
            Class<?> type = dcField.getType();
            String typeName = type.getTypeName();
            String fieldName = type.getName();
            System.out.println(typeName +" " +fieldName);
        }
        System.out.println(" 成员变量列表-------------");
    }
}
