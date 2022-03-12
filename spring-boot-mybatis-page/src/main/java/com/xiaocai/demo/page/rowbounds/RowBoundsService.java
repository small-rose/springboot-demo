package com.xiaocai.demo.page.rowbounds;

import com.xiaocai.demo.page.web.model.Account;
import lombok.AllArgsConstructor;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ RowBoundsService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/1 13:37
 * @Version ： 1.0
 **/

@Service
@AllArgsConstructor
public class RowBoundsService {




    private SqlSessionFactory sqlSessionFactory ;

    /**
     * 使用 RowBounds 进行逻辑分页
     * @param account
     * @return
     */
    public List<Account> rowboundsPages(Account account) {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        RowBounds rowbounds = new RowBounds(account.getPageNum(), account.getPageSize());
        List<Account>  accList = sqlSession.selectList("rowboundsPages", account, rowbounds);
        sqlSession.close();
        return  accList;
    }
}
