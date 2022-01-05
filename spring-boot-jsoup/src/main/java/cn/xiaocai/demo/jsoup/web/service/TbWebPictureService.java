package cn.xiaocai.demo.jsoup.web.service;

import cn.xiaocai.demo.jsoup.web.model.TbWebPicture;
import cn.xiaocai.demo.jsoup.web.repository.TbWebPictureDao;
import cn.xiaocai.demo.jsoup.web.vo.TbWebPictureQueryVO;
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
 * @Description : [ TbWebPictureService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/23 17:55
 * @Version ： 1.0
 **/
@Service
@Slf4j
public class TbWebPictureService {

    @Resource
    private TbWebPictureDao tbWebPictureDao ;


    public TbWebPicture add(TbWebPicture tbWebPicture){
       return  tbWebPictureDao.save(tbWebPicture);
    }


    public TbWebPicture update(TbWebPicture tbWebPicture){
        return  tbWebPictureDao.saveAndFlush(tbWebPicture);
    }


    public boolean delete(TbWebPicture tbWebPicture){
        tbWebPictureDao.delete(tbWebPicture);
        return true ;
    }


    public TbWebPicture selectById(Long id){
        return  tbWebPictureDao.getOne(id);
    }

    public List<TbWebPicture> queryList(TbWebPicture tbWebPicture) {

        TbWebPicture queryVo = new TbWebPicture();
        queryVo.setPicName(tbWebPicture.getPicName());
        queryVo.setPicDesc(tbWebPicture.getPicName());
        queryVo.setPicId((long) 1234);
        // 自定义匹配策略
        ExampleMatcher matcher = ExampleMatcher.matching()
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.ignoreCase())//忽略大小写
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.startsWith())//模糊查询匹配开头，即{username}%
                .withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_name}%
                .withMatcher("web_url" ,ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_url}%
                .withIgnorePaths("web_id");//忽略字段，即不管password是什么值都不加入查询条件
        Example<TbWebPicture> example = Example.of(queryVo ,matcher);

        List<TbWebPicture> list = tbWebPictureDao.findAll(example);
        return list ;
    }


    public Page<TbWebPicture> queryListForPage(TbWebPicture webPicture, Pageable pageable) {
        TbWebPicture queryVo = new TbWebPicture();
        queryVo.setPicName(webPicture.getPicName());
         queryVo.setPicId((long) 1234);
        // 自定义匹配策略
        ExampleMatcher matcher = ExampleMatcher.matching()
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.ignoreCase())//忽略大小写
                //.withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.startsWith())//模糊查询匹配开头，即{username}%
                .withMatcher("web_name", ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_name}%
                .withMatcher("web_url" ,ExampleMatcher.GenericPropertyMatchers.contains())//全部模糊查询，即%{web_url}%
                .withIgnorePaths("web_id");//忽略字段，即不管password是什么值都不加入查询条件
        Example<TbWebPicture> example = Example.of(queryVo ,matcher);

        return tbWebPictureDao.findAll(example, pageable);
    }



    public Page<TbWebPicture> queryListPageSpecification(TbWebPicture queryParams, Pageable pageable) {
        TbWebPicture queryVo = new TbWebPicture();
        queryVo.setPicName(queryParams.getPicName());
        queryVo.setPicDesc(queryParams.getPicName());
        queryVo.setPicId((long) 1234);

        //规格定义
        Specification<TbWebPicture> specification = new Specification<TbWebPicture>() {

            /**
             * 构造断言
             * @param root 实体对象引用
             * @param query 规则查询对象
             * @param cb 规则构建对象
             * @return 断言
             */
            @Override
            public Predicate toPredicate(Root<TbWebPicture> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>(); //所有的断言
                if(StringUtils.isNotBlank(queryParams.getPicName())){ //添加断言
                    Predicate likeNickName = cb.like(root.get("pic_name").as(String.class),queryParams.getPicName()+"%");
                    predicates.add(likeNickName);
                }
                return cb.and(predicates.toArray(new Predicate[0]));
            }
        };
        //查询
         return tbWebPictureDao.findAll(specification, pageable);
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
     * （其他写法见 TbWebPictureDao 中）
     *
     * @param tbWebPicture
     * @param pageable
     * @return
     */
    public Page<TbWebPicture> queryListPageAppendSQL(TbWebPictureQueryVO tbWebPicture, Pageable pageable) {
        StringBuilder countSelectSql = new StringBuilder();
        countSelectSql.append("select count(*) from TbWebPicture po where 1=1 ");

        StringBuilder selectSql = new StringBuilder();
        selectSql.append("from TbWebPicture po where 1=1 ");

        Map<String,Object> params = new HashMap<>();
        StringBuilder whereSql = new StringBuilder();
        if(StringUtils.isNotBlank(tbWebPicture.getPicName())){
            whereSql.append(" and po.picName=:webName ");
            params.put("webName", tbWebPicture.getPicName());
        }
        if(StringUtils.isNotBlank(tbWebPicture.getPicName())){
            whereSql.append(" and po.picDesc like :webName ");
            params.put("webName", "%"+tbWebPicture.getPicName()+"%");
        }

        if (tbWebPicture.getStart() != null)
        {
            whereSql.append(" and po.addTime >= :startTime");
            params.put("startTime", tbWebPicture.getStart());
        }
        if (tbWebPicture.getEnd() != null)
        {
            whereSql.append(" and po.addTime <= :endTime");
            params.put("endTime", tbWebPicture.getEnd());
        }

        String countSql = new StringBuilder().append(countSelectSql).append(whereSql).toString();
        Query countQuery = this.entityManager.createQuery(countSql);
        // 也可以写原生SQL 使用 entityManager.createNativeQuery 查
        this.setParameters(countQuery,params);
        Long count = (Long) countQuery.getSingleResult();

        String querySql = new StringBuilder().append(selectSql).append(whereSql).toString();
        TypedQuery query = this.entityManager.createQuery(querySql, TbWebPicture.class);
        this.setParameters(query,params);
        if(pageable != null){ //分页
            query.setFirstResult(pageable.getPageNumber());
            query.setMaxResults(pageable.getPageSize());
        }

        List<TbWebPicture> tbWebPictureList = query.getResultList();
        if(pageable != null) { //分页
            Page<TbWebPicture> incomeDailyPage = new PageImpl<TbWebPicture>(tbWebPictureList, pageable, count);
            return incomeDailyPage;
        }else{ //不分页
            return new PageImpl<TbWebPicture>(tbWebPictureList);
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
