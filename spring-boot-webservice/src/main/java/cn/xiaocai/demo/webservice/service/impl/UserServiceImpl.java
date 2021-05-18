package cn.xiaocai.demo.webservice.service.impl;

import cn.xiaocai.demo.webservice.service.UserService;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/4 15:51
 * @version: v1.0
 */

@WebService(serviceName = "UserService", // 与接口中指定的name一致
        targetNamespace = "http://service.webservice.demo.xiaocai.cn", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "cn.xiaocai.demo.webservice.service.UserService"// 接口地址
)
public class UserServiceImpl implements UserService {

    private static Map<Integer, String> userMap = new HashMap<>();

    static {
        userMap.put(1, "张小菜");
        userMap.put(2, "张小铭");
        userMap.put(3, "张小果");
    }

    @Override
    public String getUserName(String id) {
        return userMap.get(id);
    }
}
