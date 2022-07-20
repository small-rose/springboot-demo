package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_agentcode_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmAgentcodeTc {
    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 代理点名称
     */
    private String agentname;

    /**
     * 保险公司原来代理点代码
     */
    private String reallagentcode;

    /**
     * 代理点地址
     */
    private String agencyaddress;

    /**
     * 代理点邮编，展业证号
     */
    private String agencypostcode;

    /**
     * 代理点电话
     */
    private String agencyphone;

    /**
     * 联系人
     */
    private String linkman;

    /**
     * 0 无效 1 有效
     */
    private String ifvalid;

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
     * 代理点英文名称
     */
    private String agentnameen;

    /**
     * 组代码
     */
    private String partycode;

    /**
     * 接口表主键
     */
    private String interfaceId;

    /**
     * 代理点的组织机构代码（机构代理：代理点的组织机构代码;  个人代理：个人代理的身份证号【证件类型_证件号码】）
     */
    private String helpcode;

    /**
     * 代理点的资格证号。（机构代理：代理资格证号;  个人代理：代理从业人员资格证号）
     */
    private String description;

    /**
     * 代码层次0 总代理点 1 代理点
     */
    private String agentlevel;

    /**
     * 代理点类型(t_code_view :code = @value and cv.unit_code =0000000 and cv.parent_id=4)
     */
    private String type;

    /**
     * 展业方式:0  其他 00  其他代理类 11  柜台 12  上门 13  电话 14  网络 15  招标业务 16  电销呼出 17  电销呼入 21  专业代理 22  其它兼业代 23  营销员 24  车管所 25  团代产 26  寿险推荐 27  银行代理 28  汽车销售行 29  运输行业 31  经纪人 32  个代产 33  银保通 34  个代产（寿险推荐） 35  团代产（寿险推荐） 40  邮局代理
     */
    private String channel;

    /**
     * 标志 (分公司,部门,科室,展业人员 (0,1,2,3))
     */
    private String flag;

    /**
     * 归属
     */
    private String ascription;

    /**
     * 所属地区
     */
    private String area;

    /**
     * 传真
     */
    private String fax;

    /**
     * E_mail地址
     */
    private String email;

    /**
     * 证件类型
     */
    private String certificatetype;

    /**
     * 证件号码
     */
    private String certificateno;

    /**
     * 纳税人类型
     */
    private String taxpayertype;

    /**
     * 纳税人识别号
     */
    private String taxpayernum;

    /**
     * 纳税登记地址
     */
    private String taxpayeraddr;

    /**
     * 纳税登记开户银行
     */
    private String taxpaybank;

    /**
     * 纳税登记开户银行账号
     */
    private String taxpayeraccountno;

    /**
     * 纳税人登记联系电话
     */
    private String taxpayertel;

    /**
     * 邮寄方式
     */
    private String posttype;

    /**
     * 邮寄收件人
     */
    private String postreceiver;

    /**
     * 邮寄联系电话
     */
    private String postreceivertel;

    /**
     * 邮寄地址
     */
    private String postaddr;

    /**
    * 获取-代理点代码
    * @return agentcode
     */
    public String getAgentcode() {
        return agentcode;
    }

    /**
    * 设置-代理点代码
    * @paramType java.lang.String
    * @param agentcode - 代理点代码
     */
    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode;
    }

    /**
    * 获取-分公司代码
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司代码
    * @paramType java.lang.String
    * @param subcompany - 分公司代码
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-代理点名称
    * @return agentname
     */
    public String getAgentname() {
        return agentname;
    }

    /**
    * 设置-代理点名称
    * @paramType java.lang.String
    * @param agentname - 代理点名称
     */
    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }

    /**
    * 获取-保险公司原来代理点代码
    * @return reallagentcode
     */
    public String getReallagentcode() {
        return reallagentcode;
    }

    /**
    * 设置-保险公司原来代理点代码
    * @paramType java.lang.String
    * @param reallagentcode - 保险公司原来代理点代码
     */
    public void setReallagentcode(String reallagentcode) {
        this.reallagentcode = reallagentcode;
    }

    /**
    * 获取-代理点地址
    * @return agencyaddress
     */
    public String getAgencyaddress() {
        return agencyaddress;
    }

    /**
    * 设置-代理点地址
    * @paramType java.lang.String
    * @param agencyaddress - 代理点地址
     */
    public void setAgencyaddress(String agencyaddress) {
        this.agencyaddress = agencyaddress;
    }

    /**
    * 获取-代理点邮编，展业证号
    * @return agencypostcode
     */
    public String getAgencypostcode() {
        return agencypostcode;
    }

    /**
    * 设置-代理点邮编，展业证号
    * @paramType java.lang.String
    * @param agencypostcode - 代理点邮编，展业证号
     */
    public void setAgencypostcode(String agencypostcode) {
        this.agencypostcode = agencypostcode;
    }

    /**
    * 获取-代理点电话
    * @return agencyphone
     */
    public String getAgencyphone() {
        return agencyphone;
    }

    /**
    * 设置-代理点电话
    * @paramType java.lang.String
    * @param agencyphone - 代理点电话
     */
    public void setAgencyphone(String agencyphone) {
        this.agencyphone = agencyphone;
    }

    /**
    * 获取-联系人
    * @return linkman
     */
    public String getLinkman() {
        return linkman;
    }

    /**
    * 设置-联系人
    * @paramType java.lang.String
    * @param linkman - 联系人
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    /**
    * 获取-0 无效
1 有效
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-0 无效
1 有效
    * @paramType java.lang.String
    * @param ifvalid - 0 无效
1 有效
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
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
    * 获取-代理点英文名称
    * @return agentnameen
     */
    public String getAgentnameen() {
        return agentnameen;
    }

    /**
    * 设置-代理点英文名称
    * @paramType java.lang.String
    * @param agentnameen - 代理点英文名称
     */
    public void setAgentnameen(String agentnameen) {
        this.agentnameen = agentnameen;
    }

    /**
    * 获取-组代码
    * @return partycode
     */
    public String getPartycode() {
        return partycode;
    }

    /**
    * 设置-组代码
    * @paramType java.lang.String
    * @param partycode - 组代码
     */
    public void setPartycode(String partycode) {
        this.partycode = partycode;
    }

    /**
    * 获取-接口表主键
    * @return interfaceId
     */
    public String getInterfaceId() {
        return interfaceId;
    }

    /**
    * 设置-接口表主键
    * @paramType java.lang.String
    * @param interfaceId - 接口表主键
     */
    public void setInterfaceId(String interfaceId) {
        this.interfaceId = interfaceId;
    }

    /**
    * 获取-代理点的组织机构代码（机构代理：代理点的组织机构代码;  个人代理：个人代理的身份证号【证件类型_证件号码】）
    * @return helpcode
     */
    public String getHelpcode() {
        return helpcode;
    }

    /**
    * 设置-代理点的组织机构代码（机构代理：代理点的组织机构代码;  个人代理：个人代理的身份证号【证件类型_证件号码】）
    * @paramType java.lang.String
    * @param helpcode - 代理点的组织机构代码（机构代理：代理点的组织机构代码;  个人代理：个人代理的身份证号【证件类型_证件号码】）
     */
    public void setHelpcode(String helpcode) {
        this.helpcode = helpcode;
    }

    /**
    * 获取-代理点的资格证号。（机构代理：代理资格证号;  个人代理：代理从业人员资格证号）
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-代理点的资格证号。（机构代理：代理资格证号;  个人代理：代理从业人员资格证号）
    * @paramType java.lang.String
    * @param description - 代理点的资格证号。（机构代理：代理资格证号;  个人代理：代理从业人员资格证号）
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * 获取-代码层次0 总代理点 1 代理点
    * @return agentlevel
     */
    public String getAgentlevel() {
        return agentlevel;
    }

    /**
    * 设置-代码层次0 总代理点 1 代理点
    * @paramType java.lang.String
    * @param agentlevel - 代码层次0 总代理点 1 代理点
     */
    public void setAgentlevel(String agentlevel) {
        this.agentlevel = agentlevel;
    }

    /**
    * 获取-代理点类型(t_code_view :code = @value and cv.unit_code =0000000 and cv.parent_id=4)
    * @return type
     */
    public String getType() {
        return type;
    }

    /**
    * 设置-代理点类型(t_code_view :code = @value and cv.unit_code =0000000 and cv.parent_id=4)
    * @paramType java.lang.String
    * @param type - 代理点类型(t_code_view :code = @value and cv.unit_code =0000000 and cv.parent_id=4)
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
    * 获取-展业方式:0  其他
00  其他代理类
11  柜台
12  上门
13  电话
14  网络
15  招标业务
16  电销呼出
17  电销呼入
21  专业代理
22  其它兼业代
23  营销员
24  车管所
25  团代产
26  寿险推荐
27  银行代理
28  汽车销售行
29  运输行业
31  经纪人
32  个代产
33  银保通
34  个代产（寿险推荐）
35  团代产（寿险推荐）
40  邮局代理
    * @return channel
     */
    public String getChannel() {
        return channel;
    }

    /**
    * 设置-展业方式:0  其他
00  其他代理类
11  柜台
12  上门
13  电话
14  网络
15  招标业务
16  电销呼出
17  电销呼入
21  专业代理
22  其它兼业代
23  营销员
24  车管所
25  团代产
26  寿险推荐
27  银行代理
28  汽车销售行
29  运输行业
31  经纪人
32  个代产
33  银保通
34  个代产（寿险推荐）
35  团代产（寿险推荐）
40  邮局代理
    * @paramType java.lang.String
    * @param channel - 展业方式:0  其他
00  其他代理类
11  柜台
12  上门
13  电话
14  网络
15  招标业务
16  电销呼出
17  电销呼入
21  专业代理
22  其它兼业代
23  营销员
24  车管所
25  团代产
26  寿险推荐
27  银行代理
28  汽车销售行
29  运输行业
31  经纪人
32  个代产
33  银保通
34  个代产（寿险推荐）
35  团代产（寿险推荐）
40  邮局代理
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
    * 获取-标志 (分公司,部门,科室,展业人员 (0,1,2,3))
    * @return flag
     */
    public String getFlag() {
        return flag;
    }

    /**
    * 设置-标志 (分公司,部门,科室,展业人员 (0,1,2,3))
    * @paramType java.lang.String
    * @param flag - 标志 (分公司,部门,科室,展业人员 (0,1,2,3))
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
    * 获取-归属
    * @return ascription
     */
    public String getAscription() {
        return ascription;
    }

    /**
    * 设置-归属
    * @paramType java.lang.String
    * @param ascription - 归属
     */
    public void setAscription(String ascription) {
        this.ascription = ascription;
    }

    /**
    * 获取-所属地区
    * @return area
     */
    public String getArea() {
        return area;
    }

    /**
    * 设置-所属地区
    * @paramType java.lang.String
    * @param area - 所属地区
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
    * 获取-传真
    * @return fax
     */
    public String getFax() {
        return fax;
    }

    /**
    * 设置-传真
    * @paramType java.lang.String
    * @param fax - 传真
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
    * 获取-E_mail地址
    * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
    * 设置-E_mail地址
    * @paramType java.lang.String
    * @param email - E_mail地址
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
    * 获取-证件类型
    * @return certificatetype
     */
    public String getCertificatetype() {
        return certificatetype;
    }

    /**
    * 设置-证件类型
    * @paramType java.lang.String
    * @param certificatetype - 证件类型
     */
    public void setCertificatetype(String certificatetype) {
        this.certificatetype = certificatetype;
    }

    /**
    * 获取-证件号码
    * @return certificateno
     */
    public String getCertificateno() {
        return certificateno;
    }

    /**
    * 设置-证件号码
    * @paramType java.lang.String
    * @param certificateno - 证件号码
     */
    public void setCertificateno(String certificateno) {
        this.certificateno = certificateno;
    }

    /**
    * 获取-纳税人类型
    * @return taxpayertype
     */
    public String getTaxpayertype() {
        return taxpayertype;
    }

    /**
    * 设置-纳税人类型
    * @paramType java.lang.String
    * @param taxpayertype - 纳税人类型
     */
    public void setTaxpayertype(String taxpayertype) {
        this.taxpayertype = taxpayertype;
    }

    /**
    * 获取-纳税人识别号
    * @return taxpayernum
     */
    public String getTaxpayernum() {
        return taxpayernum;
    }

    /**
    * 设置-纳税人识别号
    * @paramType java.lang.String
    * @param taxpayernum - 纳税人识别号
     */
    public void setTaxpayernum(String taxpayernum) {
        this.taxpayernum = taxpayernum;
    }

    /**
    * 获取-纳税登记地址
    * @return taxpayeraddr
     */
    public String getTaxpayeraddr() {
        return taxpayeraddr;
    }

    /**
    * 设置-纳税登记地址
    * @paramType java.lang.String
    * @param taxpayeraddr - 纳税登记地址
     */
    public void setTaxpayeraddr(String taxpayeraddr) {
        this.taxpayeraddr = taxpayeraddr;
    }

    /**
    * 获取-纳税登记开户银行
    * @return taxpaybank
     */
    public String getTaxpaybank() {
        return taxpaybank;
    }

    /**
    * 设置-纳税登记开户银行
    * @paramType java.lang.String
    * @param taxpaybank - 纳税登记开户银行
     */
    public void setTaxpaybank(String taxpaybank) {
        this.taxpaybank = taxpaybank;
    }

    /**
    * 获取-纳税登记开户银行账号
    * @return taxpayeraccountno
     */
    public String getTaxpayeraccountno() {
        return taxpayeraccountno;
    }

    /**
    * 设置-纳税登记开户银行账号
    * @paramType java.lang.String
    * @param taxpayeraccountno - 纳税登记开户银行账号
     */
    public void setTaxpayeraccountno(String taxpayeraccountno) {
        this.taxpayeraccountno = taxpayeraccountno;
    }

    /**
    * 获取-纳税人登记联系电话
    * @return taxpayertel
     */
    public String getTaxpayertel() {
        return taxpayertel;
    }

    /**
    * 设置-纳税人登记联系电话
    * @paramType java.lang.String
    * @param taxpayertel - 纳税人登记联系电话
     */
    public void setTaxpayertel(String taxpayertel) {
        this.taxpayertel = taxpayertel;
    }

    /**
    * 获取-邮寄方式
    * @return posttype
     */
    public String getPosttype() {
        return posttype;
    }

    /**
    * 设置-邮寄方式
    * @paramType java.lang.String
    * @param posttype - 邮寄方式
     */
    public void setPosttype(String posttype) {
        this.posttype = posttype;
    }

    /**
    * 获取-邮寄收件人
    * @return postreceiver
     */
    public String getPostreceiver() {
        return postreceiver;
    }

    /**
    * 设置-邮寄收件人
    * @paramType java.lang.String
    * @param postreceiver - 邮寄收件人
     */
    public void setPostreceiver(String postreceiver) {
        this.postreceiver = postreceiver;
    }

    /**
    * 获取-邮寄联系电话
    * @return postreceivertel
     */
    public String getPostreceivertel() {
        return postreceivertel;
    }

    /**
    * 设置-邮寄联系电话
    * @paramType java.lang.String
    * @param postreceivertel - 邮寄联系电话
     */
    public void setPostreceivertel(String postreceivertel) {
        this.postreceivertel = postreceivertel;
    }

    /**
    * 获取-邮寄地址
    * @return postaddr
     */
    public String getPostaddr() {
        return postaddr;
    }

    /**
    * 设置-邮寄地址
    * @paramType java.lang.String
    * @param postaddr - 邮寄地址
     */
    public void setPostaddr(String postaddr) {
        this.postaddr = postaddr;
    }
}