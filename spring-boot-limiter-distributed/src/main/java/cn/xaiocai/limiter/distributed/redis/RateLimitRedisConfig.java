package cn.xaiocai.limiter.distributed.redis;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-28 13:14
 **/
@Data
@ConfigurationProperties(prefix = RateLimitRedisConfig.REDIS_PREFIX)
public class RateLimitRedisConfig {

    public static final String REDIS_PREFIX = "limit.repository.redis";

    private boolean cluster;

    private boolean sentinel;

    /**
     * cluster url example:ip:port;ip:port.
     */
    private String clusterUrl;

    /**
     * sentinel url example:ip:port;ip:port.
     */
    private String sentinelUrl;

    private String masterName;

    private String hostName;

    private int port;

    private String password;

    private int maxTotal = 8;

    private int maxIdle = 8;

    private int minIdle;

    private long maxWaitMillis = -1;

    private boolean blockWhenExhausted = true;

    private int timeOut = 10000;
}
