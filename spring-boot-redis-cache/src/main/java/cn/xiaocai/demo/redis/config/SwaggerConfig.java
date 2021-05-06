package cn.xiaocai.demo.redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @program: spring-boot-redis-cache
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-04-29 10:56
 **/

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.xiaocai"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("springboot-redis-cache  测试 文档")
                .description("使用 RestFul 风格模拟客户端 触发 redis 操作 进行测试")
                .termsOfServiceUrl("http://localhost:8081/springboot/swagger-ui.html ，http://localhost:8081/springboot-redis/odc.html")
                .version("version 1.0")
                .build();
    }
}
