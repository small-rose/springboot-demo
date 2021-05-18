package cn.xiaocai.demo.webservice.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "UserService", // 暴露服务名称
        targetNamespace = "http://service.webservice.demo.xiaocai.cn"// 命名空间,一般是接口的包名倒序
)
public interface UserService {


    @WebMethod
    @WebResult(name = "String", targetNamespace = "")
    String getUserName(@WebParam(name = "id") String id);
}
