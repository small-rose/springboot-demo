package com.xiaocai.demo.filter.demotest.hrefFilter;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/1/13 0:49
 * @version: v1.0
 */
public class HerfContainsFilter implements HrefFilter{


    @Override
    public boolean accept(List<String> skipkeys, String href) {
        if (skipkeys==null){
            return false;
        }
        for (String key: skipkeys){
            if (href.contains(key)){
                return true;
            }
        }
        return false;
    }
}
