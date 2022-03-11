package com.xiaocai.demo.java.utils.strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ EndWithStrategy ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/2 17:15
 * @Version ： 1.0
 **/
public class ContainsStrategy implements FilterStrategy{

    @Override
    public List<File> execute(List<File> target, String ... keys) {
        List<File> result = new ArrayList<>();
        String fileName = "";
        for (File file : target){
            fileName = file.getName();

            for(int i=0; i<keys.length; i++) {

                if (fileName.contains(keys[i])){
                    result.add(file);
                }
            }
        }

        return result;
    }
}
