package com.xiaocai.demo.page.web.controller;

import com.xiaocai.demo.page.rowbounds.RowBoundsService;
import com.xiaocai.demo.page.web.model.Account;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ RowBoundsController ] 说明：无
 * @Function :  功能说明：  RowBounds 分页示例
 * @Date ：2022/3/1 14:25
 * @Version ： 1.0
 **/

@RestController
@AllArgsConstructor
public class RowBoundsController {



    private final RowBoundsService rowBoundsService;


    /**
     * rowbounds 分页测试入口
     *
     * @param pageNum
     * @param pageSize
     * @param account
     * @return
     */
    @GetMapping(value = "rowbounds/{pageNum}/{pageSize}")
    public Map<String, Object> rowboundsList(@PathVariable(name="pageNum", required = false)int pageNum,
                                         @PathVariable(name="pageSize", required = false)int pageSize,
                                         Account account){

        if (pageNum==0 || pageSize==0){
            pageNum = 1 ;
            pageSize = 10 ;
        }

        Map<String,Object> response = new HashMap<>();
        response.put("pageNum", pageNum);
        response.put("pageSize", pageSize);

        account.setPageNum(pageNum);
        account.setPageSize(pageSize);
        List<Account> result = rowBoundsService.rowboundsPages(account);


        response.put("data", result);
        return response ;
    }


}
