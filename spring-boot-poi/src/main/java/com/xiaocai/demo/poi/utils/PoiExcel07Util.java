package com.xiaocai.demo.poi.utils;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.util.StringUtils;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Pattern;


public class PoiExcel07Util {
	
	/**
	 * 获取workbook
	 * @return
	 */
	public static XSSFWorkbook createAXSSFWorkbook(){
		XSSFWorkbook workbook = new XSSFWorkbook();
		return workbook ;
	}
	
	/**
	 * 获取sheet
	 * @return
	 */
	public static XSSFSheet createASheetInWorkbook(XSSFWorkbook workbook, String sheetname){
		if(workbook==null){
			workbook = createAXSSFWorkbook();
		}
		 XSSFSheet sheet = workbook.createSheet(sheetname);
		return sheet ;
	}
	
	
	/**
	 * 获取row
	 * @return
	 */
	public static XSSFRow createARowInSheet(XSSFSheet sheet, int rownum, int height){
		
		 XSSFRow row = sheet.createRow(rownum);
		if(height==0){
			height = ExcelConstant.Row_Height;
		}
		row.setHeight((short)height);
		return row ;
	}
	
	
	/**
	 * 获取cell
	 * @return
	 */
	public static XSSFCell createACellInRow(XSSFRow row, int column, String value){
		 XSSFCell cell = row.createCell(column);
		cell.setCellValue(value);
		return cell ;
	}
	
	/**
	 * 获取单元格样式
	 * @return
	 */
	public static XSSFCellStyle getAXSSFCellStyle(XSSFWorkbook workbook,String fontposition,int fontsize,int fontWeight,boolean iscolor,String color){
		XSSFCellStyle style = workbook.createCellStyle();
		
		//全部细边线
		setThinBorderStyle(style);
		if(fontposition.equals(ExcelConstant.Font_Position_Left)){
			//字体居左
			setCellAlignLeftStyle(style);
		}else if(fontposition.equals(ExcelConstant.Font_Position_Center)){
			//字体居中
			setCellAlignCenterStyle(style);
		}else if(fontposition.equals(ExcelConstant.Font_Position_Right)){
			//字体居右
			setCellAlignRightStyle(style);
		}
		// 字体大小号码、   字体（ 宋体）、 字体宽度（ 加粗4）
		Font font = getFontStyle(workbook,fontsize,"",fontWeight);
		style.setFont(font);
		if(iscolor){
			if(color.equals(ExcelConstant.BgColor_Pale_Blue)){
				style.setFillForegroundColor(IndexedColors.PALE_BLUE.getIndex());
			}else if(color.equals(ExcelConstant.BgColor_Grey_25_Percent)){
				style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
			}
			
			style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		}
		return style ;
	}

	
	/**
	 * 获取项目汇总页样式集合
	 * @return
	 */
	public static XSSFCellStyle getAWrapTextCellStyle(XSSFWorkbook workbook,String fontposition,int fontsize,int fontWeight,boolean iscolor,String color){
		XSSFCellStyle style = workbook.createCellStyle();
		
		//全部细边线
		setThinBorderStyle(style);
		if(fontposition.equals(ExcelConstant.Font_Position_Left)){
			//字体居左
			setCellAlignLeftStyle(style);
		}else if(fontposition.equals(ExcelConstant.Font_Position_Center)){
			//字体居中
			setCellAlignCenterStyle(style);
		}else if(fontposition.equals(ExcelConstant.Font_Position_Right)){
			//字体居右
			setCellAlignRightStyle(style);
		}
		// 字体大小号码、   字体（ 宋体）、 字体宽度（ 加粗4）
		Font font = getFontStyle(workbook,fontsize,"",fontWeight);
		style.setFont(font);
		if(iscolor){
			if(color.equals(ExcelConstant.BgColor_Pale_Blue)){
				style.setFillForegroundColor(IndexedColors.PALE_BLUE.getIndex());
			}else if(color.equals(ExcelConstant.BgColor_Grey_25_Percent)){
				style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
			}
			
			style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		}
		//换行
		style.setWrapText(true);
		return style ;
	}

	
	private static void setHeadCellStyle(XSSFCellStyle style){
		//全部细线
		setThinBorderStyle(style);
		//字体居中
		style.setAlignment(XSSFCellStyle.ALIGN_CENTER);  
	}

