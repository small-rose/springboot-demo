package cn.small.demo.pdf.itextpdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/11/21 21:28
 * @version: v1.0
 */
public class ItextPdfTest {

    private static final String FILE_URL = "D:\\software\\";
    private static final int alarmNum = 123;
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(FILE_URL+"hello01.pdf"));
            document.open();
            //设置中文样式（不设置，中文将不会显示）
            BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            Font fontChinese_title = new Font(bfChinese, 20, Font.BOLD, BaseColor.BLACK);
            Font fontChinese_content = new Font(bfChinese, 10, Font.NORMAL, BaseColor.BLACK);
            Paragraph paragraph_title = new Paragraph("这是一个标题", fontChinese_title);
            paragraph_title.setAlignment(Paragraph.ALIGN_CENTER);
            Paragraph paragraph_title_1 = new Paragraph("01总概括", fontChinese_content);
            paragraph_title_1.setAlignment(Paragraph.ALIGN_JUSTIFIED);
            Paragraph paragraph_content = new Paragraph("本期发生告警数量一共"+alarmNum+"次", fontChinese_content);
            paragraph_content.setFirstLineIndent(20);
            document.add(paragraph_title);
            document.add(paragraph_title_1);
            document.add(paragraph_content);
            document.newPage();


            System.out.println("over");
            document.close();
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static CategoryDataset lineDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        //添加第一季度数据
        dataSet.addValue(6000, "第一季度", "J2SE类");
        dataSet.addValue(3000, "第一季度", "J2ME类");
        dataSet.addValue(12000, "第一季度", "J2EE类");
        //添加第二季度数据
        dataSet.addValue(8000, "第二季度", "J2SE类");
        dataSet.addValue(4000, "第二季度", "J2ME类");
        dataSet.addValue(6000, "第二季度", "J2EE类");
        //添加第三季度数据
        dataSet.addValue(5000, "第三季度", "J2SE类");
        dataSet.addValue(4000, "第三季度", "J2ME类");
        dataSet.addValue(8000, "第三季度", "J2EE类");
        //添加第四季度数据
        dataSet.addValue(8000, "第四季度", "J2SE类");
        dataSet.addValue(2000, "第四季度", "J2ME类");
        dataSet.addValue(9000, "第四季度", "J2EE类");
        return dataSet;
    }

    private static PieDataset pieDataSet() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue(" 市场前期", new Double(10));
        dataset.setValue(" 立项", new Double(15));
        dataset.setValue(" 计划", new Double(10));
        dataset.setValue(" 需求与设计", new Double(10));
        dataset.setValue(" 执行控制", new Double(35));
        dataset.setValue(" 收尾", new Double(10));
        dataset.setValue(" 运维",new Double(10));
        return dataset;
    }
}
