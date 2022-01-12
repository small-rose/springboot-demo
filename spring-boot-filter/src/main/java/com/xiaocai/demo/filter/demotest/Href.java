package com.xiaocai.demo.filter.demotest;

import com.xiaocai.demo.filter.demotest.hrefFilter.HrefFilter;
import lombok.Data;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/1/13 0:36
 * @version: v1.0
 */
@Data
public class Href   {

    List<String> skipkeys;
    String href ;

    boolean doFilter(HrefFilter filter){
        if (filter==null){
            return  false;
        }
       return filter.accept( skipkeys,  href);
    }
}
