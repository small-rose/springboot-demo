package com.xiaocai.demo.java.bpweb;

import com.xiaocai.demo.java.utils.FileFilterUtils;
import com.xiaocai.demo.java.utils.strategy.FileContentContainsStrategy;
import com.xiaocai.demo.java.utils.strategy.FilterStrategy;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/4/11 17:43
 * @version: v1.0
 */
public class TableCountMapperHandler {


    String path = "D:\\dev-tools-JetBrains\\idea-work\\Localization\\cibp\\bp-web\\src\\main\\java\\com\\fenet\\insurance\\mm\\entity";

    String mapperXmlName = "${tableName}Mapper.java";
    String mapperTemplate = "D:\\filesTest\\";
    String mapperTestMapper = "D:\\filesTest\\mapper";
    String mapperTestMapperXml = "D:\\filesTest\\xml";
    /**
     * 找出需要创建Mapper的表
     */
    @Test
    public void count() throws Exception {

        // 全部列表
        List<File> allList = FileFilterUtils.getAllList(path);
        //allList.stream().forEach(System.out::println);
        System.out.println("------------allList------"+ allList.size());

        //计算 含有关键词的 文件
        FilterStrategy strategy = new FileContentContainsStrategy();
        List<File> containsList = FileFilterUtils.getAllFilesByFileNameKeys(allList, strategy, "@Table");
        //containsList.stream().forEach(System.out::println);
        System.out.println("-----------containsList ------"+ containsList.size());

        List<String> tableNameList = new ArrayList<>();
        for (File file :containsList){
            String tableName  = handle(file);
            if (StringUtils.hasText(tableName)){
                tableNameList.add(tableName);
            }
        }
        System.out.println("-----------tableNameList ------"+ tableNameList.size());

        //tableNameList.stream().forEach(System.out::println);
        String tableObj = "";
        String targetXmlName = "";
        File templateFile = null;
        File sourceFile = null;
        File targetFile = null;

        for (String tableName : tableNameList){
            tableObj = lineToHump(tableName);

            fileContentReplace(tableObj);


            sourceFile = new File(tableObj+"Mapper.xml");
            targetFile = new File(mapperTestMapperXml+tableObj+"Mapper.xml");
            //targetFile = new File(targetMapper+tableObj+"Mapper.xml");
            FileUtils.copyFile(sourceFile, targetFile);
        }

    }

    private void fileContentReplace(String tableObj) throws Exception {
        String template = mapperTemplate + mapperXmlName;
        String targetMapperName = mapperXmlName.replace("${tableName}", tableObj);
        //String targetFileName = targetMapper + targetMapperName;
        String targetFileName = mapperTestMapper + targetMapperName;

        BufferedReader br = new BufferedReader(new FileReader(template));
        String con = null;
        File f = new File(targetFileName);
        FileOutputStream fop = new FileOutputStream(f);
        // 构建FileOutputStream对象,文件不存在会自动新建
        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
        while((con = br.readLine())!= null){
            System.out.println(con);

            if (con.contains("${tableName}")){
                con.replace("${tableName}", tableObj);
            }
            writer.append(con);

        }
        writer.close();
        fop.close();
        br.close();

    }

    String mapperPath = "D:\\dev-tools-JetBrains\\idea-work\\Localization\\cibp\\bp-web\\src\\main\\java\\com\\fenet\\insurance\\mm\\entity";

    String targetMapper = "D:\\dev-tools-JetBrains\\idea-work\\Localization\\cibp\\bp-web\\src\\main\\java\\com\\fenet\\insurance\\mm\\mapper\\";
    String sourceMapperXml = "D:\\dev-tools-JetBrains\\idea-work\\Localization\\cibp\\bp-web\\src\\main\\resources\\mapper\\mysql\\";
    String targetMapperXml = "D:\\dev-tools-JetBrains\\idea-work\\Localization\\cibp\\bp-web\\src\\main\\resources\\mapper\\mysql\\";



    private String lineToHump(String source){

        return lineToHump(source, true);
    }
    private Pattern linePattern = Pattern.compile("_(\\w)");
    // 下划线字符串驼峰转大写
    private String lineToHump(String source, boolean firstUpper){
        System.out.println("source : " +source);
        String str = source.toLowerCase();
        if (firstUpper){
            str = "_"+str;
        }

        Matcher matcher = linePattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()){
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(sb);
        return  sb.toString();
    }

    @Test
    public void str_test(){
        String source = "mm_policy_td";
        System.out.println(lineToHump(source));
    }


    Pattern p1= Pattern.compile("\"(.*?)\"");

    private String handle(File file) {
        //String tmp = file.getName();
        BufferedReader br = null;
        InputStreamReader isr = null;
        String line = "";
        String tableName = "";
        try {
            int x = 1 ;
            isr = new InputStreamReader(new FileInputStream(file), "UTF-8");
            br = new BufferedReader(isr);
            while ((line = br.readLine()) != null) {
                //dataList.add(line);
                if (!line.startsWith("@Table")){
                    continue ;
                }
                // 2创建 matcher 对象
                Matcher m = p1.matcher(line);
                while (m.find()) {
                    System.out.println("Found value: " +m.group().trim() );
                    System.out.println("Found value0: " + m.group(0) );
                    System.out.println("Found value1: " + m.group(1) );
                    tableName = m.group(1);
                }
                System.out.println(line);
                //tableName = line.substring(line.lastIndexOf("\""), line.lastIndexOf("\""));
                //tableName = line.split("\\.")[0].substring(line.split("\\.")[0].indexOf("\"")+1).trim();
                if (tableName!=""){
                    return tableName ;
                }

            }

        } catch(Exception e) {

            e.printStackTrace();
        }finally {
            try {
                if (br!=null){
                    br.close();
                }
                if (isr!=null){
                    isr.close();
                }
            } catch (IOException e) {
            }
        }
        return null;
    }


    @Test
    public void stringtest(){
        String line = "@Table(name = \"MM_SUBCOMPANY_TC\")";
        String tableName = line.substring(line.lastIndexOf("\""), line.lastIndexOf("\""));
        System.out.println(tableName);


        System.out.println((line.split("\\.")[0].substring(line.split("\\.")[0].indexOf("\"")+1)).trim());
    }
}
