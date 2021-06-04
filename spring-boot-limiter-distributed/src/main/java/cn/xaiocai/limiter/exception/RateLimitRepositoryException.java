package cn.xaiocai.limiter.exception;

/**
 * @program: rate-limit-distributed-starter
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-28 16:11
 **/
public class RateLimitRepositoryException  extends RateLimitException{

    /**
     * Instantiates a new Tcc runtime exception.
     */
    public RateLimitRepositoryException() {
    }

    /**
     * Instantiates a new Tcc runtime exception.
     *
     * @param message the message
     */
    public RateLimitRepositoryException(final String message) {
        super(message);
    }

    /**
     * Instantiates a new Tcc runtime exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public RateLimitRepositoryException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Tcc runtime exception.
     *
     * @param cause the cause
     */
    public RateLimitRepositoryException(final Throwable cause) {
        super(cause);
    }
}
