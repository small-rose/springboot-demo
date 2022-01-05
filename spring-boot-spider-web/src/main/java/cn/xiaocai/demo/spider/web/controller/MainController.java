package cn.xiaocai.demo.spider.web.controller;

import cn.xiaocai.demo.spider.web.config.InnerDataConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ MainController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/31 23:57
 * @Version ： 1.0
 **/
@Slf4j
@Controller
public class MainController extends RulesData{

    @Autowired
    private InnerDataConfig innerDataConfig ;

    @PostConstruct
    public void init(){
        RULELIST.addAll(innerDataConfig.getRuleList());
    }

    @GetMapping(value = {"/index.html", "/"})
    public String getString(HttpServletRequest request){
        request.setAttribute("ruleList", RULELIST);
        return "index";
    }
}
