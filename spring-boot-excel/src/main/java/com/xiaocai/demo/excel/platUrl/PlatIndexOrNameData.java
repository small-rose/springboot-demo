package com.xiaocai.demo.excel.platUrl;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ PlatIndexOrNameData ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/27 11:30
 * @Version ： 1.0
 **/
@Data
public class PlatIndexOrNameData {

    /**
     * 用名字去匹配，这里需要注意，如果名字重复，会导致只有一个字段读取到数据
     */
    @ExcelProperty("部门")
    private String dept;

    @ExcelProperty("产品")
    private String product;

    @ExcelProperty("平台地址")
    private String url;

    @ExcelProperty("用户名")
    private String user;

    @ExcelProperty("密码")
    private String pass;



}
