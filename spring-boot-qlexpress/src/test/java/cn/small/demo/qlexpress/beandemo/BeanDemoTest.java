package cn.small.demo.qlexpress.beandemo;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import org.junit.Test;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ BeanDemoTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/11/4 14:35
 * @Version ： 1.0
 **/
public class BeanDemoTest {


    @Test
    public void test_java_bean() throws Exception {
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        //qlexpress只会引入java.util.*和java.lang.*
        String express = "import cn.small.demo.qlexpress.bean.Person;" +
                "person=new Person();" +
                "person.sayHello();" +
                "person.sayHelloStatic();";
        runner.execute(express, context, null, true, false);
    }


    @Test
    public void test_java_bean2() throws Exception {
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        context.put("name", "zxc");
        //qlexpress只会引入java.util.*和java.lang.*
        String express = "import cn.small.demo.qlexpress.bean.Person;" +
                "person=new Person();" +
                "person.sayHello(name);" +
                "person.sayHelloStatic();";
        runner.execute(express, context, null, true, false);
    }



}
