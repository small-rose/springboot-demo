package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;

/**
 *  
 * @Table : spring_session
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class SpringSession {
    /**
     * 会话id
     */
    private String sessionId;

    /**
     * 会话创建时间
     */
    private BigDecimal creationTime;

    /**
     * 最后登出时间
     */
    private BigDecimal lastAccessTime;

    /**
     * 最大会话保持时间
     */
    private Long maxInactiveInterval;

    /**
     * PRINCIPAL_NAME
     */
    private String principalName;

    /**
    * 获取-会话id
    * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
    * 设置-会话id
    * @paramType java.lang.String
    * @param sessionId - 会话id
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
    * 获取-会话创建时间
    * @return creationTime
     */
    public BigDecimal getCreationTime() {
        return creationTime;
    }

    /**
    * 设置-会话创建时间
    * @paramType java.math.BigDecimal
    * @param creationTime - 会话创建时间
     */
    public void setCreationTime(BigDecimal creationTime) {
        this.creationTime = creationTime;
    }

    /**
    * 获取-最后登出时间
    * @return lastAccessTime
     */
    public BigDecimal getLastAccessTime() {
        return lastAccessTime;
    }

    /**
    * 设置-最后登出时间
    * @paramType java.math.BigDecimal
    * @param lastAccessTime - 最后登出时间
     */
    public void setLastAccessTime(BigDecimal lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    /**
    * 获取-最大会话保持时间
    * @return maxInactiveInterval
     */
    public Long getMaxInactiveInterval() {
        return maxInactiveInterval;
    }

    /**
    * 设置-最大会话保持时间
    * @paramType java.lang.Long
    * @param maxInactiveInterval - 最大会话保持时间
     */
    public void setMaxInactiveInterval(Long maxInactiveInterval) {
        this.maxInactiveInterval = maxInactiveInterval;
    }

    /**
    * 获取-PRINCIPAL_NAME
    * @return principalName
     */
    public String getPrincipalName() {
        return principalName;
    }

    /**
    * 设置-PRINCIPAL_NAME
    * @paramType java.lang.String
    * @param principalName - PRINCIPAL_NAME
     */
    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }
}