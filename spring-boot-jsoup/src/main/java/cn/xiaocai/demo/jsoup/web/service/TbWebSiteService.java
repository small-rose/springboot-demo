package cn.xiaocai.demo.jsoup.web.service;

import cn.xiaocai.demo.jsoup.web.model.TbWebSite;
import cn.xiaocai.demo.jsoup.web.repository.TbWebSiteDao;
import cn.xiaocai.demo.jsoup.web.vo.TbWebSiteQueryVO;
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
 * @Description : [ TbWebSiteService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/23 17:55
 * @Version ： 1.0
 **/
@Service
@Slf4j
public class TbWebSiteService {

    @Resource
    private TbWebSiteDao tbWebSiteDao ;


    public TbWebSite add(TbWebSite tbWebSite){
       return  tbWebSiteDao.save(tbWebSite);
    }


    public TbWebSite update(TbWebSite tbWebSite){
        return  tbWebSiteDao.saveAndFlush(tbWebSite);
    }


    public boolean delete(TbWebSite tbWebSite){
        tbWebSiteDao.delete(tbWebSite);
        return true ;
    }


    public TbWebSite selectById(Long id){
        return  tbWebSiteDao.getOne(id);
    }

    public List<TbWebSite> queryList(TbWebSite tbWebSite) {

        TbWebSite queryVo = new TbWebSite();
        queryVo.setWebName(tbWebSite.getWebName());
        queryVo.setWebUrl(tbWebSite.getWebUrl());
        queryVo.setWebId((long) 1234);
        // 自定义匹配策略
        ExampleMatcher matcher = ExampleMatcher.matching()
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.ignoreCase())//忽略大小写
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.startsWith())//模糊查询匹配开头，即{username}%
                .withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_name}%
                .withMatcher("web_url" ,ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_url}%
                .withIgnorePaths("web_id");//忽略字段，即不管password是什么值都不加入查询条件
        Example<TbWebSite> example = Example.of(queryVo ,matcher);

        List<TbWebSite> list = tbWebSiteDao.findAll(example);
        return list ;
    }


    public Page<TbWebSite> queryListForPage(TbWebSite tbWebSite, Pageable pageable) {
        TbWebSite queryVo = new TbWebSite();
        queryVo.setWebName(tbWebSite.getWebName());
        queryVo.setWebUrl(tbWebSite.getWebUrl());
        queryVo.setWebId((long) 1234);
        // 自定义匹配策略
        ExampleMatcher matcher = ExampleMatcher.matching()
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.ignoreCase())//忽略大小写
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.startsWith())//模糊查询匹配开头，即{username}%
                .withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_name}%
                .withMatcher("web_url" ,ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_url}%
                .withIgnorePaths("web_id");//忽略字段，即不管password是什么值都不加入查询条件
        Example<TbWebSite> example = Example.of(queryVo ,matcher);

        return tbWebSiteDao.findAll(example, pageable);
    }



    public Page<TbWebSite> queryListPageSpecification(TbWebSite tbWebSite, Pageable pageable) {
        TbWebSite queryVo = new TbWebSite();
        queryVo.setWebName(tbWebSite.getWebName());
        queryVo.setWebUrl(tbWebSite.getWebUrl());
        queryVo.setWebId((long) 1234);

        //规格定义
        Specification<TbWebSite> specification = new Specification<TbWebSite>() {

            /**
             * 构造断言
             * @param root 实体对象引用
             * @param query 规则查询对象
             * @param cb 规则构建对象
             * @return 断言
             */
            @Override
            public Predicate toPredicate(Root<TbWebSite> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>(); //所有的断言
                if(StringUtils.isNotBlank(tbWebSite.getWebName())){ //添加断言
                    Predicate likeNickName = cb.like(root.get("web_name").as(String.class),tbWebSite.getWebName()+"%");
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
         return tbWebSiteDao.findAll(specification, pageable);
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
     * （其他写法见 TbWebSiteDao 中）
     *
     * @param tbWebSite
     * @param pageable
     * @return
     */
    public Page<TbWebSite> queryListPageAppendSQL(TbWebSiteQueryVO tbWebSite, Pageable pageable) {
        StringBuilder countSelectSql = new StringBuilder();
        countSelectSql.append("select count(*) from TbWebSite po where 1=1 ");

        StringBuilder selectSql = new StringBuilder();
        selectSql.append("from TbWebSite po where 1=1 ");

        Map<String,Object> params = new HashMap<>();
        StringBuilder whereSql = new StringBuilder();
        if(StringUtils.isNotBlank(tbWebSite.getWebName())){
            whereSql.append(" and po.webName=:webName ");
            params.put("webName", tbWebSite.getWebName());
        }
        if(StringUtils.isNotBlank(tbWebSite.getWebUrl())){
            whereSql.append(" and po.webUrl like :webUrl ");
            params.put("webUrl", "%"+tbWebSite.getWebUrl()+"%");
        }

        if (tbWebSite.getStart() != null)
        {
            whereSql.append(" and po.addTime >= :startTime");
            params.put("startTime", tbWebSite.getStart());
        }
        if (tbWebSite.getEnd() != null)
        {
            whereSql.append(" and po.addTime <= :endTime");
            params.put("endTime", tbWebSite.getEnd());
        }

        String countSql = new StringBuilder().append(countSelectSql).append(whereSql).toString();
        Query countQuery = this.entityManager.createQuery(countSql);
        // 也可以写原生SQL 使用 entityManager.createNativeQuery 查
        this.setParameters(countQuery,params);
        Long count = (Long) countQuery.getSingleResult();

        String querySql = new StringBuilder().append(selectSql).append(whereSql).toString();
        TypedQuery query = this.entityManager.createQuery(querySql, TbWebSite.class);
        this.setParameters(query,params);
        if(pageable != null){ //分页
            query.setFirstResult(pageable.getPageNumber());
            query.setMaxResults(pageable.getPageSize());
        }

        List<TbWebSite> tbWebSiteList = query.getResultList();
        if(pageable != null) { //分页
            Page<TbWebSite> incomeDailyPage = new PageImpl<TbWebSite>(tbWebSiteList, pageable, count);
            return incomeDailyPage;
        }else{ //不分页
            return new PageImpl<TbWebSite>(tbWebSiteList);
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
