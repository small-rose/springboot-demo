package com.xiaocai.demo.filter.demotest.category;

import com.xiaocai.demo.filter.demotest.include.IncludeRule;
import com.xiaocai.demo.filter.vo.Category;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/1/13 22:03
 * @version: v1.0
 */
@FunctionalInterface
public interface CategoryFilter {


    public Category doFilter(List<IncludeRule> includeRuleList);
}
