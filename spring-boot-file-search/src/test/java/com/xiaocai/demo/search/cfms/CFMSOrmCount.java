package com.xiaocai.demo.search.cfms;

import com.xiaocai.demo.search.core.ContainsMode;
import com.xiaocai.demo.search.core.FileFilterUtils;
import com.xiaocai.demo.search.core.FileFinder;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.File;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ CFMSCount ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/11/14 14:16
 * @Version ： 1.0
 **/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CFMSOrmCount {

    /**
     * 找要修改的 select 相关语句
     */
    @Test
    public void count(){

        String path = "D:\\idea-Work\\Ancheng-XiaoGuan\\cfms\\cfms-service\\src";
        FileFinder finder = new FileFinder();
        finder.setPath(path);
        List<File> allFiles = finder.getAllFiles();
        System.out.println("------------allList------"+ allFiles.size());


        String[] nameKeys = new String[]{".java"};
        //查文件里包含关键字的文件列表
        List<File> xmlFileList = finder.getFileList( ContainsMode.FileNameEndWith,  nameKeys, null);
        System.out.println("------------xmlFileList------"+ xmlFileList.size());


        //String[] keys = new String[]{" List<Object> "," Page<Object> ", "page.getRecords()"};
        String[] keys = new String[]{"select ","update ","delete ", "insert ", "save.", "saveOrUpdate."};

        //File genFile = new File("d:\\cfms\\1.txt");
        //查文件里包含关键字的文件列表
        List<File> resultFileList = finder.getFileList( ContainsMode.FileContentContains,  keys, xmlFileList);
        System.out.println("------------resultFileList------"+ resultFileList.size());

        List<String> result = FileFilterUtils.getFileNameList(resultFileList);
        result.stream().forEach(System.out::println);



        String[] nameKeys2 = new String[]{"@Entity","@Table","@SequenceGenerator"};
        //查文件里包含关键字的文件列表
        List<File> nameFileList = finder.getFileList( ContainsMode.FileContentContains,  nameKeys2, xmlFileList);
        System.out.println("------------nameFileList------"+ nameFileList.size());
        nameFileList.stream().forEach(System.out::println);

    }


}
