package com.xiaocai.demo.search.cfms;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import com.alibaba.fastjson2.JSONObject;
import com.xiaocai.demo.search.core.ContainsMode;
import com.xiaocai.demo.search.core.FileFilterUtils;
import com.xiaocai.demo.search.core.FileFinder;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.util.StringUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ CFMSCount ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/11/14 14:16
 * @Version ： 1.0
 **/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CFMSCount {

    /**
     * 找要修改的 Controller
     */
    @Test
    public void count(){

        String path = "D:\\idea-Work\\Ancheng-XiaoGuan\\old-service\\cfms-service\\src\\main\\java\\com\\cpic\\fms";
        FileFinder finder = new FileFinder();
        finder.setPath(path);
        List<File> allFiles = finder.getAllFiles();
        System.out.println("------------allList------"+ allFiles.size());

        String[] nameKeys = new String[]{"Controller.java"};
        //查文件里包含关键字的文件列表
        List<File> xmlFileList = finder.getFileList( ContainsMode.FileNameEndWith,  nameKeys, null);
        System.out.println("------------xmlFileList------"+ xmlFileList.size());



        //String[] keys = new String[]{" List<Object> "," Page<Object> ", "page.getRecords()"};
        String[] keys = new String[]{"@RequestMapping(","@PostMapping(","@RequestBody", "*"};

        File genFile = new File("d:\\cfms\\1.txt");
        //查文件里包含关键字的文件列表
        List<File> resultFileList = finder.getFileList( ContainsMode.FileContentContains,  keys, xmlFileList, genFile);
        System.out.println("------------resultFileList------"+ resultFileList.size());

        List<String> result = FileFilterUtils.getFileNameList(resultFileList);
        result.stream().forEach(System.out::println);
    }


    @Test
    public void filterData(){
        File genFile = new File("d:\\cfms\\1.txt");
        FileReader reader = new FileReader(genFile);

        List<String> readLines = reader.readLines();
        List<String> filter1List = new ArrayList<>();

        List<String> list = Arrays.asList("import org.","import com", "From ","/**","@RequestMapping(value = \"\"",
                "* @author","* @version","* @version","*/","* @param","* @return","add by","ADD By","@date","@throws","write by");
        for (String string : readLines) {

            if (string.startsWith("From")){
                string = "CLASS===========================";
            }
            if (containsKey(string, list)){
                continue;
            }

            string = string.replaceAll("\\*","");

            if(StringUtils.hasText(string.trim())){
                filter1List.add(string);
            }

            if (string.endsWith("{")){
                filter1List.add("Method===========================");
            }
        }

        File genFile2 = new File("d:\\cfms\\2.txt");
        if (genFile2.exists()){genFile2.delete();}
        FileWriter writer = new FileWriter(genFile2);
        writer.appendLines(filter1List);
        //string = string.substring("@RequestMapping(value = \"".length(), string.lastIndexOf("\""));
    }



    private boolean containsKey(String str , List<String> keyList){
        for (String key : keyList) {
            if (str.contains(key)){
                return true;
            }
        }
        return false;
    }


    @Test
    public void readData(){

        File genFile2 = new File("d:\\cfms\\2.txt");
        FileReader reader = new FileReader(genFile2);
        List<String> readLines = reader.readLines();

        List<Map<String, String>> result = new ArrayList<>();
        Map tmpMap = null ;
        boolean newClass = false , newMethod = false;
        String prefix = "" , url = "", methodName = "", moName = "";
        for (String line : readLines) {

            if (line.startsWith("CLASS")){
                newClass = true;
                tmpMap = new HashMap<>();
                continue;
            }
            if (line.startsWith("Method")){
                newMethod = true;
                tmpMap = new HashMap<>();
                continue;
            }

            if (!line.contains("RequestMapping") && !line.contains("PostMapping") && !line.contains("public") && !line.contains("Method")
                    && !line.contains("import ")  && !line.contains("Created by") ) {
                if (tmpMap.get("desc")==null) {
                    tmpMap.put("desc", line.trim());
                }else{
                    tmpMap.put("desc", tmpMap.get("desc") + line.trim());
                }
                continue;
            }

            if (line.startsWith("@RequestMapping(method = RequestMethod")){
                tmpMap = new HashMap<>();
                tmpMap.put("prefix", "");
            }
            if (line.startsWith("    @PostMapping") || line.startsWith("    @RequestMapping")){
                String tempLine = line ;
                System.out.println("templine " + tempLine);
                if (tempLine.contains(",")) {
                    tempLine = tempLine.split(",")[0];
                }
                url = tempLine.substring(tempLine.indexOf("\"")+1, tempLine.lastIndexOf("\""));
                if (!prefix.equals(url)){
                    url = prefix.concat(url);
                }
                tmpMap.put("url", url);
                //continue;
            }
            if (line.contains(" public ")){
                methodName = line.substring(0, line.lastIndexOf("("));
                methodName = methodName.split(" ")[methodName.split(" ").length-1];
                tmpMap.put("methodName", methodName);

                String tmpLine = line.substring(line.indexOf("@RequestBody"));
                moName = tmpLine.split(" ")[1];
                tmpMap.put("moName", moName);
                result.add(tmpMap);
                newMethod = false;
            }

            //System.out.println("+++++++++++++++++++++++++++++++");
        }
        Set<String> jsonset = new HashSet<>();
        for (Map<String, String> stringMap : result) {
            jsonset.add(JSONObject.toJSONString(stringMap));
        }

        jsonset.stream().forEach(System.out::println);
        System.out.println("----------------合計API个数" +jsonset.size());
    }
}
