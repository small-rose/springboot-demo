package cn.xiaocai.id;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.util.Assert;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ IdService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/2/17 16:09
 * @Version ： 1.0
 **/

public class IdService {
    private static final Logger log = LoggerFactory.getLogger(IdService.class);
    public static final long MAX_BITS = 63L;
    private volatile long serverId;
    private volatile long sequence;

    /**
     * 开始时间截 (2015-01-01)
     */
    public final long baseTime = 1622605643198L ;//1643703348L; //2022-02-01 16:15:48
    protected long maxServerId;
    private long timeBackLeftShift;
    private long workerIdShift;
    private long timestampLeftShift;

    //每毫秒生产的序列号之从0开始递增；
    private long sequenceMask;
    private volatile Long lastTimestamp = -1L;
    private volatile long lastSequenceNo = 0L;
    private long timeBackMaxTimeMask;
    private volatile Long timeBackCount = 0L;
    private RedisTemplate<String, String> redisTemplate;

    public IdService() {
    }

    public void init(IdProperties idProperties, Environment env, RedisTemplate<String, String> redisTemplate) throws Exception {
        this.redisTemplate = redisTemplate;
        long serverIdBits = idProperties.getIdBit();
        long timeBits = idProperties.getTimeBit();
        long timeBackBits = idProperties.getTimeBackBit();
        long sequenceBits = idProperties.getSequenceBit();
        this.redisTemplate = redisTemplate;
        this.timeBackCount = 0L;
        IdConfig.firstLoadUpInRedisMode = false;
        IdConfig.active = false;
        boolean checkPass = false;
        if (idProperties.getIdMode() != null) {
            if (EnumIdMode.REDIS.value.equals(idProperties.getIdMode().toLowerCase())) {
                try {
                    log.info("SMALL-ID配置:::机器ID分配模式=Redis注册获取");
                    if (!this.hasRedisConfig(env)) {
                        log.error("SMALL-ID配置:::缺少redis连接配置!");
                        return;
                    }

                    String redisKeyPre = Tools.getLocalMacAddress();
                    String port = this.getSeverPort(env);
                    Assert.notNull(port, "SMALL-ID配置:::本机端口配置缺少!(server.port)");
                    String idPrefix = "SMALL-ID:IDKey:";
                    String keyPrefix = idPrefix + redisKeyPre + "-" + port;
                    log.info("SMALL-ID配置:::本机RedisKey={}", keyPrefix);
                    IdConfig.redisIdKey = this.getRedisIdKey(redisTemplate, keyPrefix);
                    if (IdConfig.redisIdKey == null) {
                        log.info("SMALL-ID配置:::Redis没有发现生成的配置.");

                        try {
                            this.serverId = this.initServerIdFromRedis(serverIdBits, idPrefix, keyPrefix);
                            if (this.serverId == -1L) {
                                log.error("SMALL-ID配置:::Redis获取不到可用的ID！");
                                return;
                            }
                        } catch (Exception var20) {
                            log.error("SMALL-ID配置:::Redis获取ID出错！信息={}", var20.getMessage());
                            return;
                        }
                    } else {
                        log.info("SMALL-ID配置:::加载redis的Key={}", IdConfig.redisIdKey);
                        String[] values = IdConfig.redisIdKey.split("#");
                        if (values.length < 2) {
                            log.error("SMALL-ID配置:::Redis获取ID解析错误!key=" + IdConfig.redisIdKey);
                            return;
                        }

                        this.serverId = Long.parseLong(values[1]);
                        String cacheInfoStr = this.getLastDataFromRedisInKey(redisTemplate, IdConfig.redisIdKey);
                        if (cacheInfoStr != null && !"".equals(cacheInfoStr.trim())) {
                            log.info("SMALL-ID配置:::Redis 获取CacheInfo={}", cacheInfoStr);
                            String[] cacheInfos = cacheInfoStr.split(",");
                            this.serverId = Long.parseLong(cacheInfos[0]);
                            this.timeBackCount = Long.parseLong(cacheInfos[1]);
                            this.lastTimestamp = Long.parseLong(cacheInfos[2]);
                            this.lastSequenceNo = Long.parseLong(cacheInfos[3]);
                        }
                    }

                    IdConfig.firstLoadUpInRedisMode = true;
                    checkPass = true;
                } catch (Exception var21) {
                    log.error("SMALL-ID配置:::Redis模式启动失败！错误=" + var21.getMessage());
                    return;
                }
            } else {
                if (!EnumIdMode.NUM.value.equals(idProperties.getIdMode().toLowerCase())) {
                    throw new Exception("SMALL-ID配置:::id-mode配置无效的值(id-mode=" + idProperties.getIdMode() + ")错误,请检查!");
                }

                log.info("SMALL-ID配置:::机器id分配模式=指定id的num. (id={})", idProperties.getId());
                this.serverId = idProperties.getId();
                checkPass = true;
            }
        }

        if (checkPass) {
            if (serverIdBits + sequenceBits + timeBackBits + timeBits != 63L) {
                log.error("SMALL-ID配置:::生成号区段配置错误!(各个部分占位长度和不等于63)");
                return;
            }

            log.info("SMALL-ID配置:::SMALL-ID生成器准备就绪!版本={}", IdConfig.VERSION);
            log.debug(String.format("SMALL-ID配置:::ID=%d,时间位数=%d,ID位数=%d,回拨位数=%d,序列位数=%d", this.serverId, timeBits, serverIdBits, timeBackBits, sequenceBits));
            this.sequenceMask = ~(-1L << (int)sequenceBits);
            this.timeBackMaxTimeMask = ~(-1L << (int)timeBackBits);
            this.maxServerId = ~(-1L << (int)serverIdBits);
            this.timeBackLeftShift = sequenceBits;
            this.workerIdShift = sequenceBits + timeBackBits;
            this.timestampLeftShift = sequenceBits + timeBackBits + serverIdBits;
            if (this.serverId > this.maxServerId || this.serverId < 0L) {
                IdConfig.active = false;
                log.error("Id生成器的序号超过位数最大值 {} 或者 小于0.", this.maxServerId);
                return;
            }

            IdConfig.active = true;
        }

    }

