package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_temp_policy_data_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTempPolicyDataTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 保单流水号
     */
    private Long seqpolicy;

    /**
     * 批次号
     */
    private Long listno;

    /**
     * 操作用户
     */
    private String opcode;

    /**
     * 操作日期
     */
    private Date opdate;

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
    * 获取-保单流水号
    * @return seqpolicy
     */
    public Long getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-保单流水号
    * @paramType java.lang.Long
    * @param seqpolicy - 保单流水号
     */
    public void setSeqpolicy(Long seqpolicy) {
        this.seqpolicy = seqpolicy;
    }

    /**
    * 获取-批次号
    * @return listno
     */
    public Long getListno() {
        return listno;
    }

    /**
    * 设置-批次号
    * @paramType java.lang.Long
    * @param listno - 批次号
     */
    public void setListno(Long listno) {
        this.listno = listno;
    }

    /**
    * 获取-操作用户
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作用户
    * @paramType java.lang.String
    * @param opcode - 操作用户
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-操作日期
    * @return opdate
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
    * 设置-操作日期
    * @paramType java.util.Date
    * @param opdate - 操作日期
     */
    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }
}