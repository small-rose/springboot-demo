package cn.xiaocai.demo.cxf.config;

import cn.xiaocai.demo.cxf.interceptor.AuthInterceptor;
import cn.xiaocai.demo.cxf.service.TestService;
import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import javax.xml.ws.Endpoint;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-04-30 17:30
 **/
@Configuration
public class WebServiceEndpointConfig  {


}
