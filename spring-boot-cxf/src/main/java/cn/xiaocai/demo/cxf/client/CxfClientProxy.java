package cn.xiaocai.demo.cxf.client;

import cn.xiaocai.demo.cxf.service.TestService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * @program: springboot-redis
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-06 11:00
 **/
public class CxfClientProxy {

    /**
     *  客户端访问服务端接口地址
     */
    private static String address = "http://127.0.0.1:8080/cxf/services/TestService?wsdl";

    /**
     * 方式1.代理类工厂的方式,需要拿到对方的接口
     */
    public static void clientProxy() {
        try {
            // 代理工厂
            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
            // 设置代理地址
            jaxWsProxyFactoryBean.setAddress(address);
            // 设置接口类型
            jaxWsProxyFactoryBean.setServiceClass(TestService.class);
            //添加拦截，补充认证信息
            jaxWsProxyFactoryBean.getOutInterceptors().add(new ClientInterceptor("admin1","root"));
            // 创建一个代理接口实现
            TestService cs = (TestService) jaxWsProxyFactoryBean.create();
            // 数据准备
            String userName = "zhang xiao cai";
            // 调用代理接口的方法调用并返回结果
            String result = cs.sendMessage(userName);
            System.out.println("返回结果:" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        clientProxy();
    }
}
