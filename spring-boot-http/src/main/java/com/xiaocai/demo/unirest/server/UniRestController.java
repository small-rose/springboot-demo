package com.xiaocai.demo.unirest.server;

import com.xiaocai.demo.unirest.vo.RestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ UniRestController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/28 13:44
 * @Version ： 1.0
 **/
@RestController
@RequestMapping("/rest")
@Api(value = "UniRestController", description = "Unirest 服务Demo")
public class UniRestController {


    @GetMapping("/getData")
    @ApiOperation(value = "Get请求的Demo")
    public String demo01(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        System.out.println("接收到参数 name ："+name);
        return "Hello ".concat(name).concat(" !");
    }

    @PostMapping("/postData")
    @ApiOperation(value = "Post请求的Demo")
    public RestResponse demo02(HttpServletRequest request){
        String name = request.getParameter("name");
        System.out.println("接收到参数 name ："+name);

        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        System.out.println("接收到参数 user ："+user+" , pass："+pass);

        RestResponse response = new RestResponse();
        response.setCode("200");
        response.setMsg("支付成功");
        response.setData("https://zhangxiaocai.cn?req="+ UUID.randomUUID().toString());
        return response;
    }
}
