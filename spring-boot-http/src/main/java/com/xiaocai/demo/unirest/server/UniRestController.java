package com.xiaocai.demo.unirest.server;

import com.mashape.unirest.http.utils.Base64Coder;
import com.xiaocai.demo.unirest.vo.RestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
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


    @PostMapping("/AuthData")
    @ApiOperation(value = "Post请求的Basic Authentication的Demo")
    public RestResponse authData(HttpServletRequest request){

        Map<String,String> headerParams = new HashMap<>();
        Enumeration<String> nameList = request.getHeaderNames();
        while (nameList.hasMoreElements()) {
            // 循环取出每个参数名
            String paramName =  nameList.nextElement();
            // 获取每个参数所对应的所有的参数值
            String paramValue = request.getHeader(paramName);

            headerParams.put(paramName, paramValue);

        }
        System.out.println("接收到参数 headerParams ："+headerParams);

        String authorization = request.getHeader("Authorization");
        System.out.println("接收到参数 Authorization 的值是 ："+authorization);
        String info = Base64Coder.decodeString(authorization.split(" ")[1]);
        System.out.println("解密参数 Authorization 用户名密码是："+info);

        RestResponse response = new RestResponse();
        response.setCode("200");
        response.setMsg("支付成功");
        response.setData("https://zhangxiaocai.cn?req="+ UUID.randomUUID().toString());
        return response;
    }

    @PostMapping("/HeadData")
    @ApiOperation(value = "Post请求头-传输数据-的Demo")
    public RestResponse headData(HttpServletRequest request){

        Map<String,String> headerParams = new HashMap<>();
        Enumeration<String> nameList = request.getHeaderNames();
        while (nameList.hasMoreElements()) {
            // 循环取出每个参数名
            String paramName =  nameList.nextElement();
            // 获取每个参数所对应的所有的参数值
            String paramValue = request.getHeader(paramName);
            headerParams.put(paramName, paramValue);
        }
        System.out.println("接收到参数 headerParams ："+headerParams);

        RestResponse response = new RestResponse();
        response.setCode("200");
        response.setMsg("支付成功");
        response.setData("https://zhangxiaocai.cn?req="+ UUID.randomUUID().toString());
        return response;
    }



    @PostMapping("/BodyData")
    @ApiOperation(value = "Post请求体-传输数据-的Demo")
    public RestResponse BodyData(HttpServletRequest request){

        Map<String,String> headerParams = new HashMap<>();
        Enumeration<String> nameList = request.getHeaderNames();
        while (nameList.hasMoreElements()) {
            // 循环取出每个参数名
            String paramName =  nameList.nextElement();
            // 获取每个参数所对应的所有的参数值
            String paramValue = request.getHeader(paramName);
            headerParams.put(paramName, paramValue);
        }
        System.out.println("BodyData接收到参数 headerParams ："+headerParams);

        RestResponse response = new RestResponse();
        response.setCode("200");
        response.setMsg("支付成功");
        response.setData("https://zhangxiaocai.cn?req="+ UUID.randomUUID().toString());
        return response;
    }

}
