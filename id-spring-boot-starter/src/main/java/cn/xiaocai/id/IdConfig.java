package cn.xiaocai.id;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ IdConfig ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/2/17 16:08
 * @Version ： 1.0
 **/

@Configuration
@EnableConfigurationProperties({IdProperties.class})
@ConditionalOnProperty(
        prefix = "small-id",
        value = {"enabled"},
        matchIfMissing = true
)
public class IdConfig {

    private static final Logger log = LoggerFactory.getLogger(IdConfig.class);
    public static final String KEY_DOMAIN = "SMALL-ID";
    public static final String VERSION = "1.1.10.RELEASE";
    @Autowired
    private Environment env;
    @Autowired(
            required = false
    )
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private IdProperties idProperties;
    public static boolean active = false;
    public static volatile boolean firstLoadUpInRedisMode = false;
    public static String redisIdKey = null;

    public IdProperties getIdProperties() {
        return this.idProperties;
    }

    public void setIdProperties(IdProperties idProperties) {
        this.idProperties = idProperties;
    }

    public IdConfig() throws Exception {
    }

    @Bean
    public IdService idService() throws Exception {
        IdService idService = new IdService();
        idService.init(this.idProperties, this.env, this.redisTemplate);
        return idService;
    }
}
