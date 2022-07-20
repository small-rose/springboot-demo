package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_menu_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmMenuTc {
    /**
     * 菜单主键
     */
    private Long menuid;

    /**
     * 菜单名称
     */
    private String menuname;

    /**
     * 菜单活动
     */
    private String menuaction;

    /**
     * 菜单标签
     */
    private String menulabel;

    /**
     * 是否叶子菜单，0 否 1 是
     */
    private String isleaf;

    /**
     * 菜单级别
     */
    private BigDecimal menulevel;

    /**
     * 根节点编号
     */
    private String rootid;

    /**
     * 父节点编号
     */
    private String parentsid;

    /**
     * 显示顺序
     */
    private BigDecimal displayorder;

    /**
     * 菜单序号，本系统给这个字段增加了一个唯一索引 新增字段，作为菜单层次级别序号 
     */
    private String menuseq;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 图标显示路径
     */
    private String icopath;

    /**
     * 是否忽略(0:忽略,1:可见)
     */
    private String visible;

    /**
    * 获取-菜单主键
    * @return menuid
     */
    public Long getMenuid() {
        return menuid;
    }

    /**
    * 设置-菜单主键
    * @paramType java.lang.Long
    * @param menuid - 菜单主键
     */
    public void setMenuid(Long menuid) {
        this.menuid = menuid;
    }

    /**
    * 获取-菜单名称
    * @return menuname
     */
    public String getMenuname() {
        return menuname;
    }

    /**
    * 设置-菜单名称
    * @paramType java.lang.String
    * @param menuname - 菜单名称
     */
    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    /**
    * 获取-菜单活动
    * @return menuaction
     */
    public String getMenuaction() {
        return menuaction;
    }

    /**
    * 设置-菜单活动
    * @paramType java.lang.String
    * @param menuaction - 菜单活动
     */
    public void setMenuaction(String menuaction) {
        this.menuaction = menuaction;
    }

    /**
    * 获取-菜单标签
    * @return menulabel
     */
    public String getMenulabel() {
        return menulabel;
    }

    /**
    * 设置-菜单标签
    * @paramType java.lang.String
    * @param menulabel - 菜单标签
     */
    public void setMenulabel(String menulabel) {
        this.menulabel = menulabel;
    }

    /**
    * 获取-是否叶子菜单，0 否 1 是
    * @return isleaf
     */
    public String getIsleaf() {
        return isleaf;
    }

    /**
    * 设置-是否叶子菜单，0 否 1 是
    * @paramType java.lang.String
    * @param isleaf - 是否叶子菜单，0 否 1 是
     */
    public void setIsleaf(String isleaf) {
        this.isleaf = isleaf;
    }

    /**
    * 获取-菜单级别
    * @return menulevel
     */
    public BigDecimal getMenulevel() {
        return menulevel;
    }

    /**
    * 设置-菜单级别
    * @paramType java.math.BigDecimal
    * @param menulevel - 菜单级别
     */
    public void setMenulevel(BigDecimal menulevel) {
        this.menulevel = menulevel;
    }

    /**
    * 获取-根节点编号
    * @return rootid
     */
    public String getRootid() {
        return rootid;
    }

    /**
    * 设置-根节点编号
    * @paramType java.lang.String
    * @param rootid - 根节点编号
     */
    public void setRootid(String rootid) {
        this.rootid = rootid;
    }

    /**
    * 获取-父节点编号
    * @return parentsid
     */
    public String getParentsid() {
        return parentsid;
    }

    /**
    * 设置-父节点编号
    * @paramType java.lang.String
    * @param parentsid - 父节点编号
     */
    public void setParentsid(String parentsid) {
        this.parentsid = parentsid;
    }

    /**
    * 获取-显示顺序
    * @return displayorder
     */
    public BigDecimal getDisplayorder() {
        return displayorder;
    }

    /**
    * 设置-显示顺序
    * @paramType java.math.BigDecimal
    * @param displayorder - 显示顺序
     */
    public void setDisplayorder(BigDecimal displayorder) {
        this.displayorder = displayorder;
    }

    /**
    * 获取-菜单序号，本系统给这个字段增加了一个唯一索引 新增字段，作为菜单层次级别序号 
    * @return menuseq
     */
    public String getMenuseq() {
        return menuseq;
    }

    /**
    * 设置-菜单序号，本系统给这个字段增加了一个唯一索引 新增字段，作为菜单层次级别序号 
    * @paramType java.lang.String
    * @param menuseq - 菜单序号，本系统给这个字段增加了一个唯一索引 新增字段，作为菜单层次级别序号 
     */
    public void setMenuseq(String menuseq) {
        this.menuseq = menuseq;
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
    * 获取-手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-图标显示路径
    * @return icopath
     */
    public String getIcopath() {
        return icopath;
    }

    /**
    * 设置-图标显示路径
    * @paramType java.lang.String
    * @param icopath - 图标显示路径
     */
    public void setIcopath(String icopath) {
        this.icopath = icopath;
    }

    /**
    * 获取-是否忽略(0:忽略,1:可见)
    * @return visible
     */
    public String getVisible() {
        return visible;
    }

    /**
    * 设置-是否忽略(0:忽略,1:可见)
    * @paramType java.lang.String
    * @param visible - 是否忽略(0:忽略,1:可见)
     */
    public void setVisible(String visible) {
        this.visible = visible;
    }
}