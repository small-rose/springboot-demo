package com.xiaocai.demo.search.core.strategy;

import java.io.File;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ FileKeyUtil ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/2 17:01
 * @Version ： 1.0
 **/
public class FileKeyContext {

    FilterStrategy filterStrategy ;


    /**
     * 构造函数，传入一个具体策略对象
     * @param strategy    具体策略对象
     */
    public FileKeyContext(FilterStrategy strategy){
        this.filterStrategy = strategy;
    }
    /**
     * 策略方法
     */
    public List<File> doFilterStrategy(List<File> target, String ... keys ){

        return filterStrategy.execute(target, keys);
    }
}
