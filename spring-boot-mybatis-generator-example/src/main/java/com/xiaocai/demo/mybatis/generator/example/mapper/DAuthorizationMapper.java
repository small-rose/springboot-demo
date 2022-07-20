package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.DAuthorization;
import com.xiaocai.demo.mybatis.generator.example.entity.DAuthorizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DAuthorizationMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  DAuthorizationExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(DAuthorizationExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  DAuthorizationExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(DAuthorizationExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : userid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long userid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DAuthorization
     * @modified by : 
     * @last-modify : 
     */
    int insert(DAuthorization record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DAuthorization
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(DAuthorization record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  DAuthorizationExample
     * @modified by : 
     * @last-modify : 
     */
    List<DAuthorization> selectByExample(DAuthorizationExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : userid  Long
     * @modified by : 
     * @last-modify : 
     */
    DAuthorization selectByPrimaryKey(Long userid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DAuthorization
     * @param : example  DAuthorizationExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") DAuthorization record, @Param("example") DAuthorizationExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DAuthorization
     * @param : example  DAuthorizationExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") DAuthorization record, @Param("example") DAuthorizationExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DAuthorization
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(DAuthorization record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DAuthorization
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(DAuthorization record);
}