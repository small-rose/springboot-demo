package cn.xiaocai.demo.jsoup.web.service;

import cn.xiaocai.demo.jsoup.web.model.TbWebLink;
import cn.xiaocai.demo.jsoup.web.repository.TbWebLinkDao;
import cn.xiaocai.demo.jsoup.web.vo.TbWebLinkQueryVO;
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
 * @Author : zhangzongyuan
 * @Description : [ TbWebLinkService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/23 17:55
 * @Version ： 1.0
 **/
@Service
@Slf4j
public class TbWebLinkService {

    @Resource
    private TbWebLinkDao tbWebLinkDao ;


    public TbWebLink add(TbWebLink tbWebLink){
       return  tbWebLinkDao.save(tbWebLink);
    }


    public TbWebLink update(TbWebLink tbWebLink){
        return  tbWebLinkDao.saveAndFlush(tbWebLink);
    }


    public boolean delete(TbWebLink tbWebLink){
        tbWebLinkDao.delete(tbWebLink);
        return true ;
    }


    public TbWebLink selectById(Long id){
        return  tbWebLinkDao.getOne(id);
    }

    public List<TbWebLink> queryList(TbWebLink tbWebLink) {

        TbWebLink queryVo = new TbWebLink();
        queryVo.setLinkName(tbWebLink.getLinkName());
        queryVo.setLinkId((long) 1234);
        // 自定义匹配策略
        ExampleMatcher matcher = ExampleMatcher.matching()
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.ignoreCase())//忽略大小写
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.startsWith())//模糊查询匹配开头，即{username}%
                .withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_name}%
                .withMatcher("web_url" ,ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_url}%
                .withIgnorePaths("web_id");//忽略字段，即不管password是什么值都不加入查询条件
        Example<TbWebLink> example = Example.of(queryVo ,matcher);

        List<TbWebLink> list = tbWebLinkDao.findAll(example);
        return list ;
    }


    public Page<TbWebLink> queryListForPage(TbWebLink tbWebLink, Pageable pageable) {
        TbWebLink queryVo = new TbWebLink();
        queryVo.setLinkName(tbWebLink.getLinkName());
        queryVo.setLinkId((long) 1234);
        // 自定义匹配策略
        ExampleMatcher matcher = ExampleMatcher.matching()
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.ignoreCase())//忽略大小写
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.startsWith())//模糊查询匹配开头，即{username}%
                .withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_name}%
                .withMatcher("web_url" ,ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_url}%
                .withIgnorePaths("web_id");//忽略字段，即不管password是什么值都不加入查询条件
        Example<TbWebLink> example = Example.of(queryVo ,matcher);

        return tbWebLinkDao.findAll(example, pageable);
    }



    public Page<TbWebLink> queryListPageSpecification(TbWebLink tbWebLink, Pageable pageable) {

        //规格定义
        Specification<TbWebLink> specification = new Specification<TbWebLink>() {

            /**
             * 构造断言
             * @param root 实体对象引用
             * @param query 规则查询对象
             * @param cb 规则构建对象
             * @return 断言
             */
            @Override
            public Predicate toPredicate(Root<TbWebLink> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>(); //所有的断言
                if(StringUtils.isNotBlank(tbWebLink.getLinkName())){ //添加断言
                    Predicate likeNickName = cb.like(root.get("web_name").as(String.class),tbWebLink.getLinkName()+"%");
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
         return tbWebLinkDao.findAll(specification, pageable);
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
     * （其他写法见 TbWebLinkDao 中）
     *
     * @param tbWebLink
     * @param pageable
     * @return
     */
    public Page<TbWebLink> queryListPageAppendSQL(TbWebLinkQueryVO tbWebLink, Pageable pageable) {
        StringBuilder countSelectSql = new StringBuilder();
        countSelectSql.append("select count(*) from TbWebLink po where 1=1 ");

        StringBuilder selectSql = new StringBuilder();
        selectSql.append("from TbWebLink po where 1=1 ");

        Map<String,Object> params = new HashMap<>();
        StringBuilder whereSql = new StringBuilder();
        if(StringUtils.isNotBlank(tbWebLink.getLinkName())){
            whereSql.append(" and po.linkName=:webName ");
            params.put("webName", tbWebLink.getLinkName());
        }

        if (tbWebLink.getStart() != null)
        {
            whereSql.append(" and po.addTime >= :startTime");
            params.put("startTime", tbWebLink.getStart());
        }
        if (tbWebLink.getEnd() != null)
        {
            whereSql.append(" and po.addTime <= :endTime");
            params.put("endTime", tbWebLink.getEnd());
        }

        String countSql = new StringBuilder().append(countSelectSql).append(whereSql).toString();
        Query countQuery = this.entityManager.createQuery(countSql);
        // 也可以写原生SQL 使用 entityManager.createNativeQuery 查
        this.setParameters(countQuery,params);
        Long count = (Long) countQuery.getSingleResult();

        String querySql = new StringBuilder().append(selectSql).append(whereSql).toString();
        TypedQuery query = this.entityManager.createQuery(querySql, TbWebLink.class);
        this.setParameters(query,params);
        if(pageable != null){ //分页
            query.setFirstResult(pageable.getPageNumber());
            query.setMaxResults(pageable.getPageSize());
        }

        List<TbWebLink> tbWebLinkList = query.getResultList();
        if(pageable != null) { //分页
            Page<TbWebLink> incomeDailyPage = new PageImpl<TbWebLink>(tbWebLinkList, pageable, count);
            return incomeDailyPage;
        }else{ //不分页
            return new PageImpl<TbWebLink>(tbWebLinkList);
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
