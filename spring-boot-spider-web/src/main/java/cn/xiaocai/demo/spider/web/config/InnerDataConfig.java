package cn.xiaocai.demo.spider.web.config;

import cn.xiaocai.demo.spider.web.vo.Rules;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import org.yaml.snakeyaml.Yaml;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
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
public class InnerDataConfig {

     private List<Rules> ruleList ;


    @PostConstruct
    public void init() throws FileNotFoundException {

        File visitor = ResourceUtils.getFile("classpath:app-data.yml");
        Yaml yaml = new Yaml();
        RuleConfig ruleConfig = yaml.loadAs(new FileInputStream(visitor), RuleConfig.class);
        ruleList = ruleConfig.getRules();

        log.info("ruleConfig :" + ruleConfig);
    }
}
