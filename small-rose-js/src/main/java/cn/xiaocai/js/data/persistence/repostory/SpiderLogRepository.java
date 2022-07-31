package cn.xiaocai.js.data.persistence.repostory;

import cn.xiaocai.js.data.persistence.entity.SpiderLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/7/31 10:03
 * @version: v1.0
 */
@Repository
public interface SpiderLogRepository extends JpaRepository<SpiderLog,Long> {

    @Query(value = "select * from JS_SPIDER_LOG where rank_date = :randDate and rank_type = :rankType"  ,nativeQuery = true)
    List<SpiderLog> selectByRankDateRankType(String randDate, String rankType);

}
