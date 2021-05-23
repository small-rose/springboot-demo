package com.example.temp.excepion;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 防止 限流注解冲突
 * @author: 张小菜
 * @date: 2021/5/20 21:43
 * @version: v1.0
 */
public class LimitConflictException extends RuntimeException{

    public LimitConflictException(){
       super();
    }

    public LimitConflictException(String message){
        super(message);
    }

    public LimitConflictException(String message, Throwable cause) {
        super(message, cause);
    }
}
