package cn.xiaocai.demo.spider.web.listener;

import cn.xiaocai.demo.spider.web.controller.RulesData;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/1/9 11:47
 * @version: v1.0
 */

@Component
public class StartListener extends RulesData implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        System.out.println("项目启动成功");
    }
}
