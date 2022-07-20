package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmDepartmentTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmDepartmentTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmDepartmentTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDepartmentTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmDepartmentTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDepartmentTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmDepartmentTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : departmentcode  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String departmentcode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDepartmentTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmDepartmentTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDepartmentTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmDepartmentTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDepartmentTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmDepartmentTc> selectByExample(MmDepartmentTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : departmentcode  String
     * @modified by : 
     * @last-modify : 
     */
    MmDepartmentTc selectByPrimaryKey(String departmentcode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDepartmentTc
     * @param : example  MmDepartmentTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmDepartmentTc record, @Param("example") MmDepartmentTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDepartmentTc
     * @param : example  MmDepartmentTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmDepartmentTc record, @Param("example") MmDepartmentTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDepartmentTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmDepartmentTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDepartmentTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmDepartmentTc record);
}