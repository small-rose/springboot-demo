package com.xiaocai.demo.transaction.mapper;

import com.xiaocai.demo.transaction.entity.*;
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
public interface UserMapper {

    @Insert("insert into t_user (name, phone) values( #{name}, #{phone})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public void insertUser(UserRecord record);

    @Select("select * from t_user where phone= #{phone} ")
    public UserRecord getUser(UserRecord record);
}
