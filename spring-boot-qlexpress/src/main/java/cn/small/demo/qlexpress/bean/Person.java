package cn.small.demo.qlexpress.bean;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ Person ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/11/4 14:34
 * @Version ： 1.0
 **/
public class Person {


    public void sayHello() {
        System.out.println("hello,world! this is normal (non static) method");
    }

    public static void sayHelloStatic() {
        System.out.println("hello,world! this is static method");
    }

    public void sayHello(String name) {
        System.out.println("hello," + name);
    }
}
