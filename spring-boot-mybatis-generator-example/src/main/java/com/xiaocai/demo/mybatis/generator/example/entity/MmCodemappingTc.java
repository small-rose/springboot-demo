package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_codemapping_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmCodemappingTc {
    /**
     * 主键
     */
    private Long id;

    /**
     * 代码类型： 1,src=业务险种－dest=财务险种 2,src=财务险种-dest=打印项目 3,src=车险车辆类别-dest=税局车辆类别 4,src=单证类型 5,src=开具方式-dest=查询时效
     */
    private String codetype;

    /**
     * 老的代码
     */
    private String oldcode;

    /**
     * 老代码对应的新代码
     */
    private String newcode;

    /**
     * 时间戳
     */
    private Date createdate;

    /**
     * 修改说明
     */
    private String modifydesc;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * 摘要
     */
    private String description;

    /**
     * 最后操作员代码
     */
    private String lastopcode;

    /**
     * 是否生效
     */
    private String ifvalid;

    /**
     * 参考信息1  辅助定位映射关系的参考要素，不是必须要有的。如果oldcode和newcode是一一对应关系的则不需要填reference
     */
    private String reference1;

    /**
     * 参考信息2
     */
    private String reference2;

    /**
     * 参考信息3
     */
    private String reference3;

    /**
     * 参考信息4
     */
    private String reference4;

    /**
     * 工号
     */
    private String opcode;

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
    * 获取-代码类型：
1,src=业务险种－dest=财务险种
2,src=财务险种-dest=打印项目
3,src=车险车辆类别-dest=税局车辆类别
4,src=单证类型
5,src=开具方式-dest=查询时效
    * @return codetype
     */
    public String getCodetype() {
        return codetype;
    }

    /**
    * 设置-代码类型：
1,src=业务险种－dest=财务险种
2,src=财务险种-dest=打印项目
3,src=车险车辆类别-dest=税局车辆类别
4,src=单证类型
5,src=开具方式-dest=查询时效
    * @paramType java.lang.String
    * @param codetype - 代码类型：
1,src=业务险种－dest=财务险种
2,src=财务险种-dest=打印项目
3,src=车险车辆类别-dest=税局车辆类别
4,src=单证类型
5,src=开具方式-dest=查询时效
     */
    public void setCodetype(String codetype) {
        this.codetype = codetype;
    }

    /**
    * 获取-老的代码
    * @return oldcode
     */
    public String getOldcode() {
        return oldcode;
    }

    /**
    * 设置-老的代码
    * @paramType java.lang.String
    * @param oldcode - 老的代码
     */
    public void setOldcode(String oldcode) {
        this.oldcode = oldcode;
    }

    /**
    * 获取-老代码对应的新代码
    * @return newcode
     */
    public String getNewcode() {
        return newcode;
    }

    /**
    * 设置-老代码对应的新代码
    * @paramType java.lang.String
    * @param newcode - 老代码对应的新代码
     */
    public void setNewcode(String newcode) {
        this.newcode = newcode;
    }

    /**
    * 获取-时间戳
    * @return createdate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
    * 设置-时间戳
    * @paramType java.util.Date
    * @param createdate - 时间戳
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
    * 获取-修改说明
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-修改说明
    * @paramType java.lang.String
    * @param modifydesc - 修改说明
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-HIBERNATE版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATE版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATE版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-最后操作日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作日期
    * @paramType java.util.Date
    * @param lastopdate - 最后操作日期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-摘要
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-摘要
    * @paramType java.lang.String
    * @param description - 摘要
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * 获取-最后操作员代码
    * @return lastopcode
     */
    public String getLastopcode() {
        return lastopcode;
    }

    /**
    * 设置-最后操作员代码
    * @paramType java.lang.String
    * @param lastopcode - 最后操作员代码
     */
    public void setLastopcode(String lastopcode) {
        this.lastopcode = lastopcode;
    }

    /**
    * 获取-是否生效
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否生效
    * @paramType java.lang.String
    * @param ifvalid - 是否生效
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
    }

    /**
    * 获取-参考信息1  辅助定位映射关系的参考要素，不是必须要有的。如果oldcode和newcode是一一对应关系的则不需要填reference
    * @return reference1
     */
    public String getReference1() {
        return reference1;
    }

    /**
    * 设置-参考信息1  辅助定位映射关系的参考要素，不是必须要有的。如果oldcode和newcode是一一对应关系的则不需要填reference
    * @paramType java.lang.String
    * @param reference1 - 参考信息1  辅助定位映射关系的参考要素，不是必须要有的。如果oldcode和newcode是一一对应关系的则不需要填reference
     */
    public void setReference1(String reference1) {
        this.reference1 = reference1;
    }

    /**
    * 获取-参考信息2
    * @return reference2
     */
    public String getReference2() {
        return reference2;
    }

    /**
    * 设置-参考信息2
    * @paramType java.lang.String
    * @param reference2 - 参考信息2
     */
    public void setReference2(String reference2) {
        this.reference2 = reference2;
    }

    /**
    * 获取-参考信息3
    * @return reference3
     */
    public String getReference3() {
        return reference3;
    }

    /**
    * 设置-参考信息3
    * @paramType java.lang.String
    * @param reference3 - 参考信息3
     */
    public void setReference3(String reference3) {
        this.reference3 = reference3;
    }

    /**
    * 获取-参考信息4
    * @return reference4
     */
    public String getReference4() {
        return reference4;
    }

    /**
    * 设置-参考信息4
    * @paramType java.lang.String
    * @param reference4 - 参考信息4
     */
    public void setReference4(String reference4) {
        this.reference4 = reference4;
    }

    /**
    * 获取-工号
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-工号
    * @paramType java.lang.String
    * @param opcode - 工号
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }
}