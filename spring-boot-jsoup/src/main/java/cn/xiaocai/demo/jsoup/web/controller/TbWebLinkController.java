package cn.xiaocai.demo.jsoup.web.controller;

import cn.xiaocai.demo.jsoup.web.model.TbWebLink;
import cn.xiaocai.demo.jsoup.web.service.TbWebLinkService;
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
 * @Description : [ TbWebLinkController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/23 17:55
 * @Version ： 1.0
 **/

@Slf4j
@RestController
@RequestMapping(value = "/link")
@Api(value = "链接查询", description="链接查询", tags="链接查询")
public class TbWebLinkController {
    @Autowired
    private TbWebLinkService tbWebLinkService;


    @ApiOperation(value = "add",response = Map.class)
    @PostMapping("/add")
    public Map add(@RequestBody TbWebLink tbWebLink) {
        TbWebLink result = tbWebLinkService.add(tbWebLink);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }

    @ApiOperation(value = "update",response = Map.class)
    @PostMapping("/update")
    public Map update(@RequestBody TbWebLink tbWebLink) {
        TbWebLink result = tbWebLinkService.update(tbWebLink);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }


    @ApiOperation(value = "select",response = Map.class)
    @PostMapping("/select")
    public Map select(@RequestBody TbWebLink tbWebLink) {
        TbWebLink result = tbWebLinkService.selectById(tbWebLink.getLinkId());
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }

    @ApiOperation(value = "queryList",response = Map.class)
    @PostMapping("/queryList")
    public Map queryList(@RequestBody TbWebLink tbWebLink) {
        List<TbWebLink> result = tbWebLinkService.queryList(tbWebLink);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }
}
