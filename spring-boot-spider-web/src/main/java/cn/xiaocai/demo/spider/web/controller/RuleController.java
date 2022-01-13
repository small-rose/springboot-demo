package cn.xiaocai.demo.spider.web.controller;

import cn.xiaocai.demo.spider.web.message.AjaxJson;
import cn.xiaocai.demo.spider.web.service.RuleService;
import cn.xiaocai.demo.spider.web.vo.Rules;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.stream.Collectors;

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

    /**
     * 实时保存
     * @param rules
     * @return
     */
    @PostMapping("/add")
    public AjaxJson addRule(@RequestBody Rules rules){

        log.info("Rule added :" + rules) ;

        rules.setId(String.valueOf(UUID.randomUUID()));

        customList.add(rules);
        customList = customList.stream().filter(distinctByKey(r->r.getDoor())).collect(Collectors.toList());

        boolean bool = ruleService.saveRules(customList);
        if (bool){
            customList.clear();
            return AjaxJson.success("添加成功");
        }
        return AjaxJson.failed("添加失败");
    }


    /**
     * 不实时保存，项目停止时保存，是一条思路，尚未实现，
     * 可以用过项目启动、停止监听，来读取和持久化数据到 custom-data.yml
     * @param rules
     * @return
     */
    @PostMapping("/addList")
    public AjaxJson addList(@RequestBody Rules rules){

        log.info("Rule added :" + rules) ;

        rules.setId(String.valueOf(UUID.randomUUID()));

        customList.add(rules);

        return AjaxJson.success("添加成功");
    }

}
