package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmFormatTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmFormatTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmFormatTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmFormatTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmFormatTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmFormatTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmFormatTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : formatid  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String formatid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFormatTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmFormatTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFormatTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmFormatTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmFormatTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmFormatTc> selectByExample(MmFormatTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : formatid  String
     * @modified by : 
     * @last-modify : 
     */
    MmFormatTc selectByPrimaryKey(String formatid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFormatTc
     * @param : example  MmFormatTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmFormatTc record, @Param("example") MmFormatTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFormatTc
     * @param : example  MmFormatTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmFormatTc record, @Param("example") MmFormatTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFormatTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmFormatTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFormatTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmFormatTc record);
}