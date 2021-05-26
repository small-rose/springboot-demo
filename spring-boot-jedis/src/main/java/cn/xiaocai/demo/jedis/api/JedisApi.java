package cn.xiaocai.demo.jedis.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/26 22:08
 * @version: v1.0
 */
@Component
public class JedisApi {
    private static Logger logger = LoggerFactory.getLogger(JedisApi.class);

    // 成功标识
    private static final int REDIS_SUCCESS = 1;

    // 失败标识
    private static final int REDIS_FAILED = -1;

    @Autowired
    private ShardedJedisPool jedisPool;

    /**
     * @param key
     * @param message
     * @return boolean
     * @Description: 保存String信息
     * @author SLy
     * @date 2018-12-19 19:49
     */
    public Integer saveMessage(String key, String message) {
        ShardedJedis jedis = null;
        try {
            if (StringUtils.isEmpty(key)) {
                return REDIS_FAILED;
            }

            // 从jedis池中获取一个jedis实例
            jedis = jedisPool.getResource();
            jedis.set(key, message);

            return REDIS_SUCCESS;

        } catch (Exception e) {
            logger.error("保存String信息异常", e);
            e.printStackTrace();
        } finally {
            // 释放对象池，即获取jedis实例使用后要将对象还回去
            if (jedis != null)
                jedisPool.returnResource(jedis);
        }
        return REDIS_FAILED;
    }

    /**
     * @param key
     * @param message
     * @param expire
     * @return
     * @Description: 保存String信息(生命周期单位秒)
     * @author SLy
     * @date 2018-12-19 19:49
     */
    public Integer saveMessage(String key, String message, long expire) {
        ShardedJedis jedis = null;
        try {
            if (StringUtils.isEmpty(key)) {
                return REDIS_FAILED;
            }

            // 从jedis池中获取一个jedis实例
            jedis = jedisPool.getResource();
            jedis.set(key, message);
            jedis.expire(key, expire);

            return REDIS_SUCCESS;

        } catch (Exception e) {
            logger.error("保存String信息(生命周期单位秒)异常", e);
            e.printStackTrace();
        } finally {
            // 释放对象池，即获取jedis实例使用后要将对象还回去
            if (jedis != null)
                jedisPool.returnResource(jedis);
        }
        return REDIS_FAILED;
    }

    /**
     * @param key
     * @param message
     * @return
     * @Description: 保存byte[]信息
     * @author SLy
     * @date 2018-12-19 19:49
     */
    public Integer saveMessage(String key, byte[] message) {
        ShardedJedis jedis = null;
        try {
            if (!StringUtils.hasLength(key)) {
                return REDIS_FAILED;
            }

            // 从jedis池中获取一个jedis实例
            jedis = jedisPool.getResource();
            jedis.set(key.getBytes(), message);

            return REDIS_SUCCESS;

        } catch (Exception e) {
            logger.error("保存byte[]信息异常", e);
            e.printStackTrace();
        } finally {
            // 释放对象池，即获取jedis实例使用后要将对象还回去
            if (jedis != null)
                jedisPool.returnResource(jedis);
        }
        return REDIS_FAILED;
    }


    /**
     * @param key
     * @param value
     * @Description: 保存对象(序列化)
     * @author SLy
     * @date 2018-12-19 19:49
     */
    public Integer saveSerializeMessage(String key, Object value) {
        ShardedJedis jedis = null;
        try {
            if (!StringUtils.hasLength(key) || !StringUtils.isEmpty(value)) {
                return REDIS_FAILED;
            }

            byte[] val = SerializeUtil.serialize(value);

            // 从jedis池中获取一个jedis实例
            jedis = jedisPool.getResource();
            jedis.set(key.getBytes(), val);

            return REDIS_SUCCESS;

        } catch (Exception e) {
            logger.error("保存对象(序列化)异常", e);
            e.printStackTrace();
        } finally {
            // 释放对象池，即获取jedis实例使用后要将对象还回去
            if (jedis != null)
                jedisPool.returnResource(jedis);
        }
        return REDIS_FAILED;
    }

    /**
     * @param key
     * @return
     * @Description: 获取String对象类型值
     * @author SLy
     * @date 2018-12-19 19:49
     */
    public String getMessage(String key) {
        ShardedJedis jedis = null;
        try {
            if (!StringUtils.hasLength(key)) {
                return null;
            }

            // 从jedis池中获取一个jedis实例
            jedis = jedisPool.getResource();

            // 获取jedis实例后可以对redis服务进行一系列的操作
            String value = jedis.get(key);

            return value;

        } catch (Exception e) {
            logger.error("获取String对象类型值异常", e);
            e.printStackTrace();
        } finally {
            // 释放对象池，即获取jedis实例使用后要将对象还回去
            if (jedis != null)
                jedisPool.returnResource(jedis);
        }
        return null;
    }

    /**
     * @param key
     * @return
     * @Description: 获取对象(序列化)
     * @author SLy
     * @date 2018-12-19 19:49
     */
    public Object getSerializeMessage(String key) {
        ShardedJedis jedis = null;
        try {
            if (!StringUtils.hasLength(key)) {
                return null;
            }

            // 从jedis池中获取一个jedis实例
            jedis = jedisPool.getResource();


            if (StringUtils.isEmpty(jedis.get(key))) {
                return null;
            }

            // 获取jedis实例后可以对redis服务进行一系列的操作
            byte[] value = jedis.get(key.getBytes());
            Object data = SerializeUtil.unserialize(value);

            return data;

        } catch (Exception e) {
            logger.error("获取对象(序列化)异常", e);
            e.printStackTrace();
        } finally {
            // 释放对象池，即获取jedis实例使用后要将对象还回去
            if (jedis != null)
                jedisPool.returnResource(jedis);
        }
        return null;
    }

    /**
     * @param key
     * @return
     * @Description: 通过key删除数据
     * @author SLy
     * @date 2018-12-19 19:49
     */
    public Integer deleteByKey(String key) {
        ShardedJedis jedis = null;
        try {
            if (!StringUtils.hasLength(key)) {
                return REDIS_FAILED;
            }

            // 从jedis池中获取一个jedis实例
            jedis = jedisPool.getResource();
            jedis.del(key);

            return REDIS_SUCCESS;

        } catch (Exception e) {
            logger.error("通过key删除数据异常", e);
            e.printStackTrace();
        } finally {
            // 释放对象池，即获取jedis实例使用后要将对象还回去
            if (jedis != null)
                jedisPool.returnResource(jedis);
        }
        return REDIS_FAILED;
    }
}
