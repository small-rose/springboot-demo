package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmDataReport;
import com.xiaocai.demo.mybatis.generator.example.entity.MmDataReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmDataReportMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDataReportExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmDataReportExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDataReportExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmDataReportExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subDeptCde  Long
     * @param : cItemNo  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("subDeptCde") Long subDeptCde, @Param("cItemNo") Long cItemNo);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDataReport
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmDataReport record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDataReport
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmDataReport record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDataReportExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmDataReport> selectByExample(MmDataReportExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subDeptCde  Long
     * @param : cItemNo  Long
     * @modified by : 
     * @last-modify : 
     */
    MmDataReport selectByPrimaryKey(@Param("subDeptCde") Long subDeptCde, @Param("cItemNo") Long cItemNo);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDataReport
     * @param : example  MmDataReportExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmDataReport record, @Param("example") MmDataReportExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDataReport
     * @param : example  MmDataReportExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmDataReport record, @Param("example") MmDataReportExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDataReport
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmDataReport record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDataReport
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmDataReport record);
}