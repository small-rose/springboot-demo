package com.xiaocai.demo.filter.demotest;

import com.xiaocai.demo.filter.demotest.hrefFilter.HrefContainsFilter;
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
    HrefRule rule = new HrefRule();

    @Test
    public void hrefFilter(){

        List<String> skipKeys = Arrays.asList("aa","bb","cc");
        String href="https://zhangxiacai.cn/aa/102";
         HrefData href1 = new HrefData();
         href1.setHref(href);
         href1.setName("还不能");

        rule.setSkipkeys(skipKeys);
        //rule.setHrefData(href1);

        Boolean bool =  rule.doFilter(new HrefContainsFilter(href1));
        System.out.println(bool);

    }

}
