package cn.xiaocai.demo.mongodb.dao;

import cn.xiaocai.demo.mongodb.po.UserDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

/**
 * @program: spring-boot-mongodb
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-11 09:46
 **/
@Component
public class UserMongoDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 创建对象
     */
    public UserDemo saveUserDemo(UserDemo user) {
      return  mongoTemplate.save(user);
    }

    /**
     * 根据用户名查询对象
     * @return
     */
    public UserDemo findUserDemoByName(String name) {
        Query query=new Query(Criteria.where("name").is(name));
        UserDemo mgt =  mongoTemplate.findOne(query , UserDemo.class);
        return mgt;
    }

    /**
     * 更新对象
     */
    public void updateUserDemo(UserDemo user) {
        Query query=new Query(Criteria.where("id").is(user.getId()));
        Update update= new Update().set("age", user.getAge()).set("name", user.getName());
        //更新查询返回结果集的第一条
        mongoTemplate.updateFirst(query,update,UserDemo.class);
        //更新查询返回结果集的所有
        // mongoTemplate.updateMulti(query,update,TestEntity.class);
    }

    /**
     * 删除对象
     * @param id
     */
    public void deleteUserDemoById(Integer id) {
        Query query=new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,UserDemo.class);
    }
}
