package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmProcesstypeTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmProcesstypeTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmProcesstypeTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmProcesstypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmProcesstypeTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmProcesstypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmProcesstypeTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : processtype  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String processtype);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmProcesstypeTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmProcesstypeTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmProcesstypeTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmProcesstypeTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmProcesstypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmProcesstypeTc> selectByExample(MmProcesstypeTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : processtype  String
     * @modified by : 
     * @last-modify : 
     */
    MmProcesstypeTc selectByPrimaryKey(String processtype);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmProcesstypeTc
     * @param : example  MmProcesstypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmProcesstypeTc record, @Param("example") MmProcesstypeTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmProcesstypeTc
     * @param : example  MmProcesstypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmProcesstypeTc record, @Param("example") MmProcesstypeTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmProcesstypeTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmProcesstypeTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmProcesstypeTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmProcesstypeTc record);
}