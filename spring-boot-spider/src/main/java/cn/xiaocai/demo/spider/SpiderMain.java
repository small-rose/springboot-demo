package cn.xiaocai.demo.spider;


import cn.xiaocai.demo.spider.catcher.SpiderServer;
import cn.xiaocai.demo.spider.door.baserules.BaseWebRule;
import cn.xiaocai.demo.spider.door.webrules.FulituCc;
import cn.xiaocai.demo.spider.door.webrules.MeituluCn;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
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

    static  List<BaseWebRule> rules = new ArrayList<>();

    static String downPath = "D:\\download\\";
    static String categoryKey = "";

    /**
     * 蜘蛛启动入口
     * @param args
     */
    public static void main(String[] args) {

        loadOuterRules();

        if (!StringUtils.isEmpty(args) && args.length>0){
            String path = args[0] ;
            if (!"default".equalsIgnoreCase(path)){
                downPath = path ;
                File file = new File(downPath);
                if ( !file.isDirectory() || (!file.exists() && file.mkdirs())){
                    throw  new IllegalArgumentException("args参数异常[ 文件路径]");
                }
            }

            if (args.length>1){
                categoryKey = args[1] ;
            }
        }
        System.out.println("----------------------------");
        if (StringUtils.hasText(categoryKey)) {
            System.out.println("只下载分类 【down category keys】 : " + categoryKey);
        }
        System.out.println("文件默认下载路径【down file path】 : "+downPath);
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------- ");
        System.out.println("0）Exit ");
        System.out.println("1）https://www.fulitu.cc/");
        System.out.println("2）https://www.meizitu.cn/");
        System.out.println("tips : java -jar spiderMan-v.1.4.0.jar [file download path] [categoey keys] ");
        System.out.println("默认路径下载所有分类 : java -jar spiderMan-v.1.4.0.jar   ");
        System.out.println("默认路径下载指定分类 : java -jar spiderMan-v.1.4.0.jar  default  JK制服");
        System.out.println("默认路径下载N个分类 : java -jar spiderMan-v.1.4.0.jar  default  JK制服+黑丝 ");
        System.out.println("自定义下载路径 : java -jar spiderMan-v.1.4.0.jar  c:\\download   ");
        System.out.println("自定义下载路径和分类. : java -jar spiderMan-v.1.4.0.jar  c:\\download  JK制服 ");
        System.out.println("自定义下载路径和多个分类. : java -jar spiderMan-v.1.4.0.jar  c:\\download  JK制服+黑丝 ");
        System.out.println("输入序号后回车");
        System.out.println("----------------------------");



        //int num = 1 ;
        int num = input.nextInt();

        System.out.println("The input number is " + num);
        //input.close();
        //Scanner path = new Scanner(System.in);
        //String downPath = path.nextLine();


        //path.close();

        SpiderServer server = new SpiderServer();

        switch (num){
           case 1 :
               FulituCc fulituCc = new FulituCc("https://www.fulitu.cc/");
               fulituCc.setThreadNameKey("fulitu");
               fulituCc.setDownloadThreadNumbers(1); //下载图片线程数
               fulituCc.setDownLoadPath(downPath);
               fulituCc.setCategoryKeys(categoryKey);
               rules.add(fulituCc);
               break;
           case 2 :

               MeituluCn meituluCn = new MeituluCn("http://www.meitulu.cn");
               meituluCn.setThreadNameKey("meitulu");
               meituluCn.setDownloadThreadNumbers(1); //下载图片线程数
               meituluCn.setDownLoadPath(downPath);
               meituluCn.setCategoryKeys(categoryKey);

               rules.add(meituluCn);
                break;
           default:
               System.out.println("Have a nice day ! ");
               System.exit(0);
        }



        server.setRuleList(rules);
        server.start();

    }

    private static void loadOuterRules() {

        try {
            //LoadRulesHelper.loadProperties();
            LoadRulesHelper.loadYml();

            System.out.println(LoadRulesHelper.rules);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
