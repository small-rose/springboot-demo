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
public class CategoryExcludeFilter extends CategoryIncludeFilter implements CategoryFilter{


    public CategoryExcludeFilter(List<IncludeRule> includeRuleList){
        super(includeRuleList);
     }


    @Override
    public Category doFilter(Category category) {
        if (null == category){
            return null;
        }
        if (includeRuleList==null || includeRuleList.size()==0){
            return category ;
        }
        List<IncludeRule> collect = includeRuleList.stream().filter(i -> i instanceof ExcludeRule).collect(Collectors.toList());

        for (IncludeRule includeRule : collect){
            if (category.getName().contains(includeRule.getKey())){
                return  null;
            }
        }
        return category;
    }
}
