package com.xiaocai.demo.filter.demotest;

import com.xiaocai.demo.filter.demotest.include.ExcludeRule;
import com.xiaocai.demo.filter.demotest.include.IncludeRule;
import com.xiaocai.demo.filter.vo.Category;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/1/13 23:53
 * @version: v1.0
 */
public class CategoryFilterDemoTest {

    @Test
    public void test(){
        List<IncludeRule> includeRuleList = new ArrayList<IncludeRule>();
        includeRuleList.add(new ExcludeRule());
        includeRuleList.add(new IncludeRule());
        List<IncludeRule> collect = includeRuleList.stream().filter(i -> !(i instanceof ExcludeRule)).collect(Collectors.toList());

    }

    @Test
    public void categoryFilter(){

        List<Category> categoryList = new ArrayList<>();
        Category category = null ;
        for (int i = 0; i < 10 ; i++){
            category = new Category();
            category.setName("测试" + i);
            category.setUrl("https://zhangxiaocai.cn/02"+i);
            categoryList.add(category);
        }


    }
}
