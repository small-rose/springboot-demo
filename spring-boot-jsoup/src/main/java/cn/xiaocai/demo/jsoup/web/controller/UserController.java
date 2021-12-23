package cn.xiaocai.demo.jsoup.web.controller;

import cn.xiaocai.demo.jsoup.web.common.message.CommonResult;
import cn.xiaocai.demo.jsoup.web.service.UserBsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xiaocai.Zhang
 */
@Slf4j
@RestController
@RequestMapping(value = "/user")
public class UserController  {

    @Autowired
    private UserBsService userBsService;


    /**
     * http://localhost:8805/user/doUser
     * @return
     */
    @RequestMapping("/doUser")
    public CommonResult doUser() {

       return userBsService.querySpecialAgeOver20();
    }
}
