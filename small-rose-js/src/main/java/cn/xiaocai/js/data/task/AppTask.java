package cn.xiaocai.js.data.task;

import cn.xiaocai.js.data.servce.ArticleRankTaskService;
import com.mashape.unirest.http.exceptions.UnirestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/7/30 23:36
 * @version: v1.0
 */
@Service
@Slf4j
public class AppTask {

    @Autowired
    private ArticleRankTaskService articleRankTaskService ;

    @Scheduled(cron = "0 0/20 0-2 * * ? ")
    public void shangHaiPlatformTask(){

        log.info("定时抓取文章排名任务开始执行！！");
        try {
            articleRankTaskService.catchRankData(null);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        log.info("定时抓取文章排名任务执行完成！！");
    }
}
