package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_taxout_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTaxoutTd {
    /**
     * 主键
     */
    private String seqtaxout;

    /**
     * 报税清单号
     */
    private String bsqdh;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 保单币种
     */
    private String basecurrencycode;

    /**
     * 业务部门
     */
    private String departmentcode;

    /**
     * 报税部门
     */
    private String bsdepartmentcode;

    /**
     * 申报日期
     */
    private Date opdate;

    /**
     * 报税日期
     */
    private Date bsdate;

    /**
     * 报税清单状态
     */
    private String bsqdstate;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
     * 申报金额
     */
    private BigDecimal sbje;

    /**
     * 代缴车辆数
     */
    private Long djvehnum;

    /**
     * 拒缴车辆数
     */
    private Long rejvehnum;

    /**
     * 减税车辆数
     */
    private Long jsvehnum;

    /**
     * 免税车辆数
     */
    private Long msvehnum;

    /**
     * 已完税车辆数
     */
    private Long wsvehnum;

    /**
     * 补缴车辆数
     */
    private Long bjvehnum;

    /**
     * 滞纳金车辆数
     */
    private Long znjvehnum;

    /**
     * 当年应纳税款总计
     */
    private BigDecimal yeartaxpaysum;

    /**
     * 当年实纳税款总计
     */
    private BigDecimal yearrealpaysum;

    /**
     * 往年应纳补缴税额总计
     */
    private BigDecimal lasyearynbjsum;

    /**
     * 往年实纳补缴税额总计
     */
    private BigDecimal lasyearsnbjsum;

    /**
     * 往年应纳滞纳金总计
     */
    private BigDecimal lasyearynznsum;

    /**
     * 往年实纳滞纳金总计
     */
    private BigDecimal lasyearsnznsum;

    /**
     * 申报单号
     */
    private String sbrjdh;

    /**
     * 拒绝单号
     */
    private String jjrjdh;

    /**
     * 版本号
     */
    private Long hibernateversion;

    /**
     * 插入时间
     */
    private Date timestamp;

    /**
     * 0正常报送数据 3作废数据 9深圳正常报送数据
     */
    private String opstatus;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过modifydesc is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 产生方式；0-表示从主表申报生成的申报单，1-表示从明细申报生成的申报单并且申报方式为签单;2-表示从明细申报生成的申报单并且申报方式为应收;3-表示从明细申报生成的申报单并且申报方式为实收;
     */
    private String createtype;

    /**
     * 1未报送 2已报送 3报送出错 4不报送
     */
    private String status;

    /**
     * 车船税临时确认中是否确认,0是未确认,1已确认
     */
    private String ifconfirm;

    /**
    * 获取-主键
    * @return seqtaxout
     */
    public String getSeqtaxout() {
        return seqtaxout;
    }

    /**
    * 设置-主键
    * @paramType java.lang.String
    * @param seqtaxout - 主键
     */
    public void setSeqtaxout(String seqtaxout) {
        this.seqtaxout = seqtaxout;
    }

    /**
    * 获取-报税清单号
    * @return bsqdh
     */
    public String getBsqdh() {
        return bsqdh;
    }

    /**
    * 设置-报税清单号
    * @paramType java.lang.String
    * @param bsqdh - 报税清单号
     */
    public void setBsqdh(String bsqdh) {
        this.bsqdh = bsqdh;
    }

    /**
    * 获取-分公司
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司
    * @paramType java.lang.String
    * @param subcompany - 分公司
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-保单币种
    * @return basecurrencycode
     */
    public String getBasecurrencycode() {
        return basecurrencycode;
    }

    /**
    * 设置-保单币种
    * @paramType java.lang.String
    * @param basecurrencycode - 保单币种
     */
    public void setBasecurrencycode(String basecurrencycode) {
        this.basecurrencycode = basecurrencycode;
    }

    /**
    * 获取-业务部门
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-业务部门
    * @paramType java.lang.String
    * @param departmentcode - 业务部门
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    /**
    * 获取-报税部门
    * @return bsdepartmentcode
     */
    public String getBsdepartmentcode() {
        return bsdepartmentcode;
    }

    /**
    * 设置-报税部门
    * @paramType java.lang.String
    * @param bsdepartmentcode - 报税部门
     */
    public void setBsdepartmentcode(String bsdepartmentcode) {
        this.bsdepartmentcode = bsdepartmentcode;
    }

    /**
    * 获取-申报日期
    * @return opdate
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
    * 设置-申报日期
    * @paramType java.util.Date
    * @param opdate - 申报日期
     */
    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }

    /**
    * 获取-报税日期
    * @return bsdate
     */
    public Date getBsdate() {
        return bsdate;
    }

    /**
    * 设置-报税日期
    * @paramType java.util.Date
    * @param bsdate - 报税日期
     */
    public void setBsdate(Date bsdate) {
        this.bsdate = bsdate;
    }

    /**
    * 获取-报税清单状态
    * @return bsqdstate
     */
    public String getBsqdstate() {
        return bsqdstate;
    }

    /**
    * 设置-报税清单状态
    * @paramType java.lang.String
    * @param bsqdstate - 报税清单状态
     */
    public void setBsqdstate(String bsqdstate) {
        this.bsqdstate = bsqdstate;
    }

    /**
    * 获取-操作员代码
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作员代码
    * @paramType java.lang.String
    * @param opcode - 操作员代码
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-申报金额
    * @return sbje
     */
    public BigDecimal getSbje() {
        return sbje;
    }

    /**
    * 设置-申报金额
    * @paramType java.math.BigDecimal
    * @param sbje - 申报金额
     */
    public void setSbje(BigDecimal sbje) {
        this.sbje = sbje;
    }

    /**
    * 获取-代缴车辆数
    * @return djvehnum
     */
    public Long getDjvehnum() {
        return djvehnum;
    }

    /**
    * 设置-代缴车辆数
    * @paramType java.lang.Long
    * @param djvehnum - 代缴车辆数
     */
    public void setDjvehnum(Long djvehnum) {
        this.djvehnum = djvehnum;
    }

    /**
    * 获取-拒缴车辆数
    * @return rejvehnum
     */
    public Long getRejvehnum() {
        return rejvehnum;
    }

    /**
    * 设置-拒缴车辆数
    * @paramType java.lang.Long
    * @param rejvehnum - 拒缴车辆数
     */
    public void setRejvehnum(Long rejvehnum) {
        this.rejvehnum = rejvehnum;
    }

    /**
    * 获取-减税车辆数
    * @return jsvehnum
     */
    public Long getJsvehnum() {
        return jsvehnum;
    }

    /**
    * 设置-减税车辆数
    * @paramType java.lang.Long
    * @param jsvehnum - 减税车辆数
     */
    public void setJsvehnum(Long jsvehnum) {
        this.jsvehnum = jsvehnum;
    }

    /**
    * 获取-免税车辆数
    * @return msvehnum
     */
    public Long getMsvehnum() {
        return msvehnum;
    }

    /**
    * 设置-免税车辆数
    * @paramType java.lang.Long
    * @param msvehnum - 免税车辆数
     */
    public void setMsvehnum(Long msvehnum) {
        this.msvehnum = msvehnum;
    }

    /**
    * 获取-已完税车辆数
    * @return wsvehnum
     */
    public Long getWsvehnum() {
        return wsvehnum;
    }

    /**
    * 设置-已完税车辆数
    * @paramType java.lang.Long
    * @param wsvehnum - 已完税车辆数
     */
    public void setWsvehnum(Long wsvehnum) {
        this.wsvehnum = wsvehnum;
    }

    /**
    * 获取-补缴车辆数
    * @return bjvehnum
     */
    public Long getBjvehnum() {
        return bjvehnum;
    }

    /**
    * 设置-补缴车辆数
    * @paramType java.lang.Long
    * @param bjvehnum - 补缴车辆数
     */
    public void setBjvehnum(Long bjvehnum) {
        this.bjvehnum = bjvehnum;
    }

    /**
    * 获取-滞纳金车辆数
    * @return znjvehnum
     */
    public Long getZnjvehnum() {
        return znjvehnum;
    }

    /**
    * 设置-滞纳金车辆数
    * @paramType java.lang.Long
    * @param znjvehnum - 滞纳金车辆数
     */
    public void setZnjvehnum(Long znjvehnum) {
        this.znjvehnum = znjvehnum;
    }

    /**
    * 获取-当年应纳税款总计
    * @return yeartaxpaysum
     */
    public BigDecimal getYeartaxpaysum() {
        return yeartaxpaysum;
    }

    /**
    * 设置-当年应纳税款总计
    * @paramType java.math.BigDecimal
    * @param yeartaxpaysum - 当年应纳税款总计
     */
    public void setYeartaxpaysum(BigDecimal yeartaxpaysum) {
        this.yeartaxpaysum = yeartaxpaysum;
    }

    /**
    * 获取-当年实纳税款总计
    * @return yearrealpaysum
     */
    public BigDecimal getYearrealpaysum() {
        return yearrealpaysum;
    }

    /**
    * 设置-当年实纳税款总计
    * @paramType java.math.BigDecimal
    * @param yearrealpaysum - 当年实纳税款总计
     */
    public void setYearrealpaysum(BigDecimal yearrealpaysum) {
        this.yearrealpaysum = yearrealpaysum;
    }

    /**
    * 获取-往年应纳补缴税额总计
    * @return lasyearynbjsum
     */
    public BigDecimal getLasyearynbjsum() {
        return lasyearynbjsum;
    }

    /**
    * 设置-往年应纳补缴税额总计
    * @paramType java.math.BigDecimal
    * @param lasyearynbjsum - 往年应纳补缴税额总计
     */
    public void setLasyearynbjsum(BigDecimal lasyearynbjsum) {
        this.lasyearynbjsum = lasyearynbjsum;
    }

    /**
    * 获取-往年实纳补缴税额总计
    * @return lasyearsnbjsum
     */
    public BigDecimal getLasyearsnbjsum() {
        return lasyearsnbjsum;
    }

    /**
    * 设置-往年实纳补缴税额总计
    * @paramType java.math.BigDecimal
    * @param lasyearsnbjsum - 往年实纳补缴税额总计
     */
    public void setLasyearsnbjsum(BigDecimal lasyearsnbjsum) {
        this.lasyearsnbjsum = lasyearsnbjsum;
    }

    /**
    * 获取-往年应纳滞纳金总计
    * @return lasyearynznsum
     */
    public BigDecimal getLasyearynznsum() {
        return lasyearynznsum;
    }

    /**
    * 设置-往年应纳滞纳金总计
    * @paramType java.math.BigDecimal
    * @param lasyearynznsum - 往年应纳滞纳金总计
     */
    public void setLasyearynznsum(BigDecimal lasyearynznsum) {
        this.lasyearynznsum = lasyearynznsum;
    }

    /**
    * 获取-往年实纳滞纳金总计
    * @return lasyearsnznsum
     */
    public BigDecimal getLasyearsnznsum() {
        return lasyearsnznsum;
    }

    /**
    * 设置-往年实纳滞纳金总计
    * @paramType java.math.BigDecimal
    * @param lasyearsnznsum - 往年实纳滞纳金总计
     */
    public void setLasyearsnznsum(BigDecimal lasyearsnznsum) {
        this.lasyearsnznsum = lasyearsnznsum;
    }

    /**
    * 获取-申报单号
    * @return sbrjdh
     */
    public String getSbrjdh() {
        return sbrjdh;
    }

    /**
    * 设置-申报单号
    * @paramType java.lang.String
    * @param sbrjdh - 申报单号
     */
    public void setSbrjdh(String sbrjdh) {
        this.sbrjdh = sbrjdh;
    }

    /**
    * 获取-拒绝单号
    * @return jjrjdh
     */
    public String getJjrjdh() {
        return jjrjdh;
    }

    /**
    * 设置-拒绝单号
    * @paramType java.lang.String
    * @param jjrjdh - 拒绝单号
     */
    public void setJjrjdh(String jjrjdh) {
        this.jjrjdh = jjrjdh;
    }

    /**
    * 获取-版本号
    * @return hibernateversion
     */
    public Long getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本号
    * @paramType java.lang.Long
    * @param hibernateversion - 版本号
     */
    public void setHibernateversion(Long hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-插入时间
    * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
    * 设置-插入时间
    * @paramType java.util.Date
    * @param timestamp - 插入时间
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
    * 获取-0正常报送数据 3作废数据 9深圳正常报送数据
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-0正常报送数据 3作废数据 9深圳正常报送数据
    * @paramType java.lang.String
    * @param opstatus - 0正常报送数据 3作废数据 9深圳正常报送数据
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }

    /**
    * 获取-手工修改数据说明，用于标识手工改过的数据；可以通过modifydesc is not null来查手工碰过的数据
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据说明，用于标识手工改过的数据；可以通过modifydesc is not null来查手工碰过的数据
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据说明，用于标识手工改过的数据；可以通过modifydesc is not null来查手工碰过的数据
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-产生方式；0-表示从主表申报生成的申报单，1-表示从明细申报生成的申报单并且申报方式为签单;2-表示从明细申报生成的申报单并且申报方式为应收;3-表示从明细申报生成的申报单并且申报方式为实收;
    * @return createtype
     */
    public String getCreatetype() {
        return createtype;
    }

    /**
    * 设置-产生方式；0-表示从主表申报生成的申报单，1-表示从明细申报生成的申报单并且申报方式为签单;2-表示从明细申报生成的申报单并且申报方式为应收;3-表示从明细申报生成的申报单并且申报方式为实收;
    * @paramType java.lang.String
    * @param createtype - 产生方式；0-表示从主表申报生成的申报单，1-表示从明细申报生成的申报单并且申报方式为签单;2-表示从明细申报生成的申报单并且申报方式为应收;3-表示从明细申报生成的申报单并且申报方式为实收;
     */
    public void setCreatetype(String createtype) {
        this.createtype = createtype;
    }

    /**
    * 获取-1未报送 2已报送 3报送出错 4不报送
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-1未报送 2已报送 3报送出错 4不报送
    * @paramType java.lang.String
    * @param status - 1未报送 2已报送 3报送出错 4不报送
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-车船税临时确认中是否确认,0是未确认,1已确认
    * @return ifconfirm
     */
    public String getIfconfirm() {
        return ifconfirm;
    }

    /**
    * 设置-车船税临时确认中是否确认,0是未确认,1已确认
    * @paramType java.lang.String
    * @param ifconfirm - 车船税临时确认中是否确认,0是未确认,1已确认
     */
    public void setIfconfirm(String ifconfirm) {
        this.ifconfirm = ifconfirm;
    }
}