package cn.xaiocai.limiter.exception;

/**
 * @program: rate-limit-distributed-starter
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-28 16:20
 **/
public class RateLimitConfigException extends RateLimitException{

    /**
     * Instantiates a new Tcc runtime exception.
     */
    public RateLimitConfigException() {
    }

    /**
     * Instantiates a new Tcc runtime exception.
     *
     * @param message the message
     */
    public RateLimitConfigException(final String message) {
        super(message);
    }

    /**
     * Instantiates a new Tcc runtime exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public RateLimitConfigException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Tcc runtime exception.
     *
     * @param cause the cause
     */
    public RateLimitConfigException(final Throwable cause) {
        super(cause);
    }
}
