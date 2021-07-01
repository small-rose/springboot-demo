package cn.xiaocai.demo.jsoup.common;

import org.apache.commons.lang3.StringUtils;

import java.io.*;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-28 17:17
 **/
public class SqlHandler {

    public static void main(String[] args) {
        String line = "INSERT INTO d_bankmapping VALUES ('WEIXIN', 'WEIXIN', 'WEIXIN', '微信', '1', '2014-11-4 00:00:00', NULL, 'WEIXIN', 'bank-gateway', 'WEIXIN_', 'WEIXIN', '微信', '0 -72px', 3, 3, NULL);";
        String result = lineReplace(line);
        System.out.println(result);

        sqlDeal();
    }

    public static String lineReplace(String line) {

        //获得第一个点的位置
        int index1 = StringUtils.ordinalIndexOf(line,",",5);
        int index2 = StringUtils.ordinalIndexOf(line,",", 6);
        String before = line.substring(0,index1+1);
        System.out.println(" before " + before);

        String place = line.substring(index1+1, index2);
        place = String.format("to_date(%s, 'yyyy-mm-dd HH24:MI:SS')", place);

        System.out.println(" replace " + place);

        String after = line.substring(index2);
        System.out.println(" after " + after);

        String newLine = new StringBuilder(before).append(" ").append(place).append(after).toString();
        return newLine ;
    }

    private static void sqlDeal(){
        String fileName = "F:\\01zzy-Files\\DATA\\bankMapping.sql";
        File file = new File(fileName);
        BufferedReader reader = null;
        String fileNameOut = "F:\\01zzy-Files\\DATA\\bankMapping_oracle.sql";
        File fileOut = new File(fileNameOut);
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = null;

            writer = new BufferedWriter(new FileWriter(fileOut));
            long lineNum = 1;
            String newLine = null ;

            // 一次读入一行，直到读入null为文件结束
            while ((line = reader.readLine()) != null) {
                // 显示行号
                System.out.println("lineNum " + lineNum + ": " + line);


                newLine = lineReplace(line);

                writer.write(newLine);
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

