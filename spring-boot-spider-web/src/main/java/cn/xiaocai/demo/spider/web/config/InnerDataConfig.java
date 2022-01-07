package cn.xiaocai.demo.spider.web.config;

import cn.xiaocai.demo.spider.web.vo.Rules;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import org.yaml.snakeyaml.Yaml;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

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

    private List<String> ids ;

    @PostConstruct
    public void init() throws FileNotFoundException {

        InputStream inputStream = InnerDataConfig.class.getResourceAsStream("classpath:app-data.yml");
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            String line = reader.readLine();
            log.info("----读取到line----"+line);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 获取类路径下的文件路径
        File path = new File(ResourceUtils.getURL("classpath:app-data.yml").getPath());
        if (!path.exists()) {
            log.info("---文件不存在！----");
        }
        log.info("path = {}", path.getAbsolutePath());



        File visitor = ResourceUtils.getFile("classpath:app-data.yml");
        log.info("app-data.yml path = " + visitor.getAbsolutePath());

        Yaml yaml = new Yaml();
        RuleConfig ruleConfig = yaml.loadAs(new FileInputStream(visitor), RuleConfig.class);
        ruleList = ruleConfig.getRules();

        ids = ruleList.stream().map(Rules::getId).collect(Collectors.toList());
        log.info("ruleConfig :" + ruleConfig);
        log.info("ids :" + ids);
    }
}
