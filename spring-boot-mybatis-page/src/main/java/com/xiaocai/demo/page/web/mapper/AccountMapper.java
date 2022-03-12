package com.xiaocai.demo.page.web.mapper;

import com.xiaocai.demo.page.web.model.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    int insert(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    Account selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    List<Account> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    int updateByPrimaryKey(Account record);





    List<Account> rowboundsPages(int pageNum, int pageSize);



    List<Account> getAllAccountsByPage(@Param("currPage")int pageNum, @Param("pageSize") int pageSize);

    List<Account> selectAllByPages(Account account);
}