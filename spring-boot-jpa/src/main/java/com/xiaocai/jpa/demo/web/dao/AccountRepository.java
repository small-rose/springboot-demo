package com.xiaocai.jpa.demo.web.dao;

import com.xiaocai.jpa.demo.web.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ AccountRepository ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/6 11:06
 * @Version ： 1.0
 **/
@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
}
