package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_queryapply_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmQueryapplyTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * Q_CONTROL表主键
     */
    private Long qCApplyno;

    /**
     * 记录对应申请的提交人信息，用于提取结果实施的控制校验。数据类型跟相关的业务系统的代码的数据类型保持一致。 
     */
    private String opcode;

    /**
     * 记录对应申请的提交人信息，用于提取结果实施的控制校验。数据类型跟相关的业务系统的代码的数据类型保持一致。 
     */
    private String opunit;

    /**
     * 1.申请提交 2、处理中 3 完成  4 已提取 对于4 已提取，只有结果只允许一次提取时可能有用，一般情况下不用。
     */
    private String status;

    /**
     * 客户提交申请的时间。
     */
    private Date applydate;

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
    * 获取-Q_CONTROL表主键
    * @return qCApplyno
     */
    public Long getqCApplyno() {
        return qCApplyno;
    }

    /**
    * 设置-Q_CONTROL表主键
    * @paramType java.lang.Long
    * @param qCApplyno - Q_CONTROL表主键
     */
    public void setqCApplyno(Long qCApplyno) {
        this.qCApplyno = qCApplyno;
    }

    /**
    * 获取-记录对应申请的提交人信息，用于提取结果实施的控制校验。数据类型跟相关的业务系统的代码的数据类型保持一致。

    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-记录对应申请的提交人信息，用于提取结果实施的控制校验。数据类型跟相关的业务系统的代码的数据类型保持一致。

    * @paramType java.lang.String
    * @param opcode - 记录对应申请的提交人信息，用于提取结果实施的控制校验。数据类型跟相关的业务系统的代码的数据类型保持一致。

     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-记录对应申请的提交人信息，用于提取结果实施的控制校验。数据类型跟相关的业务系统的代码的数据类型保持一致。

    * @return opunit
     */
    public String getOpunit() {
        return opunit;
    }

    /**
    * 设置-记录对应申请的提交人信息，用于提取结果实施的控制校验。数据类型跟相关的业务系统的代码的数据类型保持一致。

    * @paramType java.lang.String
    * @param opunit - 记录对应申请的提交人信息，用于提取结果实施的控制校验。数据类型跟相关的业务系统的代码的数据类型保持一致。

     */
    public void setOpunit(String opunit) {
        this.opunit = opunit;
    }

    /**
    * 获取-1.申请提交 2、处理中 3 完成  4 已提取
对于4 已提取，只有结果只允许一次提取时可能有用，一般情况下不用。
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-1.申请提交 2、处理中 3 完成  4 已提取
对于4 已提取，只有结果只允许一次提取时可能有用，一般情况下不用。
    * @paramType java.lang.String
    * @param status - 1.申请提交 2、处理中 3 完成  4 已提取
对于4 已提取，只有结果只允许一次提取时可能有用，一般情况下不用。
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-客户提交申请的时间。
    * @return applydate
     */
    public Date getApplydate() {
        return applydate;
    }

    /**
    * 设置-客户提交申请的时间。
    * @paramType java.util.Date
    * @param applydate - 客户提交申请的时间。
     */
    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }
}