package cn.xiaocai.demo.jsoup.web.controller;

import cn.xiaocai.demo.jsoup.web.model.TbWebCategory;
import cn.xiaocai.demo.jsoup.web.service.TbWebCategoryService;
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
 * @Author : small-rose/zhangxiaocai
 * @Description : [ TbWebCategoryController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/23 17:55
 * @Version ： 1.0
 **/

@Slf4j
@RestController
@RequestMapping(value = "/category")
@Api(value = "分类查询", description="分类查询", tags="分类查询")
public class TbWebCategoryController {
    @Autowired
    private TbWebCategoryService tbWebCategoryService;


    @ApiOperation(value = "add",response = Map.class)
    @PostMapping("/add")
    public Map add(@RequestBody TbWebCategory tbWebCategory) {
        TbWebCategory result = tbWebCategoryService.add(tbWebCategory);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }

    @ApiOperation(value = "update",response = Map.class)
    @PostMapping("/update")
    public Map update(@RequestBody TbWebCategory tbWebCategory) {
        TbWebCategory result = tbWebCategoryService.update(tbWebCategory);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }


    @ApiOperation(value = "select",response = Map.class)
    @PostMapping("/select")
    public Map select(@RequestBody TbWebCategory tbWebCategory) {
        TbWebCategory result = tbWebCategoryService.selectById(tbWebCategory.getCategoryId());
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }

    @ApiOperation(value = "queryList",response = Map.class)
    @PostMapping("/queryList")
    public Map queryList(@RequestBody TbWebCategory tbWebCategory) {
        List<TbWebCategory> result = tbWebCategoryService.queryList(tbWebCategory);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }
}
