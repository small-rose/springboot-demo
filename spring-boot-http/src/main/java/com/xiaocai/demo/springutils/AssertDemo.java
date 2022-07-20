package com.xiaocai.demo.springutils;

import com.xiaocai.demo.client.chengbao.reqbean.PayBackBody;
import org.junit.Test;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ AssertDemo ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/19 8:46
 * @Version ： 1.0
 **/
public class AssertDemo {

    /**
     * 断言没有包含指定字符串，若包含则抛出异常
     */
    @Test
    public void test_01(){
        Assert.doesNotContain("我是一个 hello world", "hello1", "找不到指定的字符串");
    }

    @Test
    public void test_02(){
        Assert.doesNotContain("我是一个 hello world", "hello", ()->"自定义提示信息");
    }

    @Test
    public void test_03(){
        String params = "我是一个 hello world";
        Assert.hasLength(  params, "参数不允许为空");
        Assert.hasLength("",  ()->"参数不允许为空");
    }

    @Test
    public void test_04(){
        Object a = null ;
        Assert.isNull(a, "hello a is null");
    }

    /**
     * 断言元素不为null
     */
    @Test
    public void test_05(){
        List a = null ;
        Assert.noNullElements(a, "hello a is null");
    }

    /**
     * 断言表达式为真，若不为真，抛出异常
     */
    @Test
    public void test_06(){
        List a = Arrays.asList("1") ;
        int b = (int) Math.round(1.5);
        Assert.isTrue(a.size()>b , "hello a is null");
    }

    /**
     * 断言obj参数是指定类型的实例，否则抛出异常，不予放行
     */
    @Test
    public void test_07(){
        Children children = new Children();
        Assert.isInstanceOf(PayBackBody.class, children);
    }

    /**
     * 断言参数 `subType` 必须是参数 superType 的子类或实现类，否则抛出异常，不予放行
     */
    @Test
    public void test_08()  {

        Assert.isAssignable(Person.class, Children.class, "不是子类或实现类");
    }


    class Person extends PayBackBody{

    }
    class Children extends Person{

    }
}
