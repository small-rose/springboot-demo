package com.xiaocai.demo.filter.vo;

import com.xiaocai.demo.filter.demotest.category.CategoryFilter;
import lombok.Data;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/1/13 22:06
 * @version: v1.0
 */
@Data
public class Category extends UrlData{





    public Category filter(CategoryFilter filter){
        if (filter==null){
            return this ;
        }
        return filter.doFilter(this);
    }
}
