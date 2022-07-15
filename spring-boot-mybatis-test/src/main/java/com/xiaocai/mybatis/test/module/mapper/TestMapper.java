package com.xiaocai.mybatis.test.module.mapper;


import org.springframework.stereotype.Repository;

/**
 *  Mapper 写两个只是为了区分给人看的，动态数据源环境下，切换之后SQL会到对应的数据源执行
 */
@Repository
public interface TestMapper {

    public Long test();

}
