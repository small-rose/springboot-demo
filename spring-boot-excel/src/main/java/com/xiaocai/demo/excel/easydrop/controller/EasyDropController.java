package com.xiaocai.demo.excel.easydrop.controller;

import com.xiaocai.demo.excel.easydrop.service.impl.EasyDropServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ EasyDropController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/10/24 10:52
 * @Version ： 1.0
 **/
@Slf4j
@Controller
@RequestMapping("/api/excel")
public class EasyDropController {

    @Autowired
    private EasyDropServiceImpl easyDropService;

    @GetMapping(value = "/getDetailListTemplate")
    public void getExcel(HttpServletResponse response) {
        try {
            easyDropService.exportDetailListTemplate(response);
        } catch (Exception e) {
            log.error("导出共享清单明细模板出错", e);
        }
    }
}
