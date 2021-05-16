package cn.xiaocai.demo.javaassist.proxy;

import javassist.util.proxy.MethodHandler;

import java.lang.reflect.Method;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/16 14:57
 * @version: v1.0
 */
public class JavassistInterceptor implements MethodHandler{
    // 被代理对象
    private Object delegate;

    public JavassistInterceptor(Object delegate) {
        this.delegate = delegate;
    }

    /**
     * @param self 创建的代理对象
     * @param m 被代理方法
     * @param proceed 如果代理接口，此参数为null，如果代理类，此参数为父类的方法
     * @param args 方法参数
     */
    @Override
    public Object invoke(Object self, Method m, Method proceed,
                         Object[] args) throws Throwable {
        System.out.println("javassist proxy before eating");
        Object ret = m.invoke(delegate, args);
        System.out.println("javassist proxy after eating");
        return ret;
    }
}
