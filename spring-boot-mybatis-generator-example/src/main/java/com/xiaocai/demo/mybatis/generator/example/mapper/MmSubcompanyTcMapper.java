package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmSubcompanyTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmSubcompanyTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmSubcompanyTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSubcompanyTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmSubcompanyTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSubcompanyTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmSubcompanyTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String subcompany);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSubcompanyTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmSubcompanyTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSubcompanyTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmSubcompanyTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSubcompanyTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmSubcompanyTc> selectByExample(MmSubcompanyTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  String
     * @modified by : 
     * @last-modify : 
     */
    MmSubcompanyTc selectByPrimaryKey(String subcompany);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSubcompanyTc
     * @param : example  MmSubcompanyTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmSubcompanyTc record, @Param("example") MmSubcompanyTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSubcompanyTc
     * @param : example  MmSubcompanyTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmSubcompanyTc record, @Param("example") MmSubcompanyTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSubcompanyTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmSubcompanyTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSubcompanyTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmSubcompanyTc record);
}