package cn.small.demo.pdf.pdfbox;

import lombok.extern.slf4j.Slf4j;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/11/21 21:03
 * @version: v1.0
 */
@Slf4j
public class PDFBoxUtils {


    public void getText(String file) throws Exception{
        //是否排序
        boolean sort = false;
        //pdf文件名
        String pdfFile = file;
        //输入文本文件名称
        String textFile = null;
        //编码方式
        String encoding = "UTF-8";
        //开始提取页数
        int startPage = 1;
        //结束提取页数
        int endPage = Integer.MAX_VALUE;
        //文件输入流，输入文本文件
        Writer output = null;
        //内存中存储的PDF Document
        PDDocument document = null;

        try{
            try{
                //首先当作一个File来加载文件，如果得到异常再从本地系统装载文件
                File url = new File(pdfFile);
                document = PDDocument.load(url);
                String fileName = url.getName();

                if(fileName.length() > 4){
                    //以原来pdf名称来命名新产生的txt文件
                    File outputFile = new File(fileName.substring(0, fileName.length()-4) + ".txt");
                    textFile = outputFile.getName();
                }
            }catch(Exception e){
                log.info("报错了");
            }
            //文件输出流，写入文件到textFile
            output = new OutputStreamWriter(new FileOutputStream(textFile),encoding);
            //PDFTextStripper来提取文本
            PDFTextStripper stripper = new PDFTextStripper();
            //设置是否排序
            stripper.setSortByPosition(sort);
            //设置起始页
            stripper.setStartPage(startPage);
            //设置结束页
            stripper.setEndPage(endPage);
            //调用PDFTextStripper的writeText提取并输出文本
            stripper.writeText(document, output);
        }finally{
            if(output != null){
                output.close();
            }
            if(document != null){
                document.close();
            }
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PDFBoxUtils test = new PDFBoxUtils();
        try{
            test.getText("E://test.pdf");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
