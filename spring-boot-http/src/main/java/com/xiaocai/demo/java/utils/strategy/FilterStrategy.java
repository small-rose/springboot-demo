package com.xiaocai.demo.java.utils.strategy;

import java.io.File;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ FileFilterStrategy ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/2 17:11
 * @Version ： 1.0
 **/
public interface FilterStrategy {



    List<File> execute(List<File> target, String ... keys);
}
