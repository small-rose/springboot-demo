package com.small.o2o.comp.module.facade;


import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileReader;
import com.cppic.obgenerator.small.utils.FileRWUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@Slf4j
@Service
public class FilePickService {


    String path = "E:\\ideaWork\\PT17ACC-MA\\fisservice\\src\\main\\resources\\SQL\\2022\\" ;

    String target = "E:\\obgenerator\\DDL\\";



    public void search(String target, String key){
        File file = new File(target);
        List<File> fileList = getAllFileList(file.listFiles());
        fileList.forEach(file1 -> {
            System.out.println(file1.getAbsolutePath());
            FileReader fileReader = new FileReader(file1);
            AtomicInteger lineNo = new AtomicInteger(0);
            AtomicBoolean atomicBoolean = new AtomicBoolean(Boolean.FALSE);
            fileReader.readLines().forEach(l->{
                lineNo.incrementAndGet();
                if(l.toUpperCase().contains(key.toUpperCase())){
                    System.out.println("LineNo "+lineNo.get());
                    System.out.println("\t" +l);
                    atomicBoolean.set(Boolean.TRUE);
                }
            });


            System.out.println("--From "+file1.getAbsolutePath());


        });
    }


    public void getAllFiles(){
        File file = new File(path);
        File[] files = file.listFiles((f,n)->{
            String yymm = n.substring(0,6);
            int ym = Integer.parseInt(yymm);
            return ym >= 202209 ;
        });

        //Arrays.stream(files).forEach(System.out::println);

        List<File> fileList = getAllFileList(files);
        fileList.forEach(System.out::println);

        fileList.forEach(f->{
            String absolutePath = f.getAbsolutePath();
            String date = "";
            if (absolutePath.contains("生产环境")) {
               date = absolutePath.substring(absolutePath.indexOf("2022\\") + 5, absolutePath.indexOf("\\生产环境\\"));
            }else {
                date = absolutePath.substring(absolutePath.indexOf("2022\\") + 5, absolutePath.indexOf("\\DDL\\ORACLE"));
            }
            //System.out.println(date);
            FileUtil.copy(f, new File(target +date+ f.getName()),false);
        });


    }

    private List<File>  getAllFileList(File[] files) {
        List<File>  result = new ArrayList<>();
        for (File tmpFile : files){
            if (tmpFile.isDirectory()){
                result.addAll(getAllFileList(tmpFile.listFiles()));
            }
            String fileName = tmpFile.getName();
           /* if (tmpFile.isFile() && fileName.startsWith("zhu") && fileName.toUpperCase().endsWith("DDL.SQL")) {
                result.add(tmpFile);
            }
*/
            if (tmpFile.isFile() && fileName.contains("zhu") && fileName.toUpperCase().endsWith(".SQL")) {
                result.add(tmpFile);
            }

        }
        return result ;
    }


    public List<String> getTestOracleTable(){
        FileReader reader = new FileReader("E:\\obgenerator\\test_oracle_key.txt");
        List<String> table = reader.readLines();
        return table ;

    }

    public List<String> get146Table(){
        FileReader reader = new FileReader("E:\\obgenerator\\ora_146.txt");
        List<String> table = reader.readLines();
        return table ;

    }

    public List<String> getWhiteListTable(){
        FileReader reader = new FileReader("E:\\obgenerator\\Keep_table.txt");
        List<String> table = reader.readLines();
        return table ;

    }

    public List<String> getChayiListTable(){
        FileReader reader = new FileReader("E:\\obgenerator\\chayi.txt");
        List<String> table = reader.readLines();
        return table ;

    }


    public List<String> getOBPlsqlUnitListTable(){
        FileReader reader = new FileReader("E:\\obgenerator\\ob_plsqlunit_37.txt");
        List<String> table = reader.readLines();
        return table ;
    }

    public List<String> getORAPlsqlUnitListTable(){
        FileReader reader = new FileReader("E:\\obgenerator\\ora_plsqlunit_49.txt");
        List<String> table = reader.readLines();
        return table ;
    }

    public void searchKeys(String target, String key1,String key2){
        File file = new File(target);

        FileReader fileReader = new FileReader(file);
        AtomicInteger lineNo = new AtomicInteger(0);
        AtomicBoolean atomicBoolean = new AtomicBoolean(Boolean.FALSE);
        fileReader.readLines().forEach(l -> {
            lineNo.incrementAndGet();
            if (l.contains(key1) && l.contains(key2)) {
                System.out.println("LineNo " + lineNo.get());
                System.out.println("\t" + l);
                atomicBoolean.set(Boolean.TRUE);
            }
        });


    }
    public static String PACKAGE_BODY = "PACKAGE BODY ";
    public static String PLSQL_UNIT = "$$PLSQL_UNIT";
    public static String plsql_unit = "$$plsql_unit";

    public void countPLSQLUNIT(String path) {
        List<String> resultList = new ArrayList<>();
        List<String> stringList = FileRWUtils.fileReader(path);
        AtomicReference<String> packageName = new AtomicReference<>("");
        AtomicInteger count = new AtomicInteger(0);
        boolean currentPKG  = false ;
         String lastpkg = "";
        for (String l : stringList){

            if (l.toUpperCase().contains(PACKAGE_BODY) ) {
                lastpkg = packageName.get();
                packageName.set(l.toUpperCase().substring(l.toUpperCase().indexOf(PACKAGE_BODY) + PACKAGE_BODY.length(), l.toUpperCase().indexOf(" IS")));
                currentPKG = true ;
            }

            if (currentPKG && (
                    l.toUpperCase().contains(PLSQL_UNIT) || l.toLowerCase().contains(plsql_unit)) && !packageName.equals(lastpkg)){
                currentPKG = false ;
                count.getAndIncrement();
                System.out.println(" 发现存过 " + packageName +" 存在 " + PLSQL_UNIT +" ,合计发现 " + count.get());
                resultList.add(packageName.get().trim());
            }



        };

        resultList.forEach(System.out::println);
    }
}
