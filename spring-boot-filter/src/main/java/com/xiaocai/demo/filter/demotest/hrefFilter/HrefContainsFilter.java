package com.xiaocai.demo.filter.demotest.hrefFilter;

import com.xiaocai.demo.filter.demotest.HrefData;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/1/13 0:49
 * @version: v1.0
 */
public class HrefContainsFilter implements HrefFilter{

    HrefData hrefData ;

    public HrefContainsFilter(HrefData hrefData){
        this.hrefData = hrefData ;
    }

    @Override
    public boolean accept(List<String> skipkeys) {
        if (skipkeys==null){
            return false;
        }
        for (String key: skipkeys){
            if (hrefData.getHref().contains(key)){
                return true;
            }
        }
        return false;
    }
}
