package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmUnitmappingTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmUnitmappingTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmUnitmappingTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmUnitmappingTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmUnitmappingTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmUnitmappingTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmUnitmappingTcExample example);

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
     * @param : record  MmUnitmappingTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmUnitmappingTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUnitmappingTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmUnitmappingTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmUnitmappingTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmUnitmappingTc> selectByExample(MmUnitmappingTcExample example);

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
    MmUnitmappingTc selectByPrimaryKey(@Param("subcompany") String subcompany, @Param("departmentcode") String departmentcode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUnitmappingTc
     * @param : example  MmUnitmappingTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmUnitmappingTc record, @Param("example") MmUnitmappingTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUnitmappingTc
     * @param : example  MmUnitmappingTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmUnitmappingTc record, @Param("example") MmUnitmappingTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUnitmappingTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmUnitmappingTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUnitmappingTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmUnitmappingTc record);
}