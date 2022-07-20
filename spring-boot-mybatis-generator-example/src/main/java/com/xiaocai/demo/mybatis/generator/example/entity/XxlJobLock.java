package com.xiaocai.demo.mybatis.generator.example.entity;

/**
 *  
 * @Table : xxl_job_lock
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class XxlJobLock {
    /**
     * 锁名称
     */
    private String lockName;

    /**
    * 获取-锁名称
    * @return lockName
     */
    public String getLockName() {
        return lockName;
    }

    /**
    * 设置-锁名称
    * @paramType java.lang.String
    * @param lockName - 锁名称
     */
    public void setLockName(String lockName) {
        this.lockName = lockName;
    }
}