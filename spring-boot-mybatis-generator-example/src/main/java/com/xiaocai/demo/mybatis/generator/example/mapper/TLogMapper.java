package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.TLog;
import com.xiaocai.demo.mybatis.generator.example.entity.TLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLogMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TLogExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(TLogExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TLogExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(TLogExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : tano  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long tano);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TLog
     * @modified by : 
     * @last-modify : 
     */
    int insert(TLog record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TLog
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(TLog record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TLogExample
     * @modified by : 
     * @last-modify : 
     */
    List<TLog> selectByExample(TLogExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : tano  Long
     * @modified by : 
     * @last-modify : 
     */
    TLog selectByPrimaryKey(Long tano);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TLog
     * @param : example  TLogExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") TLog record, @Param("example") TLogExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TLog
     * @param : example  TLogExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") TLog record, @Param("example") TLogExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TLog
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(TLog record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TLog
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(TLog record);
}