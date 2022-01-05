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

    private static Integer total = 0;
    @PostConstruct
    public void init(){
        RULELIST.addAll(innerDataConfig.getRuleList());
        total = RULELIST.size();
    }


    @GetMapping(value = {"/index.html", "/"})
    public String getString(HttpServletRequest request){
        List<Rules> customList = null;
        String errorMsg = "数据加载成功";
        if (total!=RULELIST.size()){
            try {
                customList = ruleService.queryCustomList();
                RULELIST.addAll(customList);
            } catch (Exception e) {
                e.printStackTrace();
                log.info("----加载自定义数据出错----");
                errorMsg = "加载自定义数据异常！";
            }
        }
        request.setAttribute("errorMsg", errorMsg);
        request.setAttribute("ruleList", RULELIST);
        return "index";
    }
}
