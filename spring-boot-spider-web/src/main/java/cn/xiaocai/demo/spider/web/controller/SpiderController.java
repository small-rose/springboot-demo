package cn.xiaocai.demo.spider.web.controller;

import cn.xiaocai.demo.spider.web.message.AjaxJson;
import cn.xiaocai.demo.spider.web.service.SpiderFacade;
import cn.xiaocai.demo.spider.web.vo.Rules;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/1/9 11:59
 * @version: v1.0
 */
@Slf4j
@RestController
@RequestMapping("/didi")
public class SpiderController extends RulesData{

    @Autowired
    private SpiderFacade spiderFacade ;

    /**
     * 抓取
     * @param id
     * @return
     */
    @PostMapping("/start/{id}")
    public AjaxJson startTask(@PathVariable String id){
        if(!StringUtils.hasText(id)){
            return AjaxJson.failed("参数非法");
        }
        //totalList.stream().anyMatch(r->r.getId().equals(id))
        List<Rules> taskRules = totalList.stream().filter(r -> r.getId().equals(id)).collect(Collectors.toList());
        if(taskRules.isEmpty()){
            return AjaxJson.failed("参数非法");
        }
        if(!taskList.isEmpty()){
            return AjaxJson.failed("已经有任务正在执行");
        }

        Rules rules = taskRules.get(0);
        boolean bool = spiderFacade.startTask(rules);
        return  AjaxJson.success("任务已启动执行");
    }


    /**
     * 抓取
     * @param id
     * @return
     */
    @PostMapping("/stop/{id}")
    public AjaxJson stopTask(@PathVariable String id){
        if(!StringUtils.hasText(id)){
            return AjaxJson.failed("参数非法");
        }
        //totalList.stream().anyMatch(r->r.getId().equals(id))
        List<Rules> taskRules = totalList.stream().filter(r -> r.getId().equals(id)).collect(Collectors.toList());
        if(taskRules.isEmpty()){
            return AjaxJson.failed("参数非法");
        }
        if(!taskList.isEmpty()){
            return AjaxJson.failed("已经有任务正在执行");
        }

        //Rules rules = taskRules.get(0);
        //boolean bool = spiderFacade.stopTask(rules);
        return  AjaxJson.success("任务已启动执行");
    }
}
