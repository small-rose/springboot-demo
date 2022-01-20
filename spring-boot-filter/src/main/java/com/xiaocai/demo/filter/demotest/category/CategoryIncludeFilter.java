package com.xiaocai.demo.filter.demotest.category;

import com.xiaocai.demo.filter.demotest.include.ExcludeRule;
import com.xiaocai.demo.filter.demotest.include.IncludeRule;
import com.xiaocai.demo.filter.vo.Category;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/1/13 23:01
 * @version: v1.0
 */
public class CategoryIncludeFilter implements CategoryFilter{

    protected List<IncludeRule> includeRuleList ;

    public CategoryIncludeFilter(List<IncludeRule> includeRuleList){
        this.includeRuleList = includeRuleList;
    }

    @Override
    public Category doFilter(Category category) {
        if (null == category){
            return null;
        }
        if (includeRuleList==null || includeRuleList.size()==0){
            return category ;
        }

        List<IncludeRule> collect = includeRuleList.stream().filter(i -> !(i instanceof ExcludeRule)).collect(Collectors.toList());

        for (IncludeRule includeRule : collect){
            if (category.getName().contains(includeRule.getKey())){
                return  category;
            }
        }
        return category;
    }
}
