package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.TCheckapplications;
import com.xiaocai.demo.mybatis.generator.example.entity.TCheckapplicationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCheckapplicationsMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TCheckapplicationsExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(TCheckapplicationsExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TCheckapplicationsExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(TCheckapplicationsExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String id);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TCheckapplications
     * @modified by : 
     * @last-modify : 
     */
    int insert(TCheckapplications record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TCheckapplications
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(TCheckapplications record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TCheckapplicationsExample
     * @modified by : 
     * @last-modify : 
     */
    List<TCheckapplications> selectByExample(TCheckapplicationsExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  String
     * @modified by : 
     * @last-modify : 
     */
    TCheckapplications selectByPrimaryKey(String id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TCheckapplications
     * @param : example  TCheckapplicationsExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") TCheckapplications record, @Param("example") TCheckapplicationsExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TCheckapplications
     * @param : example  TCheckapplicationsExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") TCheckapplications record, @Param("example") TCheckapplicationsExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TCheckapplications
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(TCheckapplications record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TCheckapplications
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(TCheckapplications record);
}