package cn.xiaocai.demo.spider.web.controller;

import cn.xiaocai.demo.spider.web.config.InnerDataConfig;
import cn.xiaocai.demo.spider.web.service.RuleService;
import cn.xiaocai.demo.spider.web.vo.Rules;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

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
    @Autowired
    RuleService ruleService;


    @PostConstruct
    public void init(){
        appdataList.addAll(innerDataConfig.getRuleList());
        totalList.addAll(appdataList);
    }


    @GetMapping(value = {"/index.html", "/"})
    public String getString(HttpServletRequest request){
         String errorMsg = "数据加载成功";
        //refreshCustomList();
        //RULELIST.addAll(appdataList);
        totalList.addAll(customList);
        totalList = totalList.stream().filter(distinctByKey(r->r.getDoor())).collect(Collectors.toList());
        request.setAttribute("errorMsg", errorMsg);
        request.setAttribute("ruleList", totalList);
        return "index";
    }


    private void refreshCustomList(){
        //RULELIST.clear();
        customList.clear();;
        try {
            List<Rules> rules = ruleService.queryCustomList();
            customList.addAll(rules);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
