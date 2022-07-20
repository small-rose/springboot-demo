package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmClassescodemappingInTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmClassescodemappingInTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmClassescodemappingInTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmClassescodemappingInTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmClassescodemappingInTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmClassescodemappingInTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmClassescodemappingInTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : erpclassescode  Long
     * @param : busclassescode  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("erpclassescode") Long erpclassescode, @Param("busclassescode") Long busclassescode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmClassescodemappingInTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmClassescodemappingInTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmClassescodemappingInTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmClassescodemappingInTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmClassescodemappingInTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmClassescodemappingInTc> selectByExample(MmClassescodemappingInTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : erpclassescode  Long
     * @param : busclassescode  Long
     * @modified by : 
     * @last-modify : 
     */
    MmClassescodemappingInTc selectByPrimaryKey(@Param("erpclassescode") Long erpclassescode, @Param("busclassescode") Long busclassescode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmClassescodemappingInTc
     * @param : example  MmClassescodemappingInTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmClassescodemappingInTc record, @Param("example") MmClassescodemappingInTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmClassescodemappingInTc
     * @param : example  MmClassescodemappingInTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmClassescodemappingInTc record, @Param("example") MmClassescodemappingInTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmClassescodemappingInTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmClassescodemappingInTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmClassescodemappingInTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmClassescodemappingInTc record);
}