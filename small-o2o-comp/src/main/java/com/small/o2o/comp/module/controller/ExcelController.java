package com.small.o2o.comp.module.controller;


import com.small.o2o.comp.module.facade.ExcelGenaratorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
@Api(tags = "元数据操作")
public class ExcelController {


    @Autowired
    private ExcelGenaratorService excelGenaratorService ;

    @ApiOperation("生成Excel")
    @GetMapping("/excel")
    public void excel(HttpServletResponse response){
        excelGenaratorService.doHandle(response);
    }

    @ApiOperation("删除元数据")
    @ApiParam(name= "obj" ,allowableValues = "枚举类型:table 表，index 表索引，proc 仅存过，func 仅函数，package 仅存过包，view 视图，type 集合")
    @PostMapping("/del/{obj}")
    @ResponseBody
    public String delObject(@PathVariable("obj") String obj){
        try {

            excelGenaratorService.delObj(obj);
            return "SUCCESS";
        }catch (Exception e){
            return "FAILED-"+e.getMessage();
        }
    }

    @ApiOperation("测试数据")
    @ApiParam(name= "type" ,allowableValues = "枚举类型:1 call，2-匿名")
    @PostMapping("/procedure/{type}")
    @ResponseBody
    public String procedure(@PathVariable("type") String type){
        try {

            excelGenaratorService.procedure(type);
            return "SUCCESS";
        }catch (Exception e){
            return "FAILED-"+e.getMessage();
        }
    }
    
}
