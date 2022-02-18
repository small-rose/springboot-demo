package com.xiaocai.demo.java;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ FileDemoTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/9 16:20
 * @Version ： 1.0
 **/
@Slf4j
public class FileDemoTest {

    @Test
    public void file01(){
        String file = "D:\\当前任务文件夹\\安诚\\对账文件\\招行\\DZ_110001_20210910_JHZFB_04 - 副本.txt";
        File file1 = new File(file);
        File dest = new File("D:\\当前任务文件夹\\安诚\\对账文件\\招行\\bak\\DZ_110001_20210910_JHZFB_0111.txt");
        boolean bool = file1.renameTo(dest);
        System.out.println(bool);
    }

    @Test
    public void file02(){
        String filepath = "D:\\当前任务文件夹\\安诚\\对账文件\\招行";
        String filterPattern = "DZ_110001_20210910";
        File tmp = new File(filepath);
        File[] files = tmp.listFiles(new FileFilter(){
            @Override
            public boolean accept(File pathname) {
                Pattern pattern = Pattern.compile("^" + filterPattern +"[\\s\\S]*.txt");
                log.info("pattern" + pattern.pattern());
                log.info("pathname" + !pathname.isDirectory());
                log.info("pathname" + pathname.getName());
                log.info("matches" + pattern.matcher(pathname.getName()).matches());
                return !pathname.isDirectory() && pattern.matcher(pathname.getName()).matches();
            }
        });
        if (files==null || files.length == 0){
            log.info("File Not Found !");
        }else{
            for (File file : files){
                log.info(file.getAbsolutePath());
            }
        }
    }

    @Test
    public void fileReneme(){
        String reanme = "DZ_900001_20211029_GHZF_143012021102901.txt";

    }



