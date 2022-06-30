package com.xiaocai.demo.java.bpweb;

import com.xiaocai.demo.java.utils.ContainsMode;
import com.xiaocai.demo.java.utils.FileFilterUtils;
import com.xiaocai.demo.java.utils.FileFinder;
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

    String path = "D:\\idea-Work\\Localization\\cibp\\bp-web\\src\\main\\java\\com\\fenet";

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
        List<File> sqlServiceList = FileFilterUtils.getAllFilesByFileNameKeys(containsList, strategy2, "@Service");
        //sqlServiceList.stream().forEach(System.out::println);
        System.out.println("-----------sqlServiceList ------"+ sqlServiceList.size());


        List<String> result = FileFilterUtils.getFileNameList(sqlServiceList);
        result.stream().forEach(System.out::println);

    }

    @Test
    public void test03(){

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
        List<File> sqlServiceList = FileFilterUtils.getAllFilesByFileNameKeys(containsList, strategy2, "@Service");
        //sqlServiceList.stream().forEach(System.out::println);
        System.out.println("-----------sqlServiceList ------"+ sqlServiceList.size());

        //去除包含有关键词的 文件，剩下的就是不包含某种关键词的文件
        containsList.removeAll(sqlServiceList);
        List<String> result = FileFilterUtils.getFileNameList(containsList);
        result.stream().forEach(System.out::println);

    }

    @Test
    public void test04(){

        // 全部列表
        List<File> allList = FileFilterUtils.getAllList(path);
        //allList.stream().forEach(System.out::println);
        System.out.println("------------allList------"+ allList.size());

        //计算 含有关键词的 文件
        FilterStrategy strategy = new FileNameEndsWithStrategy();
        List<File> containsList = FileFilterUtils.getAllFilesByFileNameKeys(allList, strategy, "Mapper.java");
        //containsList.stream().forEach(System.out::println);
        System.out.println("-----------containsList ------"+ containsList.size());

        //计算 含有关键词的 文件
        FilterStrategy strategy2 = new FileContentContainsStrategy();
        List<File> sqlServiceList = FileFilterUtils.getAllFilesByFileNameKeys(containsList, strategy2, "[]");
        //sqlServiceList.stream().forEach(System.out::println);
        System.out.println("-----------sqlServiceList ------"+ sqlServiceList.size());

        //去除包含有关键词的 文件，剩下的就是不包含某种关键词的文件

        List<String> result = FileFilterUtils.getFileNameList(sqlServiceList);
        result.stream().forEach(System.out::println);

    }

    @Test
    public void test05(){
        String path = "D:\\idea-Work\\Localization\\cibp\\bp-web\\src\\main\\resources\\mapper\\mysql";
        FileFinder finder = new FileFinder();
        finder.setPath(path);
        List<File> allFiles = finder.getAllFiles();
        System.out.println("------------allList------"+ allFiles.size());

        String[] nameKeys = new String[]{" Mapper.xml"};
        //查文件里包含关键字的文件列表
        List<File> xmlFileList = finder.getFileList( ContainsMode.FileNameEndWith,  nameKeys, null);
        System.out.println("------------xmlFileList------"+ xmlFileList.size());


        String[] keys = new String[]{" AND ", " OR ", " ！= "};
        //查文件里包含关键字的文件列表
        List<File> resultFileList = finder.getFileList( ContainsMode.FileContentContains,  keys, xmlFileList);
        System.out.println("------------resultFileList------"+ resultFileList.size());

        List<String> result = FileFilterUtils.getFileNameList(resultFileList);
        result.stream().forEach(System.out::println);
    }
}
