package cn.xiaocai.demo.cxf.config;

import cn.xiaocai.demo.cxf.service.TestService;
import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.jaxws.EndpointImpl;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;

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
@ImportResource({ "classpath:META-INF/cxf/cxf.xml","classpath:META-INF/cxf/cxf-extension-jaxws.xml","classpath:META-INF/cxf/cxf-servlet.xml" })
public class CxfConfig {


    @Bean
    public ServletRegistrationBean<CXFServlet> cxfServlet() {
        return new ServletRegistrationBean<CXFServlet>(new CXFServlet(),"/services/*");
    }
    /*
    @Bean(name = "cxfServlet")
    public ServletRegistrationBean cxfServletRegistrationBean() {
        CXFServlet servlet = new CXFServlet();
        ServletRegistrationBean bean = new ServletRegistrationBean(servlet,
                "/services/*");
        bean.setLoadOnStartup(1);
        return bean;
    }
*/

}
