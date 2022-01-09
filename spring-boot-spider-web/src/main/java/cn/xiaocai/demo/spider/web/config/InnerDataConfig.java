package cn.xiaocai.demo.spider.web.config;

import cn.xiaocai.demo.spider.web.vo.Rules;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.Yaml;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
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

    private String appdata = "/app-data.yml";
    private String customdata = "/custom-data.yml";

    private List<Rules> ruleList ;

    private List<String> ids ;

    @PostConstruct
    public void init() throws IOException {
/*

        InputStream inputStream = InnerDataConfig.class.getResourceAsStream("/app-data.yml");
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            String line = reader.readLine();
            log.info("----读取到line----"+line);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 获取类路径下的文件路径
        File path = new File(ResourceUtils.getURL("/app-data.yml").getPath());
        if (!path.exists()) {
            log.info("---文件不存在！----");
        }
        log.info("path = {}", path.getAbsolutePath());
*/


        //ResourceUtils的getFile方法无法获取jar中打包进去的资源文件，所以建议采用getInputStream方法获取resources目录下的资源文件。
        //File visitor = ResourceUtils.getFile("classpath:app-data.yml");
        //log.info("app-data.yml path = " + visitor.getAbsolutePath());

        // 读取内置数据
        ClassPathResource classPathResource = new ClassPathResource(appdata);
        log.info(classPathResource.getPath());
        InputStream fileInputStream = classPathResource.getInputStream();

        Yaml yaml = new Yaml();
        RuleConfig ruleConfig = yaml.loadAs(fileInputStream, RuleConfig.class);
        ruleList = ruleConfig.getRules();

        ids = ruleList.stream().map(Rules::getId).collect(Collectors.toList());
        log.info("ruleConfig :" + ruleConfig);
        log.info("ids :" + ids);
    }
}
