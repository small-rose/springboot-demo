package com.xiaocai.demo.java.reflect;

import org.junit.Before;
import org.junit.jupiter.api.Test;

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
}