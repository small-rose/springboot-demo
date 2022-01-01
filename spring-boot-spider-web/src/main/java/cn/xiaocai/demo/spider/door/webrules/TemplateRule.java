package cn.xiaocai.demo.spider.door.webrules;

import cn.xiaocai.demo.spider.door.baserules.BaseWebRule;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/29 23:43
 * @version: v1.0
 */
public class TemplateRule extends BaseWebRule {


    public TemplateRule(String doorUrl){
        this.doorUrl = doorUrl;
    }


    @Override
    public void check() {
        checkRules();
    }

    @Override
    protected void loadRule() {

    }
}
