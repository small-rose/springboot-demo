package cn.xaiocai.limiter.example;

import com.example.temp.annotation.RateLimitSWL;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-31 14:44
 **/
@RestController
public class ExampleFixController {

    @RateLimitSWL
    @RequestMapping("/test1")
    public String test(){
        return "SUCCESS API";
    }


    @RateLimitSWL
    @RequestMapping("/test2")
    public String test2(){
        return "SUCCESS API";
    }
}
