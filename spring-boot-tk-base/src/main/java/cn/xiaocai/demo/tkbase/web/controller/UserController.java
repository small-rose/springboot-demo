package cn.xiaocai.demo.tkbase.web.controller;

import cn.xiaocai.demo.tkbase.web.common.base.BaseController;
import cn.xiaocai.demo.tkbase.web.common.base.BaseService;
import cn.xiaocai.demo.tkbase.web.common.message.CommonResult;
import cn.xiaocai.demo.tkbase.web.service.UserBsService;
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
public class UserController extends BaseController {

    @Autowired
    private UserBsService userBsService;

    @Override
    public BaseService getBaseService() {
        return userBsService;
    }

    /**
     * 通用方法在父类
     * http://localhost:8805/user/getById
     */

    /**
     * http://localhost:8805/user/doUser
     * @return
     */
    @RequestMapping("/doUser")
    public CommonResult doUser() {

       return userBsService.querySpecialAgeOver20();
    }
}
