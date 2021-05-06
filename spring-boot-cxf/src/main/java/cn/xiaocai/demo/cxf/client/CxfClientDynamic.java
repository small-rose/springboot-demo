package cn.xiaocai.demo.cxf.client;

import com.google.gson.Gson;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * @program: spring-boot-cxf-client
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-06 10:25
 **/
public class CxfClientDynamic {

    /**
     *  客户端访问服务端接口地址
     */
    private static String address = "http://127.0.0.1:8080/cxf/services/TestService?wsdl";

    /**
     *  方式2  动态调用方式
     */
    @SuppressWarnings("all")
    public static void main(String[] args) {
        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient(address);
        // 添加用户信息验证 ,可以设置错误密码测试
        client.getOutInterceptors().add(new ClientInterceptor("admin", "root1"));
        // 取返回值
        Object[] objects = new Object[0];
        try {
            // 接口方法、参数
            objects = client.invoke("sendMessage", "zhangxiaocai");
            System.out.println(objects[0]);
            /*
            Map[] maps = new Gson().fromJson(objects[0].toString(), Map[].class);
            List<Map<String, String>> list = Arrays.asList(maps);
            System.out.println("返回的数据：");
            System.out.println(list);
             */
        } catch (Exception e) {
            System.out.println("客户端接口访问失败！！");
            e.printStackTrace();
        }
    }
}
