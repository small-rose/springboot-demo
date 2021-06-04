package cn.xaiocai.limiter.distributed.repository;


import cn.xaiocai.limiter.distributed.redis.RateLimitRedisConfig;
import cn.xaiocai.limiter.distributed.serializer.RateLimitSerializer;

/**
 * @program: rate-limit-distributed-starter
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-28 15:44
 **/
public interface RateLimitRepository {

    /**
     * Init.
     *
     * @param redisConfig the app redisConfig
     */
    void init(RateLimitRedisConfig redisConfig);

    /**
     * Sets serializer.
     *
     * @param rateLimitSerializer the RateLimitSerializer
     */
    void setSerializer(RateLimitSerializer rateLimitSerializer);

    /**
     * assist handle
     *
     */
    void assistantHandle();
}
