package cn.xiaocai.demo.spider.web.service;

import cn.xiaocai.demo.spider.web.config.RuleConfig;
import cn.xiaocai.demo.spider.web.vo.Rules;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.List;

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


    public boolean saveRules(Rules rules) {
        FileWriter fileWriter = null ;
        try {
            File visitor = ResourceUtils.getFile("classpath:custom-data.yml");
            Yaml yaml = new Yaml();
            fileWriter = new FileWriter(visitor);
            yaml.dump(rules, fileWriter);
            return true ;
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if (fileWriter!=null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
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
