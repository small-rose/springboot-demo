package com.xiaocai.mybatis.test.module.mapper;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;


/**
 *  Mapper 写两个只是为了区分给人看的，动态数据源环境下，切换之后SQL会到对应的数据源执行
 */
@Repository
public interface KBTestMapper {

    public Long test();


    public Long testTemporaryTable();



    public String selectNextDay(@Param("date") Timestamp date);
    public String selectNextDay2(@Param("date") String date);




}