	/**
	 * 设置单元格顶部边线（粗线）
	 * @param style
	 * @return
	 */
	private static void setThickBorderTopStyle(XSSFCellStyle style) {  
		// 设置单元格边框样式   
        // CellStyle.BORDER_DOUBLE      双边线   
        // CellStyle.BORDER_THIN        细边线   
        // CellStyle.BORDER_MEDIUM      中等边线   
        // CellStyle.BORDER_DASHED      虚线边线   
        // CellStyle.BORDER_HAIR        小圆点虚线边线   
        // CellStyle.BORDER_THICK       粗边线    
		style.setBorderTop(CellStyle.BORDER_THICK);   
		
	}
	
	/**
	 * 设置单元格底部边线（粗线）
	 * @param style
	 * @return
	 */
	private static void setThickBorderBottomStyle(XSSFCellStyle style) {
		//HSSFCellStyle borderStyle = workbook.createCellStyle();   
		// 设置单元格边框样式   
		style.setBorderBottom(CellStyle.BORDER_THICK);
		
	}
	/**
	 * 设置单元格左部边线（粗线）
	 * @param style
	 * @return
	 */
	private static void setThickBorderLeftStyle(XSSFCellStyle style) {
		//HSSFCellStyle borderStyle = workbook.createCellStyle();   
		// 设置单元格边框样式   
		style.setBorderLeft(CellStyle.BORDER_THICK);   
		
	}
	
	/**
	 * 设置单元格右部边线（粗线）
	 * @param style
	 * @return
	 */
	private static void setThickBorderRightStyle(XSSFCellStyle style) {
		//HSSFCellStyle borderStyle = workbook.createCellStyle();   
		// 设置单元格边框样式   
		style.setBorderRight(CellStyle.BORDER_THICK); 
	}
	
	/**
	 * 设置单元格四方边线（中等线）
	 * @param style
	 * @return
	 */
	private static void setMediumBorderStyle(XSSFCellStyle style) {
		//HSSFCellStyle borderStyle = workbook.createCellStyle();   
		// 设置单元格边框样式   
		style.setBorderBottom(CellStyle.BORDER_MEDIUM);   
		style.setBorderTop(CellStyle.BORDER_MEDIUM);   
		style.setBorderLeft(CellStyle.BORDER_MEDIUM);   
		style.setBorderRight(CellStyle.BORDER_MEDIUM); 

	}
	
