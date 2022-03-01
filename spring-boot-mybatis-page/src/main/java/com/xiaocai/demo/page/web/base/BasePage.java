package com.xiaocai.demo.page.web.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ BasePage ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/1 13:43
 * @Version ： 1.0
 **/
@Data
public class BasePage {

    @JsonIgnore
    private int pageNum ;

    @JsonIgnore
    private int pageSize ;
}
