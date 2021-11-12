package com.example.qrcode.demo.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @program: bp-paystation-client
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-04-29 10:56
 **/

@Configuration
public class SwaggerConfig {

    @Autowired
    Environment environment;

    @Bean
    public Docket createRestApi() throws UnknownHostException {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example"))
                //.apis(RequestHandlerSelectors.withClassAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }
    public ApiInfo apiInfo() throws UnknownHostException {
        String ip = InetAddress.getLocalHost().getHostAddress();
        String contextPath = environment.getProperty("server.servlet.context-path");
        String port = environment.getProperty("server.port");
        return new ApiInfoBuilder()
                .title("bp-paystation api文档")
                .description("bp-paystation api文档")
                .termsOfServiceUrl("http://"+ip+":"+port+""+contextPath+"/swagger-ui.html, http://"+ip+":"+port+""+contextPath+"/doc.html")
                .version("version 1.0")
                .build();
    }
}
