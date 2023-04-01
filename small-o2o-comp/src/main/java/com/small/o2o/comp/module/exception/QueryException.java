package com.small.o2o.comp.module.exception;

/**
 * @author zhangxiaocai
 */
public class QueryException extends RuntimeException {

    public QueryException(String message) {
        super(message);
    }

    public QueryException(String message, Throwable cause) {
        super(message, cause);
    }
}
