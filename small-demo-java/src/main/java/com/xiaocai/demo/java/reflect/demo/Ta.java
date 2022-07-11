package com.xiaocai.demo.java.reflect.demo;

import lombok.Data;

import java.util.ArrayList;

/**
 * @Project : bp
 * @Author : zhangzongyuan
 * @Description : [ Ta ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/6/28 15:26
 * @Version ： 1.0
 **/
@Data
public class Ta {
    private int age;
    private Long id ;
    private String name ;
    private String[] names;

    private ArrayList<Cc> list;

    public ArrayList<Cc> getList() {
        return list;
    }

    public void setList(ArrayList<Cc> list) {
        this.list = list;
    }
}
