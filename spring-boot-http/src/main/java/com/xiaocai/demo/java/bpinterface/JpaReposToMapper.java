package com.xiaocai.demo.java.bpinterface;

import com.xiaocai.demo.java.utils.FileUtils;
import com.xiaocai.demo.java.utils.strategy.EndsWithStrategy;
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
        List<File> allList = FileUtils.getAllList(src);
        //allList.stream().forEach(System.out::println);
        System.out.println("------------allList------"+ allList.size());

        // 取 Repostory
        FilterStrategy strategy = new EndsWithStrategy();
        List<File> repositoryList = FileUtils.getAllFilesByFileNameKeys(allList, strategy, "Repository.java");
        //repositoryList.stream().forEach(System.out::println);
        System.out.println("------------jpa repository ------"+ repositoryList.size());

        List<String> repositoryNameList = FileUtils.getFileNameList(repositoryList);

        List<String> repToMapperNameList = FileUtils.getReplaceFileNameList(repositoryNameList, "Repository", "Mapper");

        List<File> mapperList = FileUtils.getAllFilesByFileNameKeys(allList, strategy, "Mapper.java");
        List<String> mapperNameList = FileUtils.getFileNameList(mapperList);

        List<String> commonMapperList = new ArrayList<String>(repToMapperNameList);
        commonMapperList.retainAll(mapperNameList);//取mapper 交集
        commonMapperList.stream().forEach(System.out::println);
        repToMapperNameList.removeAll(commonMapperList);// 取 差集


        System.out.println("------------repository 需要修改的数量 ------" + repToMapperNameList.size());
        //取 jdbcTemplate
        List<File> daoList = FileUtils.getAllFilesByFileNameKeys(allList, strategy, "Dao.java");
        //daoList.stream().forEach(System.out::println);
        System.out.println("------------jdbcTemplate ------" + daoList.size());
        List<String> daoNameList = FileUtils.getFileNameList(daoList);


        List<String> mapperNameList2 = FileUtils.getFileNameList(mapperList);
        List<String> commonMapperList2 = new ArrayList<String>(daoNameList);
        commonMapperList2.retainAll(mapperNameList2);//取mapper 交集
        commonMapperList2.stream().forEach(System.out::println);
        daoNameList.removeAll(commonMapperList2);// 取 差集

    }

    @Test
    public void test(){
        // 全部列表
        List<File> allList = FileUtils.getAllList(src);
        //allList.stream().forEach(System.out::println);
        System.out.println("------------allList------"+ allList.size());



        FilterStrategy strategy = new FileContentContainsStrategy();
        List<File> containsList = FileUtils.getAllFilesByFileNameKeys(allList, strategy, "\"select", "\"update", "\"delete");
        //repositoryList.stream().forEach(System.out::println);
        System.out.println("-----------containsList ------"+ containsList.size());

        List<File> updateList = FileUtils.getAllFilesByFileNameKeys(allList, strategy, "Repository.","saveAndFlush");
        //repositoryList.stream().forEach(System.out::println);
        System.out.println("-----------updateList ------"+ updateList.size());
    }


    @Test
    public void test03(){
        // 全部列表
        List<File> allList = FileUtils.getAllList(src);
        //allList.stream().forEach(System.out::println);
        System.out.println("------------allList------"+ allList.size());

        FilterStrategy strategy = new EndsWithStrategy();
        List<File> containsList = FileUtils.getAllFilesByFileNameKeys(allList, strategy, "Dao.java","Repository.java");

        List<String> fileNameList = FileUtils.getFileNameList(containsList);
        fileNameList.stream().forEach(System.out::println);


    }
}
