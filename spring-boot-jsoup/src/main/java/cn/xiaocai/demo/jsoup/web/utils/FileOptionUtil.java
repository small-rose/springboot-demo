package cn.xiaocai.demo.jsoup.web.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileOptionUtil {

	
	public static boolean checkImgSizePx(String filePath){
		System.out.println(" filePath" + filePath);
		File file = new File(filePath);
		if(!file.exists()){
			System.out.println(" 文件不存在， filePath" + filePath);
			return true;
		}
		if(file.length()<3000){
			System.out.println(" 文件太小：删除" + file.length());
			file.delete();
			return true;
		}
		BufferedImage bi = null;
		try {
			bi = ImageIO.read(file);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(bi==null){
			file.delete();
			return true;
		}
		int width = bi.getWidth();
		int height = bi.getHeight();
		if(width<300 || height <300){
			System.out.println(" file.delete 文件width" + width +" 文件height" + height);
			file.delete();
			return true;
		}
		return false;
	}
	
	
	public static void fileDownload(File zipFile, HttpServletRequest request, HttpServletResponse response){
		byte[] buf = new byte[1024];
        int len;
		FileInputStream zipInput = null;
		OutputStream out = null;
		try {
			System.out.println(" zipFile path :"+zipFile.getAbsolutePath());
			zipInput = new FileInputStream(zipFile);
			out = response.getOutputStream();
	        response.setContentType("application/octet-stream");
	        response.setHeader("Content-Disposition", "attachment; filename=images.zip");
	        while ((len=zipInput.read(buf))!= -1){  
	            out.write(buf,0,len);  
	        }
	        out.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(zipInput!=null){
					zipInput.close();
				}
				if(out!=null){
					out.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        
        //删除压缩包
        zipFile.delete();
	}
	
	/**
	 * 移动文件
	 * @param srcfile
	 * @param dest
	 */
	public static void fileMove(File srcfile,String destpath,String desc,String fileName){
		 
		FileInputStream input = null;
		FileOutputStream out = null;   
		byte[] buf = new byte[1024];
		int len;
		try {
			if(destpath.endsWith("/")){
				destpath += "/";
			}
			File tmp = new File(destpath + desc+"/");
			if(!tmp.exists()){
				tmp.mkdirs();
			}
			File dest = new File(tmp.getAbsolutePath()+"/"+desc+fileName);
			if(dest.exists()){
				return ;
			}		
			input = new FileInputStream(srcfile);
			out = new FileOutputStream(dest);
			while ((len=input.read(buf))!= -1){  
	            out.write(buf,0,len);  
	        }
	        out.flush();
	        System.out.println(" move file to --->" + dest.getAbsolutePath());
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				String path = srcfile.getAbsolutePath();
//				if(srcfile.delete()){
//					System.out.println(" delete file  --->" + path);
//				}
				if(input!=null){
					input.close();
				}
				if(out!=null){
					out.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
