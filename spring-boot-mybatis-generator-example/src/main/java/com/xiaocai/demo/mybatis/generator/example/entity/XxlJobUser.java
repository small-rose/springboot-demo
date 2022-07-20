package com.xiaocai.demo.mybatis.generator.example.entity;

/**
 *  
 * @Table : xxl_job_user
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class XxlJobUser {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 角色：0-普通用户、1-管理员
     */
    private Byte role;

    /**
     * 权限：执行器ID列表，多个逗号分割
     */
    private String permission;

    /**
    * 获取-主键
    * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Integer
    * @param id - 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
    * 获取-账号
    * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
    * 设置-账号
    * @paramType java.lang.String
    * @param username - 账号
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
    * 获取-密码
    * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
    * 设置-密码
    * @paramType java.lang.String
    * @param password - 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
    * 获取-角色：0-普通用户、1-管理员
    * @return role
     */
    public Byte getRole() {
        return role;
    }

    /**
    * 设置-角色：0-普通用户、1-管理员
    * @paramType java.lang.Byte
    * @param role - 角色：0-普通用户、1-管理员
     */
    public void setRole(Byte role) {
        this.role = role;
    }

    /**
    * 获取-权限：执行器ID列表，多个逗号分割
    * @return permission
     */
    public String getPermission() {
        return permission;
    }

    /**
    * 设置-权限：执行器ID列表，多个逗号分割
    * @paramType java.lang.String
    * @param permission - 权限：执行器ID列表，多个逗号分割
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }
}