package com.xiaocai.demo.poi.oracle.vo;

import lombok.Data;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ TableLastDDLTime ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/17 13:59
 * @Version ： 1.0
 **/
@Data
public class TableLastDDLTime {

    private String tableName ;
    private String lastDDLTime;
}
