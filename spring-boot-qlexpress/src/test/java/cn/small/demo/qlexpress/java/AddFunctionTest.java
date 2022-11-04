package cn.small.demo.qlexpress.java;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import org.junit.Test;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ AddFunctionOfClassMethodTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/11/4 14:53
 * @Version ： 1.0
 **/
public class AddFunctionTest {


    @Test
    public void test_ClassMethod() throws Exception {

        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();

        runner.addFunctionOfClassMethod("取绝对值", Math.class.getName(), "abs",
                new String[]{"double"}, null);
        runner.addFunctionOfClassMethod("转换为大写", BeanExample.class.getName(),
                "upper", new String[]{"String"}, null);


        //String exp = "取绝对值(-100);转换为大写(\"hello world\");打印(\"你好吗？\");contains(\"helloworld\",\"aeiou\");";
        String exp = "取绝对值(-100);转换为大写(\"hello world\");";
        runner.execute(exp, context, null, false, false);
    }


    @Test
    public void test_ServiceMethod() throws Exception {

        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();

        runner.addFunctionOfServiceMethod("打印", System.out, "println", new String[]{"String"}, null);
        runner.addFunctionOfServiceMethod("contains", new BeanExample(), "anyContains",
                new Class[]{String.class, String.class}, null);

        //String exp = "取绝对值(-100);转换为大写(\"hello world\");打印(\"你好吗？\");contains(\"helloworld\",\"aeiou\");";
        String exp = "打印(\"你好吗？\");contains(\"helloworld\",\"aeiou\");";
        runner.execute(exp, context, null, false, false);
    }


}
