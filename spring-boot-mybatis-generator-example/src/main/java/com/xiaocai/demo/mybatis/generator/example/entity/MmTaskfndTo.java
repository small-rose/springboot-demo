package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_taskfnd_to
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTaskfndTo {
    /**
     * 主键
     */
    private Long id;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 数据类型：0再保账单，1再保结算单
     */
    private String certitype;

    /**
     * 状态：0初始状态，1成功，2失败
     */
    private String status;

    /**
     * 分保类型: 2 合约 4 临分 0再保 6销管手续费
     */
    private String contracttype;

    /**
    * 获取-主键
    * @return id
     */
    public Long getId() {
        return id;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param id - 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    * 获取-时间戳
    * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
    * 设置-时间戳
    * @paramType java.util.Date
    * @param timestamp - 时间戳
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
    * 获取-最后操作时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作时间
    * @paramType java.util.Date
    * @param lastopdate - 最后操作时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-数据类型：0再保账单，1再保结算单
    * @return certitype
     */
    public String getCertitype() {
        return certitype;
    }

    /**
    * 设置-数据类型：0再保账单，1再保结算单
    * @paramType java.lang.String
    * @param certitype - 数据类型：0再保账单，1再保结算单
     */
    public void setCertitype(String certitype) {
        this.certitype = certitype;
    }

    /**
    * 获取-状态：0初始状态，1成功，2失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态：0初始状态，1成功，2失败
    * @paramType java.lang.String
    * @param status - 状态：0初始状态，1成功，2失败
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-分保类型: 2 合约 4 临分 0再保 6销管手续费
    * @return contracttype
     */
    public String getContracttype() {
        return contracttype;
    }

    /**
    * 设置-分保类型: 2 合约 4 临分 0再保 6销管手续费
    * @paramType java.lang.String
    * @param contracttype - 分保类型: 2 合约 4 临分 0再保 6销管手续费
     */
    public void setContracttype(String contracttype) {
        this.contracttype = contracttype;
    }
}