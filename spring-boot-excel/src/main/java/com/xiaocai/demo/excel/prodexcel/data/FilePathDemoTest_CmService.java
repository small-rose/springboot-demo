package com.xiaocai.demo.excel.prodexcel.data;

import com.xiaocai.demo.excel.prodexcel.DoorData;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ FilePathDemoTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/2/24 17:13
 * @Version ： 1.0
 **/
@Slf4j
public class FilePathDemoTest_CmService {



    @Test
    public List<DoorData> listFilesDirCmService(){

        //cm-service  XianDai-TrunkNew
        //String path = "D:\\idea-Work\\XianDai-TrunkNew\\cm-service\\src\\main\\java\\com\\fenet\\insurance";
        String path = "D:\\idea-Work\\Localization\\cm-service\\src\\main\\java\\com\\fenet\\insurance";
        String dirKey = "com\\fenet\\insurance\\";

        File[] fileList = getFileList(path);
        List<File> resultList = new ArrayList<File>();
        for (File file : fileList){
            if (file.isDirectory()){
                List<File> tmpFiles = listFilesDir(file.getAbsolutePath());
                resultList.addAll(tmpFiles);
            }else{
                resultList.add(file);
            }
        }
        final String finalDirKey = dirKey;
        List<File> controller = resultList.stream().filter(file -> (file.getAbsolutePath().contains("Controller") ||
                file.getAbsolutePath().contains("Servlet")) ).collect(Collectors.toList());

        List<String> doorList = new ArrayList<String>();
        for(File file : controller) {
            String tmp = file.getAbsolutePath();
            tmp = tmp.substring(tmp.indexOf("java")+5, tmp.lastIndexOf(".java"));
            //System.out.println(tmp);
            doorList.add(tmp);
        }

        Set<String> modules = new HashSet<String>();

        for(String module : doorList) {
            //module = module.substring(module.indexOf("\\mm\\")+4, module.indexOf("\\controller\\"));
            System.out.println(module);
            modules.add(module);
        }
        //modules.stream().forEach(System.out::println);
        List<DoorData> dataList = new ArrayList<DoorData>();
        for (File file : controller){
            String tmp = file.getAbsolutePath();
            List<DoorData> method = handle(file);
            if (method ==null){
                continue ;
            }
            dataList.addAll(method);
        }
        dataList.stream().forEach(System.out::println);
        System.out.println("方法入口数量 " + dataList.size());
        return dataList ;
    }
    static int index = 0 ;

    private List<DoorData> handle(File file) {
        String filePath = file.getAbsolutePath();
        String packageKey = filePath.substring(filePath.indexOf("java")+5, filePath.lastIndexOf(".java"));

        String tmp = file.getName();
        if (!tmp.contains("Controller") && !tmp.contains("Servlet")) {
            return null;
        }
        List<DoorData> dataList = new ArrayList<DoorData>();
        BufferedReader br = null;
        InputStreamReader isr = null;

        Map<String, List<String>>  result = new HashMap<String, List<String>>();

        String line = "";
        String comment = "";
        BigDecimal amout = null;
        try {
            int x = 1 ;
            isr = new InputStreamReader(new FileInputStream(file), "UTF-8");
            br = new BufferedReader(isr);
            while ((line = br.readLine()) != null) {
                //dataList.add(line);
                if (line.startsWith("//")){
                    continue ;
                }
                if (line.contains("//    @RequestMapping")|| line.contains("//    @GetMapping") || line.contains("//     @PostMapping")){
                    continue ;
                }
                if (line.startsWith("@RequestMapping")){
                    continue ;
                }
               if(line.contains("@RequestMapping")|| line.contains("@GetMapping") || line.contains("@PostMapping")
               || line.contains("@WebServlet") ){
                   String value = "";
                   if (line.contains("@RequestMapping")){
                       if (line.contains("@RequestMapping(value")) {
                           try{
                                value = line.substring(line.indexOf("@RequestMapping(value = \"")+25, line.indexOf("\","));
                            }catch(Exception e){
                               System.err.println("Error1 " + line);
                               try {
                                   value = line.substring(line.indexOf("@RequestMapping(value = \"") + 25, line.indexOf("\" ,"));
                               }catch(Exception e1){
                                   System.err.println("Error2 " + line);
                                   try {
                                       value = line.substring(line.indexOf(" @RequestMapping(value = \"") + 25, line.indexOf("\")"));
                                   }catch(Exception e2){
                                       System.err.println("Error3 " + line);
                                   }
                               }

                           }
                       }else{
                           value = line.substring(line.indexOf("@RequestMapping(\"")+17, line.indexOf("\")"));
                       }

                   }else if(line.contains("@GetMapping")){

                        value = line.substring(line.indexOf("@GetMapping(\"")+13, line.indexOf("\")"));

                   }else if(line.contains("@PostMapping")){

                        value = line.substring(line.indexOf("@PostMapping(\"")+14, line.indexOf("\")"));

                   }else if(line.contains("@WebServlet")){
                       value = line.substring(line.indexOf("@WebServlet(urlPatterns = \"")+27, line.indexOf("\")"));
                   }

                   if (line.contains("@Description")){
                       comment = line.substring(line.indexOf("@Description")).trim();
                   }
                   //System.out.println(index +"  " + x + "  "+ tmp +" - " + value);
                   //System.out.println(index +"  " + x + "  "+ tmp +" - " + value);

                   if (result.keySet().contains(tmp)){
                       result.get(tmp).add(value);
                   }else{
                       List<String> tmpList = new ArrayList();
                       tmpList.add(value);
                       result.put(tmp, tmpList);
                   }

                   index++;
                   x++;
               }
            }
            int myIndex = 1 ;
            for(String key : result.keySet()){
                System.out.println(myIndex +"---key : " + key  +" size : " + result.get(key).size());
                for (String method :result.get(key)){


                    DoorData data = new DoorData();
                    data.setFuncComment(comment);
                    data.setDoorController(packageKey);
                    data.setFuncMethod(method);

                    dataList.add(data);
                }
                myIndex++ ;
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
        return dataList;
    }

    public  List<File> listFilesDir(String path){
        List<File> list = new ArrayList<File>();
        File[] fileList = getFileList(path);
        for (File file : fileList){
            if (file.isDirectory()){
                List<File> tmpFiles = listFilesDir(file.getAbsolutePath());
                list.addAll(tmpFiles);
            }else{
                list.add(file);
            }
        }
        return list;
    }

    File[] getFileList(String path){
        File tmp  = new File(path);
        File[] files = tmp.listFiles();
        return files ;
    }

}
