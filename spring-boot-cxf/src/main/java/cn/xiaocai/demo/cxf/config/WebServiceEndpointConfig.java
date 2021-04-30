package cn.xiaocai.demo.cxf.config;

import cn.xiaocai.demo.cxf.service.TestService;
import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(springBus(), testService);
        endpoint.publish("/TestService");
        return endpoint;
    }
}
