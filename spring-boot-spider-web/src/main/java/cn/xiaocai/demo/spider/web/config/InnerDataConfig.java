package cn.xiaocai.demo.spider.web.config;

import cn.xiaocai.demo.spider.web.vo.Category;
import cn.xiaocai.demo.spider.web.vo.Rules;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ InnerDataConfig ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/1 0:26
 * @Version ： 1.0
 **/
@Slf4j
@Data
//@Configuration
//@PropertySource("classpath:app-data.yml")
@Component
@ConfigurationProperties(prefix = "data")
public class InnerDataConfig {

    @Value("${category}")
    private Category category ;

    @Value("${rules}")
    private List<Rules> ruleList ;


    @PostConstruct
    public void init(){


        log.info("Initialized : "+ category);
        log.info("Initialized : "+ ruleList);
    }
}
