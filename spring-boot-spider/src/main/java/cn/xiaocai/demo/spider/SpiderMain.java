package cn.xiaocai.demo.spider;


import cn.xiaocai.demo.spider.catcher.SpiderServer;
import cn.xiaocai.demo.spider.door.SpiderUI;

import java.io.FileNotFoundException;

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

        //loadOuterRules();

        SpiderUI spiderUI = new SpiderUI();
        spiderUI.init(args);
        spiderUI.choose(3);
        SpiderServer server = new SpiderServer();

        server.setRuleList(SpiderUI.rules);
        server.start();
    }




    private static void loadOuterRules() {

        try {
            //LoadRulesHelper.loadProperties();
            //LoadRulesHelper.loadYml();
            LoadRulesHelper.saveYml();
            System.out.println(LoadRulesHelper.rules);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
