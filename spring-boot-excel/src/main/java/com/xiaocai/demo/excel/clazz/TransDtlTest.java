package com.xiaocai.demo.excel.clazz;

import com.alibaba.excel.EasyExcel;

import java.io.File;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/7/17 20:44
 * @version: v1.0
 */
public class TransDtlTest {


    static String sourceFile = "E:"+ File.separator+"Tmp"+ File.separator+"old_table.xlsx";

    public static void main(String[] args) {
        TransReadListener platListener = new TransReadListener();

        // 被读取的文件绝对路径
        EasyExcel.read(sourceFile,  platListener).sheet().headRowNumber(0).doRead();
    }

}
