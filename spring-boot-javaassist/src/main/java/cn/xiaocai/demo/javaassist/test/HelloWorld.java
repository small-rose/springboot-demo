package cn.xiaocai.demo.javaassist.test;
/**
 * @Copyright 源码阅读网 http://coderead.cn
 */

/**
 * @author 鲁班大叔
 * @date 2021
 */
public class HelloWorld {

//加代码  删除 改
    public void hello(String name) throws InterruptedException {
        System.out.println("hello World" + name);
        Thread.sleep(100);
        System.out.println(hi(name+" good",19,true));
    }


    public String hi(Object name,int age,boolean sex) throws InterruptedException {
        System.out.println("hello World" + name);
        Thread.sleep(100);
       return "luban";
    }

    public String hi$agent(Object name,int age,boolean sex) throws InterruptedException {

        return "luban$agent";
    }

}
