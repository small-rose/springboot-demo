package com.xiaocai.demo.transaction.mapper;

import com.xiaocai.demo.transaction.entity.AccountRecord;
import com.xiaocai.demo.transaction.entity.UserRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-01 17:46
 **/
@Mapper
public interface AccountMapper {

    @Insert("insert into account (nickname, pass, uid) values( #{nickname}, #{pass}, #{uid})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public void insertAccount(AccountRecord record);

    @Select("select * from account where uid = #{uid} and pass = #{pass} ")
    public AccountRecord getAccount(AccountRecord record);
}
