package com.xiaocai.demo.mockito.web.exception;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/5/15 15:06
 * @version: v1.0
 */
public class ValidateException extends  Exception{

    public ValidateException() {
        super();
    }

    public ValidateException(String message) {
        super(message);
    }

    public ValidateException(Throwable cause) {
        super(cause);
    }
}
