package cn.xiaocai.demo.jsoup.web.config;

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

/**
 * @Project : bp-paystation
 * @Author : small-rose/zhangxiaocai
 * @Description : [ AppServerInfo ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/7/29 16:24
 * @Version ： 1.0
 **/
@Slf4j
@Component
public class AppServerInfo  implements ApplicationListener<WebServerInitializedEvent> {


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
                    "\n\tCheckUrl:\thttp://{}:{}{}{}" +
                    "\n\tApiInfo:\t{}" +
                    "\n------------------------------------------------------------\n",
                port, contextPath,
                ip, port, contextPath,
                ip, port, contextPath, "/path",
                termsOfServiceUrl);

    }
}
