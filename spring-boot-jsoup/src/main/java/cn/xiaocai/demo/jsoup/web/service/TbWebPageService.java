package cn.xiaocai.demo.jsoup.web.service;

import cn.xiaocai.demo.jsoup.web.model.TbWebPage;
import cn.xiaocai.demo.jsoup.web.repository.TbWebPageDao;
import cn.xiaocai.demo.jsoup.web.vo.TbWebPageQueryVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ TbWebPageService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/23 17:55
 * @Version ： 1.0
 **/
@Service
@Slf4j
public class TbWebPageService {

    @Resource
    private TbWebPageDao tbWebPageDao ;


    public TbWebPage add(TbWebPage tbWebPage){
       return  tbWebPageDao.save(tbWebPage);
    }


    public TbWebPage update(TbWebPage tbWebPage){
        return  tbWebPageDao.saveAndFlush(tbWebPage);
    }


    public boolean delete(TbWebPage tbWebPage){
        tbWebPageDao.delete(tbWebPage);
        return true ;
    }


    public TbWebPage selectById(Long id){
        return  tbWebPageDao.getOne(id);
    }

    public List<TbWebPage> queryList(TbWebPage tbWebPage) {

        TbWebPage queryVo = new TbWebPage();
        queryVo.setPageName(tbWebPage.getPageName());
        queryVo.setPageNo(tbWebPage.getPageNo());
        queryVo.setPageId((long) 1234);
        // 自定义匹配策略
        ExampleMatcher matcher = ExampleMatcher.matching()
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.ignoreCase())//忽略大小写
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.startsWith())//模糊查询匹配开头，即{username}%
                .withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_name}%
                .withMatcher("web_url" ,ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_url}%
                .withIgnorePaths("web_id");//忽略字段，即不管password是什么值都不加入查询条件
        Example<TbWebPage> example = Example.of(queryVo ,matcher);

        List<TbWebPage> list = tbWebPageDao.findAll(example);
        return list ;
    }


    public Page<TbWebPage> queryListForPage(TbWebPage tbWebPage, Pageable pageable) {
        TbWebPage queryVo = new TbWebPage();
        queryVo.setPageName(tbWebPage.getPageName());
        queryVo.setPageNo(tbWebPage.getPageNo());
        queryVo.setPageId((long) 1234);
        // 自定义匹配策略
        ExampleMatcher matcher = ExampleMatcher.matching()
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.ignoreCase())//忽略大小写
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.startsWith())//模糊查询匹配开头，即{username}%
                .withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_name}%
                .withMatcher("web_url" ,ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_url}%
                .withIgnorePaths("web_id");//忽略字段，即不管password是什么值都不加入查询条件
        Example<TbWebPage> example = Example.of(queryVo ,matcher);

        return tbWebPageDao.findAll(example, pageable);
    }



    public Page<TbWebPage> queryListPageSpecification(TbWebPage tbWebPage, Pageable pageable) {


        //规格定义
        Specification<TbWebPage> specification = new Specification<TbWebPage>() {

            /**
             * 构造断言
             * @param root 实体对象引用
             * @param query 规则查询对象
             * @param cb 规则构建对象
             * @return 断言
             */
            @Override
            public Predicate toPredicate(Root<TbWebPage> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>(); //所有的断言
                if(StringUtils.isNotBlank(tbWebPage.getPageName())){ //添加断言
                    Predicate likeNickName = cb.like(root.get("web_name").as(String.class),tbWebPage.getPageName()+"%");
                    predicates.add(likeNickName);
                }
                return cb.and(predicates.toArray(new Predicate[0]));
            }
        };
       /* // JPA 分页从0开始
        if(pageNumber==null) pageNumber=1;
        if(pageSize==null) pageNumber=10;
        Pageable pageable = PageRequest.of(pageNumber-1, pageSize, Sort.Direction.DESC,"add_time");*/
        //查询
         return tbWebPageDao.findAll(specification, pageable);
    }




    /**
     * 实体管理对象
     *  注意这里使用的是 javax.persistence-api-2.2.jar
     *
     */
    @PersistenceContext
    EntityManager entityManager;

    /**
     * 分页查询 写法五
     * 使用entityManager，适用于动态sql查询
     *
     * （其他写法见 TbWebPageDao 中）
     *
     * @param tbWebPage
     * @param pageable
     * @return
     */
    public Page<TbWebPage> queryListPageAppendSQL(TbWebPageQueryVO tbWebPage, Pageable pageable) {
        StringBuilder countSelectSql = new StringBuilder();
        countSelectSql.append("select count(*) from TbWebPage po where 1=1 ");

        StringBuilder selectSql = new StringBuilder();
        selectSql.append("from TbWebPage po where 1=1 ");

        Map<String,Object> params = new HashMap<>();
        StringBuilder whereSql = new StringBuilder();
        if(StringUtils.isNotBlank(tbWebPage.getPageName())){
            whereSql.append(" and po.pageName=:pageName ");
            params.put("pageName", tbWebPage.getPageName());
        }

        if (tbWebPage.getStart() != null)
        {
            whereSql.append(" and po.addTime >= :startTime");
            params.put("startTime", tbWebPage.getStart());
        }
        if (tbWebPage.getEnd() != null)
        {
            whereSql.append(" and po.addTime <= :endTime");
            params.put("endTime", tbWebPage.getEnd());
        }

        String countSql = new StringBuilder().append(countSelectSql).append(whereSql).toString();
        Query countQuery = this.entityManager.createQuery(countSql);
        // 也可以写原生SQL 使用 entityManager.createNativeQuery 查
        this.setParameters(countQuery,params);
        Long count = (Long) countQuery.getSingleResult();

        String querySql = new StringBuilder().append(selectSql).append(whereSql).toString();
        TypedQuery query = this.entityManager.createQuery(querySql, TbWebPage.class);
        this.setParameters(query,params);
        if(pageable != null){ //分页
            query.setFirstResult(pageable.getPageNumber());
            query.setMaxResults(pageable.getPageSize());
        }

        List<TbWebPage> tbWebPageList = query.getResultList();
        if(pageable != null) { //分页
            Page<TbWebPage> incomeDailyPage = new PageImpl<TbWebPage>(tbWebPageList, pageable, count);
            return incomeDailyPage;
        }else{ //不分页
            return new PageImpl<TbWebPage>(tbWebPageList);
        }
    }

    /**
     * 给hql参数设置值
     * @param query 查询
     * @param params 参数
     */
    private void setParameters(Query query,Map<String,Object> params){
        for(Map.Entry<String,Object> entry:params.entrySet()){
            query.setParameter(entry.getKey(),entry.getValue());
        }
    }
}
