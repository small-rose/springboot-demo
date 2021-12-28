package cn.xiaocai.demo.spider.rules;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/24 20:57
 * @version: v1.0
 */
@Data
@Slf4j
public class LinkGroupRule extends BaseRule{



    @Override
    protected BaseRule getRules() {
        return this;
    }


    @PostConstruct
    public void init(){
        log.info("============LinkPageRule Keys==============");
        print();
        log.info("============LinkPageRule Keys==============");
     }
}
