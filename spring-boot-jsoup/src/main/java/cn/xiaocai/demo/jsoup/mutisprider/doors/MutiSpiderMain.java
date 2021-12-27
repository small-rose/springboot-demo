package cn.xiaocai.demo.jsoup.mutisprider.doors;

import cn.xiaocai.demo.jsoup.mutisprider.doors.server.MutiSpiderServer;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ MutiSpiderMain ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/27 15:01
 * @Version ： 1.0
 **/
public class MutiSpiderMain {

    public static void main(String[] args) {
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println(processors);
        MutiSpiderServer spider  = new MutiSpiderServer();
        spider.start();
    }
}
