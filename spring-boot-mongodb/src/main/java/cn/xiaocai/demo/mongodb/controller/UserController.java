package cn.xiaocai.demo.mongodb.controller;

import cn.xiaocai.demo.mongodb.po.UserDemo;
import cn.xiaocai.demo.mongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: spring-boot-mongodb
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-11 09:45
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    Map<String, Object> result = new HashMap<String, Object>();

    @PostMapping(value="/save")
    public Map<String, Object> saveUser(@RequestBody UserDemo userDemo) {
        result.clear();
        UserDemo user = userService.saveUser(userDemo);
        result.put("code", 200);
        result.put("data", user);
        return result;
    }

    @GetMapping(value="/find/{name}")
    public Map<String, Object> findTestByName(@PathVariable("name") String name){
        result.clear();
        UserDemo user = userService.findUserByName(name);
        result.put("code", 200);
        result.put("data", user);
        return result;
    }

    @GetMapping(value="/update")
    public void updateTest(@RequestBody UserDemo userDemo){

        userService.updateUser(userDemo);
    }

    @GetMapping(value="/delete")
    public void deleteTestById(){
        userService.deleteUserById(11);
    } 
}
