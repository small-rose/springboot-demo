package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmMailServiceTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmMailServiceTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmMailServiceTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmMailServiceTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmMailServiceTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmMailServiceTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmMailServiceTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : mailcode  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String mailcode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMailServiceTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmMailServiceTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMailServiceTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmMailServiceTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmMailServiceTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmMailServiceTc> selectByExample(MmMailServiceTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : mailcode  String
     * @modified by : 
     * @last-modify : 
     */
    MmMailServiceTc selectByPrimaryKey(String mailcode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMailServiceTc
     * @param : example  MmMailServiceTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmMailServiceTc record, @Param("example") MmMailServiceTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMailServiceTc
     * @param : example  MmMailServiceTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmMailServiceTc record, @Param("example") MmMailServiceTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMailServiceTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmMailServiceTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMailServiceTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmMailServiceTc record);
}