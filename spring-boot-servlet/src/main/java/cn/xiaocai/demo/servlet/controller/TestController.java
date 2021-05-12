package cn.xiaocai.demo.servlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springboot-redis
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-12 14:58
 **/
@Controller
public class TestController {

    @RequestMapping("/")
    public String index(){
        return "WEB-INF/jsp/index";
    }
}
