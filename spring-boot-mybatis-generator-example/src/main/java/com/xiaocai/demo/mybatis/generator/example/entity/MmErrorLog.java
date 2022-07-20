package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_error_log
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmErrorLog {
    /**
     * errorid
     */
    private Long errorid;

    /**
     * 所有者
     */
    private String owner;

    /**
     * some error information
     */
    private String info;

    /**
     * sql error code
     */
    private BigDecimal sqlcode;

    /**
     * sql error message
     */
    private String sqlerrm;

    /**
     * some error trace
     */
    private String trace;

    /**
     * 错误日志写表时间
     */
    private Date logdate;

    /**
     * 过程名
     */
    private String procname;

    /**
     * 关键字1,记录业务表的主键，放表定位错误
     */
    private String keyword1;

    /**
     * 关键字2,同上
     */
    private String keyword2;

    /**
     * 关键字3,同上
     */
    private String keyword3;

    /**
     * 关键字4,同上
     */
    private String keyword4;

    /**
    * 获取-errorid
    * @return errorid
     */
    public Long getErrorid() {
        return errorid;
    }

    /**
    * 设置-errorid
    * @paramType java.lang.Long
    * @param errorid - errorid
     */
    public void setErrorid(Long errorid) {
        this.errorid = errorid;
    }

    /**
    * 获取-所有者
    * @return owner
     */
    public String getOwner() {
        return owner;
    }

    /**
    * 设置-所有者
    * @paramType java.lang.String
    * @param owner - 所有者
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
    * 获取-some error information
    * @return info
     */
    public String getInfo() {
        return info;
    }

    /**
    * 设置-some error information
    * @paramType java.lang.String
    * @param info - some error information
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
    * 获取-sql error code
    * @return sqlcode
     */
    public BigDecimal getSqlcode() {
        return sqlcode;
    }

    /**
    * 设置-sql error code
    * @paramType java.math.BigDecimal
    * @param sqlcode - sql error code
     */
    public void setSqlcode(BigDecimal sqlcode) {
        this.sqlcode = sqlcode;
    }

    /**
    * 获取-sql error message
    * @return sqlerrm
     */
    public String getSqlerrm() {
        return sqlerrm;
    }

    /**
    * 设置-sql error message
    * @paramType java.lang.String
    * @param sqlerrm - sql error message
     */
    public void setSqlerrm(String sqlerrm) {
        this.sqlerrm = sqlerrm;
    }

    /**
    * 获取-some error trace
    * @return trace
     */
    public String getTrace() {
        return trace;
    }

    /**
    * 设置-some error trace
    * @paramType java.lang.String
    * @param trace - some error trace
     */
    public void setTrace(String trace) {
        this.trace = trace;
    }

    /**
    * 获取-错误日志写表时间
    * @return logdate
     */
    public Date getLogdate() {
        return logdate;
    }

    /**
    * 设置-错误日志写表时间
    * @paramType java.util.Date
    * @param logdate - 错误日志写表时间
     */
    public void setLogdate(Date logdate) {
        this.logdate = logdate;
    }

    /**
    * 获取-过程名
    * @return procname
     */
    public String getProcname() {
        return procname;
    }

    /**
    * 设置-过程名
    * @paramType java.lang.String
    * @param procname - 过程名
     */
    public void setProcname(String procname) {
        this.procname = procname;
    }

    /**
    * 获取-关键字1,记录业务表的主键，放表定位错误
    * @return keyword1
     */
    public String getKeyword1() {
        return keyword1;
    }

    /**
    * 设置-关键字1,记录业务表的主键，放表定位错误
    * @paramType java.lang.String
    * @param keyword1 - 关键字1,记录业务表的主键，放表定位错误
     */
    public void setKeyword1(String keyword1) {
        this.keyword1 = keyword1;
    }

    /**
    * 获取-关键字2,同上
    * @return keyword2
     */
    public String getKeyword2() {
        return keyword2;
    }

    /**
    * 设置-关键字2,同上
    * @paramType java.lang.String
    * @param keyword2 - 关键字2,同上
     */
    public void setKeyword2(String keyword2) {
        this.keyword2 = keyword2;
    }

    /**
    * 获取-关键字3,同上
    * @return keyword3
     */
    public String getKeyword3() {
        return keyword3;
    }

    /**
    * 设置-关键字3,同上
    * @paramType java.lang.String
    * @param keyword3 - 关键字3,同上
     */
    public void setKeyword3(String keyword3) {
        this.keyword3 = keyword3;
    }

    /**
    * 获取-关键字4,同上
    * @return keyword4
     */
    public String getKeyword4() {
        return keyword4;
    }

    /**
    * 设置-关键字4,同上
    * @paramType java.lang.String
    * @param keyword4 - 关键字4,同上
     */
    public void setKeyword4(String keyword4) {
        this.keyword4 = keyword4;
    }
}