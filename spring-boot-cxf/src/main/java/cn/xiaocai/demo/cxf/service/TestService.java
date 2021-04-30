package cn.xiaocai.demo.cxf.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-04-30 17:04
 **/
@WebService(name = "TestService", // 暴露服务名称
        targetNamespace = "http://service.cxf.demo.xiaocai.cn"// 命名空间,一般是接口的包名倒序
)
public interface TestService {
    /**
     *  test
     * @param username
     * @return
     */
    @WebMethod
    @WebResult(name = "String", targetNamespace = "")
    String sendMessage(@WebParam(name = "username") String username);
}
