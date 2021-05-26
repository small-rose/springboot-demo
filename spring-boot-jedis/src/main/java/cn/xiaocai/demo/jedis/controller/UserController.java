package cn.xiaocai.demo.jedis.controller;

import cn.xiaocai.demo.jedis.api.JedisApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/26 22:23
 * @version: v1.0
 */
@RestController
public class UserController {
    @Autowired
    private JedisApi jedisApi;

    @RequestMapping("/testCache")
    public String testCache() {
        String cache = "This have no one";
        if (jedisApi.getSerializeMessage("testJedis2") == null) {
            jedisApi.saveSerializeMessage("testJedis2", "This is testCache");
        } else {
            cache = jedisApi.getSerializeMessage("testJedis2").toString();
        }
        return cache;
    }
}
