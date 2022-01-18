package com.xiaocai.demo.quartz.tasks.service.impl;

import com.xiaocai.demo.quartz.tasks.emun.JobOperateEnum;
import com.xiaocai.demo.quartz.tasks.model.BuzBatchTask;
import com.xiaocai.demo.quartz.tasks.service.BatchTaskService;
import com.xiaocai.demo.quartz.tasks.service.QuartzService;
import com.xiaocai.demo.quartz.tasks.service.ScheduleJobService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
public class ScheduleJobServiceImpl implements ScheduleJobService {


    @Autowired
    private QuartzService quartzService;
    @Autowired
    private BatchTaskService batchTaskService;

    @Override
    public void add(BuzBatchTask job) {

        //此处省去数据验证
        batchTaskService.save(job);
        //加入job
        try {
            quartzService.addJob(job);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @Override
    public void start(int id) {
        //此处省去数据验证
        BuzBatchTask job = batchTaskService.getById(id);
        job.setStatus(1);
        batchTaskService.updateStatusById(job);

        //执行job
        try {
            quartzService.operateJob(JobOperateEnum.START, job);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void pause(int id) {
        //此处省去数据验证
        BuzBatchTask job = batchTaskService.getById(id);
        job.setStatus(2);
        batchTaskService.updateStatusById(job);

        //执行job
        try {
            quartzService.operateJob(JobOperateEnum.PAUSE, job);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        //此处省去数据验证
        BuzBatchTask job = batchTaskService.getById(id);
        batchTaskService.removeById(id);

        //执行job
        try {
            quartzService.operateJob(JobOperateEnum.DELETE, job);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void startAllJob() {

        BuzBatchTask job = new BuzBatchTask();
        job.setStatus(1);
        batchTaskService.updateAllStatus(job);
        //执行job
        try {
            quartzService.startAllJob();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void pauseAllJob() {
        //此处省去数据验证
        BuzBatchTask job = new BuzBatchTask();
        job.setStatus(2);
        batchTaskService.updateAllStatus(job);

        //执行job
        try {
            quartzService.pauseAllJob();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }


}
