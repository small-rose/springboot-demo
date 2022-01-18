package com.xiaocai.demo.quartz.tasks.service;

import com.xiaocai.demo.quartz.tasks.model.BuzBatchTask;

public interface ScheduleJobService {


    /**
     * 新增定时任务
     *
     * @param job 任务
     */
    void add(BuzBatchTask job);

    /**
     * 启动定时任务
     *
      * @param id 任务id
     */
    void start(int id);

    /**
     * 暂停定时任务
     *
     * @param id 任务id
     */
    void pause(int id);

    /**
     * 删除定时任务
     *
     * @param id 任务id
     */
    void delete(int id);

    /**
     * 启动所有定时任务
     *
     */
    void startAllJob();

    /**
     * 暂停所有定时任务
     *
     */
    void pauseAllJob();

}
