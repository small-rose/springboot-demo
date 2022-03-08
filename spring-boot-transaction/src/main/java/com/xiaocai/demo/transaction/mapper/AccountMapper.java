package com.xiaocai.demo.transaction.mapper;

import com.xiaocai.demo.transaction.entity.AccountRecord;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-01 17:46
 **/
@Mapper
public interface AccountMapper {

    @Insert("insert into t_account (NAME, PASS, ADD_DATE, " +
            "      LAST_LOGIN, BALANCE, DESCRIPTION, " +
            "      HEAD_IMAGE) " +
            "    values (#{name,jdbcType=VARCHAR}, #{pass,jdbcType=VARCHAR}, #{addDate,jdbcType=DATE}, \n" +
            "      #{lastLogin,jdbcType=TIMESTAMP}, #{balance,jdbcType=DECIMAL}, #{description,jdbcType=LONGVARCHAR}, \n" +
            "      #{headImage,jdbcType=LONGVARBINARY})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public int insertAccount(AccountRecord record);

    @Select("select * from t_account where name = #{name} and pass = #{pass} ")
    public AccountRecord getAccount(AccountRecord record);


    @Insert("INSERT INTO t_account (NAME, PASS, ADD_DATE, " +
            "      LAST_LOGIN, BALANCE, DESCRIPTION) " +
            "VALUES " +
            "<foreach collection =\"records\" item=\"ictd\" separator =\",\"> " +
            "    (#{name,jdbcType=VARCHAR}, #{pass,jdbcType=VARCHAR}, #{addDate,jdbcType=DATE}, " +
            "     #{lastLogin,jdbcType=TIMESTAMP}, #{balance,jdbcType=DECIMAL}, #{description,jdbcType=LONGVARCHAR} " +
            "     ) " +
            "</foreach >")
    public int batchInsertList(@Param("records")  List<AccountRecord> records);
}
