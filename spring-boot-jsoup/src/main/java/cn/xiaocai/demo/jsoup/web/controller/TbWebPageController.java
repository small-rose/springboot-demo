package cn.xiaocai.demo.jsoup.web.controller;

import cn.xiaocai.demo.jsoup.web.model.TbWebPage;
import cn.xiaocai.demo.jsoup.web.service.TbWebPageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ TbWebPageController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/23 17:55
 * @Version ： 1.0
 **/

@Slf4j
@RestController
@RequestMapping(value = "/page")
@Api(value = "页面查询", description="页面测试", tags="页面测试")
public class TbWebPageController {
    @Autowired
    private TbWebPageService tbWebPageService;


    @ApiOperation(value = "add",response = Map.class)
    @PostMapping("/add")
    public Map add(@RequestBody TbWebPage tbWebPage) {
        TbWebPage result = tbWebPageService.add(tbWebPage);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }

    @ApiOperation(value = "update",response = Map.class)
    @PostMapping("/update")
    public Map update(@RequestBody TbWebPage tbWebPage) {
        TbWebPage result = tbWebPageService.update(tbWebPage);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }


    @ApiOperation(value = "select",response = Map.class)
    @PostMapping("/select")
    public Map select(@RequestBody TbWebPage tbWebPage) {
        TbWebPage result = tbWebPageService.selectById(tbWebPage.getPageId());
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }

    @ApiOperation(value = "queryList",response = Map.class)
    @PostMapping("/queryList")
    public Map queryList(@RequestBody TbWebPage tbWebPage) {
        List<TbWebPage> result = tbWebPageService.queryList(tbWebPage);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }
}
