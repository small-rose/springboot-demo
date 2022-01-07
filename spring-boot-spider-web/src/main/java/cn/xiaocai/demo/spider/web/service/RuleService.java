package cn.xiaocai.demo.spider.web.service;

import cn.xiaocai.demo.spider.web.config.InnerDataConfig;
import cn.xiaocai.demo.spider.web.config.RuleConfig;
import cn.xiaocai.demo.spider.web.vo.Rules;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ RuleService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/31 23:42
 * @Version ： 1.0
 **/
@Slf4j
@Service
public class RuleService {

    @Autowired
    private InnerDataConfig innerDataConfig ;

    public boolean saveRules(List<Rules> rules) {
        FileWriter fileWriter = null ;
        try {
            List<String> ids = innerDataConfig.getIds();
            List<Rules> customRuleList = rules.stream().filter(r->!ids.contains(r.getId())).collect(Collectors.toList());

            File ymlPath = ResourceUtils.getFile("classpath:custom-data.yml");
            FileOutputStream outputStream = new FileOutputStream(ymlPath);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            //Yaml yaml = new Yaml();
            // yaml.dump(customRuleList, outputStreamWriter);
            //return true ;

            DumperOptions dumperOptions = new DumperOptions();
            dumperOptions.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
            dumperOptions.setDefaultScalarStyle(DumperOptions.ScalarStyle.PLAIN);
            dumperOptions.setPrettyFlow(false);
            Yaml yaml = new Yaml(dumperOptions);

            RuleConfig trmp = new RuleConfig();
            trmp.setRules(customRuleList);
            yaml.dump(trmp, outputStreamWriter);
            return true ;
        } catch (IOException e) {
            log.info("Write Yaml failed");
            e.printStackTrace();
        }
        return false ;
    }




    public List<Rules> queryCustomList() throws Exception{

        File visitor = ResourceUtils.getFile("classpath:custom-data.yml");
        Yaml yaml = new Yaml();
        RuleConfig ruleConfig = yaml.loadAs(new FileInputStream(visitor), RuleConfig.class);
        List<Rules>  ruleList = ruleConfig.getRules();

        log.info("custom ruleConfig :" + ruleConfig);
        return ruleList;
    }
}
