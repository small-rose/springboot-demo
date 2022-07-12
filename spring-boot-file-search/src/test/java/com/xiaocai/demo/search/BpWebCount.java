package com.xiaocai.demo.search;


import com.xiaocai.demo.search.core.ContainsMode;
import com.xiaocai.demo.search.core.FileFilterUtils;
import com.xiaocai.demo.search.core.FileFinder;
import com.xiaocai.demo.search.core.strategy.FileContentContainsStrategy;
import com.xiaocai.demo.search.core.strategy.FileNameEndsWithStrategy;
import com.xiaocai.demo.search.core.strategy.FilterStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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


        //String[] keys = new String[]{" AND ", " OR ", " ！= "};
        //String[] keys = new String[]{"(.*)((test=)?)(.*)(\\sAND\\s|\\sOR\\s)+(.*)"}; // 检索大写的AND OR
        String[] keys = new String[]{"(.*)((test=)+)(.*)(and )+(.*)(date|Date|datetime|time|timestamp|amount)+\\s?(!= '')+(.*)"}; // 检索日期相关字段 != '' 的写法
        //查文件里包含关键字的文件列表
        List<File> resultFileList = finder.getFileList( ContainsMode.FileContentRegExpStrategy,  keys, xmlFileList);
        System.out.println("------------resultFileList------"+ resultFileList.size());

        List<String> result = FileFilterUtils.getFileNameList(resultFileList);
        result.stream().forEach(System.out::println);
    }

    @Test
    public void test_151(){
        String str = "<if test='unitcode !=null AND unitcode !=\"\" AND isMutual !=null AND isMutual '>";
        String str2 = "  AND isMutual !=null AND isMutual '>";
        String str3 = " and isMutual !=null and isMutual '>";
        //String str4 = "  (SELECT SUM(T.AMOUNT) FROM BFP_BALANCEDETAIL_TD T WHERE T.BALANCETYPE IN ('sun_add_sum') AND T.BALANCEID = J.BALANCEID) AS sunaddsumamount,\n";
        String str5 = "  AND SUBCOMPANY = #{subcompay}";
        String pattern = "(.*)((test=)?)(.*)(\\sAND\\s|\\sOR\\s)+(.*)[^#{,\\${](.*)";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());

        Matcher m2 = r.matcher(str2);
        System.out.println(m2.matches());
        Assertions.assertEquals(true, m2.matches());

        Matcher m3 = r.matcher(str3);
        Assertions.assertEquals(false, m3.matches());

        //Matcher m4 = r.matcher(str4);
        //Assert.assertEquals("第4个不能正常匹配", false, m4.matches());

        Matcher m5 = r.matcher(str5);
        Assertions.assertEquals(false, m5.matches());
    }

    @Test
    public void test07(){
        String path = "D:\\idea-Work\\gitLab\\guochanhua\\bp-service\\bp-web\\src\\main\\resources\\mapper\\mysql";
        FileFinder finder = new FileFinder();
        finder.setPath(path);
        List<File> allFiles = finder.getAllFiles();
        System.out.println("------------allList------"+ allFiles.size());

        String[] nameKeys = new String[]{" Mapper.xml"};
        //查文件里包含关键字的文件列表
        List<File> xmlFileList = finder.getFileList( ContainsMode.FileNameEndWith,  nameKeys, null);
        System.out.println("------------xmlFileList------"+ xmlFileList.size());


        //String[] keys = new String[]{"'true'"," BizPrivilege ", ".id." , " Unit ", " UnitMapping ", " BizSub ", " PlatFormFileDetail "  }; // 检索关键字

        String[] keys = new String[]{"List != ''","List != ''.toString()"};
        //查文件里包含关键字的文件列表
        List<File> resultFileList = finder.getFileList( ContainsMode.FileContentContains,  keys, xmlFileList);
        System.out.println("------------resultFileList------"+ resultFileList.size());

        List<String> result = FileFilterUtils.getFileNameList(resultFileList);
        result.stream().forEach(System.out::println);
    }


    @Test
    public void test_209(){

        String path = "D:\\idea-Work\\gitLab\\guochanhua\\bp-service\\bp-web\\src\\";
        FileFinder finder = new FileFinder();
        finder.setPath(path);
        List<File> allFiles = finder.getAllFiles();
        System.out.println("------------allList------"+ allFiles.size());

        String[] nameKeys = new String[]{"Mapper.java"};
        //查文件里包含关键字的文件列表
        List<File> xmlFileList = finder.getFileList( ContainsMode.FileNameEndWith,  nameKeys, null);
        System.out.println("------------xmlFileList------"+ xmlFileList.size());



        //String[] keys = new String[]{" List<Object> "," Page<Object> ", "page.getRecords()"};
        String[] keys = new String[]{"page.getRecords()"," Page<"};
        //查文件里包含关键字的文件列表
        List<File> resultFileList = finder.getFileList( ContainsMode.FileContentContains,  keys, xmlFileList);
        System.out.println("------------resultFileList------"+ resultFileList.size());

        List<String> result = FileFilterUtils.getFileNameList(resultFileList);
        result.stream().forEach(System.out::println);

    }
}
