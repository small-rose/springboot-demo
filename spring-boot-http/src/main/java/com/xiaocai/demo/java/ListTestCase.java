package com.xiaocai.demo.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/5/31 13:41
 * @version: v1.0
 */
public class ListTestCase {

    @Test
    public void test_list2string(){
        List<Long> list = new ArrayList<>();
        list.add(100L);
        list.add(200L);
        list.add(300L);
        list.add(400L);
        Long[] objects = new Long[list.size()];
        list.toArray(objects);
        System.out.println(objects);

    }
}
