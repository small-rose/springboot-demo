package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.TApplications;
import com.xiaocai.demo.mybatis.generator.example.entity.TApplicationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TApplicationsMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TApplicationsExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(TApplicationsExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TApplicationsExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(TApplicationsExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : applyno  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String applyno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TApplications
     * @modified by : 
     * @last-modify : 
     */
    int insert(TApplications record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TApplications
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(TApplications record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TApplicationsExample
     * @modified by : 
     * @last-modify : 
     */
    List<TApplications> selectByExample(TApplicationsExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : applyno  String
     * @modified by : 
     * @last-modify : 
     */
    TApplications selectByPrimaryKey(String applyno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TApplications
     * @param : example  TApplicationsExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") TApplications record, @Param("example") TApplicationsExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TApplications
     * @param : example  TApplicationsExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") TApplications record, @Param("example") TApplicationsExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TApplications
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(TApplications record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TApplications
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(TApplications record);
}