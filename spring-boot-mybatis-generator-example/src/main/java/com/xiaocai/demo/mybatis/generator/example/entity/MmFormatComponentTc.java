package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_format_component_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmFormatComponentTc {
    /**
     * 主键
     */
    private Long componentid;

    /**
     * 格式id
     */
    private BigDecimal formatid;

    /**
     * 组成部分类型：header 、body、tail
     */
    private String componenttype;

    /**
     * 组成部分的显示顺序
     */
    private BigDecimal displayorder;

    /**
     * 银行要求的格式中是否需要加格式代码 0否 1是 
     */
    private BigDecimal isadd;

    /**
     * 格式与数据分隔符
     */
    private String split;

    /**
     * 操作员
     */
    private String opcode;

    /**
     * 最后操作人代码
     */
    private String lastopcode;

    /**
     * 创建时间
     */
    private Date createdate;

    /**
     * 操作日期
     */
    private Date lastopdate;

    /**
     * 人工修改数据描述
     */
    private String modifydesc;

    /**
     * HIBERNATEVERSION版本
     */
    private Integer hibernateversion;

    /**
     * 组成部分的元素是使用通过一行来显示，还是根据列来显示，行 ：row 、列：column
     */
    private String cellshowtype;

    /**
     * 数据来源方式：写对应的java类在工程的包路径，可用于Class.forName().
     */
    private String datagettype;

    /**
    * 获取-主键
    * @return componentid
     */
    public Long getComponentid() {
        return componentid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param componentid - 主键
     */
    public void setComponentid(Long componentid) {
        this.componentid = componentid;
    }

    /**
    * 获取-格式id
    * @return formatid
     */
    public BigDecimal getFormatid() {
        return formatid;
    }

    /**
    * 设置-格式id
    * @paramType java.math.BigDecimal
    * @param formatid - 格式id
     */
    public void setFormatid(BigDecimal formatid) {
        this.formatid = formatid;
    }

    /**
    * 获取-组成部分类型：header 、body、tail
    * @return componenttype
     */
    public String getComponenttype() {
        return componenttype;
    }

    /**
    * 设置-组成部分类型：header 、body、tail
    * @paramType java.lang.String
    * @param componenttype - 组成部分类型：header 、body、tail
     */
    public void setComponenttype(String componenttype) {
        this.componenttype = componenttype;
    }

    /**
    * 获取-组成部分的显示顺序
    * @return displayorder
     */
    public BigDecimal getDisplayorder() {
        return displayorder;
    }

    /**
    * 设置-组成部分的显示顺序
    * @paramType java.math.BigDecimal
    * @param displayorder - 组成部分的显示顺序
     */
    public void setDisplayorder(BigDecimal displayorder) {
        this.displayorder = displayorder;
    }

    /**
    * 获取-银行要求的格式中是否需要加格式代码 0否 1是 
    * @return isadd
     */
    public BigDecimal getIsadd() {
        return isadd;
    }

    /**
    * 设置-银行要求的格式中是否需要加格式代码 0否 1是 
    * @paramType java.math.BigDecimal
    * @param isadd - 银行要求的格式中是否需要加格式代码 0否 1是 
     */
    public void setIsadd(BigDecimal isadd) {
        this.isadd = isadd;
    }

    /**
    * 获取-格式与数据分隔符
    * @return split
     */
    public String getSplit() {
        return split;
    }

    /**
    * 设置-格式与数据分隔符
    * @paramType java.lang.String
    * @param split - 格式与数据分隔符
     */
    public void setSplit(String split) {
        this.split = split;
    }

    /**
    * 获取-操作员
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作员
    * @paramType java.lang.String
    * @param opcode - 操作员
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-最后操作人代码
    * @return lastopcode
     */
    public String getLastopcode() {
        return lastopcode;
    }

    /**
    * 设置-最后操作人代码
    * @paramType java.lang.String
    * @param lastopcode - 最后操作人代码
     */
    public void setLastopcode(String lastopcode) {
        this.lastopcode = lastopcode;
    }

    /**
    * 获取-创建时间
    * @return createdate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
    * 设置-创建时间
    * @paramType java.util.Date
    * @param createdate - 创建时间
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
    * 获取-操作日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-操作日期
    * @paramType java.util.Date
    * @param lastopdate - 操作日期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-人工修改数据描述
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-人工修改数据描述
    * @paramType java.lang.String
    * @param modifydesc - 人工修改数据描述
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-HIBERNATEVERSION版本
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATEVERSION版本
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATEVERSION版本
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-组成部分的元素是使用通过一行来显示，还是根据列来显示，行 ：row 、列：column
    * @return cellshowtype
     */
    public String getCellshowtype() {
        return cellshowtype;
    }

    /**
    * 设置-组成部分的元素是使用通过一行来显示，还是根据列来显示，行 ：row 、列：column
    * @paramType java.lang.String
    * @param cellshowtype - 组成部分的元素是使用通过一行来显示，还是根据列来显示，行 ：row 、列：column
     */
    public void setCellshowtype(String cellshowtype) {
        this.cellshowtype = cellshowtype;
    }

    /**
    * 获取-数据来源方式：写对应的java类在工程的包路径，可用于Class.forName().
    * @return datagettype
     */
    public String getDatagettype() {
        return datagettype;
    }

    /**
    * 设置-数据来源方式：写对应的java类在工程的包路径，可用于Class.forName().
    * @paramType java.lang.String
    * @param datagettype - 数据来源方式：写对应的java类在工程的包路径，可用于Class.forName().
     */
    public void setDatagettype(String datagettype) {
        this.datagettype = datagettype;
    }
}