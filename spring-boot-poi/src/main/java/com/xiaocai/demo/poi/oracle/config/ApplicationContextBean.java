package com.xiaocai.demo.poi.oracle.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 本类只是在调试 springboot 环境下的 bean的加载，暂时没有使用
 * 打印 调试 bean 加载情况 2021年07月
 * @author: 张小菜
 * @date: 2021/12/14 22:41
 * @version: v1.0
 */
@Component
public class ApplicationContextBean  implements ApplicationContextAware, InitializingBean {

        public static ApplicationContext applicationContext;

        /**
         * 获取 ApplicationContext
         *
         * @param applicationContext
         * @throws BeansException
         */
        @Override
        public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            ApplicationContextBean.applicationContext = applicationContext;
        }

        /**
         * 打印IOC容器中所有的Bean名称
         *
         * @throws Exception
         */
        @Override
        public void afterPropertiesSet() throws Exception {
            String[] names = applicationContext.getBeanDefinitionNames();
        /*
        for (String name : names) {
            System.out.println(">>>>>> " + name);
        }
         */
            System.out.println("------Bean 总计:" + applicationContext.getBeanDefinitionCount());
        }


        public  <T> T getBean(String name){
            return (T) applicationContext.getBean(name);
        }


}
