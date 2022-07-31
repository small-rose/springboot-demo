package cn.xiaocai.js.data.controller;

import cn.xiaocai.js.data.persistence.entity.ArticleRank;
import cn.xiaocai.js.data.persistence.service.SearchService;
import cn.xiaocai.js.data.search.vo.NameResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpClientErrorException;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/7/31 10:58
 * @version: v1.0
 */
@Controller
@Slf4j
public class SearchController {

    @Autowired
    private SearchService searchService ;

    @RequestMapping("/index.html")
    public String openSearch(Model model) {
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        model.addAttribute("lastModify", format);
        Long aLong = searchService.searchRankCount();
        model.addAttribute("count", aLong);
        model.addAttribute("addressUrl", "jianshu.com");
        return "ResourceTree";
    }

    @RequestMapping("/")
    public String home() {
        return "forward:/index.html";
    }

    @RequestMapping("/search")
    public String doSearch(String keyword, Model model, HttpServletRequest request) {
        if (!StringUtils.hasText(keyword)) {
            throw new HttpClientErrorException(HttpStatus.NOT_ACCEPTABLE,"参数keyword不能为空");
        }
        List<NameResult> articleRanks = searchService.searchByKeyword(keyword);

        model.addAttribute("results", articleRanks);
        return "searchResultJson";
    }


    @RequestMapping("/version")
    public String getVersions(String groupId, String artifactId, Model model) {
        try {
            List<ArticleRank> articleRanks = searchService.searchArticleRankList(groupId);

            model.addAttribute("groupId", groupId);
            model.addAttribute("artifactId", artifactId);
            model.addAttribute("items", articleRanks);
            Long count = searchService.searchRankCountByName(groupId);
            model.addAttribute("artifact", count);


        } catch (Exception e) {
            throw new RuntimeException("版本查询失败", e);
        }
        return "versionList";
    }

}
