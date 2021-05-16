package cn.xiaocai.demo.javaassist.proxy;


import javassist.util.proxy.ProxyFactory;
import javassist.util.proxy.ProxyObject;

import java.lang.reflect.InvocationTargetException;


/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/16 14:40
 * @version: v1.0
 */
public class JavassistDynamicProxy {

    private  Object target ;

    public JavassistDynamicProxy(Object target){
        this.target = target;
    }

    public Object creatProxy(Class clazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ProxyFactory proxyFactory = new ProxyFactory();
        // 设置实现的接口
        proxyFactory.setInterfaces(new Class[]{clazz});
        Class<?> proxyClass = proxyFactory.createClass();
        Object javassistProxy =   proxyClass.getDeclaredConstructor().newInstance();
        ((ProxyObject) javassistProxy).setHandler(new JavassistInterceptor(target));
        return javassistProxy;
    }


}
