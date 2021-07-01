package cn.xiaocai.demo.jsoup.common;

import java.io.*;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-08 13:40
 **/
public class ApplyNoHandler {


    public static void main(String[] args) {
        String fileName = "D:\\Jemeter-work\\crpt_no_result\\crpt_no_20210607_03.txt";
        File file = new File(fileName);
        BufferedReader reader = null;
        String fileNameOut = "D:\\Jemeter-work\\crpt_no_result\\crpt_no_20210607_04.txt";
        File fileOut = new File(fileNameOut);
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;

            writer = new BufferedWriter(new FileWriter(fileOut));
            long line = 1;
            boolean flag = false ;

            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                System.out.println("line " + line + ": " + tempString);
                if (tempString.contains("error") || tempString.equals("")){
                    continue;
                }
                line++;
                if (tempString.equals("6695924285849600")){
                    flag = true ;
                }
                if(!flag){
                    continue;
                }
                writer.write(tempString);
                writer.newLine();

            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e1) {
                }
            }
        }
    }
}
