package cn.xiaocai.demo.javaassist.proxy;

import java.lang.reflect.InvocationTargetException;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/16 14:51
 * @version: v1.0
 */
public class JavassistClientTest {

    public void testProxy01(){
        IPersion proxy = null;
            try {
            proxy = (IPersion) new JavassistDynamicProxy(new Student()).creatProxy(IPersion.class);
            proxy.eat("黄花菜");

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        /**
         *  有接口有实现类
         */
        new JavassistClientTest().testProxy01();

        /**
         * 只代理某个类
         */
        new JavassistClientTest().testProxy02();
    }

    private void testProxy02() {
        ZzyCodeService proxy = null;
        try {
            proxy = (ZzyCodeService) new ZzyProxy().creatProxy(ZzyCodeService.class);
            proxy.code("System.out.println(\"hello world\");");

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
