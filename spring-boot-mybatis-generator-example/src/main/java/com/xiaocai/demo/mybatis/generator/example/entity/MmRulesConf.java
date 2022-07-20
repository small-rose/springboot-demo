package com.xiaocai.demo.mybatis.generator.example.entity;

/**
 *  
 * @Table : mm_rules_conf
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmRulesConf {
    /**
     * 交叉验证规则代码
     */
    private String code;

    /**
     * 对应交叉表的验证字段低位
     */
    private String colL;

    /**
     * 对应交叉表的验证字段低位
     */
    private String colH;

    /**
     * 对应的号码,segment1>1,segment2>2,等
     */
    private Short no;

    /**
     * 描述
     */
    private String des;

    /**
    * 获取-交叉验证规则代码
    * @return code
     */
    public String getCode() {
        return code;
    }

    /**
    * 设置-交叉验证规则代码
    * @paramType java.lang.String
    * @param code - 交叉验证规则代码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
    * 获取-对应交叉表的验证字段低位
    * @return colL
     */
    public String getColL() {
        return colL;
    }

    /**
    * 设置-对应交叉表的验证字段低位
    * @paramType java.lang.String
    * @param colL - 对应交叉表的验证字段低位
     */
    public void setColL(String colL) {
        this.colL = colL;
    }

    /**
    * 获取-对应交叉表的验证字段低位
    * @return colH
     */
    public String getColH() {
        return colH;
    }

    /**
    * 设置-对应交叉表的验证字段低位
    * @paramType java.lang.String
    * @param colH - 对应交叉表的验证字段低位
     */
    public void setColH(String colH) {
        this.colH = colH;
    }

    /**
    * 获取-对应的号码,segment1>1,segment2>2,等
    * @return no
     */
    public Short getNo() {
        return no;
    }

    /**
    * 设置-对应的号码,segment1>1,segment2>2,等
    * @paramType java.lang.Short
    * @param no - 对应的号码,segment1>1,segment2>2,等
     */
    public void setNo(Short no) {
        this.no = no;
    }

    /**
    * 获取-描述
    * @return des
     */
    public String getDes() {
        return des;
    }

    /**
    * 设置-描述
    * @paramType java.lang.String
    * @param des - 描述
     */
    public void setDes(String des) {
        this.des = des;
    }
}