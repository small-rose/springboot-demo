package com.xiaocai.demo.mockito.web.exception;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/5/15 14:52
 * @version: v1.0
 */
public class ServiceException extends  Exception{

    public ServiceException() {
        super();
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }
}
