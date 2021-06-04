package cn.xaiocai.limiter.distributed.auto;

import cn.xaiocai.limiter.aop.SpringRateLimitDistributedAspect;
import cn.xaiocai.limiter.distributed.redis.RateLimitRedisConfig;
import cn.xaiocai.limiter.distributed.repository.RedisRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springboot-limiter
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-28 13:16
 **/
@Slf4j
@Configuration
@EnableConfigurationProperties(RateLimitRedisConfig.class)
public class RateLimiterAutoConfiguration {

    @Bean
    @ConditionalOnClass(RateLimitRedisConfig.class)
    @ConditionalOnProperty(prefix =  RateLimitRedisConfig.REDIS_PREFIX)
    public RateLimitRedisConfig limitRedisProperties(){
        log.info("Init limitRedisProperties ... ");
        return new RateLimitRedisConfig();
    }

    @Bean
    public RedisRepository redisRepository(){
        log.info("Init RedisRepository ... ");
        RedisRepository redisRepository = new RedisRepository();
        redisRepository.init(limitRedisProperties());
        return redisRepository;
    }

    @Bean
    public SpringRateLimitDistributedAspect springRateLimitDistributedAspect(){
        log.info("Init SpringRateLimitDistributedAspect ... ");
        return new SpringRateLimitDistributedAspect(redisRepository());
    }
}
