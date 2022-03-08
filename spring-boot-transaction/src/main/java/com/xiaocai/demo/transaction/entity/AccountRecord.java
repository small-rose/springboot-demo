package com.xiaocai.demo.transaction.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-01 17:48
 **/
@Data
public class AccountRecord {

    private Long id;

    private String name;

    private String pass;

    private Date addDate;

    private Date lastLogin;

    private Long balance;

    private String description;

    private byte[] headImage;
}
