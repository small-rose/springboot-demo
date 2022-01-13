package com.xiaocai.demo.filter.demotest;

import com.xiaocai.demo.filter.demotest.hrefFilter.HerfContainsFilter;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/1/13 0:33
 * @version: v1.0
 */
public class HrefTestDemo {


    @Test
    public void hrefFilter(){

        List<String> skipKeys = Arrays.asList("aa","bb","cc");
        String href="https://zhangxiacai.cn/aa/102";
         Href href1 = new Href();
         href1.setHref(href);
         href1.setSkipkeys(skipKeys);

        Boolean bool =  href1.doFilter(new HerfContainsFilter());
        System.out.println(bool);

    }

}
