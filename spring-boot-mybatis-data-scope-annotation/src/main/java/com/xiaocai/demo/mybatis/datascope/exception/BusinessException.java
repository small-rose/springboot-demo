package com.xiaocai.demo.mybatis.datascope.exception;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/5/19 22:03
 * @version: v1.0
 */
public class BusinessException extends RuntimeException{

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
