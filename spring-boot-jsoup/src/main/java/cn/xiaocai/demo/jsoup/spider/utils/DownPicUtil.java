package cn.xiaocai.demo.jsoup.spider.utils;

import org.springframework.util.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ SavePicUtil ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/23 11:51
 * @Version ： 1.0
 **/
public class DownPicUtil {

    private static String roadPath = "C:/fetch_pic/";
    static int tmpIndex = 0;
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH");
    static SimpleDateFormat tmp = new SimpleDateFormat("yyyyMMddHHmmsss");
    static String tmpName = "";

    public static String save(String imgSrc,String Name,String sufffix){
        String now = sdf.format(new Date());
        String filePath = roadPath+now+"/";
        if(!new File(filePath).exists()){
            new File(filePath).mkdirs();
        }
        String result = "";
        try{
            //System.err.println("imgSrc :"+imgSrc);
            URL url = new URL(imgSrc);
            URLConnection conn = url.openConnection();
            //设置超时
            conn.setConnectTimeout(10*1000);
            //设置代理
            conn.setRequestProperty("User-Agent", ConstantUtils.getAgent());
            //获取响应
            InputStream str = conn.getInputStream();
            if(sufffix.length()>5){
                sufffix = ".jpg";
            }
            //System.out.println("sufffix:"+sufffix);
            String fileName = "000";
            if(!StringUtils.isEmpty(Name)){
                if(Name.endsWith(sufffix)){
                    fileName = Name;
                }else{
                    fileName = Name +sufffix ;
                }
            }
            //System.out.println("fileName 1:"+fileName);
            if(!RegexUtil.isFileName(fileName)){
                String tmpName = tmp.format(new Date());
                fileName = tmpName + sufffix;
            }

            //System.out.println("fileName 2:"+fileName);
            //缓冲区
            byte[] bs = new byte[1024];
            //长度
            int len = 0;

            //保存文件到本地
            File saveDir = new File(filePath);
            if(!saveDir.exists()){
                saveDir.mkdir();
            }
            File file = new File(saveDir+ File.separator+fileName);
            System.out.println("filepath : "+file.getAbsolutePath());
            result = file.getAbsolutePath();
            if(file.exists()) {
                System.out.println("文件已经存在");
                return result;
            }
            //文件输出流
            FileOutputStream out = new FileOutputStream(file);

            while ((len = str.read(bs)) != -1) {

                out.write(bs, 0, len);
            }

            //刷新缓存
            out.flush();
            //关闭流
            out.close();
            str.close();

            System.out.println("down pic success");
            result = file.getAbsolutePath();
            return result ;
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("down pic failed");
            result = "";
        }
        return result;
    }

    /**
     * 带指定目录 的
     * @param dir
     * @param imgSrc
     * @param Name
     * @param sufffix
     * @return
     */
    public static String save(String dir, String imgSrc,String Name,String sufffix){

        if (dir.endsWith("/")) {
            dir += "/";
        }
        String filePath = dir ;

        String result = "";
        try{
            //System.err.println("imgSrc :"+imgSrc);
            URL url = new URL(imgSrc);
            URLConnection conn = url.openConnection();
            //设置超时
            conn.setConnectTimeout(10*1000);
            //设置代理
            conn.setRequestProperty("User-Agent", ConstantUtils.getAgent());
            //获取响应
            InputStream str = conn.getInputStream();
            if(sufffix.length()>5){
                sufffix = ".jpg";
            }
            //System.out.println("sufffix:"+sufffix);
            String fileName = "000";
            if(!StringUtils.isEmpty(Name)){
                if(Name.endsWith(sufffix)){
                    fileName = Name;
                }else{
                    fileName = Name +sufffix ;
                }
            }
            //System.out.println("fileName 1:"+fileName);
            if(!RegexUtil.isFileName(fileName)){
                String tmpName = tmp.format(new Date());
                fileName = tmpName + sufffix;
            }

            //System.out.println("fileName 2:"+fileName);
            //缓冲区
            byte[] bs = new byte[1024];
            //长度
            int len = 0;

            //保存文件到本地
            File saveDir = new File(filePath);
            if(!saveDir.exists()){
                saveDir.mkdir();
            }
            File file = new File(saveDir+File.separator+fileName);
            System.out.println("filepath : "+file.getAbsolutePath());
            result = file.getAbsolutePath();
            if(file.exists()) {
                System.out.println("文件已经存在");
                return result;
            }
            //文件输出流
            FileOutputStream out = new FileOutputStream(file);

            while ((len = str.read(bs)) != -1) {

                out.write(bs, 0, len);
            }

            //刷新缓存
            out.flush();
            //关闭流
            out.close();
            str.close();

            System.out.println("down pic success");
            result = file.getAbsolutePath();
            return result ;
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("down pic failed");
            result = "";
        }
        return result;
    }

}
