package cn.xiaocai.demo.spider;

import cn.xiaocai.demo.spider.door.baserules.BaseWebRule;
import cn.xiaocai.demo.spider.door.webrules.TemplateRule;
import cn.xiaocai.demo.spider.rules.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.*;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/29 22:46
 * @version: v1.0
 */
@Slf4j
public class LoadRulesHelper {

    public static List<BaseWebRule> rules = new ArrayList<>();


    private TemplateRule templateRule;

    public static void loadProperties() throws FileNotFoundException {
        Properties properties = new Properties();

        InputStream inputStream =null;
        String testPath = "D:\\dev-tools-JetBrains\\idea-work\\springboot-demo\\spring-boot-spider\\config\\rules.properties";
        try {
            //testPath = "config/rules.properties";
            properties.load(new FileInputStream(testPath));

            /* 注释：也可以直接在src/main/resources目录下新建配置文件，但是new FileInputStream("res/myCanal.properties")需要改为new FileInputStream("src/main/resources/myCanal.properties") */

        }catch (FileNotFoundException e) {
            e.printStackTrace();
            log.info("找不到配置文件！");
            throw new FileNotFoundException("找不到配置文件！");
        }catch (IOException e) {
            e.printStackTrace();
        }
        Set<String> strings = properties.stringPropertyNames();
        for (String key : strings){
            System.out.println("key : "+ key +" , value : " + properties.getProperty(key));
        }

        System.out.println("----rules ----" + properties.getProperty("rules"));
        System.out.println("-------------------");


    }


