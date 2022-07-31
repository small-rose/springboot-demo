package cn.xiaocai.js.data.config;

import cn.xiaocai.js.data.persistence.id.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/7/31 10:22
 * @version: v1.0
 */
@Component
public class IDService {

    private static IdWorker idWorkerUtil;
    @Autowired
    IdWorker idWorker ;

    @PostConstruct
    public void init(){
        idWorkerUtil = idWorker ;
    }


    public static long getNextId(){
        return idWorkerUtil.nextId();
    }
}
