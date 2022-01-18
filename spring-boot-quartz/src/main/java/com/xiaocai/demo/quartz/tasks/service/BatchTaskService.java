package com.xiaocai.demo.quartz.tasks.service;

import com.xiaocai.demo.quartz.tasks.model.BuzBatchTask;
import com.xiaocai.demo.quartz.tasks.repository.BatchTaskTdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ JobTaskService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/18 17:13
 * @Version ： 1.0
 **/
@Service
public class BatchTaskService {

    @Autowired
    private BatchTaskTdRepository batchTaskTdRepository ;


    public List<BuzBatchTask> listAll(){
        BuzBatchTask queryVo = new BuzBatchTask();
        queryVo.setDeleteFlag(0);
        Example<BuzBatchTask> example = Example.of(queryVo);
        return batchTaskTdRepository.findAll(example);
    }

    public BuzBatchTask save(BuzBatchTask job) {
        return batchTaskTdRepository.save(job);
    }

    public BuzBatchTask getById(int id) {
        return batchTaskTdRepository.getById(id);
    }

    public int updateStatusById(BuzBatchTask job) {
        return batchTaskTdRepository.updateStatusById(job.getId(), job.getStatus());
    }

    public int removeById(int id) {
        return batchTaskTdRepository.updateDeleteFlagById(id);
    }

    public List<BuzBatchTask> findAll(BuzBatchTask task) {
        BuzBatchTask queryVo = new BuzBatchTask();
        queryVo.setDeleteFlag(0);
        Example<BuzBatchTask> example = Example.of(queryVo);
        return batchTaskTdRepository.findAll(example);
    }

    public int updateAllStatus(BuzBatchTask job) {

        return batchTaskTdRepository.updateAllStatus(job.getStatus());
    }
}
