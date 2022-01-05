package cn.xiaocai.demo.spider.web.controller;

import cn.xiaocai.demo.spider.web.service.RuleService;
import cn.xiaocai.demo.spider.web.vo.Rules;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ RuleController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/31 23:41
 * @Version ： 1.0
 **/
@Slf4j
@RestController
@RequestMapping("/rule")
public class RuleController extends RulesData{

    @Autowired
    RuleService ruleService;

    @PostMapping("/add")
    public Map addRule(@RequestBody Rules rules){

        log.info("Rule added :" + rules) ;
        HashMap result = new HashMap();


        RULELIST.add(rules);
        boolean bool = ruleService.saveRules(RULELIST);

        result.put("code", bool ? 200 : 500);
        result.put("data", bool ? "添加成功":"添加失败");
        return result ;
    }
}
