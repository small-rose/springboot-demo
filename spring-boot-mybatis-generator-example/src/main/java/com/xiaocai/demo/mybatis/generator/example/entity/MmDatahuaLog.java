package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_datahua_log
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmDatahuaLog {
    /**
     * 主键
     */
    private Long id;

    /**
     * 请求报文
     */
    private String request;

    /**
     * 响应报文
     */
    private String response;

    /**
     * 请求时间
     */
    private Date requesttime;

    /**
     * 响应时间
     */
    private Date responsetime;

    /**
     * 关联id
     */
    private String seqid;

    /**
     * 交易类型
     */
    private String trancode;

    /**
     * 结果代码 成功-1,失败-0
     */
    private String rsltcode;

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
    * 获取-请求报文
    * @return request
     */
    public String getRequest() {
        return request;
    }

    /**
    * 设置-请求报文
    * @paramType java.lang.String
    * @param request - 请求报文
     */
    public void setRequest(String request) {
        this.request = request;
    }

    /**
    * 获取-响应报文
    * @return response
     */
    public String getResponse() {
        return response;
    }

    /**
    * 设置-响应报文
    * @paramType java.lang.String
    * @param response - 响应报文
     */
    public void setResponse(String response) {
        this.response = response;
    }

    /**
    * 获取-请求时间
    * @return requesttime
     */
    public Date getRequesttime() {
        return requesttime;
    }

    /**
    * 设置-请求时间
    * @paramType java.util.Date
    * @param requesttime - 请求时间
     */
    public void setRequesttime(Date requesttime) {
        this.requesttime = requesttime;
    }

    /**
    * 获取-响应时间
    * @return responsetime
     */
    public Date getResponsetime() {
        return responsetime;
    }

    /**
    * 设置-响应时间
    * @paramType java.util.Date
    * @param responsetime - 响应时间
     */
    public void setResponsetime(Date responsetime) {
        this.responsetime = responsetime;
    }

    /**
    * 获取-关联id
    * @return seqid
     */
    public String getSeqid() {
        return seqid;
    }

    /**
    * 设置-关联id
    * @paramType java.lang.String
    * @param seqid - 关联id
     */
    public void setSeqid(String seqid) {
        this.seqid = seqid;
    }

    /**
    * 获取-交易类型
    * @return trancode
     */
    public String getTrancode() {
        return trancode;
    }

    /**
    * 设置-交易类型
    * @paramType java.lang.String
    * @param trancode - 交易类型
     */
    public void setTrancode(String trancode) {
        this.trancode = trancode;
    }

    /**
    * 获取-结果代码 成功-1,失败-0
    * @return rsltcode
     */
    public String getRsltcode() {
        return rsltcode;
    }

    /**
    * 设置-结果代码 成功-1,失败-0
    * @paramType java.lang.String
    * @param rsltcode - 结果代码 成功-1,失败-0
     */
    public void setRsltcode(String rsltcode) {
        this.rsltcode = rsltcode;
    }
}