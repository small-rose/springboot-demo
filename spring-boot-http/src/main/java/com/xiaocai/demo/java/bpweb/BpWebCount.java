package com.xiaocai.demo.java.bpweb;

import com.xiaocai.demo.java.utils.FileFilterUtils;
import com.xiaocai.demo.java.utils.strategy.FileContentContainsStrategy;
import com.xiaocai.demo.java.utils.strategy.FileNameEndsWithStrategy;
import com.xiaocai.demo.java.utils.strategy.FilterStrategy;
import org.junit.Test;

import java.io.File;
import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/4/2 10:43
 * @version: v1.0
 */
public class BpWebCount {

    String path = "D:\\dev-tools-JetBrains\\idea-work\\Localization\\cibp\\bp-web\\src\\main\\java\\com\\fenet\\insurance";

    /**
     * 找要修改的Dao
     */
    @Test
    public void count(){

        // 全部列表
        List<File> allList = FileFilterUtils.getAllList(path);
        //allList.stream().forEach(System.out::println);
        System.out.println("------------allList------"+ allList.size());

        //计算 含有关键词的 文件
        FilterStrategy strategy = new FileNameEndsWithStrategy();
        List<File> containsList = FileFilterUtils.getAllFilesByFileNameKeys(allList, strategy, "Dao.java");
        //containsList.stream().forEach(System.out::println);
        System.out.println("-----------containsList ------"+ containsList.size());

        List<String> result = FileFilterUtils.getFileNameList(containsList);
        result.stream().forEach(System.out::println);
    }


    @Test
    public void test02(){

        // 全部列表
        List<File> allList = FileFilterUtils.getAllList(path);
        //allList.stream().forEach(System.out::println);
        System.out.println("------------allList------"+ allList.size());

        //计算 含有关键词的 文件
        FilterStrategy strategy = new FileNameEndsWithStrategy();
        List<File> containsList = FileFilterUtils.getAllFilesByFileNameKeys(allList, strategy, "ServiceImpl.java");
        //containsList.stream().forEach(System.out::println);
        System.out.println("-----------containsList ------"+ containsList.size());

        //计算 含有关键词的 文件
        FilterStrategy strategy2 = new FileContentContainsStrategy();
        List<File> sqlServiceList = FileFilterUtils.getAllFilesByFileNameKeys(containsList, strategy2, " from ");
        //sqlServiceList.stream().forEach(System.out::println);
        System.out.println("-----------sqlServiceList ------"+ sqlServiceList.size());

        List<String> result = FileFilterUtils.getFileNameList(sqlServiceList);
        result.stream().forEach(System.out::println);

    }
}
