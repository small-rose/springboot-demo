package cn.small.demo.qlexpress.dynamicparams;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.DynamicParamsUtil;
import com.ql.util.express.ExpressRunner;
import com.ql.util.express.IExpressContext;
import org.junit.Test;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ DynamicParamsDemoTest ] 说明：无
 * @Function :  功能说明： 不定参数的DEMO 测试用例
 * @Date ：2022/11/4 16:52
 * @Version ： 1.0
 **/
public class DynamicParamsDemoTest {

    @Test
    public void testMethodReplace() throws Exception {
        ExpressRunner runner = new ExpressRunner();
        IExpressContext<String, Object> expressContext = new DefaultContext<String, Object>();
        runner.addFunctionOfServiceMethod("getTemplate", new DynamicParamBean(), "getTemplate", new Class[]{Object[].class}, null);

        //(1)默认的不定参数可以使用数组来代替
        Object r = runner.execute("getTemplate([11,'22', 33L, true])", expressContext, null, false, true);
        System.out.println(r);

        //(2)像java一样,支持函数动态参数调用,需要打开以下全局开关,否则以下调用会失败
        DynamicParamsUtil.supportDynamicParams = true;
        r = runner.execute("getTemplate(11, '22', 33L, true)", expressContext, null, false, true);
        System.out.println(r);
    }


}
