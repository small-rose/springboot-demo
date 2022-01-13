package cn.xiaocai.demo.spider.web.listener;

import cn.xiaocai.demo.spider.web.controller.RulesData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/1/9 11:47
 * @version: v1.0
 */

@Slf4j
@Component
public class StopListener extends RulesData implements ApplicationListener<ContextClosedEvent> {



    // 监听kill pid     无法监听 kill -9 pid
    @Override
    public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
        log.info("App is stopping , begin save your custom data ...");


        log.info("App is stopping , save your custom data success !");

    }
}
