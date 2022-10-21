package com.xiaocai.demo.java.reflect;

import com.xiaocai.demo.java.reflect.bean.BeanTest;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ObjectUtilTest {

    ObjectUtil objectUtil ;

    @Before
    public void prepare(){
        objectUtil = new ObjectUtil() ;
    }

    @Test
    public void test_9(){
        String name = "XiaoCai";
        Object clazz = objectUtil.getObject(name);

    }

    @Test
    public void test_23() {
        try{
            Class aClass = BeanTest.class;

            BeanTest o = (BeanTest) aClass.newInstance();
            Field declaredField = aClass.getDeclaredField("serialVersionUID");
            //获取modifiers属性，modifiers属性也是私有的
            Field modifiers = Field.class.getDeclaredField("modifiers");
            // 其他特性如 private, static 保持不变
            modifiers.setAccessible(true);
            modifiers.setInt(declaredField,declaredField.getModifiers() & ~Modifier.FINAL);

            declaredField.setAccessible(true);
            declaredField.set(o, new Long(2000L));

            System.out.println(o.getSerialVersionUID());


            /**
             * 内省机制
             */
            //PropertyDescriptor propertyDescriptor = new PropertyDescriptor("serialVersionUID", aClass);
            //Method setMethod = propertyDescriptor.getWriteMethod();
            //setMethod.invoke(o, 200L);
            //System.out.println(o.getSerialVersionUID());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}