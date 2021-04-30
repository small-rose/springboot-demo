package cn.xiaocai.demo.cxf.service.impl;

import cn.xiaocai.demo.cxf.service.TestService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-04-30 17:05
 **/
@WebService(serviceName = "TestService", // 与接口中指定的name一致
        targetNamespace = "http://service.cxf.demo.xiaocai.cn", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "cn.xiaocai.demo.cxf.service.TestService"// 接口地址
)
@Component
public class TestServiceImpl implements TestService {

    @Override
    public String sendMessage(String username) {
        return  "hello "+username;
    }
}