    public static void loadYml() throws FileNotFoundException {
        Yaml yaml = new Yaml();

        InputStream inputStream =null;
        String testPath = "D:\\dev-tools-JetBrains\\idea-work\\springboot-demo\\spring-boot-spider\\config\\rules.yml";
        try {
            //testPath = "config/rules.properties";

            inputStream = new FileInputStream(testPath);

            Map<String, Object> objectMap = (Map<String, Object>) yaml.load(inputStream);
            List ruleList = (List) objectMap.get("rules");
            TemplateRule templateRule = null ;
            CategoryRule categoryRule= null ;
            CategoryPageRule categoryPageRule= null ;
            LinkGroupRule linkGroupRule= null ;
            LinkGroupPageRule linkGroupPageRule= null ;
            PicLinkRule picLinkRule= null ;
            LinkedHashMap category, categoryPage, linkgroup, linkGroupPage, picLink;
            for (Object object : ruleList){
                System.out.println(object);
                LinkedHashMap rule = (LinkedHashMap) object;
                String door = (String) rule.get("door");
                category = (LinkedHashMap) rule.get("category-rule");
                categoryPage = (LinkedHashMap) rule.get("category-pages-rule");
                linkgroup = (LinkedHashMap) rule.get("link-group-rule");
                linkGroupPage = (LinkedHashMap) rule.get("link-group-pages-rule");
                picLink = (LinkedHashMap) rule.get("pic-link-rule");

                templateRule = new TemplateRule(door);
                categoryRule = new CategoryRule();
                ;
                categoryRule.setEleLocation((String) category.get("eleLocation"));
                List<String> ckeys = (List<String>) category.get("skipKeys");
                categoryRule.setSkipKeys(ckeys);


                String categoryName = (String) category.get("skipKeys");
                if (StringUtils.hasText(categoryName)) {
                    templateRule.setCategoryKeys(categoryName);
                }
                templateRule.setCategoryRule(categoryRule);

                categoryPageRule = new CategoryPageRule();
                categoryPageRule.setEleLocation((String) categoryPage.get("eleLocation"));
                List<String> cpkeys = (List<String>) categoryPage.get("skipKeys");
                categoryPageRule.setSkipKeys(cpkeys);
                templateRule.setCategoryPageRule(categoryPageRule);

                linkGroupRule = new LinkGroupRule();
                linkGroupRule.setEleLocation((String) linkgroup.get("eleLocation"));
                 List<String> lkeys = (List<String>) linkgroup.get("skipKeys");
                linkGroupRule.setSkipKeys(lkeys);
                templateRule.setCategoryRule(categoryRule);


                linkGroupPageRule = new LinkGroupPageRule();
                linkGroupPageRule.setEleLocation((String) linkGroupPage.get("eleLocation"));
                List<String> lgkeys = (List<String>) linkGroupPage.get("skipKeys");
                linkGroupPageRule.setSkipKeys(lgkeys);
                templateRule.setLinkGroupPageRule(linkGroupPageRule);

                picLinkRule = new PicLinkRule();
                picLinkRule.setEleLocation((String) picLink.get("eleLocation"));
                picLinkRule.setImgSrcKey((String) picLink.get("img-src-key"));
                templateRule.setPicLinkRule(picLinkRule);

                rules.add(templateRule);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
            log.info("找不到配置文件！");
            throw new FileNotFoundException("找不到配置文件！");
        }

        log.info("---------load over----------");


    }

    public static void saveYml() throws FileNotFoundException {
        Yaml yaml = new Yaml();

         String testPath = "D:\\dev-tools-JetBrains\\idea-work\\springboot-demo\\spring-boot-spider\\config\\rules1.yml";
        try {
            //testPath = "config/rules.properties";

            FileWriter dumpFile  = new FileWriter(testPath);

            //Map<String, Object> objectMap = (Map<String, Object>) yaml.load(inputStream);
            List ruleList = new ArrayList<>();
            TemplateRule templateRule = null ;
            CategoryRule categoryRule= null ;
            CategoryPageRule categoryPageRule= null ;
            LinkGroupRule linkGroupRule= null ;
            LinkGroupPageRule linkGroupPageRule= null ;
            PicLinkRule picLinkRule= null ;
            LinkedHashMap category, categoryPage, linkgroup, linkGroupPage, picLink;
            for (Object object : ruleList){
                System.out.println(object);
                LinkedHashMap rule = (LinkedHashMap) object;
                String door = (String) rule.get("door");
                category = (LinkedHashMap) rule.get("category-rule");
                categoryPage = (LinkedHashMap) rule.get("category-pages-rule");
                linkgroup = (LinkedHashMap) rule.get("link-group-rule");
                linkGroupPage = (LinkedHashMap) rule.get("link-group-pages-rule");
                picLink = (LinkedHashMap) rule.get("pic-link-rule");

                templateRule = new TemplateRule(door);
                categoryRule = new CategoryRule();
                ;
                categoryRule.setEleLocation((String) category.get("eleLocation"));
                List<String> ckeys = (List<String>) category.get("skipKeys");
                categoryRule.setSkipKeys(ckeys);


                String categoryName = (String) category.get("skipKeys");
                if (StringUtils.hasText(categoryName)) {
                    templateRule.setCategoryKeys(categoryName);
                }
                templateRule.setCategoryRule(categoryRule);

                categoryPageRule = new CategoryPageRule();
                categoryPageRule.setEleLocation((String) categoryPage.get("eleLocation"));
                List<String> cpkeys = (List<String>) categoryPage.get("skipKeys");
                categoryPageRule.setSkipKeys(cpkeys);
                templateRule.setCategoryPageRule(categoryPageRule);

                linkGroupRule = new LinkGroupRule();
                linkGroupRule.setEleLocation((String) linkgroup.get("eleLocation"));
                List<String> lkeys = (List<String>) linkgroup.get("skipKeys");
                linkGroupRule.setSkipKeys(lkeys);
                templateRule.setCategoryRule(categoryRule);


                linkGroupPageRule = new LinkGroupPageRule();
                linkGroupPageRule.setEleLocation((String) linkGroupPage.get("eleLocation"));
                List<String> lgkeys = (List<String>) linkGroupPage.get("skipKeys");
                linkGroupPageRule.setSkipKeys(lgkeys);
                templateRule.setLinkGroupPageRule(linkGroupPageRule);

                picLinkRule = new PicLinkRule();
                picLinkRule.setEleLocation((String) picLink.get("eleLocation"));
                picLinkRule.setImgSrcKey((String) picLink.get("img-src-key"));
                templateRule.setPicLinkRule(picLinkRule);

                rules.add(templateRule);

            }


            yaml.dump(rules, dumpFile);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
            log.info("找不到配置文件！");
            throw new FileNotFoundException("找不到配置文件！");
        } catch (IOException e) {
            e.printStackTrace();
        }

        log.info("---------load over----------");

        /*
        <dependency>
            <groupId>org.jyaml</groupId>
            <artifactId>jyaml</artifactId>
            <version>1.3</version>
        </dependency>
         */
    }
}
