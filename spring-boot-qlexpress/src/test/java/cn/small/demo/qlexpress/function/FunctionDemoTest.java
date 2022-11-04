package cn.small.demo.qlexpress.function;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import org.junit.Test;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ FunctionDemoTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/11/4 14:39
 * @Version ： 1.0
 **/
public class FunctionDemoTest {

    /**
     * 写法和js非常相似。
     * 注意点
     *      在入参的地方需要声明类型
     *      function的右}需要添加;
     * @throws Exception
     */
    @Test
    public void test_add_func() throws Exception {
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        String express = "function add(int a,int b){" +
                "return a+b;" +
                "};" +
                "a=2;b=2;" +
                "return add(a,b);";
        Object funcResult = runner.execute(express, context, null, true, false);
        System.out.println("add(a,b)=" + funcResult);
    }


}
