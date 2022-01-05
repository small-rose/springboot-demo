package cn.xiaocai.demo.async.task.repository;

import cn.xiaocai.demo.async.task.bean.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ TbUserRepository ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/20 13:44
 * @Version ： 1.0
 **/
@Repository
public interface TbUserRepository extends JpaRepository<TbUser,Long> {


}
