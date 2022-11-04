package cn.small.demo.qlexpress.simple;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import org.junit.Test;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ CollectionDemoTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/11/4 17:55
 * @Version ： 1.0
 **/
public class CollectionDemoTest {



    @Test
    public void test_NewMap() throws Exception {
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        String express = "abc=NewMap('a':1,'b':2,'c':3);return abc.get('a')+abc.get('b')+abc.get('c');";
        Object mapSum = runner.execute(express, context, null, true, false);
        System.out.println("mapSum: " + mapSum);
    }


    /**
     *  集合的写法示例
     * @throws Exception
     */
    @Test
    public void testSet() throws Exception {
        ExpressRunner runner = new ExpressRunner(false, false);
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        String express = "abc = NewMap(1:1, 2:2); return abc.get(1) + abc.get(2);";
        Object r = runner.execute(express, context, null, false, false);
        System.out.println(r);
        express = "abc = NewList(1, 2, 3); return abc.get(1) + abc.get(2)";
        r = runner.execute(express, context, null, false, false);
        System.out.println(r);
        express = "abc = [1, 2, 3]; return abc[1] + abc[2];";
        r = runner.execute(express, context, null, false, false);
        System.out.println(r);
    }
}
