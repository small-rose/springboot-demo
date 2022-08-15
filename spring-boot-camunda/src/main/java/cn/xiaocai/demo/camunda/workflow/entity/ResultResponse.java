package cn.xiaocai.demo.camunda.workflow.entity;

import java.io.Serializable;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ ResultResponse ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/8/11 12:36
 * @Version ： 1.0
 **/
public class ResultResponse<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private T data;
    private boolean success = true;
    private Integer code;
    private String message;

    public ResultResponse<T> data(T data) {
        this.data = data;
        return this;
    }

    public ResultResponse() {
    }

    public T getData() {
        return this.data;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setData(final T data) {
        this.data = data;
    }

    public void setSuccess(final boolean success) {
        this.success = success;
    }

    public void setCode(final Integer code) {
        this.code = code;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ResultResponse)) {
            return false;
        } else {
            ResultResponse<?> other = (ResultResponse)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data != null) {
                        return false;
                    }
                } else if (!this$data.equals(other$data)) {
                    return false;
                }

                if (this.isSuccess() != other.isSuccess()) {
                    return false;
                } else {
                    Object this$code = this.getCode();
                    Object other$code = other.getCode();
                    if (this$code == null) {
                        if (other$code != null) {
                            return false;
                        }
                    } else if (!this$code.equals(other$code)) {
                        return false;
                    }

                    Object this$message = this.getMessage();
                    Object other$message = other.getMessage();
                    if (this$message == null) {
                        if (other$message != null) {
                            return false;
                        }
                    } else if (!this$message.equals(other$message)) {
                        return false;
                    }

                    return true;
                }
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ResultResponse;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        result = result * 59 + (this.isSuccess() ? 79 : 97);
        Object $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        Object $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        return result;
    }

    public String toString() {
        return "ResultResponse(data=" + this.getData() + ", success=" + this.isSuccess() + ", code=" + this.getCode() + ", message=" + this.getMessage() + ")";
    }
}
