package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmReportorgcodeTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmReportorgcodeTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmReportorgcodeTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmReportorgcodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmReportorgcodeTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmReportorgcodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmReportorgcodeTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subDeptCde  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long subDeptCde);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReportorgcodeTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmReportorgcodeTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReportorgcodeTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmReportorgcodeTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmReportorgcodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmReportorgcodeTc> selectByExample(MmReportorgcodeTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subDeptCde  Long
     * @modified by : 
     * @last-modify : 
     */
    MmReportorgcodeTc selectByPrimaryKey(Long subDeptCde);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReportorgcodeTc
     * @param : example  MmReportorgcodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmReportorgcodeTc record, @Param("example") MmReportorgcodeTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReportorgcodeTc
     * @param : example  MmReportorgcodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmReportorgcodeTc record, @Param("example") MmReportorgcodeTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReportorgcodeTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmReportorgcodeTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReportorgcodeTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmReportorgcodeTc record);
}