package cn.xiaocai.demo.mongodb.service;

import cn.xiaocai.demo.mongodb.dao.UserMongoDao;
import cn.xiaocai.demo.mongodb.po.UserDemo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @program: spring-boot-mongodb
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-11 09:54
 **/
@Service
@AllArgsConstructor
public class UserService {

    private final UserMongoDao userMongoDao;

    public UserDemo saveUser(UserDemo userDemo) {
       return userMongoDao.saveUserDemo(userDemo);
//        UserDemo userDemo=new UserDemo();
//        userDemo.setId(11);
//        userDemo.setAge(33);
//        userDemo.setName("ceshi");
    }


    public UserDemo findUserByName(String name) {
        return userMongoDao.findUserDemoByName(name);
    }

    public void updateUser(UserDemo userDemo) {
        userMongoDao.updateUserDemo(userDemo);
    }

    public void deleteUserById(int i) {
        userMongoDao.deleteUserDemoById(i);
    }
}
