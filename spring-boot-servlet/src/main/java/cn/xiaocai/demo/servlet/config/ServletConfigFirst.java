package cn.xiaocai.demo.servlet.config;

import cn.xiaocai.demo.servlet.action.LoginServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springboot-servlet
 * @description  servlet 注册方式 一  : 直接使用 bean 的方式注入
 * @function:
 * @author: zzy
 * @create: 2021-05-11 17:28
 **/
@Configuration
public class ServletConfigFirst {

    @Bean
    public ServletRegistrationBean payResultQuery() {
        //放入自己的Servlet对象实例
        ServletRegistrationBean bean = new ServletRegistrationBean(new LoginServlet());
        //访问路径值 , 路径规则自己定义即可
        bean.addUrlMappings("/login.do");
        return bean;
    }
}
