package com.xiaocai.demo.poi.oracle.vo;

import lombok.Data;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ TableIndex ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/20 15:19
 * @Version ： 1.0
 **/
@Data
public class TableIndex {

    private String indexName;
    private String columnName;
    private String columnType;

}
