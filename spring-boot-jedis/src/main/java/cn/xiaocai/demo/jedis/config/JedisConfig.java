package cn.xiaocai.demo.jedis.config;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedisPool;
import redis.clients.jedis.util.Hashing;
import redis.clients.jedis.util.Sharded;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/26 21:45
 * @version: v1.0
 */
@Configuration
@EnableCaching
public class JedisConfig implements InitializingBean {

    private static Logger logger = LoggerFactory.getLogger(JedisConfig.class);

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private String port;

    @Value("${spring.redis.jedis.pool.max-active}")
    private String maxActive;

    @Value("${spring.redis.jedis.pool.max-wait}")
    private String maxWait;

    @Value("${spring.redis.jedis.pool.max-idle}")
    private String maxIdle;


    /**
     * 初始化jedis连接池
     */
    @Bean
    public ShardedJedisPool jedisPoolConfig() {
        // 创建jedis池配置实例
        GenericObjectPoolConfig jedisPoolConfig = new JedisPoolConfig();

        // 设连接池最大连接数
        jedisPoolConfig.setMaxTotal(Integer.parseInt(maxActive));

        // 连接池中的最大空闲连接
        jedisPoolConfig.setMaxIdle(Integer.parseInt(maxIdle));

        // 连接池最大阻塞等待时间
        //jedisPoolConfig.setMaxWaitMillis(Long.valueOf(maxWait.substring(0, maxWait.length() - 2)));
        jedisPoolConfig.setMaxWaitMillis(Long.valueOf(maxWait));

        // #jedis调用borrowObject方法时，是否进行有效检查
        jedisPoolConfig.setTestOnBorrow(Boolean.valueOf(true));

        // #jedis调用returnObject方法时，是否进行有效检查
        jedisPoolConfig.setTestOnReturn(Boolean.valueOf(true));

        List<JedisShardInfo> jdsInfoList = new ArrayList<JedisShardInfo>(2);

        JedisShardInfo jedisShardInfo = new JedisShardInfo(host, port);
        jdsInfoList.add(jedisShardInfo);

        ShardedJedisPool pool = new ShardedJedisPool(jedisPoolConfig, jdsInfoList, Hashing.MURMUR_HASH, Sharded.DEFAULT_KEY_TAG_PATTERN);
        return pool;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("****************正在初始化Redis****************");
        logger.info("******Redis-Url:" + host + ":" + port + "******");
        logger.info("********************************************");
    }
}
