package cn.xiaocai.demo.jsoup.web.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

import javax.servlet.http.HttpServletRequest;

@Slf4j
public class AttachemnetUtil {
	

	private static String imgPath = "//home//bmis//supplier//";

	// 附件转二进制
	public static byte[] convertFileToBytes(File file) {
		byte[] content = null;
		try {

			FileInputStream fin = new FileInputStream(file);
			ByteBuffer nbf = ByteBuffer.allocate((int) file.length());
			byte[] array = new byte[1024];
			int offset = 0, length = 0;
			while ((length = fin.read(array)) > 0) {
				if (length != 1024)
					nbf.put(array, 0, length);
				else
					nbf.put(array);
				offset += length;
			}
			fin.close();
			content = nbf.array();
			//System.out.println("file content " +content);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return content;
	}
	/**
	 * 
	 * @param req
	 * @param content 二进制
	 * @param imgName 文件名称
	 * @return 文件路径
	 */
	public static String getFileByBytes(HttpServletRequest req, byte[] content, String imgName) {

		imgPath = req.getServletContext().getRealPath("/");
		log.info("---imgPath---" + imgPath);
		String path = "";
		//System.out.println("content :"+content);
		InputStream in = new ByteArrayInputStream(content);
		imgPath += "tmpImg";
		File filed = new File(imgPath);// 可以是任何图片格式.jpg,.png等
		if (!filed.exists()) {
			filed.mkdirs();
		}
		File file = new File(filed.getPath() + "/" + imgName);
		if(file.exists()){
			log.info("--file-"+imgName+"---exists--");
			return file.getAbsolutePath();
		}
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(file);
			byte[] b = new byte[1024];
			int nRead = 0;
			while ((nRead = in.read(b)) != -1) {
				fos.write(b, 0, nRead);
			}
			fos.flush();
			fos.close();
			in.close();
			path = file.getAbsolutePath();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			log.info("----附件转图片失败----FileNotFoundException---");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.info("----附件转图片失败----IOException--");
			e.printStackTrace();
		}
		return path;
	}

}
