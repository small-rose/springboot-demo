package com.xiaocai.demo.java;


/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ HtmlDemoTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/1 9:38
 * @Version ： 1.0
 **/
public class HtmlDemoTest {


    public static void main(String[] args) {
        String result = createCertErrorLinkPage("90001|实名认证失败，上传的查询码非预确认状态。");
        System.out.println(result);
    }


    public static String createCertErrorLinkPage(String message) {
        StringBuffer messages = new StringBuffer();
        messages.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        messages.append("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
        messages.append("<head>");
        messages.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=GBK\" />");
        messages.append("<title>实名认证提示</title>");
        messages.append("</head>");
        messages.append("<body>");
        messages.append("<div style=\"height: 100px; margin-top:250px; 　margin：0 auto;  font-size: 14px;text-align:center\"></div>");
        messages.append(message);
        messages.append("</body></html>");
        return messages.toString();
    }


}
