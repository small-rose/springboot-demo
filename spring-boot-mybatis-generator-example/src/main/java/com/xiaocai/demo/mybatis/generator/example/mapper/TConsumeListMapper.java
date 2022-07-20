package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.TConsumeList;
import com.xiaocai.demo.mybatis.generator.example.entity.TConsumeListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TConsumeListMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TConsumeListExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(TConsumeListExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TConsumeListExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(TConsumeListExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : no  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long no);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConsumeList
     * @modified by : 
     * @last-modify : 
     */
    int insert(TConsumeList record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConsumeList
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(TConsumeList record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TConsumeListExample
     * @modified by : 
     * @last-modify : 
     */
    List<TConsumeList> selectByExample(TConsumeListExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : no  Long
     * @modified by : 
     * @last-modify : 
     */
    TConsumeList selectByPrimaryKey(Long no);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConsumeList
     * @param : example  TConsumeListExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") TConsumeList record, @Param("example") TConsumeListExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConsumeList
     * @param : example  TConsumeListExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") TConsumeList record, @Param("example") TConsumeListExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConsumeList
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(TConsumeList record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConsumeList
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(TConsumeList record);
}