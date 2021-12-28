package cn.xiaocai.demo.spider.door;


import cn.xiaocai.demo.spider.catcher.SpiderServer;
import cn.xiaocai.demo.spider.door.baserules.BaseWebRule;
import cn.xiaocai.demo.spider.door.webrules.MeituluCn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*import cn.xiaocai.demo.jsoup.spider.door.webrules.FulituCc;
import cn.xiaocai.demo.jsoup.spider.door.webrules.IvskyDoCom;*/

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 22:52
 * @version: v1.0
 */
public class SpiderMain {


    /**
     * 蜘蛛启动入口
     * @param args
     */
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        System.out.println("0）all web site ");
        System.out.println("1）https://www.ivsky.com/ ");
        System.out.println("2）https://www.fulitu.cc/ ");
        System.out.print("Enter a number: ");
        int num = 3 ; //ip.nextInt();
        ip.close();
        System.out.println("The input number is " + num);
        //Scanner path = new Scanner(System.in);
        //String downPath = path.nextLine();
        String downPath = "D:\\download\\";
        System.out.println("Default file path is : "+downPath);
        //path.close();
         // necessary to avoid memory leaks

        SpiderServer server = new SpiderServer();
        List<BaseWebRule> rules = new ArrayList<>();
        //https://pixabay.com/photos/search/?cat=travel&
        /*if (num==0 || num==1) {
            IvskyDoCom ivskyDoCom = new IvskyDoCom("https://www.ivsky.com/");
            ivskyDoCom.setThreadNameKey("ivsky");
            ivskyDoCom.setDownloadThreadNumbers(3); //下载图片线程数
            ivskyDoCom.setDownLoadPath(downPath);
            rules.add(ivskyDoCom);
        }
        if (num==0 || num==2) {
            FulituCc fulituCc = new FulituCc("https://www.fulitu.cc/");
            fulituCc.setThreadNameKey("fulitu");
            fulituCc.setDownloadThreadNumbers(1); //下载图片线程数
            fulituCc.setDownLoadPath(downPath);
            rules.add(fulituCc);
        }*/
        if (num==0 || num==3) {

            MeituluCn meituluCn = new MeituluCn("http://www.meitulu.cn");
            meituluCn.setThreadNameKey("meitulu");
            meituluCn.setDownloadThreadNumbers(1); //下载图片线程数
            meituluCn.setDownLoadPath(downPath);
            rules.add(meituluCn);
        }

        server.setRuleList(rules);
        server.start();

    }




}
