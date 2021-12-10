package com.xiaocai.demo.ftp;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ FtpClientUtil ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/1 14:52
 * @Version ： 1.0
 **/
public class FtpClientUtil {

    private FTPClient ftp = null ;

    private InputStream is = null;
    private OutputStream os  = null;
    private FileOutputStream fos = null;
    private FileInputStream fis = null;

    /**
     * 验证登录
     * @param ip
     * @param port
     * @param name
     * @param pwd
     * @return
     */
    public boolean login(String ip,int port, String name, String pwd) {
        try {
            ftp = new FTPClient();
            ftp.connect(ip, port);

            System.out.println(ftp.login(name, pwd));
            if(!ftp.login(name, pwd)){
                return false;
            }
            ftp.setCharset(Charset.forName("UTF-8"));
            ftp.setControlEncoding("UTF-8");

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 获取ftp某一文件（路径）下的文件名字,用于查看文件列表
     * @param ip
     * @param port
     * @param name
     * @param pwd
     * @param remotedir 远程地址目录
     * @return
     */
    public boolean getFilesName(String ip,int port, String name, String pwd, String remotedir) {
        try {
            if(!login(ip, port, name, pwd)){
                return false;
            }
            //获取ftp里面，指定文件夹 里面的文件名字，存入数组中
            FTPFile[] files = ftp.listFiles(remotedir);
            //打印出ftp里面，指定文件夹 里面的文件名字
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i].getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }finally{
            this.close();
        }
        return true;
    }


    /**
     * 上传文件 方法一
     * @param ip
     * @param port
     * @param name
     * @param pwd
     * @param remotepath 远程地址文件路径
     * @param localpath 本地文件路径
     * @return
     */
    public boolean putFileOne(String ip,int port, String name, String pwd,String remotepath,String localpath) {
        try {
            if(!login(ip, port, name, pwd)){
                return false;
            }
            //将本地的 localpath 文件上传到ftp的根目录文件夹下面，并重命名为 remotepath中的名字
            return ftp.storeFile(remotepath, new FileInputStream(new File(localpath)));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }finally{
            this.close();
        }
    }

    /**
     * 上传文件的第二种方法，优化了传输速度
     * @param ip
     * @param port
     * @param name
     * @param pwd
     * @param remotepath 远程地址文件路径
     * @param localpath 本地文件路径
     * @return
     */
    public boolean putFileTwo(String ip,int port, String name, String pwd,String remotepath,String localpath) {
        try {
            if(!login(ip, port, name, pwd)){
                return false;
            }
            os = ftp.storeFileStream(remotepath);
            fis = new FileInputStream(new File(localpath));
            byte[] b = new byte[1024];
            int len = 0;
            while ((len = fis.read(b)) != -1) {
                os.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }finally {
            this.close();
        }
        return true;
    }



    private void close(){

        if(ftp.isConnected()){
            try {
                ftp.disconnect();
            } catch (IOException e) {
            }
        }
        if(is != null){
            try {
                is.close();
            } catch (IOException e) {
            }
        }
        if(os != null){
            try {
                os.close();
            } catch (IOException e) {
            }
        }
        if(fis != null){
            try {
                fis.close();
            } catch (IOException e) {
            }
        }
        if(fos != null){
            try {
                fos.close();
            } catch (IOException e) {
            }
        }
    }

    public static void main(String[] args) {

        String ip = "120.27.164.229";
        int port = 13022;
        String name = "202109150001bill";
        String pass = "202109150001bill";
        String remotePath = "/mnt/customerbill/202109150001";
        FtpClientUtil ftpClientUtil = new FtpClientUtil();
        ftpClientUtil.getFilesName(ip,port, name,pass, remotePath);
    }
}
