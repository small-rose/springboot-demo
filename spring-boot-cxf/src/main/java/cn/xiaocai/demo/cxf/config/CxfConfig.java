package cn.xiaocai.demo.cxf.config;

import cn.xiaocai.demo.cxf.interceptor.AuthInterceptor;
import cn.xiaocai.demo.cxf.service.TestService;
import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import javax.xml.ws.Endpoint;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-04-30 17:07
 **/
@Configuration
//@ImportResource({ "classpath:META-INF/cxf/cxf.xml","classpath:META-INF/cxf/cxf-extension-jaxws.xml","classpath:META-INF/cxf/cxf-servlet.xml" })
public class CxfConfig {


    @Bean
    public ServletRegistrationBean<CXFServlet> cxfServlet() {
        return new ServletRegistrationBean<CXFServlet>(new CXFServlet(),"/services/*");
    }

    @Value("${webservice.username}")
    private String username;
    @Value("${webservice.password}")
    private String password;

    @Bean
    public Bus bus(){
        BusFactory busFactory = BusFactory.newInstance();
        return busFactory.createBus();
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Autowired
    private TestService testService;

    /** JAX-WS **/
    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(springBus(), testService);
        // 服务端添加自定义拦截器：用户密码
        endpoint.getInInterceptors().add(new AuthInterceptor(username, password));
        endpoint.publish("/TestService");
        return endpoint;
    }

}
