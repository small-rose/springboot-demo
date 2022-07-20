package com.xiaocai.demo.mybatis.generator.example.entity;

/**
 *  
 * @Table : mm_acc_add_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmAccAddTd {
    /**
     * 主键
     */
    private Long seqno;

    /**
     * 来源表
     */
    private String sourcetable;

    /**
     * 财务险种代码
     */
    private String classescode;

    /**
     * 财务部门代码
     */
    private String departmentcode;

    /**
     * 渠道编号
     */
    private String channel;

    /**
     * 涉农(92非涉农)
     */
    private String farmflag;

    /**
     * 项目段
     */
    private String projectsegment;

    /**
     * 服务机构代码
     */
    private String serviceunitcode;

    /**
     * 备用1
     */
    private String segment1;

    /**
     * 备用2
     */
    private String segment2;

    /**
     * 备用3
     */
    private String segment3;

    /**
     * 备用4
     */
    private String segment4;

    /**
     * 健康险是否拆分 1可拆分
     */
    private String issplitted;

    /**
     * 涉农标志代码
     */
    private String farmflagcode;

    /**
     * 车辆使用性质
     */
    private String useporperty;

    /**
     * 农业险政策性  0 政策性-中央政策性、1 政策性-地方政策性、2 商业性
     */
    private String farpolicytype;

    /**
     * 备用5
     */
    private String segment5;

    /**
     * 备用6
     */
    private String segment6;

    /**
     * 备用字段7
     */
    private String segment7;

    /**
    * 获取-主键
    * @return seqno
     */
    public Long getSeqno() {
        return seqno;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param seqno - 主键
     */
    public void setSeqno(Long seqno) {
        this.seqno = seqno;
    }

    /**
    * 获取-来源表
    * @return sourcetable
     */
    public String getSourcetable() {
        return sourcetable;
    }

    /**
    * 设置-来源表
    * @paramType java.lang.String
    * @param sourcetable - 来源表
     */
    public void setSourcetable(String sourcetable) {
        this.sourcetable = sourcetable;
    }

    /**
    * 获取-财务险种代码
    * @return classescode
     */
    public String getClassescode() {
        return classescode;
    }

    /**
    * 设置-财务险种代码
    * @paramType java.lang.String
    * @param classescode - 财务险种代码
     */
    public void setClassescode(String classescode) {
        this.classescode = classescode;
    }

    /**
    * 获取-财务部门代码
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-财务部门代码
    * @paramType java.lang.String
    * @param departmentcode - 财务部门代码
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    /**
    * 获取-渠道编号
    * @return channel
     */
    public String getChannel() {
        return channel;
    }

    /**
    * 设置-渠道编号
    * @paramType java.lang.String
    * @param channel - 渠道编号
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
    * 获取-涉农(92非涉农)
    * @return farmflag
     */
    public String getFarmflag() {
        return farmflag;
    }

    /**
    * 设置-涉农(92非涉农)
    * @paramType java.lang.String
    * @param farmflag - 涉农(92非涉农)
     */
    public void setFarmflag(String farmflag) {
        this.farmflag = farmflag;
    }

    /**
    * 获取-项目段
    * @return projectsegment
     */
    public String getProjectsegment() {
        return projectsegment;
    }

    /**
    * 设置-项目段
    * @paramType java.lang.String
    * @param projectsegment - 项目段
     */
    public void setProjectsegment(String projectsegment) {
        this.projectsegment = projectsegment;
    }

    /**
    * 获取-服务机构代码
    * @return serviceunitcode
     */
    public String getServiceunitcode() {
        return serviceunitcode;
    }

    /**
    * 设置-服务机构代码
    * @paramType java.lang.String
    * @param serviceunitcode - 服务机构代码
     */
    public void setServiceunitcode(String serviceunitcode) {
        this.serviceunitcode = serviceunitcode;
    }

    /**
    * 获取-备用1
    * @return segment1
     */
    public String getSegment1() {
        return segment1;
    }

    /**
    * 设置-备用1
    * @paramType java.lang.String
    * @param segment1 - 备用1
     */
    public void setSegment1(String segment1) {
        this.segment1 = segment1;
    }

    /**
    * 获取-备用2
    * @return segment2
     */
    public String getSegment2() {
        return segment2;
    }

    /**
    * 设置-备用2
    * @paramType java.lang.String
    * @param segment2 - 备用2
     */
    public void setSegment2(String segment2) {
        this.segment2 = segment2;
    }

    /**
    * 获取-备用3
    * @return segment3
     */
    public String getSegment3() {
        return segment3;
    }

    /**
    * 设置-备用3
    * @paramType java.lang.String
    * @param segment3 - 备用3
     */
    public void setSegment3(String segment3) {
        this.segment3 = segment3;
    }

    /**
    * 获取-备用4
    * @return segment4
     */
    public String getSegment4() {
        return segment4;
    }

    /**
    * 设置-备用4
    * @paramType java.lang.String
    * @param segment4 - 备用4
     */
    public void setSegment4(String segment4) {
        this.segment4 = segment4;
    }

    /**
    * 获取-健康险是否拆分 1可拆分
    * @return issplitted
     */
    public String getIssplitted() {
        return issplitted;
    }

    /**
    * 设置-健康险是否拆分 1可拆分
    * @paramType java.lang.String
    * @param issplitted - 健康险是否拆分 1可拆分
     */
    public void setIssplitted(String issplitted) {
        this.issplitted = issplitted;
    }

    /**
    * 获取-涉农标志代码
    * @return farmflagcode
     */
    public String getFarmflagcode() {
        return farmflagcode;
    }

    /**
    * 设置-涉农标志代码
    * @paramType java.lang.String
    * @param farmflagcode - 涉农标志代码
     */
    public void setFarmflagcode(String farmflagcode) {
        this.farmflagcode = farmflagcode;
    }

    /**
    * 获取-车辆使用性质
    * @return useporperty
     */
    public String getUseporperty() {
        return useporperty;
    }

    /**
    * 设置-车辆使用性质
    * @paramType java.lang.String
    * @param useporperty - 车辆使用性质
     */
    public void setUseporperty(String useporperty) {
        this.useporperty = useporperty;
    }

    /**
    * 获取-农业险政策性  0 政策性-中央政策性、1 政策性-地方政策性、2 商业性
    * @return farpolicytype
     */
    public String getFarpolicytype() {
        return farpolicytype;
    }

    /**
    * 设置-农业险政策性  0 政策性-中央政策性、1 政策性-地方政策性、2 商业性
    * @paramType java.lang.String
    * @param farpolicytype - 农业险政策性  0 政策性-中央政策性、1 政策性-地方政策性、2 商业性
     */
    public void setFarpolicytype(String farpolicytype) {
        this.farpolicytype = farpolicytype;
    }

    /**
    * 获取-备用5
    * @return segment5
     */
    public String getSegment5() {
        return segment5;
    }

    /**
    * 设置-备用5
    * @paramType java.lang.String
    * @param segment5 - 备用5
     */
    public void setSegment5(String segment5) {
        this.segment5 = segment5;
    }

    /**
    * 获取-备用6
    * @return segment6
     */
    public String getSegment6() {
        return segment6;
    }

    /**
    * 设置-备用6
    * @paramType java.lang.String
    * @param segment6 - 备用6
     */
    public void setSegment6(String segment6) {
        this.segment6 = segment6;
    }

    /**
    * 获取-备用字段7
    * @return segment7
     */
    public String getSegment7() {
        return segment7;
    }

    /**
    * 设置-备用字段7
    * @paramType java.lang.String
    * @param segment7 - 备用字段7
     */
    public void setSegment7(String segment7) {
        this.segment7 = segment7;
    }
}