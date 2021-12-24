package cn.xiaocai.demo.jsoup.web.repository;

import cn.xiaocai.demo.jsoup.web.model.TbWebCategory;
import cn.xiaocai.demo.jsoup.web.model.TbWebLink;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Project : springboot-demo
 * @Author : XiaoCai
 * @Description : [ TbWebLinkDao ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/24 9:33
 * @Version ： 1.0
 **/
public interface TbWebCategoryDao extends JpaRepository<TbWebCategory, Long> {

    Page<TbWebCategory> findAll(Specification<TbWebCategory> specification, Pageable pageable);
}
