package com.xiaocai.demo.quartz.tasks.repository;

import com.xiaocai.demo.quartz.tasks.model.BuzBatchTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ BatchTaskTd ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/18 17:34
 * @Version ： 1.0
 **/
public interface BatchTaskTdRepository extends JpaRepository<BuzBatchTask, Integer> {


    @Query(value = "update mm_batch_task_td set status = ?2 where id =?1 ",
            nativeQuery = true)
    public int updateStatusById(int id, int status);



    @Query(value = "update mm_batch_task_td set deleteFlag = 1  where id =?1 ",
            nativeQuery = true)
    public int updateDeleteFlagById(int id);


    @Query(value = "update mm_batch_task_td set status = ?1 where deleteFlag = 0 ",
            nativeQuery = true)
    public int updateAllStatus(int status);
}
