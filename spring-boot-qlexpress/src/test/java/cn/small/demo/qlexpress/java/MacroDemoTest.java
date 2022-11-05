package cn.small.demo.qlexpress.java;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import com.ql.util.express.IExpressContext;
import org.junit.Test;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ MacroDemoTest ] 说明：无
 * @Function :  功能说明： 宏定义
 * @Date ：2022/11/4 15:37
 * @Version ： 1.0
 **/
public class MacroDemoTest {

    @Test
    public void test_macro_use() throws Exception {
        ExpressRunner runner = new ExpressRunner();
        IExpressContext<String, Object> context = new DefaultContext<String, Object>();

        runner.addMacro("计算平均成绩", "(语文+数学+英语)/3.0");
        runner.addMacro("是否优秀", "计算平均成绩>90");
        context.put("语文", 88);
        context.put("数学", 99);
        context.put("英语", 95);
        Object result = runner.execute("是否优秀", context, null, false, false);
        System.out.println(result);
    }

    /**
     * 编译脚本
     *  执行过程：单词分解-->单词类型分析-->语法分析-->生成运行期指令集合-->执行生成的指令集合
     * @throws Exception
     */
    @Test
    public void test_compile_script() throws Exception {
        String express = "int 平均分 = (语文+数学+英语+综合考试.科目2)/4.0;return 平均分";
        ExpressRunner runner = new ExpressRunner(true, true);
        String[] names = runner.getOutVarNames(express);
        for (String s : names) {
            System.out.println("var : " + s);
        }

        String[] functions = runner.getOutFunctionNames(express);
        for (String s : functions) {
            System.out.println("function : " + s);
        }
    }
}