    private String getLastDataFromRedisInKey(RedisTemplate<String, String> redisTemplate, String redisIdKey) {
        return (String)redisTemplate.opsForValue().get(redisIdKey);
    }

    String getRedisIdKey(RedisTemplate<String, String> redisTemplate, String keyPrefix) {
        Set<String> keys = redisTemplate.keys(keyPrefix + "*");
        return keys != null && keys.size() > 0 ? (String)keys.iterator().next() : null;
    }

    boolean hasRedisConfig(Environment env) {
        String key = "spring.redis.host";

        try {
            Iterator var3 = ((StandardEnvironment)env).getPropertySources().iterator();

            while(var3.hasNext()) {
                PropertySource<?> dt = (PropertySource)var3.next();
                if (dt.containsProperty(key)) {
                    String host = String.valueOf(dt.getProperty(key));
                    if (host != null && host.trim().length() > 0) {
                        return true;
                    }
                }
            }
        } catch (Exception var6) {
        }

        return false;
    }

    private String getSeverPort(Environment env) throws Exception {
        String port = env.getProperty("server.port");
        if (port == null || "-1".equals(port)) {
            try {
                Iterator var3 = ((StandardEnvironment)env).getPropertySources().iterator();

                while(var3.hasNext()) {
                    PropertySource<?> dt = (PropertySource)var3.next();
                    if (dt.containsProperty("server.port")) {
                        port = String.valueOf(dt.getProperty("server.port"));
                        if (!"-1".equals(port) && port != null && port.trim().length() == 0) {
                            break;
                        }
                    }
                }
            } catch (Exception var6) {
                port = "null";
            }
        }

        if (!"-1".equals(port) && port != null) {
            try {
                int portInt = Integer.parseInt(port);
                return String.valueOf(portInt);
            } catch (Exception var5) {
                return null;
            }
        } else {
            return null;
        }
    }

    @Async
    void asyncWriteListValue(String value) {
        try {
            this.redisTemplate.opsForValue().set(IdConfig.redisIdKey, value);
            log.info(String.format("ID服务更新[%s][%s]", IdConfig.redisIdKey, value));
        } catch (Exception var3) {
            log.error("ID服务更新[%s][%s]失败！错误={}", var3.getMessage());
        }

    }

