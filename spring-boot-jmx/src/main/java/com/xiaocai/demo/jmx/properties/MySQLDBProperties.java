package com.xiaocai.demo.jmx.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ MySQLDBProperties ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/6 15:19
 * @Version ： 1.0
 **/
@ConfigurationProperties(prefix = "jdbc")
@ManagedResource("com.xiaocai.demo.jmx.properties:type=MySQLDBProperties,name=MySQLDBProperties")
public class MySQLDBProperties {

    private String url;
    private String driverClassName;
    private String username;
    private String password;
    private Integer maxIdle;
    private Integer validationQueryTimeout;
    private String validationQuery;
    private Boolean testOnBorrow; // 是否在使用的时候进行检查操作
    private Boolean testWhileIdle;// 测试是否已经不能使用了
    @ManagedAttribute
    public Boolean getTestOnBorrow() {
        return testOnBorrow;
    }
    @ManagedAttribute
    public void setTestOnBorrow(Boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }
    @ManagedAttribute
    public Boolean getTestWhileIdle() {
        return testWhileIdle;
    }
    @ManagedAttribute
    public void setTestWhileIdle(Boolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }
    @ManagedAttribute
    public Integer getValidationQueryTimeout() {
        return validationQueryTimeout;
    }
    @ManagedAttribute
    public void setValidationQueryTimeout(Integer validationQueryTimeout) {
        this.validationQueryTimeout = validationQueryTimeout;
    }
    @ManagedAttribute
    public String getValidationQuery() {
        return validationQuery;
    }
    @ManagedAttribute
    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery;
    }
    @ManagedAttribute
    public Integer getMaxIdle() {
        return maxIdle;
    }
    @ManagedAttribute
    public void setMaxIdle(Integer maxIdle) {
        this.maxIdle = maxIdle;
    }
    @ManagedAttribute
    public String getUrl() {
        return url;
    }
    @ManagedAttribute
    public void setUrl(String url) {
        this.url = url;
    }
    @ManagedAttribute
    public String getDriverClassName() {
        return driverClassName;
    }
    @ManagedAttribute
    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
    @ManagedAttribute
    public String getUsername() {
        return username;
    }
    @ManagedAttribute
    public void setUsername(String username) {
        this.username = username;
    }
    @ManagedAttribute
    public String getPassword() {
        return password;
    }
    @ManagedAttribute
    public void setPassword(String password) {
        System.out.println("设置新的密码为：" + password);
        this.password = password;
    }
}
