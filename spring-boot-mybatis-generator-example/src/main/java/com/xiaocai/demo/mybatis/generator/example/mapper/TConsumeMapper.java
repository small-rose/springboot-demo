package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.TConsume;
import com.xiaocai.demo.mybatis.generator.example.entity.TConsumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TConsumeMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TConsumeExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(TConsumeExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TConsumeExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(TConsumeExample example);

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
     * @param : record  TConsume
     * @modified by : 
     * @last-modify : 
     */
    int insert(TConsume record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConsume
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(TConsume record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TConsumeExample
     * @modified by : 
     * @last-modify : 
     */
    List<TConsume> selectByExample(TConsumeExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : tano  Long
     * @modified by : 
     * @last-modify : 
     */
    TConsume selectByPrimaryKey(Long tano);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConsume
     * @param : example  TConsumeExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") TConsume record, @Param("example") TConsumeExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConsume
     * @param : example  TConsumeExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") TConsume record, @Param("example") TConsumeExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConsume
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(TConsume record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConsume
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(TConsume record);
}