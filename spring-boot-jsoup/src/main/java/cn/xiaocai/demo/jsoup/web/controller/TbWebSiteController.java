package cn.xiaocai.demo.jsoup.web.controller;

import cn.xiaocai.demo.jsoup.web.model.TbWebSite;
import cn.xiaocai.demo.jsoup.web.service.TbWebSiteService;
import cn.xiaocai.demo.jsoup.web.service.UserBsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
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
    @PostMapping("/add")
    public Map add(@RequestBody TbWebSite tbWebSite) {
        TbWebSite result = tbWebSiteService.add(tbWebSite);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }

    @ApiOperation(value = "update",response = Map.class)
    @PostMapping("/update")
    public Map update(@RequestBody TbWebSite tbWebSite) {
        TbWebSite result = tbWebSiteService.update(tbWebSite);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }


    @ApiOperation(value = "select",response = Map.class)
    @PostMapping("/select")
    public Map select(@RequestBody TbWebSite tbWebSite) {
        TbWebSite result = tbWebSiteService.selectById(tbWebSite.getWebId());
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }

    @ApiOperation(value = "queryList",response = Map.class)
    @PostMapping("/queryList")
    public Map queryList(@RequestBody TbWebSite tbWebSite) {
        List<TbWebSite> result = tbWebSiteService.queryList(tbWebSite);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }

    @ApiOperation(value = "queryListPage",response = Map.class)
    @PostMapping("/queryListPage")
    public Map queryList(@RequestBody TbWebSite tbWebSite,  Integer pageNumber,Integer pageSize) {

        // JPA 分页从0开始
        if(pageNumber==null) pageNumber=1;
        if(pageSize==null) pageNumber=10;
        Pageable pageable = PageRequest.of(pageNumber-1, pageSize, Sort.Direction.DESC,"add_time");

        //查询
        Page<TbWebSite> result = tbWebSiteService.queryListForPage(tbWebSite,pageable);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }

    @ApiOperation(value = "queryListPage02",response = Map.class)
    @PostMapping("/queryListPage02")
    public Map queryList02(@RequestBody TbWebSite tbWebSite,  Integer pageNumber,Integer pageSize) {

        // JPA 分页从0开始
        if(pageNumber==null) pageNumber=1;
        if(pageSize==null) pageNumber=10;
        Pageable pageable = PageRequest.of(pageNumber-1, pageSize, Sort.Direction.DESC,"add_time");

        //查询
        Page<TbWebSite> result = tbWebSiteService.queryListPageSpecification(tbWebSite,pageable);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }
}
