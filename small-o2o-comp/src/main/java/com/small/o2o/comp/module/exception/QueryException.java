package com.small.o2o.comp.module.exception;

/**
 * @author c_zhangzongyuan
 */
public class QueryException extends RuntimeException {

    public QueryException(String message) {
        super(message);
    }

    public QueryException(String message, Throwable cause) {
        super(message, cause);
    }
}
