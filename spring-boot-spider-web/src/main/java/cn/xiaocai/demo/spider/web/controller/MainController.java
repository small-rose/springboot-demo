package cn.xiaocai.demo.spider.web.controller;

import cn.xiaocai.demo.spider.web.config.InnerDataConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ MainController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/31 23:57
 * @Version ： 1.0
 **/
@Slf4j
@RestController
@RequestMapping("/")
public class MainController extends RulesData{

    @Autowired
    private InnerDataConfig innerDataConfig ;


    @RequestMapping("/index.html")
    public String getString(HttpServletRequest request){
        String name = "Small Spider ";
        request.setAttribute("name",name);

        RULELIST.addAll(innerDataConfig.getRuleList());

        request.setAttribute("ruleList", RULELIST);
        return "index.html";
    }
}
