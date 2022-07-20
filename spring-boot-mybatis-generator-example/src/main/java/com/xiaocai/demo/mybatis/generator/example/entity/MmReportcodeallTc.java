package com.xiaocai.demo.mybatis.generator.example.entity;

/**
 *  
 * @Table : mm_reportcodeall_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmReportcodeallTc {
    /**
     * 报送指标
     */
    private Long recode;

    /**
     * 报送机构
     */
    private String unitcode;

    /**
     * 报送指标名称
     */
    private String recname;

    /**
    * 获取-报送指标
    * @return recode
     */
    public Long getRecode() {
        return recode;
    }

    /**
    * 设置-报送指标
    * @paramType java.lang.Long
    * @param recode - 报送指标
     */
    public void setRecode(Long recode) {
        this.recode = recode;
    }

    /**
    * 获取-报送机构
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-报送机构
    * @paramType java.lang.String
    * @param unitcode - 报送机构
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    /**
    * 获取-报送指标名称
    * @return recname
     */
    public String getRecname() {
        return recname;
    }

    /**
    * 设置-报送指标名称
    * @paramType java.lang.String
    * @param recname - 报送指标名称
     */
    public void setRecname(String recname) {
        this.recname = recname;
    }
}