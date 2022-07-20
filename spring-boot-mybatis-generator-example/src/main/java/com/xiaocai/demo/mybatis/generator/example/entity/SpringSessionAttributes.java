package com.xiaocai.demo.mybatis.generator.example.entity;

/**
 *  
 * @Table : spring_session_attributes
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class SpringSessionAttributes {
    /**
     * 会话id
     */
    private String sessionId;

    /**
     * 会话属性名称
     */
    private String attributeName;

    /**
     * 会话描述
     */
    private byte[] attributeBytes;

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
    * 获取-会话属性名称
    * @return attributeName
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
    * 设置-会话属性名称
    * @paramType java.lang.String
    * @param attributeName - 会话属性名称
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
    * 获取-会话描述
    * @return attributeBytes
     */
    public byte[] getAttributeBytes() {
        return attributeBytes;
    }

    /**
    * 设置-会话描述
    * @paramType byte[]
    * @param attributeBytes - 会话描述
     */
    public void setAttributeBytes(byte[] attributeBytes) {
        this.attributeBytes = attributeBytes;
    }
}