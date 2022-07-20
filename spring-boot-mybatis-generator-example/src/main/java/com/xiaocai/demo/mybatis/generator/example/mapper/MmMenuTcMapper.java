package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmMenuTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmMenuTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmMenuTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmMenuTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmMenuTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmMenuTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmMenuTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : menuid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long menuid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMenuTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmMenuTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMenuTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmMenuTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmMenuTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmMenuTc> selectByExample(MmMenuTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : menuid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmMenuTc selectByPrimaryKey(Long menuid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMenuTc
     * @param : example  MmMenuTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmMenuTc record, @Param("example") MmMenuTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMenuTc
     * @param : example  MmMenuTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmMenuTc record, @Param("example") MmMenuTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMenuTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmMenuTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMenuTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmMenuTc record);
}