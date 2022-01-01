package cn.xiaocai.demo.spider.utils;

import org.springframework.util.StringUtils;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/28 21:46
 * @version: v1.0
 */
public class HttpsDownPicUtil {


    static SimpleDateFormat tmp = new SimpleDateFormat("yyyyMMddHHmmsss");
    static int retryTime = 3;



    /**
     * 带指定目录 的
     * @param dir
     * @param imgSrc
     * @param Name
     * @param sufffix
     * @return
     */
    public static String save(String dir, String imgSrc,String Name,String sufffix, String referer) throws InterruptedException {

        if (dir.endsWith("/")) {
            dir += "/";
        }
        String filePath = dir ;

        String result = "";
        try{


            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");//第一个参数为 返回实现指定安全套接字协议的SSLContext对象。第二个为提供者
            TrustManager[] tm = {new MyX509TrustManager()};
            sslContext.init(null, tm, new SecureRandom());
            SSLSocketFactory ssf = sslContext.getSocketFactory();

            URL url = new URL(imgSrc);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setSSLSocketFactory(ssf);
            if (StringUtils.hasLength( referer)) {
                conn.setRequestProperty("referer", referer);
            }
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

            //缓冲区
            byte[] bs = new byte[1024];
            //长度
            int len = 0;

            //保存文件到本地
            File saveDir = new File(filePath);
            if(!saveDir.exists()){
                saveDir.mkdirs();
            }
            File file = new File(saveDir+File.separator+fileName);
            System.out.println("filepath : "+file.getAbsolutePath());
            result = file.getAbsolutePath();
            if(file.exists()) {
                System.out.println("文件已经存在 : "+ file.getAbsolutePath());
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

            System.out.println("down pic success" + file.getAbsolutePath());
            result = file.getAbsolutePath();
            return result ;
        }catch (Exception e) {
            int ioexpTimes = 0  ;
            e.printStackTrace();
            System.out.println("down pic failed");
            retryDown(dir, imgSrc, Name, sufffix,  referer);
            result = "";
        }
        return result;
    }

    private static void retryDown(String dir, String imgSrc, String Name, String sufffix, String referer) throws InterruptedException {
        int ioexpTimes = 0 ;
        while (ioexpTimes <=retryTime  ) {
            retyrsave( dir,  imgSrc, Name, sufffix,  referer);
            System.out.println("retry down pic :" + imgSrc);
            TimeUnit.MILLISECONDS.sleep(250);
            ioexpTimes++;
        }
    }


    /**
     * 带指定目录 的
     * @param dir
     * @param imgSrc
     * @param Name
     * @param sufffix
     * @return
     */
    public static String retyrsave(String dir, String imgSrc,String Name,String sufffix, String referer) {
        if (dir.endsWith("/")) {
            dir += "/";
        }
        String filePath = dir ;

        String result = "";
        try{

            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");//第一个参数为 返回实现指定安全套接字协议的SSLContext对象。第二个为提供者
            TrustManager[] tm = {new MyX509TrustManager()};
            sslContext.init(null, tm, new SecureRandom());
            SSLSocketFactory ssf = sslContext.getSocketFactory();

            URL url = new URL(imgSrc);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setSSLSocketFactory(ssf);

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

            System.out.println("retry down pic success ! "+ file.getAbsolutePath());
            result = file.getAbsolutePath();
            return result ;
        }catch (Exception e) {

            e.printStackTrace();
            System.out.println("retry down pic failed " + imgSrc);
            result = "";
        }
        return result;
    }
}
