package com.xiaocai.demo.excel.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileOptionUtil {
 	private String fileName = "";
	private String localPath = "";
	
	public boolean genarateFile(String content) throws Exception{
		FileWriter fw = null ;
		File tempfile = null, file = null;
		BufferedWriter bw = null;
		if(!localPath.endsWith("/")){
			localPath += "/";
		}
		try{
			tempfile = new File(localPath);
			if(!tempfile.exists()){
				tempfile.mkdirs();
			}
			System.out.println("path="+tempfile.getPath());
			file = new File(tempfile.getPath()+"/"+ fileName);
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.append("Begin");
			bw.append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
			bw.newLine();
			String[] sc = content.split("#");
			for(String s : sc){
				bw.append(s);
				bw.newLine();
			}
			bw.append("end");
			bw.newLine();
			bw.close();
			fw.close();
			return true;
		}catch(Exception e){
			System.err.println("写结果文件失败");
			e.printStackTrace();
			throw new Exception("写结果文件失败");
		}finally{
			System.out.println("文件生成成功，文件路径是："+localPath+" fileName ："+fileName);
		}	
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public String getLocalPath() {
		return localPath;
	}


	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}


	/**
	 * 以流的方式响应给客户端
	 * @param path
	 * @param fileName
	 * @param request
	 * @param response
	 */
	public static void FileDownLoad(String path,String fileName, HttpServletRequest request, HttpServletResponse response) throws Exception{
		try {  
			
			File tmpf = new File(path);
			if(!tmpf.exists()){
				tmpf.mkdirs();
			}
			if(!path.endsWith("/")){
				path += "/";
			}
			File file = new File(path +fileName);
			
	        if (isIE(request)) {
	        	fileName = java.net.URLEncoder.encode(fileName, "UTF8");
	        } else {
	        	fileName = new String(fileName.getBytes("UTF-8"), "ISO-8859-1");
	        }
	        response.setHeader("content-disposition", "attachment;filename=" + fileName);
	        //response.addHeader("Content-Length", "" + fileName.length());
  	        response.setContentType("application/octet-stream");
	        ServletOutputStream out = response.getOutputStream();
	        int len ;
  	        
	        FileInputStream in = new FileInputStream(file);
	        byte[] buffer = new byte[1024];
	        while((len=in.read(buffer))!=-1){
	        	out.write(buffer, 0, len);
        	}
	        
	        //PrintWriter out = response.getWriter();
	        /*while((in.read(buffer,0,1024))!=-1){
	        	out.write(new String(buffer));
	        }*/
	        in.close();
	        out.flush();
	        out.close();
	        
	        
	        
	        
        }catch (FileNotFoundException fe) {
			// TODO: handle exception
        	throw new Exception("找不到文件！");
		}  catch (IOException e) {  
            e.printStackTrace(); 
            System.err.println("下载出错了！");
            throw new Exception("下载异常io异常");
		 }
	}

	public static void FileDownLoad2(String path,String fileName, HttpServletRequest request, HttpServletResponse response) throws Exception{
		 
	    File tmpf = new File(path);
		if(!tmpf.exists()){
			tmpf.mkdirs();
		}
		if(!path.endsWith("/")){
			path += "/";
		}
		File file = new File(path +fileName);
		
        if (isIE(request)) {
        	fileName = java.net.URLEncoder.encode(fileName, "UTF8");
        } else {
        	fileName = new String(fileName.getBytes("UTF-8"), "ISO-8859-1");
        }
      //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型  
	    response.setContentType("multipart/form-data");  
	  //2.设置文件头：最后一个参数是设置下载文件名(假如我们叫a.pdf)  
        response.setHeader("content-disposition", "attachment;filename=" + fileName);
	    
	    ServletOutputStream out;  
	
	    try {  
	        FileInputStream inputStream = new FileInputStream(file);  
	
	        //3.通过response获取ServletOutputStream对象(out)  
	        out = response.getOutputStream();  
	
	        int b = 0;  
	        byte[] buffer = new byte[512];  
	        while (b != -1){  
	            b = inputStream.read(buffer);  
	            //4.写到输出流(out)中  
	            out.write(buffer,0,b);  
	        }  
	        inputStream.close();  
	        out.close();  
	        out.flush();  
	
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
	
	public String genarateFile(HttpServletRequest request,String content) throws Exception{
		localPath = request.getServletContext().getRealPath("/");
		log.info("---localPath---" + localPath);
		String path = "";

		localPath += "temp";
		File filed = new File(localPath);// 可以是任何格式.jpg,.png,.txt等
		if (!filed.exists()) {
			filed.mkdirs();
		}
		FileWriter fw = null ;
		File tempfile = null, file = null;
		BufferedWriter bw = null;
		if(!localPath.endsWith("/")){
			localPath += "/";
		}
		try{
			tempfile = new File(localPath);
			if(!tempfile.exists()){
				tempfile.mkdirs();
			}
			log.info("path="+tempfile.getPath());
			file = new File(tempfile.getPath()+"/"+ fileName);
			if(file.exists()){
				file.delete();
			}
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.append("Begin ");
			bw.append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
			bw.newLine();
			String[] sc = content.split("#");
			for(String s : sc){
				bw.append(s);
				bw.newLine();
			}
			bw.append("end");
			bw.newLine();
			bw.close();
			fw.close();
			log.info(" file.getAbsolutePath() :" +file.getAbsolutePath());
			return file.getAbsolutePath();
		}catch(Exception e){
			log.info("写结果文件失败");
			e.printStackTrace();
			throw new Exception("写结果文件失败");
		}finally{
			log.info("文件生成成功，文件路径是："+localPath+" fileName ："+fileName);
		}	
	}
}
