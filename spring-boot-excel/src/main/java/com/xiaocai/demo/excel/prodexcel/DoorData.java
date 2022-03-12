package com.xiaocai.demo.excel.prodexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.Getter;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ DoorData ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/2/28 15:52
 * @Version ： 1.0
 **/

@Getter
@Setter
@EqualsAndHashCode
public class DoorData {

    @ExcelProperty("模块包路径")
    private String packagePath;

    @ExcelProperty("入口")
    private String doorController;

    @ExcelProperty("功能注释")
    private String funcComment;


    @ExcelProperty("功能方法")
    private String funcMethod;


    @Override
    public String toString() {
        return "DoorData{" +
                "packagePath='" + packagePath + '\'' +
                ", doorController='" + doorController + '\'' +
                ", funcComment='" + funcComment + '\'' +
                ", funcMethod='" + funcMethod + '\'' +
                '}';
    }
}
