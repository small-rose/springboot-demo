package cn.xiaocai.js.data.config.fuzhu;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/7/31 19:22
 * @version: v1.0
 */
@Component
public class CacheManager {


    public final static Map<String, Long> LIMIT = new HashMap<>(5);

    @PostConstruct
    public void init(){
        LIMIT.put("LIMIT", (long) 30);
    }

    public long getLimit(){
       return LIMIT.get("LIMIT");
    }

    public void setLimit(Long limit){
         LIMIT.put("LIMIT", limit);
    }
}
