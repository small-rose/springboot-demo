/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.xaiocai.limiter.distributed.repository;



import cn.xaiocai.limiter.distributed.jedis.JedisClient;
import cn.xaiocai.limiter.distributed.jedis.JedisClientCluster;
import cn.xaiocai.limiter.distributed.jedis.JedisClientSentinel;
import cn.xaiocai.limiter.distributed.jedis.JedisClientSingle;
import cn.xaiocai.limiter.distributed.redis.RateLimitRedisConfig;
import cn.xaiocai.limiter.distributed.serializer.RateLimitSerializer;
import cn.xaiocai.limiter.exception.RateLimitRepositoryException;
import cn.xiaocai.limiter.spi.RateLimitSPI;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.*;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author zxc
 */
public class RedisRepository implements RateLimitRepository {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(RedisRepository.class);

    private static final String RateLimit_Key_GLOBAL = "RateLimit_key_global";

    private String rootPathPrefix = "rateLimit";
    
    private String keyPrefix = "-";
    
    private String appName;
    
    private RateLimitSerializer  rateLimitSerializer;
    
    private JedisClient jedisClient;

    private RateLimitRedisConfig redisConfig ;
    
    @Override
    public void init(final RateLimitRedisConfig redisConfig) {
        this.appName = appName;
        this.redisConfig  = redisConfig;
        try {
            buildJedisPool(redisConfig);
        } catch (Exception e) {
            LOGGER.error("redis init error please check you config:{}", e.getMessage());
            throw new RateLimitRepositoryException(e);
        }
    }

    @Override
    public void setSerializer(RateLimitSerializer rateLimitSerializer) {
        this.rateLimitSerializer = rateLimitSerializer;
    }

    public JedisClient getJedisClient() {
        return jedisClient;
    }

    @Override
    public void assistantHandle() {

    }

    
    private String buildRateLimitRootPath() {
        return rootPathPrefix + keyPrefix + RateLimit_Key_GLOBAL;
    }
    

    private void buildJedisPool(final RateLimitRedisConfig RateLimitRedisConfig) {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(RateLimitRedisConfig.getMaxIdle());
        config.setMinIdle(RateLimitRedisConfig.getMinIdle());
        config.setMaxTotal(RateLimitRedisConfig.getMaxTotal());
        config.setMaxWaitMillis(RateLimitRedisConfig.getMaxWaitMillis());

        JedisPool jedisPool;
        if (RateLimitRedisConfig.isCluster()) {
            //LogUtil.info(LOGGER, () -> "build redis cluster ............");
            final String clusterUrl = RateLimitRedisConfig.getClusterUrl();
            final Set<HostAndPort> hostAndPorts =
                    Lists.newArrayList(Splitter.on(";")
                            .split(clusterUrl))
                            .stream()
                            .map(HostAndPort::parseString).collect(Collectors.toSet());
            JedisCluster jedisCluster = new JedisCluster(hostAndPorts, config);
            jedisClient = new JedisClientCluster(jedisCluster);
        } else if (RateLimitRedisConfig.isSentinel()) {
            //LogUtil.info(LOGGER, () -> "build redis sentinel ............");
            final String sentinelUrl = RateLimitRedisConfig.getSentinelUrl();
            final Set<String> hostAndPorts =
                    new HashSet<>(Lists.newArrayList(Splitter.on(";").split(sentinelUrl)));
            JedisSentinelPool pool =
                    new JedisSentinelPool(RateLimitRedisConfig.getMasterName(), hostAndPorts,
                            config, RateLimitRedisConfig.getTimeOut(), RateLimitRedisConfig.getPassword());
            jedisClient = new JedisClientSentinel(pool);
        } else {
            if (StringUtils.isNoneBlank(RateLimitRedisConfig.getPassword())) {
                jedisPool = new JedisPool(config, RateLimitRedisConfig.getHostName(), RateLimitRedisConfig.getPort(), RateLimitRedisConfig.getTimeOut(), RateLimitRedisConfig.getPassword());
            } else {
                jedisPool = new JedisPool(config, RateLimitRedisConfig.getHostName(), RateLimitRedisConfig.getPort(), RateLimitRedisConfig.getTimeOut());
            }
            jedisClient = new JedisClientSingle(jedisPool);
        }
    }
    
    /**
     * The interface Filter.
     *
     * @param <T> the type parameter
     */
    interface Filter<T> {
    
        /**
         * Filter boolean.
         *
         * @param t      the t
         * @param params the params
         * @return the boolean
         */
        boolean filter(T t, Object... params);
    }
    
}
