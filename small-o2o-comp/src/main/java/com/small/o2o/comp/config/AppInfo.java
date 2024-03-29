package com.small.o2o.comp.config;


import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.boot.web.server.WebServer;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.net.InetAddress;

@Slf4j
@Component
public class AppInfo implements ApplicationListener<WebServerInitializedEvent> {


    @Autowired
    SwaggerConfig swaggerConfig;

    @SneakyThrows
    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        WebServer server = event.getWebServer();
        WebServerApplicationContext context = event.getApplicationContext();
        Environment env = context.getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        int port = server.getPort();
        String contextPath = env.getProperty("server.servlet.context-path");
        if (contextPath == null) {
            contextPath = "";
        }

        String termsOfServiceUrl = swaggerConfig.apiInfo().getTermsOfServiceUrl();
        log.info("\n------------------------------------------------------------\n" +
                        "\tApplication is running! Access address:\n" +
                        "\tLocal:\t\thttp://localhost:{}{}" +
                        "\n\tExternal:\thttp://{}:{}{}" +
                        "\n\tApiInfo:\t{}" +
                        "\n------------------------------------------------------------\n",
                port, contextPath,
                ip, port, contextPath,
                termsOfServiceUrl);

    }
}
