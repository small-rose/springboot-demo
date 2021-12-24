package cn.xiaocai.demo.jsoup.web.controller;

import cn.xiaocai.demo.jsoup.web.model.TbWebPicture;
import cn.xiaocai.demo.jsoup.web.service.TbWebPictureService;
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
 * @Description : [ TbWebPictureController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/23 17:55
 * @Version ： 1.0
 **/

@Slf4j
@RestController
@RequestMapping(value = "/pic")
@Api(value = "查询测试", description="查询测试", tags="查询测试")
public class TbWebPictureController {
    @Autowired
    private TbWebPictureService tbWebPictureService;


    @ApiOperation(value = "add",response = Map.class)
    @PostMapping("/add")
    public Map add(@RequestBody TbWebPicture tbWebPicture) {
        TbWebPicture result = tbWebPictureService.add(tbWebPicture);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }

    @ApiOperation(value = "update",response = Map.class)
    @PostMapping("/update")
    public Map update(@RequestBody TbWebPicture tbWebPicture) {
        TbWebPicture result = tbWebPictureService.update(tbWebPicture);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }


    @ApiOperation(value = "select",response = Map.class)
    @PostMapping("/select")
    public Map select(@RequestBody TbWebPicture tbWebPicture) {
        TbWebPicture result = tbWebPictureService.selectById(tbWebPicture.getPicId());
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }

    @ApiOperation(value = "queryList",response = Map.class)
    @PostMapping("/queryList")
    public Map queryList(@RequestBody TbWebPicture tbWebPicture) {
        List<TbWebPicture> result = tbWebPictureService.queryList(tbWebPicture);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }
}
