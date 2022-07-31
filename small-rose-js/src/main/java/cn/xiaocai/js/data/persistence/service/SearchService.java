package cn.xiaocai.js.data.persistence.service;

import cn.xiaocai.js.data.config.fuzhu.CacheManager;
import cn.xiaocai.js.data.persistence.entity.ArticleRank;
import cn.xiaocai.js.data.persistence.repostory.ArticleRankRepository;
import cn.xiaocai.js.data.search.vo.NameResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/7/31 11:59
 * @version: v1.0
 */
@Service
public class SearchService {

    @Autowired
    private ArticleRankRepository articleRankRepository ;
    @Autowired
    private CacheManager cacheManager ;


    public Long searchRankCount() {
        Long count = articleRankRepository.count();
        return count;
    }

    public List<NameResult> searchByKeyword(String keyword) {
        List<Map<String, Object>> byNameLikeList = articleRankRepository.findByNameLike(keyword);
        List<NameResult> results = new ArrayList<>(byNameLikeList.size()) ;
        for (Map<String, Object> objectMap : byNameLikeList) {
            NameResult nameResult = new NameResult();
            nameResult.setAuthor_nickname((String) objectMap.get("author_nickname"));
            nameResult.setAuthor_nickname_py((String) objectMap.get("author_nickname_py"));
            results.add(nameResult);
        }
        return results;
    }

    public List<ArticleRank> searchArticleRankList(String keyword) {
        long limit = cacheManager.getLimit();
        if (limit<=0){
            limit =30 ;
            cacheManager.setLimit(limit);
        }
        List<ArticleRank> byNameLikeList = articleRankRepository.findByName(keyword, limit);
        return byNameLikeList;
    }

    public Long searchRankCountByName(String name) {
        Long count = articleRankRepository.countByName(name);
        return count;
    }

    @Transactional
    public Integer deleteAll(List<String> dateList) {
        Integer total = 0 ;
        for (String billDate : dateList) {
            if (StringUtils.hasText(billDate)) {
                int a = articleRankRepository.deleteByDate(billDate);
                total += a ;
            }
        }
        return total ;
    }
}
