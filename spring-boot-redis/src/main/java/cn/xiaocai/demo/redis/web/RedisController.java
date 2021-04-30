package cn.xiaocai.demo.redis.web;


import cn.xiaocai.demo.redis.common.RedisUtil;
import cn.xiaocai.demo.redis.po.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @program: bp-paystation-client
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-04-29 16:47
 **/
@RestController
@Slf4j
@AllArgsConstructor
@Api(tags = "Redis-ops 测试")
public class RedisController {

    private final RedisUtil redisUtil;

    @ApiOperation("redis")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key", value = "缓存key", defaultValue = "key", required = true),
            @ApiImplicitParam(name = "value", value = "缓存value", defaultValue = "value", required = true)
    })
    @GetMapping("redis/{key}/{value}")
    public String redisOps(@PathVariable("key") String key, @PathVariable("value") String value){
        boolean b1 = redisUtil.set("key", "value");
        boolean b2 = redisUtil.set("1", "test1111");
        String cai = (String) redisUtil.get("zzy");
        log.info(" b1 = " +b1+" b2 = " +b2+" cai = "+cai);

        redisUtil.expire("1", 10, TimeUnit.SECONDS);


        boolean bk = redisUtil.set(key, value);
        redisUtil.expire(key, 15, TimeUnit.SECONDS);
        log.info(" bk = " +bk);

        return "SUCCESS";
    }

    private static  HashSet set = new HashSet<User>();
    private static List roles = new ArrayList();
    private static HashMap map = new HashMap<String,User>();

    static {
        User user1 = new User(9733L, "A1", new Date(),LocalDateTime.now(), true, "what is your name ".getBytes());
        User user2 = new User(9734L, "A2", new Date(),LocalDateTime.now(), false, "what is your name ".getBytes());
        User user3 = new User(9735L, "A3", new Date(),LocalDateTime.now(), true, "what is your name ".getBytes());
        User user4 = new User(9736L, "A4", new Date(),LocalDateTime.now(), false, "what is your name ".getBytes());
        User user5 = new User(9737L, "A5", new Date(),LocalDateTime.now(), true, "what is your name ".getBytes());
        set.add(user1);
        set.add(user2);

        map.put(user4.getId(), user1);
        map.put(user5.getId(), user1);

        roles.add(user1);
        roles.add(user3);
        roles.add(user5);
    }

    @ApiOperation("redis-obj")
    @PostMapping("redis-obj")
    public String redisObj(){

        User user = new User();
        user.setId(9733L);
        user.setImage("new FileInputStream(new File())".getBytes());
        user.setInDate(new Date());
        user.setOutTime(LocalDateTime.now());
        user.setOk(true);

        user.setLeaders(set);
        user.setRoles(roles);
        user.setPress(map);
        redisUtil.set("user:"+user.getId(), user.toString());

        redisUtil.expire("user:"+user.getId(), 60, TimeUnit.SECONDS);

        return "SUCCESS";
    }
}