    @Test
    public void fileSumAmt(){
        String filepath = "D:\\当前任务文件夹\\安诚\\对账文件\\易宝\\prod";
        String filterPattern = "DZ_800001_2022";
        File tmp = new File(filepath);
        File[] files = tmp.listFiles(new FileFilter(){
            @Override
            public boolean accept(File pathname) {
                Pattern pattern = Pattern.compile("^" + filterPattern +"[\\s\\S]*.txt");
                log.info("pattern" + pattern.pattern());
                log.info("pathname" + !pathname.isDirectory());
                log.info("pathname" + pathname.getName());
                log.info("matches" + pattern.matcher(pathname.getName()).matches());
                return !pathname.isDirectory() && pattern.matcher(pathname.getName()).matches();
            }
        });
        if (files==null || files.length == 0){
            log.info("File Not Found !");
        }else{
            BufferedReader br = null;
            InputStreamReader isr = null;

             Map<String, String> result = new HashMap<>();
            String line = "";
            BigDecimal amout = null;
            for (File file : files){
                try {
                    amout = new BigDecimal("0.00");
                    log.info("fileName : "+ file.getName());
                    //上送文件为空时直接删除

                    if (file.length() == 0) {
                        //file.delete();
                        log.info(filepath + "文件是空的,不直接删除");
                        //return dataList;
                        continue ;
                    }


                    isr = new InputStreamReader(new FileInputStream(file), "GBK");
                    br = new BufferedReader(isr);
                    while ((line = br.readLine()) != null) {
                        //dataList.add(line);

                        String[] sr = line.split(",");
                        amout = amout.add(new BigDecimal(sr[4]));
                    }
                    result.put(file.getName(), amout.toString());
                } catch(Exception e) {
                    log.info("对账文件目录未获取到文件......");
                    e.printStackTrace();
                    throw new RuntimeException("对账文件目录"+filepath+"未获取到文件");
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
            }

            log.info("result {}", result);
            result.forEach((key,value) -> {
                System.out.println("fileName : "+ key +", Amount : "+ value);
            });
        }
    }

    String[] fileExclude = new String[] {"--"};
    @Test
    public void TestFilter() throws IOException{

        List<File> allHandFiles = new ArrayList<File>();
        File f1 = new File("D:\\当前任务文件夹\\安诚\\对账文件\\工行\\143012022010901.txt");
        File f2 = new File("D:\\当前任务文件夹\\安诚\\对账文件\\工行\\1430120220110BAOQUAN.txt");
        allHandFiles.add(f1);
        allHandFiles.add(f2);
        List<File> result = fileExcludeHandle(allHandFiles);
       log.info("result {}", result);
    }


    private List<File> fileExcludeHandle(List<File> allHandFiles) {

        if (allHandFiles==null || allHandFiles.size()==0 || fileExclude==null || fileExclude.length==0){
            return allHandFiles;
        }
        List<File> rightList = new ArrayList<File>();
        String fileName = "";
        boolean fileFlag = false;
        for (File file : allHandFiles){

            fileName = file.getName();
            System.out.println(fileName);
            for (String excludeKey : fileExclude){
                if (fileName.contains(excludeKey)){
                    fileFlag = true ;
                    break;
                }
            }
            if (fileFlag){
                continue;
            }
            rightList.add(file);
        }
        return rightList ;
    }




    @Test
    public void filePolicyNo(){
        String filepath = "D:\\当前任务文件夹\\安诚\\对账文件\\工行";
        String filterPattern = "143012022";
        File tmp = new File(filepath);
        File[] files = tmp.listFiles(new FileFilter(){
            @Override
            public boolean accept(File pathname) {
                Pattern pattern = Pattern.compile("^" + filterPattern +"[\\s\\S]*.txt");
                log.info("pattern" + pattern.pattern());
                log.info("pathname" + !pathname.isDirectory());
                log.info("pathname" + pathname.getName());
                log.info("matches" + pattern.matcher(pathname.getName()).matches());
                return !pathname.isDirectory() && pattern.matcher(pathname.getName()).matches();
            }
        });
        if (files==null || files.length == 0){
            log.info("File Not Found !");
        }else{
            BufferedReader br = null;
            InputStreamReader isr = null;

            Map<String, String> result = new HashMap<>();
            String line = "";
            BigDecimal amout = null;
            List<String> policyNo = new ArrayList<>();
            for (File file : files){
                try {
                    amout = new BigDecimal("0.00");
                    log.info("fileName : "+ file.getName());
                    //上送文件为空时直接删除

                    if (file.length() == 0) {
                        //file.delete();
                        log.info(filepath + "文件是空的,不直接删除");
                        //return dataList;
                        continue ;
                    }


                    isr = new InputStreamReader(new FileInputStream(file), "GBK");
                    br = new BufferedReader(isr);
                    while ((line = br.readLine()) != null) {
                        //dataList.add(line);

                        String[] sr = line.split("\\|");
                        policyNo.add("'"+sr[3]+"'");
                    }

                } catch(Exception e) {
                    log.info("对账文件目录未获取到文件......");
                    e.printStackTrace();
                    throw new RuntimeException("对账文件目录"+filepath+"未获取到文件");
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
            }

            log.info("result {}", result);
            result.forEach((key,value) -> {
                System.out.println("fileName : "+ key +", Amount : "+ value);
            });
        }
    }

    @Test
    public void counts(){
        //String file = "C:\\Users\\SHFND-NOTE200001\\Downloads\\paystation-2022-02-14-1.log\\paystation-2022-02-14-1.log";
        //String file = "C:\\Users\\SHFND-NOTE200001\\Downloads\\paystation-2022-02-15-1.log\\paystation-2022-02-15-1.log";
        String file = "C:\\Users\\SHFND-NOTE200001\\Downloads\\paystation-2022-02-16-1.log\\paystation-2022-02-16-1.log";
        BufferedReader br = null;
        InputStreamReader isr = null;

        Map<String, Integer> result = new HashMap<String, Integer>();
        String line = "";
        try {
            isr = new InputStreamReader(new FileInputStream(file), "UTF-8");
            br = new BufferedReader(isr);

            int sumTimes = 0 ;
            int counts = 0 ;
            while ((line = br.readLine()) != null) {
                //dataList.add(line);
                if (line.contains("缴费通知接口计时")){
                    //line = line.replace("com.fenet.insurance.paystation.back.service.impl.", "");
                    String datetime = line.substring(0, line.lastIndexOf(","));
                    String takeTime = line.substring(line.lastIndexOf(":")+2, line.length()-2);

                    System.out.println(datetime +"," + takeTime);
                    sumTimes += Integer.parseInt(takeTime);
                    counts += 1;
                    result.put(datetime, Integer.parseInt(takeTime));
                }
            }

            System.out.println("平均值(ms) ： "+ sumTimes/counts);
            //2022-02-14 平均值(ms) ： 6857
            //2022-02-15 平均值(ms) ： 6583
            //2022-02-16 平均值(ms) ： 5961
            // 均值 6476
        }catch(Exception e){
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
    }
}
