package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_error_bankinpayment_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmErrorBankinpaymentTi {
    /**
     * 主键
     */
    private String errorid;

    /**
     * 记录时间
     */
    private Date createtime;

    /**
     * 出错状态  0 为获取入参属性有空  1 存储错误  2以解决 3入参有误
     */
    private String errorstatus;

    /**
     * 出错字段名称或者出错原因
     */
    private String errorfiledname;

    /**
    * 获取-主键
    * @return errorid
     */
    public String getErrorid() {
        return errorid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.String
    * @param errorid - 主键
     */
    public void setErrorid(String errorid) {
        this.errorid = errorid;
    }

    /**
    * 获取-记录时间
    * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
    * 设置-记录时间
    * @paramType java.util.Date
    * @param createtime - 记录时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
    * 获取-出错状态  0 为获取入参属性有空  1 存储错误  2以解决 3入参有误
    * @return errorstatus
     */
    public String getErrorstatus() {
        return errorstatus;
    }

    /**
    * 设置-出错状态  0 为获取入参属性有空  1 存储错误  2以解决 3入参有误
    * @paramType java.lang.String
    * @param errorstatus - 出错状态  0 为获取入参属性有空  1 存储错误  2以解决 3入参有误
     */
    public void setErrorstatus(String errorstatus) {
        this.errorstatus = errorstatus;
    }

    /**
    * 获取-出错字段名称或者出错原因
    * @return errorfiledname
     */
    public String getErrorfiledname() {
        return errorfiledname;
    }

    /**
    * 设置-出错字段名称或者出错原因
    * @paramType java.lang.String
    * @param errorfiledname - 出错字段名称或者出错原因
     */
    public void setErrorfiledname(String errorfiledname) {
        this.errorfiledname = errorfiledname;
    }
}