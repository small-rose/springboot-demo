package com.xiaocai.demo.filter.demotest.category;

import com.xiaocai.demo.filter.vo.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ CategoryFilterUtil ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/18 9:57
 * @Version ： 1.0
 **/
public class CategoryFilterUtil {

    public static List<Category> filterIncludes(List<Category> categoryList, CategoryIncludeFilter filter){
       final List<Category> categories = categoryList;
       if (categories==null ||categories.size()==0 || filter==null){
           return new ArrayList<Category>(0);
       }
       List<Category> result = new ArrayList<Category>(categoryList.size());
        // categoryList.stream().filter(c->filter.doFilter(c)).collect(Collectors.toList());
        for (Category category : categories){
            category = category.filter(filter);
            result.add(category);
        }
        return result ;
    }
}
