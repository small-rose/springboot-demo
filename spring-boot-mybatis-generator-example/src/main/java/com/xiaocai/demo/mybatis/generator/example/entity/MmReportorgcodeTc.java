package com.xiaocai.demo.mybatis.generator.example.entity;

/**
 *  
 * @Table : mm_reportorgcode_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmReportorgcodeTc {
    /**
     * 报表mm_data_report机构代码
     */
    private Long subDeptCde;

    /**
     * 报表所需的机构代码
     */
    private String repDptCde;

    /**
     * 报表机构层级
     */
    private String cLevel;

    /**
     * 是否，1有效
     */
    private String cIfvalid;

    /**
     * 备用字段1
     */
    private String cFree1;

    /**
     * 备用字段2
     */
    private String cFree2;

    /**
     * 备用字段3
     */
    private String cFree3;

    /**
    * 获取-报表mm_data_report机构代码
    * @return subDeptCde
     */
    public Long getSubDeptCde() {
        return subDeptCde;
    }

    /**
    * 设置-报表mm_data_report机构代码
    * @paramType java.lang.Long
    * @param subDeptCde - 报表mm_data_report机构代码
     */
    public void setSubDeptCde(Long subDeptCde) {
        this.subDeptCde = subDeptCde;
    }

    /**
    * 获取-报表所需的机构代码
    * @return repDptCde
     */
    public String getRepDptCde() {
        return repDptCde;
    }

    /**
    * 设置-报表所需的机构代码
    * @paramType java.lang.String
    * @param repDptCde - 报表所需的机构代码
     */
    public void setRepDptCde(String repDptCde) {
        this.repDptCde = repDptCde;
    }

    /**
    * 获取-报表机构层级
    * @return cLevel
     */
    public String getcLevel() {
        return cLevel;
    }

    /**
    * 设置-报表机构层级
    * @paramType java.lang.String
    * @param cLevel - 报表机构层级
     */
    public void setcLevel(String cLevel) {
        this.cLevel = cLevel;
    }

    /**
    * 获取-是否，1有效
    * @return cIfvalid
     */
    public String getcIfvalid() {
        return cIfvalid;
    }

    /**
    * 设置-是否，1有效
    * @paramType java.lang.String
    * @param cIfvalid - 是否，1有效
     */
    public void setcIfvalid(String cIfvalid) {
        this.cIfvalid = cIfvalid;
    }

    /**
    * 获取-备用字段1
    * @return cFree1
     */
    public String getcFree1() {
        return cFree1;
    }

    /**
    * 设置-备用字段1
    * @paramType java.lang.String
    * @param cFree1 - 备用字段1
     */
    public void setcFree1(String cFree1) {
        this.cFree1 = cFree1;
    }

    /**
    * 获取-备用字段2
    * @return cFree2
     */
    public String getcFree2() {
        return cFree2;
    }

    /**
    * 设置-备用字段2
    * @paramType java.lang.String
    * @param cFree2 - 备用字段2
     */
    public void setcFree2(String cFree2) {
        this.cFree2 = cFree2;
    }

    /**
    * 获取-备用字段3
    * @return cFree3
     */
    public String getcFree3() {
        return cFree3;
    }

    /**
    * 设置-备用字段3
    * @paramType java.lang.String
    * @param cFree3 - 备用字段3
     */
    public void setcFree3(String cFree3) {
        this.cFree3 = cFree3;
    }
}