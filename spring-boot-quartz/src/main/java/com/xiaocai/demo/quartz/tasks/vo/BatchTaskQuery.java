package com.xiaocai.demo.quartz.tasks.vo;

import com.xiaocai.demo.quartz.tasks.model.BuzBatchTask;
import lombok.Data;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ BatchTaskQuery ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/21 14:13
 * @Version ： 1.0
 **/

@Data
public class BatchTaskQuery extends BuzBatchTask {

    private int page; //pageNumber ;
    private int rows ; //pageSize ;
    private String sort ; // 排序列名
    private String sortOrder ; // desc ,asc

    private String searchKey ; //

}
