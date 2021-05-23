package com.example.temp.controller;

import com.example.temp.annotation.ExceptionFallBack;
import com.example.temp.excepion.LimitConflictException;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/23 17:53
 * @version: v1.0
 */
@RestController
public class ExceptionController {
    Map<String, Object> result = new HashMap<>();

    /**
     * http://localhost:8080/e1?code=123
     * @param code
     * @return
     */
    @ExceptionFallBack(fallbackFor = {NullPointerException.class})
    @RequestMapping("/e1")
    public Map<String, Object> testException(String code){

        if (!StringUtils.isEmpty(code) &&  code.contains("0")){
            throw new NullPointerException("测试空指针异常，降级处理");
        }
        result.put("code", code);
        result.put("data", true);
        return  result;
    }

    @ExceptionFallBack(fallbackForClassName = {"NullPointerException"})
    @RequestMapping("/e2")
    public Map<String, Object> test2Exception(String code){
        if (!StringUtils.isEmpty(code) &&  code.contains("0")){
            throw new NullPointerException("测试空指针异常，配置字符串，降级处理");
        }
        result.put("code", 200);
        result.put("data", true);
        return  result;
    }


    @ExceptionFallBack(noFallbackFor = {NullPointerException.class})
    @RequestMapping("/e3")
    public Map<String, Object> test3Exception(String code){
        if (!StringUtils.isEmpty(code) &&  code.contains("0")){
            throw new NullPointerException("测试空指针异常不降级处理...");
        }
        result.put("code", 200);
        result.put("data", true);
        return  result;
    }


    @ExceptionFallBack(noFallbackForClassName = {"LimitConflictException"})
    @RequestMapping("/e4")
    public Map<String, Object> test4Exception(String code){
        if (!StringUtils.isEmpty(code) &&  code.contains("0")){
            throw new LimitConflictException("测试自定义异常 配置字符串名字，不降级处理...");
        }
        result.put("code", 200);
        result.put("data", true);
        return  result;
    }


    @ExceptionFallBack(fallback = "test5FallBackTest", fallbackForClassName = {"Exception"})
    @RequestMapping("/e5")
    public Map<String, Object> test5Exception(String code){
        if (!StringUtils.isEmpty(code) &&  code.contains("0")){
            throw new RuntimeException("空指针异常，自定义降级方法的处理");
        }
        result.put("code", 200);
        result.put("data", "这是正常返回的数据");
        return  result;
    }

    public Map<String, Object> test5FallBackTest(String code){

        result.put("code", code);
        result.put("success", true);
        result.put("data", "这是自定义的异常降级方法返回的数据");
        return  result;
    }

}
