package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmDepartmentTaxtypeTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmDepartmentTaxtypeTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmDepartmentTaxtypeTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDepartmentTaxtypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmDepartmentTaxtypeTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDepartmentTaxtypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmDepartmentTaxtypeTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  String
     * @param : departmentcode  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("subcompany") String subcompany, @Param("departmentcode") String departmentcode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDepartmentTaxtypeTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmDepartmentTaxtypeTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDepartmentTaxtypeTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmDepartmentTaxtypeTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDepartmentTaxtypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmDepartmentTaxtypeTc> selectByExample(MmDepartmentTaxtypeTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  String
     * @param : departmentcode  String
     * @modified by : 
     * @last-modify : 
     */
    MmDepartmentTaxtypeTc selectByPrimaryKey(@Param("subcompany") String subcompany, @Param("departmentcode") String departmentcode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDepartmentTaxtypeTc
     * @param : example  MmDepartmentTaxtypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmDepartmentTaxtypeTc record, @Param("example") MmDepartmentTaxtypeTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDepartmentTaxtypeTc
     * @param : example  MmDepartmentTaxtypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmDepartmentTaxtypeTc record, @Param("example") MmDepartmentTaxtypeTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDepartmentTaxtypeTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmDepartmentTaxtypeTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDepartmentTaxtypeTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmDepartmentTaxtypeTc record);
}