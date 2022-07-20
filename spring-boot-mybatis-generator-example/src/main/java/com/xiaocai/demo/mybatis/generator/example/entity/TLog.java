package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : t_log
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class TLog {
    /**
     * 主键
     */
    private Long tano;

    /**
     * 交易请求报文
     */
    private String request;

    /**
     * 交易回复报文
     */
    private String response;

    /**
     * 交易请求时间
     */
    private Date requesttime;

    /**
     * 交易回复时间
     */
    private Date responsetime;

    /**
     * 支付申请号
     */
    private String applyno;

    /**
     * 请用用户
     */
    private String userid;

    /**
     * 交易类型
     */
    private String tranCode;

    /**
     * 结果代码
     */
    private String rsltCode;

    /**
     * 响应备份
     */
    private String responseback;

    /**
    * 获取-主键
    * @return tano
     */
    public Long getTano() {
        return tano;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param tano - 主键
     */
    public void setTano(Long tano) {
        this.tano = tano;
    }

    /**
    * 获取-交易请求报文
    * @return request
     */
    public String getRequest() {
        return request;
    }

    /**
    * 设置-交易请求报文
    * @paramType java.lang.String
    * @param request - 交易请求报文
     */
    public void setRequest(String request) {
        this.request = request;
    }

    /**
    * 获取-交易回复报文
    * @return response
     */
    public String getResponse() {
        return response;
    }

    /**
    * 设置-交易回复报文
    * @paramType java.lang.String
    * @param response - 交易回复报文
     */
    public void setResponse(String response) {
        this.response = response;
    }

    /**
    * 获取-交易请求时间
    * @return requesttime
     */
    public Date getRequesttime() {
        return requesttime;
    }

    /**
    * 设置-交易请求时间
    * @paramType java.util.Date
    * @param requesttime - 交易请求时间
     */
    public void setRequesttime(Date requesttime) {
        this.requesttime = requesttime;
    }

    /**
    * 获取-交易回复时间
    * @return responsetime
     */
    public Date getResponsetime() {
        return responsetime;
    }

    /**
    * 设置-交易回复时间
    * @paramType java.util.Date
    * @param responsetime - 交易回复时间
     */
    public void setResponsetime(Date responsetime) {
        this.responsetime = responsetime;
    }

    /**
    * 获取-支付申请号
    * @return applyno
     */
    public String getApplyno() {
        return applyno;
    }

    /**
    * 设置-支付申请号
    * @paramType java.lang.String
    * @param applyno - 支付申请号
     */
    public void setApplyno(String applyno) {
        this.applyno = applyno;
    }

    /**
    * 获取-请用用户
    * @return userid
     */
    public String getUserid() {
        return userid;
    }

    /**
    * 设置-请用用户
    * @paramType java.lang.String
    * @param userid - 请用用户
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
    * 获取-交易类型
    * @return tranCode
     */
    public String getTranCode() {
        return tranCode;
    }

    /**
    * 设置-交易类型
    * @paramType java.lang.String
    * @param tranCode - 交易类型
     */
    public void setTranCode(String tranCode) {
        this.tranCode = tranCode;
    }

    /**
    * 获取-结果代码
    * @return rsltCode
     */
    public String getRsltCode() {
        return rsltCode;
    }

    /**
    * 设置-结果代码
    * @paramType java.lang.String
    * @param rsltCode - 结果代码
     */
    public void setRsltCode(String rsltCode) {
        this.rsltCode = rsltCode;
    }

    /**
    * 获取-响应备份
    * @return responseback
     */
    public String getResponseback() {
        return responseback;
    }

    /**
    * 设置-响应备份
    * @paramType java.lang.String
    * @param responseback - 响应备份
     */
    public void setResponseback(String responseback) {
        this.responseback = responseback;
    }
}