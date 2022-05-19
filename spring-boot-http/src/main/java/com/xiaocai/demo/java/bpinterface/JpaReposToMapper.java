package com.xiaocai.demo.java.bpinterface;

import com.xiaocai.demo.java.utils.FileFilterUtils;
import com.xiaocai.demo.java.utils.strategy.FileNameEndsWithStrategy;
import com.xiaocai.demo.java.utils.strategy.FileContentContainsStrategy;
import com.xiaocai.demo.java.utils.strategy.FilterStrategy;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ JpaReposToMapper ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/2 13:41
 * @Version ： 1.0
 **/
public class JpaReposToMapper {

    String src = "D:\\idea-Work\\Localization\\bp-interface\\src\\main\\java\\com\\fenet\\insurance\\mm\\datahub\\wss\\";



    @Test
    public void checkTarget(){
        // 全部列表
        List<File> allList = FileFilterUtils.getAllList(src);
        //allList.stream().forEach(System.out::println);
        System.out.println("------------allList------"+ allList.size());

        // 取 Repostory
        FilterStrategy strategy = new FileNameEndsWithStrategy();
        List<File> repositoryList = FileFilterUtils.getAllFilesByFileNameKeys(allList, strategy, "Repository.java");
        //repositoryList.stream().forEach(System.out::println);
        System.out.println("------------jpa repository ------"+ repositoryList.size());

        List<String> repositoryNameList = FileFilterUtils.getFileNameList(repositoryList);

        List<String> repToMapperNameList = FileFilterUtils.getReplaceFileNameList(repositoryNameList, "Repository", "Mapper");

        List<File> mapperList = FileFilterUtils.getAllFilesByFileNameKeys(allList, strategy, "Mapper.java");
        List<String> mapperNameList = FileFilterUtils.getFileNameList(mapperList);

        List<String> commonMapperList = new ArrayList<String>(repToMapperNameList);
        commonMapperList.retainAll(mapperNameList);//取mapper 交集
        commonMapperList.stream().forEach(System.out::println);
        repToMapperNameList.removeAll(commonMapperList);// 取 差集


        System.out.println("------------repository 需要修改的数量 ------" + repToMapperNameList.size());
        //取 jdbcTemplate
        List<File> daoList = FileFilterUtils.getAllFilesByFileNameKeys(allList, strategy, "Dao.java");
        //daoList.stream().forEach(System.out::println);
        System.out.println("------------jdbcTemplate ------" + daoList.size());
        List<String> daoNameList = FileFilterUtils.getFileNameList(daoList);


        List<String> mapperNameList2 = FileFilterUtils.getFileNameList(mapperList);
        List<String> commonMapperList2 = new ArrayList<String>(daoNameList);
        commonMapperList2.retainAll(mapperNameList2);//取mapper 交集
        commonMapperList2.stream().forEach(System.out::println);
        daoNameList.removeAll(commonMapperList2);// 取 差集

    }

    @Test
    public void test(){
        // 全部列表
        List<File> allList = FileFilterUtils.getAllList(src);
        //allList.stream().forEach(System.out::println);
        System.out.println("------------allList------"+ allList.size());



        FilterStrategy strategy = new FileContentContainsStrategy();
        List<File> containsList = FileFilterUtils.getAllFilesByFileNameKeys(allList, strategy, "\"select", "\"update", "\"delete");
        //repositoryList.stream().forEach(System.out::println);
        System.out.println("-----------containsList ------"+ containsList.size());

        List<File> updateList = FileFilterUtils.getAllFilesByFileNameKeys(allList, strategy, "Repository.","saveAndFlush");
        //repositoryList.stream().forEach(System.out::println);
        System.out.println("-----------updateList ------"+ updateList.size());
    }


    @Test
    public void test03(){
        // 全部列表
        List<File> allList = FileFilterUtils.getAllList(src);
        //allList.stream().forEach(System.out::println);
        System.out.println("------------allList------"+ allList.size());

        FilterStrategy strategy = new FileNameEndsWithStrategy();
        List<File> containsList = FileFilterUtils.getAllFilesByFileNameKeys(allList, strategy, "Dao.java","Repository.java");

        List<String> fileNameList = FileFilterUtils.getFileNameList(containsList);
        fileNameList.stream().forEach(System.out::println);


    }
}
