package cn.xiaocai.js.data.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * https://www.jianshu.com/p/6ab1c85850e4
 */
@Configuration
public class WebMvcConfig 	 implements WebMvcConfigurer {
//public class WebMvcConfig extends WebMvcConfigurationSupport  {


	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        if(!registry.hasMappingForPattern("/static/**")){
            registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        }
    }

}