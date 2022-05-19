package com.xiaocai.demo.java.bpinterface;

import com.xiaocai.demo.java.utils.FileFilterUtils;
import com.xiaocai.demo.java.utils.strategy.FileContentContainsStrategy;
import com.xiaocai.demo.java.utils.strategy.FilterStrategy;
import org.junit.Test;

import java.io.File;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ JpaReposToMapper ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/2 13:41
 * @Version ： 1.0
 **/
public class CountKeyForJavaFile {


    String path = "D:\\dev-tools-JetBrains\\idea-work\\Localization\\bp-interface\\src\\main\\java\\com\\fenet\\insurance\\mm\\datahub\\wss\\mapper";

    @Test
    public void count(){

        // 全部列表
        List<File> allList = FileFilterUtils.getAllList(path);
        //allList.stream().forEach(System.out::println);
        System.out.println("------------allList------"+ allList.size());

        //计算 含有关键词的 文件
        FilterStrategy strategy = new FileContentContainsStrategy();
        List<File> containsList = FileFilterUtils.getAllFilesByFileNameKeys(allList, strategy, "Map<String");
        containsList.stream().forEach(System.out::println);
        System.out.println("-----------containsList ------"+ containsList.size());
    }
}
