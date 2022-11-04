package cn.small.demo.qlexpress.java;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import org.junit.Test;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ AttributeSwitchDemoTest ] 说明：无
 * @Function :  功能说明： 属性开关
 * @Date ：2022/11/4 18:00
 * @Version ： 1.0
 **/
public class AttributeSwitchDemoTest {

    /**
     * 是否需要高精度计算
     */
    private boolean isPrecise = false;
    /**
     *
     * @throws Exception
     */
    @Test
    public void is_precise() throws Exception {
        // 创建ExpressRunner的时候第一个参数是是否开启高精度默认false，第二个参数是是否开启trace。
        ExpressRunner runner = new ExpressRunner(true, false);
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        //订单总价 = 单价 * 数量 + 首重价格 + （总重量 - 首重） * 续重单价
        context.put("单价", 1.25);
        context.put("数量", 100);
        context.put("首重价格", 125.25);
        context.put("总重量", 20.55);
        context.put("首重", 10.34);
        context.put("续重单价", 3.33);

        String express = "单价*数量+首重价格+(总重量-首重)*续重单价";
        Object totalPrice = runner.execute(express, context, null, true, false);
        System.out.println("totalPrice:" + totalPrice);
    }


    /**
     * 是否使用逻辑短路特性
     */
    private boolean isShortCircuit = true;
    @Test
    public void isShortCircuit() throws Exception {
        ExpressRunner runner = new ExpressRunner(true, false);
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();


        runner.setShortCircuit(true);
        runner.setShortCircuit(false);//显式指定，默认是true

        context.put("单价", 1.25);
        context.put("数量", 100);
        context.put("首重价格", 125.25);
        context.put("总重量", 20.55);
        context.put("首重", 10.34);
        context.put("续重单价", 3.33);

        String express = "单价*数量+首重价格+(总重量-首重)*续重单价";
        Object totalPrice = runner.execute(express, context, null, true, false);
        System.out.println("totalPrice:" + totalPrice);
    }



    /**
     * 执行一段文本
     * @param expressString 程序文本
     * @param context 执行上下文，可以扩展为包含ApplicationContext
     * @param errorList 输出的错误信息List
     * @param isCache 是否使用Cache中的指令集,建议为true
     * @param isTrace 是否输出详细的执行指令信息，建议为false
     * @param aLog 输出的log
     * @return
     * @throws Exception
     */
    //Object execute(String expressString, IExpressContext<String,Object> context, List<String> errorList, boolean isCache, boolean isTrace, Log aLog);

}
