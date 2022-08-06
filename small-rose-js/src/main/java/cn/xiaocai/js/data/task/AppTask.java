package cn.xiaocai.js.data.task;

import cn.xiaocai.js.data.servce.ArticleRankTaskService;
import cn.xiaocai.js.data.servce.UpdateNickNameTaskService;
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
    @Autowired
    private UpdateNickNameTaskService updateNickNameTaskService ;


    @Scheduled(cron = "0 0/5 0-1 * * ? ")
    public void shangHaiPlatformTask(){

        log.info("定时抓取文章排名任务开始执行！！");
        try {
            articleRankTaskService.catchRankData(null);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        log.info("定时抓取文章排名任务执行完成！！");
    }

    //@Scheduled(cron = "0 0 0/1 * * ? ")
    @Scheduled(cron = "0 0/10 * * * ? ")
    public void updateNameTask(){

        log.info("定时更新昵称任务开始执行！！");
        try {
            updateNickNameTaskService.updateNickName(null);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        log.info("定时更新昵称任务执行完成！！");
    }



}
