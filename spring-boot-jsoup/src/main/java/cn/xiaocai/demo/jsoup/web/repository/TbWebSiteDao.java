package cn.xiaocai.demo.jsoup.web.repository;

import cn.xiaocai.demo.jsoup.web.model.TbWebSite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ TbWebSite ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/23 17:52
 * @Version ： 1.0
 **/
public interface TbWebSiteDao extends JpaRepository<TbWebSite, Long> {

    /**
     * 分页查询 写法一
     * 本地原生sql查询,注意表名啥的都用数据库中的名称，适用于特定数据库的查询
     *
     */
    @Query(value = "SELECT * FROM tb_web_site WHERE web_name = ?1",
            countQuery = "SELECT count(*) FROM tb_web_site WHERE web_name = ?1",
            nativeQuery = true)
    Page<TbWebSite> findByWebName(String webName, Pageable pageable);


    /** 分页查询 写法二
     *  jpa已经实现的分页接口，适用于简单的分页查询
     *  查询写法实例
     * @return
     */
    TbWebSite findFirstByOrderByWebNameAsc();

    TbWebSite findTopByOrderByAddTimeDesc();

    Page<TbWebSite> queryFirst10ByWebNameLike(String webName, Pageable pageable);

    Slice<TbWebSite> findTop3ByWebNameLike(String webName, Pageable pageable);

    List<TbWebSite> findFirst10ByWebNameLike(String webName, Sort sort);

    List<TbWebSite> findTop10ByWebNameLike(String webName, Pageable pageable);


    /**
     * 分页查询 写法三
     * Query注解, hql语局，适用于查询指定条件的数据
     * @param start
     * @param end
     * @param pageable
     * @return
     */
    @Query(value = "select b.webUrl from TbWebSite b where b.addTime between :start and :end   order by  b.addTime desc")
    Page<String> findWebUrlByAddTimeBetweenPageable(@Param("start") String start, @Param("end") String end, Pageable pageable);





    /**
     * 分页查询 写法四 扩充findAll，适用于动态sql查询
     *
     */
    Page<TbWebSite> findAll(Specification<TbWebSite> specification, Pageable pageable);
}