    private synchronized long initServerIdFromRedis(long serverIdBits, String idPrefix, String keyPrefix) {
        long maxNo = (long)Math.pow(2.0D, (double)serverIdBits);

        for(long exitCount = 0L; exitCount < 2L; ++exitCount) {
            Set<String> keys = this.redisTemplate.keys(idPrefix + "*");
            Object idMap;
            if (keys != null && keys.size() != 0) {
                idMap = (Map)keys.stream().collect(Collectors.toMap((t) -> {
                    String[] strs = t.split("#");
                    return strs[1];
                }, (s) -> {
                    return "1";
                }, (key1, key2) -> {
                    return key2;
                }));
            } else {
                idMap = new HashMap();
            }

            int id = this.initBlankId(keyPrefix, maxNo, (Map)idMap);
            if (id != -1) {
                return (long)id;
            }
        }

        return -1L;
    }

    private int initBlankId(String prefix, long maxNo, Map<String, Object> idMap) {
        for(int i = 0; (long)i < maxNo; ++i) {
            (new StringBuilder()).append(prefix).append("#").append(i).toString();
            String uuid = UUID.randomUUID().toString();
            if (idMap.get(String.valueOf(i)) == null) {
                this.redisTemplate.opsForValue().set("SMALL-ID:ServiceId:" + i, uuid, 6L, TimeUnit.SECONDS);
                String uuidGet = (String)this.redisTemplate.opsForValue().get("SMALL-ID:ServiceId:" + i);
                if (uuid.equals(uuidGet)) {
                    this.redisTemplate.opsForValue().set(prefix + "#" + i, "");
                    this.redisTemplate.delete("SMALL-ID:ServiceId:" + i);
                    return i;
                }
            }
        }

        return -1;
    }

    public void idSaveRedis() {
        if (!IdConfig.active) {
            log.error("SMALL-ID生成器没有就绪!");
        } else {
            String value = String.format("%d,%d,%d,%d", this.serverId, this.timeBackCount, this.lastTimestamp, this.lastSequenceNo);
            if (this.redisTemplate != null) {
                this.asyncWriteListValue(value);
            }

        }
    }

    public synchronized long nextId() {
        if (!IdConfig.active) {
            log.error("SMALL-ID生成器没有就绪!");
            return Long.parseLong((String)null);
        } else {
            long timestamp = this.timeGen();
            if (timestamp <= 1622605643198L) {
                log.error("严重错误！当前时间比基础时间早．");
                return Long.parseLong((String)null);
            } else {
                boolean isBack = false;
                if (IdConfig.firstLoadUpInRedisMode) {
                    IdConfig.firstLoadUpInRedisMode = false;
                    this.timeBackCount = this.timeBackCount + 1L & this.timeBackMaxTimeMask;
                    this.sequence = 0L;
                    isBack = true;
                } else {
                    if (timestamp < this.lastTimestamp) {
                        this.timeBackCount = this.timeBackCount + 1L & this.timeBackMaxTimeMask;
                        log.info(String.format("出现回拨，回拨编号=%d", this.timeBackCount));
                        isBack = true;
                    }

                    if (this.lastTimestamp == timestamp) {
                        this.sequence = this.sequence + 1L & this.sequenceMask;
                        if (this.sequence == 0L) {
                            timestamp = this.tilNextMillis(this.lastTimestamp);
                        }
                    } else {
                        this.sequence = 0L;
                    }
                }

                this.lastTimestamp = timestamp;
                this.lastSequenceNo = this.sequence;
                if (isBack) {
                    this.idSaveRedis();
                }

                return timestamp - 1622605643198L << (int)this.timestampLeftShift | this.serverId << (int)this.workerIdShift | this.timeBackCount << (int)this.timeBackLeftShift | this.sequence;
            }
        }
    }

    private long tilNextMillis(long lastTimestamp) {
        long timestamp;
        for(timestamp = this.timeGen(); timestamp <= lastTimestamp; timestamp = this.timeGen()) {
        }

        return timestamp;
    }

    private long timeGen() {
        return System.currentTimeMillis();
    }
}
