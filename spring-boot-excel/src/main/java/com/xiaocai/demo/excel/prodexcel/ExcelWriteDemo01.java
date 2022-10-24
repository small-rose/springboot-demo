package com.xiaocai.demo.excel.prodexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.xiaocai.demo.excel.prodexcel.data.FilePathDemoTest_Cm;
import com.xiaocai.demo.excel.prodexcel.data.FilePathDemoTest_CmService;
import com.xiaocai.demo.excel.utils.TestFileUtil;
import org.junit.Test;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ ExcelWriteDemo01 ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/2/28 15:55
 * @Version ： 1.0
 **/
public class ExcelWriteDemo01 {

    String writeDemoFile = "D:\\idea-Work\\zzy\\springboot-demo\\spring-boot-excel\\src\\main\\resources\\writedemo\\";
    String template  = "D:\\idea-Work\\zzy\\springboot-demo\\spring-boot-excel\\src\\main\\resources\\writedemo\\write_template.xlsx";

    static String type = "";

    @Test
    public void demo01(){

        type = "CMSERVICE" ;

        // 注意 simpleWrite在数据量不大的情况下可以使用（5000以内，具体也要看实际情况），数据量大参照 重复多次写入

        // 写法1 JDK8+
        // since: 3.0.0-beta1
        String fileName = writeDemoFile + "simpleWrite" + File.separator + "demo01_"+ datetime() + ".xlsx";


        try {
            File src = new File(template);
            File dest = new File(fileName);
            copyFileByStream(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("copy file error");
            return ;
        }

        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
       /* EasyExcel.write(fileName, DoorData.class)
                .sheet("sheet1")
                .doWrite(() -> {
                    // 分页查询数据
                    return data();
                });*/

    }

    private String datetime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-DD_HH_mm_ss"));
    }


    @Test
    public void demo02(){
        // 注意 simpleWrite在数据量不大的情况下可以使用（5000以内，具体也要看实际情况），数据量大参照 重复多次写入


        type = "CM" ;

        // 写法1 JDK8+
        // since: 3.0.0-beta1
        String fileName = writeDemoFile + "simpleWrite" + File.separator + "demo01_"+ datetime() + ".xlsx";

        try {
            File src = new File(template);
            File dest = new File(fileName);
            copyFileByStream(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("copy file error");
            return ;
        }


        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
        /*EasyExcel.write(fileName, DoorData.class)
                .sheet("sheet1")
                .doWrite(() -> {
                    // 分页查询数据
                    return data();
                });*/
        EasyExcel.write(fileName, DoorData.class)
                .sheet("sheet1")
                .doWrite( data());
    }


    @Test
    public void demo03(){
        // 写法3
        String fileName = TestFileUtil.getPath() + "simpleWrite" + datetime() + ".xlsx";
        // 这里 需要指定写用哪个class去写
        ExcelWriter excelWriter = null;
        try {
            excelWriter = EasyExcel.write(fileName, DoorData.class).build();
            WriteSheet writeSheet = EasyExcel.writerSheet("sheet1").build();
            excelWriter.write(data(), writeSheet);
        } finally {
            // 千万别忘记finish 会帮忙关闭流
            if (excelWriter != null) {
                excelWriter.finish();
            }
        }

    }


    public static List<DoorData> data(){
        List<DoorData> data = new ArrayList<DoorData>();

        if ("CMSERVICE".equals(type)){
            FilePathDemoTest_CmService cmsService = new FilePathDemoTest_CmService();
            return cmsService.listFilesDirCmService();
        }else if ("CM".equals(type)){
            FilePathDemoTest_Cm cmsService = new FilePathDemoTest_Cm();
            return cmsService.listFilesDirCmService();
        }
        return data ;
    }



    //拷贝文件
    public static void copyFileByStream(File source, File dest) throws IOException {
        try (InputStream inputStream = new FileInputStream(source);
             OutputStream outputStream = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        }
    }
}
