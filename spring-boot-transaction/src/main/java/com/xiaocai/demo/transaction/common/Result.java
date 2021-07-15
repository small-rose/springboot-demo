package com.xiaocai.demo.transaction.common;

import lombok.Data;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-08 15:22
 **/
@Data
public class Result {

    private int code ;
    private String msg ;
    private boolean flag ;
    private Object data ;

    public Result() {
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static Result Result(){
        return new Result(200, "SUCCESS");
    }

    public static Result Result(int code, String msg) {
        return new Result(code, msg);
    }

    public Result Data(Object data){
        this.setData(data);
        return this;
    }

    public Result Result(int code, String msg, boolean flag) {
        this.code = code;
        this.msg = msg;
        this.flag = flag;
        return  this;
    }

    public Result Result(int code, String msg, boolean flag, Object data) {
        this.code = code;
        this.msg = msg;
        this.flag = flag;
        this.data = data;
        return  this;
    }
}
