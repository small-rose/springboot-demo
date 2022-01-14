package com.xiaocai.demo.filter.demotest.hrefFilter;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/1/12 23:19
 * @version: v1.0
 */
@FunctionalInterface
public interface HrefFilter {

    public boolean accept(List<String> skipkeys);
}
