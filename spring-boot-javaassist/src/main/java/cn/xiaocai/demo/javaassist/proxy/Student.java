package cn.xiaocai.demo.javaassist.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/16 14:38
 * @version: v1.0
 */
@Slf4j
public class Student implements IPersion{

    @Override
    public void eat(String cai) {
        log.info("学习在食堂吃饭, 今天的菜是 ：" + cai);
    }
}
