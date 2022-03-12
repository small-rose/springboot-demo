package cn.xiaocai.demo.cxf.client;

import cn.xiaocai.demo.cxf.service.TestService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * @program: spring-boot-cxf
 * @description    客户端调用方式1 使用代理工厂的方式调用，需要拿到服务方接口。
 *                 可以根据 wsdl 地址生成。使用 jdk 的 bin下 wsimport 命令
 *              wsimport -keep -d D:\temp\d -s D:\temp\s -p com.map -verbose http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl
 *                  -keep：是否生成java源文件
 *
 *                  -d：指定.class文件的输出目录
 *
 *                  -s：指定.java文件的输出目录
 *
 *                  -p：定义生成类的包名，不定义的话有默认包名
 *
 *                  -verbose：在控制台显示输出信息
 *
 *                  -b：指定jaxws/jaxb绑定文件或额外的schemas
 *
 *                  -extension：使用扩展来支持SOAP1.2
 *                  参考 https://blog.csdn.net/qq_39459412/article/details/79079865
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
