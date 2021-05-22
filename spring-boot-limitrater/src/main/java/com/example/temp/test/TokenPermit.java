package com.example.temp.test;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/21 22:36
 * @version: v1.0
 */
public class TokenPermit {

    public  volatile long token;

    public long getToken() {
        return token;
    }

    public void setToken(long token) {
        this.token = token;
    }
}
