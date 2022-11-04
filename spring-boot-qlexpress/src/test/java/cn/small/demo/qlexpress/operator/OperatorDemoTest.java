package cn.small.demo.qlexpress.operator;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import org.junit.Test;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ OperatorDemoTest ] 说明：无
 * @Function :  功能说明： 扩展操作符
 * @Date ：2022/11/4 14:42
 * @Version ： 1.0
 **/
public class OperatorDemoTest {


    /**
     *      注意then和else后需要使用;
     * @throws Exception
     */
    @Test
    public void test_replace_if_then_else() throws Exception {
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        runner.addOperatorWithAlias("如果", "if", null);
        runner.addOperatorWithAlias("则", "then", null);
        runner.addOperatorWithAlias("否则", "else", null);
        context.put("语文", 100);
        context.put("数学", 100);
        context.put("英语", 100);
        String express = "如果 ((语文+数学+英语)>270) 则 return 1;否则 return 0;";
        Object result = runner.execute(express, context, null, true, false);
        System.out.println(result);
    }

    /**
     * 自定义扩展操作符测试 --使用方式 2
     *
     * addOperator
     */
    @Test
    public void test_add_operator() throws Exception {
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        String express = "1 join 2 join 3";
        runner.addOperator("join", new JoinOperator());
        Object result = runner.execute(express, context, null, true, false);
        System.out.println(result);
    }

    /**
     *   自定义扩展操作符测试--使用方式 2
     *    replaceOperator
     * @throws Exception
     */
    @Test
    public void test_replace_operator() throws Exception {
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        String express = "1 + 2 + 3";
        runner.replaceOperator("+", new JoinOperator());
        Object result = runner.execute(express, context, null, true, false);
        System.out.println(result);
    }


    /**
     *  自定义扩展操作符测试--使用方式 3
     *  addFunction
     * @throws Exception
     */
    @Test
    public void test_add_function() throws Exception {
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        String express = "join(1,2,3)";
        runner.addFunction("join", new JoinOperator());
        Object result = runner.execute(express, context, null, true, false);
        System.out.println(result);
    }
}
