package cn.small.demo.qlexpress.simple;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import org.junit.Test;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ DemoQuick ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/11/4 14:26
 * @Version ： 1.0
 **/
public class DemoQuick {

    @Test
    public void test_14() throws Exception {
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        context.put("a", 1);
        context.put("b", 2);
        context.put("c", 3);
        //下面五个参数意义分别是 表达式，上下文，errorList，是否缓存，是否输出日志
        Object result = runner.execute("a+b+c", context, null, true, true);
        System.out.println("a+b+c=" + result);
    }

    @Test
    public void test_basic_use_for() throws Exception {
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        String express = "n=100;sum=0;" +
                "for(i=1;i<=n;i++){" +
                "sum = sum+i;" +
                "}" +
                "return sum;";
        Object result = runner.execute(express, context, null, true, true);
        System.out.println("1...100的和是: " + result);
    }

    @Test
    public void test_basic_use_three_var() throws Exception {
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        context.put("a", 5);
        context.put("b", 10);
        String express = "a>b?a:b";
        Object max = runner.execute(express, context, null, true, false);
        System.out.println("a和b中较大的指是：" + max);
    }


    @Test
    public void test_NewList() throws Exception {
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        String express = "abc=NewList(1,2,3);return abc.get(0)+abc.get(1)+abc.get(2);";
        Object listSum = runner.execute(express, context, null, true, false);
        System.out.println("listSum: " + listSum);
    }


}