	/**
	 * 设置单元格四方边线（细边线）
	 * @param style
	 * @return
	 */
	private static void setThinBorderStyle(XSSFCellStyle style) {
		//HSSFCellStyle borderStyle = workbook.createCellStyle();   
		// 设置单元格边框样式   
		style.setBorderBottom(CellStyle.BORDER_THIN);   
		style.setBorderTop(CellStyle.BORDER_THIN);   
		style.setBorderLeft(CellStyle.BORDER_THIN);   
		style.setBorderRight(CellStyle.BORDER_THIN); 
	
	}
	
	
	/**
	 * 设置单元格样式四方边线（细边线）内部单元格
	 * @param workbook
	 * @return
	 */
	public static void setNormalCellStyle(XSSFWorkbook workbook,XSSFCellStyle contentStyle) {
		//HSSFCellStyle contentStyle = workbook.createCellStyle();   
		// 设置单元格边框样式   
		contentStyle.setBorderBottom(CellStyle.BORDER_THIN);   
		contentStyle.setBorderTop(CellStyle.BORDER_THIN);   
		contentStyle.setBorderLeft(CellStyle.BORDER_THIN);   
		contentStyle.setBorderRight(CellStyle.BORDER_THIN); 
        //设置字体
		Font font = getFontStyle(workbook,10,"",1);
        contentStyle.setFont(font);
        //对齐方式
        contentStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);  
        contentStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_JUSTIFY);
        
	}
	
	/**
	 * 取字体样式（默认宋体 10号）
	 * @param workbook
	 * @param height
	 * @param ziti
	 * @param boderweight
	 * @return
	 */
	private static Font getFontStyle(XSSFWorkbook workbook,int height,String ziti,int boderweight){
		Font font = workbook.createFont();
		if(height==0){
			height = ExcelConstant.Font_Size;
		}
		font.setFontHeightInPoints((short)height);
		if(StringUtils.isEmpty(ziti)){
			ziti = ExcelConstant.Font_Name ;
		}
		font.setFontName(ziti);
		if(boderweight==0){
			boderweight = XSSFFont.BOLDWEIGHT_NORMAL ;
		}
		font.setBoldweight((short)boderweight);
		font.setItalic(false);
		font.setStrikeout(false);
		return font ;
	}
	
	
	/**
	 * 字体样式
	 * @param workbook
	 * @param height
	 * @param ziti
	 * @param boderweight
	 * @return
	 */
	public static XSSFCellStyle getCellFontStyle(XSSFWorkbook workbook,XSSFCellStyle style, int height,String ziti,int boderweight){
		// 创建一个字体并修改它的样式.
		Font font = workbook.createFont();
		if(height==0){
			height = ExcelConstant.Font_Size;
		}
		font.setFontHeightInPoints((short)height);
		if(StringUtils.isEmpty(ziti)){
			ziti = ExcelConstant.Font_Name ;
		}
		font.setFontName(ziti);
		if(boderweight<0 ||boderweight>10){
			boderweight = ExcelConstant.Font_BoderWeight ;
		}
		font.setBoldweight((short)boderweight);
		font.setItalic(false);
		font.setStrikeout(false);
		//字体在样式（style）中载入才能使用，因此创建一个style来使用该字体
		style.setFont(font);
		return style ;
	}
	/**
	 * 单元格内容居中对齐方式
	 * @param style
	 * @return
	 */
	public static void setCellAlignCenterStyle(XSSFCellStyle style) {
      
        //CellStyle alignStyle = wb.createCellStyle();
        // 设置单元格内容水平对其方式   
        // XSSFCellStyle.ALIGN_CENTER       居中对齐   
        // XSSFCellStyle.ALIGN_LEFT         左对齐   
        // XSSFCellStyle.ALIGN_RIGHT        右对齐   
		style.setAlignment(CellStyle.ALIGN_CENTER);   
           
        // 设置单元格内容垂直对其方式   
        // XSSFCellStyle.VERTICAL_TOP       上对齐   
        // XSSFCellStyle.VERTICAL_CENTER    中对齐   
        // XSSFCellStyle.VERTICAL_BOTTOM    下对齐 		
		style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
    }
	
	/**
	 * 单元格内容居left对齐方式
	 * @param style
	 * @return
	 */
	public static void setCellAlignLeftStyle(XSSFCellStyle style) {
		//  左对齐   
		style.setAlignment(CellStyle.ALIGN_LEFT);
		
		style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
    }
	/**
	 * 单元格内容居left对齐方式
	 * @param style
	 * @return
	 */
	public static void setCellAlignRightStyle(XSSFCellStyle style) {
		//右对齐   
		style.setAlignment(XSSFCellStyle.ALIGN_RIGHT);   
     	
		style.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
       
    }


	/**
	 * 计算excel 行高
	 * @param str 单元格需要放入的 字符串
	 * @param fontCountInline 是该单元格每行多少个汉字 全角为1 英文或符号为0.5
	 * @return
	 */
	public static float getExcelCellAutoHeight(String str, float fontCountInline) {
	     float defaultRowHeight = 10.00f;//每一行的高度指定
	     float defaultCount = 0.00f;
	     for (int i = 0; i < str.length(); i++) {
	          float ff = getregex(str.substring(i, i + 1));
	          defaultCount = defaultCount + ff;
	      }
	     return ((int) (defaultCount / fontCountInline) + 1) * defaultRowHeight;//计算
	 }

	 public static float getregex(String charStr) {
	        
	      if(charStr==" "){
	          return 1.0f;
	      }
	      // 判断是否为字母或字符
	      if (Pattern.compile("^[A-Za-z0-9]+$").matcher(charStr).matches()) {
	    	  return 1.0f;
	      }
	      // 判断是否为全角
	      if (Pattern.compile("[\u4e00-\u9fa5]+$").matcher(charStr).matches()) {
	          return 1.00f;
	      }
	      //全角符号 及中文
	      if (Pattern.compile("[^x00-xff]").matcher(charStr).matches()) {
	          return 1.00f;
	      }
	      return 1.0f;

	    }
	    
	//test
	public static XSSFWorkbook AllReportExcel() {
		
		 // 第一步，创建一个webbook，对应一个Excel文件
		XSSFWorkbook workbook = createAXSSFWorkbook();
		
		XSSFRow row = null ;
		XSSFCell cell = null;
		for(int i=0 ;i< 4 ;i++){
			// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
			XSSFSheet sheet = createASheetInWorkbook(workbook,"第"+i+"个sheet");
			sheet.setDefaultColumnWidth(40);
			for(int m=0 ; m< 8 ;m++){
				// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
				row = createARowInSheet(sheet,m, 800);
				
				if(m==0){
					cell = createACellInRow(row,0, "部门工作周报");
					//row.createCell(0).setCellValue("部门工作周报");
					row.setHeight((short)600);		
					cell.setCellType(XSSFCell.CELL_TYPE_STRING); //设置单元格为STRING类型 
					//合并首行
					sheet.addMergedRegion(new CellRangeAddress(0,0,0,7));  
				}
				if(m==1){
					cell = createACellInRow(row, 0, "部门名称");
					cell = createACellInRow(row, 1, "开发组");
					
					
					cell = createACellInRow(row, 4, "部门经理");
					cell = createACellInRow(row, 5, "刘大伟");
					row.setHeight((short)400);
					//合并第二行
					sheet.addMergedRegion(new CellRangeAddress(1,1,1,3));
					sheet.addMergedRegion(new CellRangeAddress(1,1,5,7));
					//sheet.addMergedRegion(new CellRangeAddress(1,2,1,7));
				}
				if(m==2){
	
					row.createCell(0).setCellValue("报告周期");
					row.createCell(1).setCellValue("2016年11月12日~2016年11月18日	");
					//合并第3行
					sheet.addMergedRegion(new CellRangeAddress(2,2,1,7));
					row.setHeight((short)400);
				}
				if(m==3){

					row.createCell(0).setCellValue("编号");
					row.createCell(1).setCellValue("所属项目");
					row.createCell(2).setCellValue("职位");
					row.createCell(3).setCellValue("人员");
					row.createCell(4).setCellValue("本周工作内容");
					row.createCell(5).setCellValue("后续工作安排");
					row.createCell(6).setCellValue("加班时间");
					row.createCell(7).setCellValue("加班事由");
					row.setHeight((short)400);
				}
				if(m>3){
					
					for(int n = 0 ;n <8; n++){
						cell = createACellInRow(row, n, "第"+m+"行，第"+n+"列");
					}
					row.setHeight((short)1000);
				}	
			}
		}
		return workbook;
	}
	
	
	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = AllReportExcel();
		FileOutputStream fileOut = new FileOutputStream("E:\\test.xlsx");   
		wb.write(fileOut);
	}

	/**
	 * 写入磁盘
	 * @param workbook
	 * @param path
	 * @param type
	 * @param fileName
	 */
	public static void writeToSsd(XSSFWorkbook workbook,String path,String type, String fileName){
		try {  
			String realPath = null ;
			if (workbook instanceof XSSFWorkbook) {
				fileName += ExcelConstant.XSSF;
	        } else {
	        	fileName += ExcelConstant.HSSF;
	        }
			//文件磁盘保存路径
			realPath = path+"/"+ ExcelConstant.defaultPath+"/"+type+"/";
			//TODO TEST
			//path = "E:\\"+fileName;
			File file = new File(realPath);
			if (!file.exists()) {
				file.mkdirs();
			}
			realPath += fileName;
	        FileOutputStream fileOut = new FileOutputStream(realPath);   
	        workbook.write(fileOut);
  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
	}
	
	
	/**
	 * 以流的方式响应给客户端
	 * @param workbook
	 * @param fileName
	 * @param request
	 * @param response
	 */
	public static void toDownLoad(XSSFWorkbook workbook,String fileName, HttpServletRequest request, HttpServletResponse response){
		try {  
			
			if (workbook instanceof XSSFWorkbook) {
				fileName += ExcelConstant.XSSF;
				
	        } else {
	        	fileName += ExcelConstant.HSSF;
	        }
	        if (isIE(request)) {
	        	fileName = java.net.URLEncoder.encode(fileName, "UTF8");
	        } else {
	        	fileName = new String(fileName.getBytes("UTF-8"), "ISO-8859-1");
	        }
	        response.setHeader("content-disposition", "attachment;filename=" + fileName);
	        //response.addHeader("Content-Length", "" + fileName.length());
	        response.setContentType("application/octet-stream");
	        ServletOutputStream out = response.getOutputStream();
	        workbook.write(out);
	        out.flush();
	        out.close();
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
	}
	
	/**
	 * 判断是否是IE
	 * @param request
	 * @return
	 */
	private static boolean isIE(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return (request.getHeader("USER-AGENT").toLowerCase().indexOf("msie") > 0 || request
	            .getHeader("USER-AGENT").toLowerCase().indexOf("rv:11.0") > 0) ? true : false;
	}


	
}
