package cn.xiaocai.js.data.persistence.repostory;

import cn.xiaocai.js.data.persistence.entity.ArticleRank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/7/31 10:03
 * @version: v1.0
 */
@Repository
public interface ArticleRankRepository extends JpaRepository<ArticleRank,Long> {

    @Query(value = "select distinct t.author_nickname, t.author_nickname_py from JS_ARTICLE_RANK t where t.author_nickname like %?1% or t.author_nickname_py like %?1%  order by t.rank_date desc ",nativeQuery = true )
    List<Map<String, Object>> findByNameLike(String name);



    @Query(value = "select t.* from JS_ARTICLE_RANK t where t.author_nickname = ?1  order by t.rank_date desc limit ?2 ",nativeQuery = true )
    List<ArticleRank> findByName(String name,long limit );

    @Query(value = "select count(1) from JS_ARTICLE_RANK  where author_nickname = ?1  order by rank_date desc ",nativeQuery = true )
    Long countByName(String name);

    @Transactional
    @Modifying
    @Query(value = "delete from JS_ARTICLE_RANK  where rank_date = ?1 ",nativeQuery = true )
    Integer deleteByDate(String billDate);

    @Query(value = "select count(1) from JS_ARTICLE_RANK  where rank_date = ?1 ",nativeQuery = true )
    Long countByDate(String yyyyMMdd);
}
