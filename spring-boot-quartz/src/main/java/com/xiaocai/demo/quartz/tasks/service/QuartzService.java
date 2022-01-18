package com.xiaocai.demo.quartz.tasks.service;

import com.xiaocai.demo.quartz.tasks.emun.JobOperateEnum;
import com.xiaocai.demo.quartz.tasks.model.BuzBatchTask;
import org.quartz.SchedulerException;

public interface QuartzService {


    public void timingTask();


    public void addJob(BuzBatchTask job);


    public void operateJob(JobOperateEnum jobOperateEnum, BuzBatchTask job) throws SchedulerException;



    public void startAllJob() throws SchedulerException ;



    public void pauseAllJob() throws SchedulerException  ;
}
