package cn.xiaocai.demo.spiderweb.rules;

import cn.xiaocai.demo.spider.web.vo.*;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ RuleJsonTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/4 12:19
 * @Version ： 1.0
 **/
@Slf4j
public class RuleJsonTest {

    @Test
    public void rules() throws Exception {

        Rules rules = new Rules();

        rules.setId("1");
        rules.setDoor("door");

        Category category = new Category();
        category.setCategoryName("jk");
        category.setEleLocation(".nav li");
        category.setSkipKeys(Arrays.asList("lll","323"));
        rules.setCategory(category);

        CategoryPages categoryPage = new CategoryPages();
        categoryPage.setEleLocation(".page list");
        categoryPage.setSkipKeys(Arrays.asList("lll",""));
        rules.setCategoryPages(categoryPage);


        LinkGroup linkGroup = new LinkGroup();
        linkGroup.setEleLocation("body p > a");
        linkGroup.setSkipKeys(Arrays.asList("AD",""));
        rules.setLinkGroup(linkGroup);

        LinkGroupPages linkGroupPages = new LinkGroupPages();
        linkGroupPages.setEleLocation("#aaa. b > c");
        rules.setLinkGroupPages(linkGroupPages);

        PicLink picLink = new PicLink();
        picLink.setEleLocation("main > img");
        rules.setPicLink(picLink);

        //String jsonString = JSON.toJSONString(rules);
        String jsonString = JSONObject.toJSONString(rules);
        log.info(jsonString);

        String json = "{\"id\":\"1\",\"door\":\"door\",\"category\":{\"categoryName\":\"jk\",\"eleLocation\":\".nav li\",\"linkHrefKey\":\"abs:href\",\"skipKeys\":[\"lll\",\"323\"]},\"categoryPages\":{\"eleLocation\":\".page list\",\"linkHrefKey\":\"abs:href\",\"skipKeys\":[\"lll\",\"\"]},\"linkGroup\":{\"eleLocation\":\"body p > a\",\"linkHrefKey\":\"abs:href\",\"skipKeys\":[\"AD\",\"\"]},\"linkGroupPages\":{\"eleLocation\":\"#aaa. b > c\",\"linkHrefKey\":\"abs:href\"},\"picLink\":{\"eleLocation\":\"main > img\"}}";

        Rules rules1 = JSONObject.parseObject(json, Rules.class);
        log.info("---" + rules1);

    }
}
