package cn.xiaocai.demo.jsoup.web.service;

import cn.xiaocai.demo.jsoup.web.model.TbWebCategory;
import cn.xiaocai.demo.jsoup.web.repository.TbWebCategoryDao;
import cn.xiaocai.demo.jsoup.web.vo.TbWebCategoryQueryVO;
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
 * @Description : [ TbWebCategoryService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/23 17:55
 * @Version ： 1.0
 **/
@Service
@Slf4j
public class TbWebCategoryService {

    @Resource
    private TbWebCategoryDao tbWebCategoryDao ;


    public TbWebCategory add(TbWebCategory tbWebCategory){
       return  tbWebCategoryDao.save(tbWebCategory);
    }


    public TbWebCategory update(TbWebCategory tbWebCategory){
        return  tbWebCategoryDao.saveAndFlush(tbWebCategory);
    }


    public boolean delete(TbWebCategory tbWebCategory){
        tbWebCategoryDao.delete(tbWebCategory);
        return true ;
    }


    public TbWebCategory selectById(Long id){
        return  tbWebCategoryDao.getOne(id);
    }

    public List<TbWebCategory> queryList(TbWebCategory tbWebCategory) {

        TbWebCategory queryVo = new TbWebCategory();
        queryVo.setCategoryName(tbWebCategory.getCategoryName());
        queryVo.setCategoryUrl(tbWebCategory.getCategoryUrl());
        queryVo.setWebId((long) 1234);
        // 自定义匹配策略
        ExampleMatcher matcher = ExampleMatcher.matching()
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.ignoreCase())//忽略大小写
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.startsWith())//模糊查询匹配开头，即{username}%
                .withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_name}%
                .withMatcher("web_url" ,ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_url}%
                .withIgnorePaths("web_id");//忽略字段，即不管password是什么值都不加入查询条件
        Example<TbWebCategory> example = Example.of(queryVo ,matcher);

        List<TbWebCategory> list = tbWebCategoryDao.findAll(example);
        return list ;
    }


    public Page<TbWebCategory> queryListForPage(TbWebCategory tbWebCategory, Pageable pageable) {
        TbWebCategory queryVo = new TbWebCategory();
        queryVo.setCategoryName(tbWebCategory.getCategoryName());
        queryVo.setCategoryUrl(tbWebCategory.getCategoryUrl());
        queryVo.setWebId((long) 1234);
        // 自定义匹配策略
        ExampleMatcher matcher = ExampleMatcher.matching()
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.ignoreCase())//忽略大小写
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.startsWith())//模糊查询匹配开头，即{username}%
                .withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_name}%
                .withMatcher("web_url" ,ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_url}%
                .withIgnorePaths("web_id");//忽略字段，即不管password是什么值都不加入查询条件
        Example<TbWebCategory> example = Example.of(queryVo ,matcher);

        return tbWebCategoryDao.findAll(example, pageable);
    }



    public Page<TbWebCategory> queryListPageSpecification(TbWebCategory tbWebCategory, Pageable pageable) {

        //规格定义
        Specification<TbWebCategory> specification = new Specification<TbWebCategory>() {

            /**
             * 构造断言
             * @param root 实体对象引用
             * @param query 规则查询对象
             * @param cb 规则构建对象
             * @return 断言
             */
            @Override
            public Predicate toPredicate(Root<TbWebCategory> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>(); //所有的断言
                if(StringUtils.isNotBlank(tbWebCategory.getCategoryName())){ //添加断言
                    Predicate likeNickName = cb.like(root.get("web_name").as(String.class),tbWebCategory.getCategoryName()+"%");
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
         return tbWebCategoryDao.findAll(specification, pageable);
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
     * （其他写法见 TbWebCategoryDao 中）
     *
     * @param tbWebCategory
     * @param pageable
     * @return
     */
    public Page<TbWebCategory> queryListPageAppendSQL(TbWebCategoryQueryVO tbWebCategory, Pageable pageable) {
        StringBuilder countSelectSql = new StringBuilder();
        countSelectSql.append("select count(*) from TbWebCategory po where 1=1 ");

        StringBuilder selectSql = new StringBuilder();
        selectSql.append("from TbWebCategory po where 1=1 ");

        Map<String,Object> params = new HashMap<>();
        StringBuilder whereSql = new StringBuilder();
        if(StringUtils.isNotBlank(tbWebCategory.getCategoryName())){
            whereSql.append(" and po.categoryName=:categoryName ");
            params.put("categoryName", tbWebCategory.getCategoryName());
        }

        if (tbWebCategory.getStart() != null)
        {
            whereSql.append(" and po.addTime >= :startTime");
            params.put("startTime", tbWebCategory.getStart());
        }
        if (tbWebCategory.getEnd() != null)
        {
            whereSql.append(" and po.addTime <= :endTime");
            params.put("endTime", tbWebCategory.getEnd());
        }

        String countSql = new StringBuilder().append(countSelectSql).append(whereSql).toString();
        Query countQuery = this.entityManager.createQuery(countSql);
        // 也可以写原生SQL 使用 entityManager.createNativeQuery 查
        this.setParameters(countQuery,params);
        Long count = (Long) countQuery.getSingleResult();

        String querySql = new StringBuilder().append(selectSql).append(whereSql).toString();
        TypedQuery query = this.entityManager.createQuery(querySql, TbWebCategory.class);
        this.setParameters(query,params);
        if(pageable != null){ //分页
            query.setFirstResult(pageable.getPageNumber());
            query.setMaxResults(pageable.getPageSize());
        }

        List<TbWebCategory> tbWebCategoryList = query.getResultList();
        if(pageable != null) { //分页
            Page<TbWebCategory> incomeDailyPage = new PageImpl<TbWebCategory>(tbWebCategoryList, pageable, count);
            return incomeDailyPage;
        }else{ //不分页
            return new PageImpl<TbWebCategory>(tbWebCategoryList);
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
