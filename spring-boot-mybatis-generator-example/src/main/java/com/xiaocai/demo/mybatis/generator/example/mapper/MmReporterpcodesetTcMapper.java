package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmReporterpcodesetTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmReporterpcodesetTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmReporterpcodesetTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmReporterpcodesetTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmReporterpcodesetTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmReporterpcodesetTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmReporterpcodesetTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : classcode  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long classcode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReporterpcodesetTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmReporterpcodesetTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReporterpcodesetTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmReporterpcodesetTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmReporterpcodesetTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmReporterpcodesetTc> selectByExample(MmReporterpcodesetTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : classcode  Long
     * @modified by : 
     * @last-modify : 
     */
    MmReporterpcodesetTc selectByPrimaryKey(Long classcode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReporterpcodesetTc
     * @param : example  MmReporterpcodesetTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmReporterpcodesetTc record, @Param("example") MmReporterpcodesetTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReporterpcodesetTc
     * @param : example  MmReporterpcodesetTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmReporterpcodesetTc record, @Param("example") MmReporterpcodesetTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReporterpcodesetTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmReporterpcodesetTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReporterpcodesetTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmReporterpcodesetTc record);
}