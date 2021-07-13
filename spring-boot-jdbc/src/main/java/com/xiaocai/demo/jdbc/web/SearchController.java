package com.xiaocai.demo.jdbc.web;

import com.xiaocai.demo.jdbc.service.SQLService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-09 15:37
 **/
@RestController
@AllArgsConstructor
public class SearchController {

    final SQLService sqlService;

    @GetMapping("/")
    public String index(){
        return "Server is up !";
    }

    @GetMapping("/dosql")
    public String doSQL(){
        String sql = "ALTER TABLE MM_CENTRALIZATION_TD COMMENT '结算单集中支付主表AAA' ;";
        //String sql = "ALTER TABLE MM_CENTRALIZATION_TD MODIFY COLUMN  CUSTOMERTYPE  VARCHAR(2)   COMMENT '客户类型' ; ";

        sqlService.exec(sql);

        return "SUCCESS";
    }


    @GetMapping("/execJdbc")
    public String execJdbc(){
        //String sql = "ALTER TABLE MM_CENTRALIZATION_TD COMMENT '结算单集中支付主表' ;";
        String sql = "ALTER TABLE MM_CENTRALIZATION_TD MODIFY COLUMN  CUSTOMERTYPE  VARCHAR(2)   COMMENT '客户类型' ; ";

        sqlService.execJdbc(sql);

        return "SUCCESS";
    }


    @GetMapping("/check")
    public String execAndCheckSql(){

        sqlService.execAndCheckSql();
        return "SUCCESS";
    }


}
