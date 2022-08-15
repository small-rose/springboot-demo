package cn.xiaocai.demo.camunda.exception;

public class BizException extends RuntimeException {

    public BizException(String message) {
        super(message);
    }
}
