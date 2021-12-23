package cn.xiaocai.demo.jsoup.web.controller;

import cn.xiaocai.demo.jsoup.web.model.TbWebSite;
import cn.xiaocai.demo.jsoup.web.service.TbWebSiteService;
import cn.xiaocai.demo.jsoup.web.service.UserBsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ TbWebSiteController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/23 17:55
 * @Version ： 1.0
 **/

@Slf4j
@RestController
@RequestMapping(value = "/web")
@Api(value = "查询测试", description="查询测试", tags="查询测试")
public class TbWebSiteController {
    @Autowired
    private TbWebSiteService tbWebSiteService;


    @ApiOperation(value = "add",response = Map.class)
    @GetMapping("/add")
    public Map add(@RequestBody TbWebSite tbWebSite) {
        TbWebSite result = tbWebSiteService.add(tbWebSite);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }

    @ApiOperation(value = "update",response = Map.class)
    @GetMapping("/update")
    public Map update(@RequestBody TbWebSite tbWebSite) {
        TbWebSite result = tbWebSiteService.update(tbWebSite);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }


    @ApiOperation(value = "select",response = Map.class)
    @GetMapping("/select")
    public Map select(@RequestBody TbWebSite tbWebSite) {
        TbWebSite result = tbWebSiteService.selectById(tbWebSite.getWebId());
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }

    @ApiOperation(value = "select",response = Map.class)
    @GetMapping("/queryList")
    public Map queryList(@RequestBody TbWebSite tbWebSite) {
        TbWebSite result = tbWebSiteService.queryList(tbWebSite.getWebId());
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }
}
