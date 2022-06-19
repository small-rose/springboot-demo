package com.xiaocai.demo.controller;

import com.xiaocai.demo.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ TestController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/2/15 15:28
 * @Version ： 1.0
 **/

@Slf4j
@RestController
@RequestMapping(value = "/test")
@Api(value = "查询测试", description="查询测试", tags="查询测试")
public class TestController {

    @GetMapping(value = "/test01")
    public String test01(){

        return "SUCCESS";
    }


    @ApiOperation(value = "执行入口-解析Excel",response = Map.class)
    @GetMapping("/test02")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userName", value = "用户名", required = true, dataType="string",
                    defaultValue = "admin", example = "admin"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType="string",
                    defaultValue = "123456", example = "123456")
    })
    public Map test02(String userName, String password){

        Map map = new HashMap();
        map.put("userName" , userName);
        map.put("password" , password);
        return map;
    }


    @ApiOperation(value = "测试传值-JSOn解析",response = Map.class)
    @PostMapping("/testJson01")
    public Map testJson01(@RequestBody UserVO userVO) {

        Map map = new HashMap();
        map.put("data" , userVO);
        return map;
    }
}
