package cn.xiaocai.demo.spider.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ RegexUtil ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/23 12:04
 * @Version ： 1.0
 **/
public class RegexUtil {
    private final static String	URL = "^(http|https|ftp)\\://([a-zA-Z0-9\\.\\-]+(\\:[a-zA-Z0-9\\.&%\\$\\-]+)*@)?((25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[0-9])|([a-zA-Z0-9\\-]+\\.)*[a-zA-Z0-9\\-]+\\.[a-zA-Z]{2,4})(\\:[0-9]+)?(/[^/][a-zA-Z0-9\\.\\,\\?\\'\\/\\+&%\\$#\\=~_\\-@]*)*$";
    /**
     * check url is ok
     * @param url
     * @return
     */
    public static boolean isUrl(String url){
        if(url.endsWith("/")){
            return false;
        }
        if(url==null || url.trim().equals("")){
            return false;
        }
        Pattern pattern = Pattern.compile(URL) ;
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }

    private final static String reg = "/.(gif|jpg|jpeg|png|GIF|JPG|PNG|JPEG)$/";
    private final static String pic_suffixs [] = {".gif",".gif",".jpg",".jpeg",".png",".GIF",".JPG",".PNG",".JPEG"};

    public static boolean isPicLink(String link){
        //System.out.println(" isPicLink " +link);
        if(link==null || link.trim().equals("")){
            return false;
        }
        for(String suff :pic_suffixs){
            if(link.contains(suff)){
                return true;
            }
        }
        return false;
    }

    /**
     * 是否图片后缀结尾
     */
    public static boolean isEndWithImgSuffix(String link){
        //System.out.println(" isPicLink " +link);
        if(link==null || link.trim().equals("")){
            return false;
        }
        for(String suff :pic_suffixs){
            if(link.endsWith(suff)){
                return true;
            }
        }
        return false;
    }

    public static String getPicNameWithImgSuffix(String link){
        //System.out.println(" isPicLink " +link);
        String imgName = "";
        if(link==null || link.trim().equals("")){
            return imgName;
        }
        String tmpLink = "";
        for(String suff :pic_suffixs){
            if(link.contains(suff)){
                tmpLink = link.substring(0,link.lastIndexOf(suff)+suff.length());
                imgName = tmpLink.substring(tmpLink.lastIndexOf("/")+1);
                return imgName;
            }
        }
        return imgName;
    }

    private final static String File_Name = "(?!((^(con)$)|^(con)\\..*|(^(prn)$)|^(prn)/..*|(^(aux)$)|^(aux)/..*|(^(nul)$)|^(nul)/..*|(^(com)[1-9]$)|^(com)[1-9]/..*|(^(lpt)[1-9]$)|^(lpt)[1-9]/..*)|^/s+|.*/s$)(^[^/////:/*/?\\'</>/|]{1,255}$)";
    /**
     * check file name is ok
     * @param fileName
     * @return
     */
    public static boolean isFileName(String fileName){
        if(fileName==null || fileName.trim().equals("")){
            return false;
        }
        Pattern pattern = Pattern.compile(File_Name) ;
        Matcher matcher = pattern.matcher(fileName);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String fileName = "14574.jpg";
        System.out.println("fileName-->" +isFileName(fileName));
        String isUrl = "mailto:hgl198065@21cn.com";
        System.out.println("isUrl-->" +isUrl(isUrl));
        String link = "http://www.aisiren.com/meitui/uptupian3/201709/2017092421553022.jpg ";
        System.out.println("link-->" +isPicLink(link));

        String linkimg = "http://bpic.588ku.com/back_pic/04/89/17/9258f8bebbaf1eb.jpg!r850/fw/800";
        System.out.println("link-->" +getPicNameWithImgSuffix(linkimg));
    }
}
