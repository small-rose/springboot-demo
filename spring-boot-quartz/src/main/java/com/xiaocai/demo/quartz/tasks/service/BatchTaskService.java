package com.xiaocai.demo.quartz.tasks.service;

import com.xiaocai.demo.quartz.tasks.model.BuzBatchTask;
import com.xiaocai.demo.quartz.tasks.repository.BatchTaskTdRepository;
import com.xiaocai.demo.quartz.tasks.vo.BatchTaskQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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

    public Page<BuzBatchTask> listAll(Pageable pageable, BatchTaskQuery batchTaskQuery){
        BuzBatchTask queryVo = new BuzBatchTask();
        if (StringUtils.hasText(batchTaskQuery.getSearchKey())){
            queryVo.setJobDesc(batchTaskQuery.getSearchKey());
            queryVo.setJobName(batchTaskQuery.getSearchKey());
        }
        queryVo.setDeleteFlag(0);
        // 自定义匹配策略
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnorePaths("id")//忽略字段，即不管password是什么值都不加入查询条件
                .withIgnorePaths("status")//忽略字段，即不管password是什么值都不加入查询条件
                .withIgnorePaths("creatorId");//忽略字段，即不管password是什么值都不加入查询条件

        if (StringUtils.hasText(batchTaskQuery.getSearchKey())){
            matcher.withMatcher("jobName", ExampleMatcher.GenericPropertyMatchers.contains())
                    .withMatcher("jobDesc" ,ExampleMatcher.GenericPropertyMatchers.contains());//全部模糊查询，即%{web_url}%

        }
        Example<BuzBatchTask> example = Example.of(queryVo , matcher);

        return batchTaskTdRepository.findAll(example, pageable);
    }

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
        return batchTaskTdRepository.getOne(id);
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

    public BuzBatchTask update(BuzBatchTask batchTask) {
        BuzBatchTask batchReord = batchTaskTdRepository.getOne(batchTask.getId());
        if (batchTask != null) {
            // 只让修改
            batchTask.setJobDesc(batchTask.getJobDesc());
            batchReord.setCronExpression(batchTask.getCronExpression());
        }

        return batchTaskTdRepository.saveAndFlush(batchReord);
    }
}
