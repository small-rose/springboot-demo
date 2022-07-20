package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmDailyaudittypeTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmDailyaudittypeTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmDailyaudittypeTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDailyaudittypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmDailyaudittypeTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDailyaudittypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmDailyaudittypeTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : dailyaudittype  String
     * @param : businesstype  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("dailyaudittype") String dailyaudittype, @Param("businesstype") String businesstype);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyaudittypeTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmDailyaudittypeTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyaudittypeTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmDailyaudittypeTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDailyaudittypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmDailyaudittypeTc> selectByExample(MmDailyaudittypeTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : dailyaudittype  String
     * @param : businesstype  String
     * @modified by : 
     * @last-modify : 
     */
    MmDailyaudittypeTc selectByPrimaryKey(@Param("dailyaudittype") String dailyaudittype, @Param("businesstype") String businesstype);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyaudittypeTc
     * @param : example  MmDailyaudittypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmDailyaudittypeTc record, @Param("example") MmDailyaudittypeTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyaudittypeTc
     * @param : example  MmDailyaudittypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmDailyaudittypeTc record, @Param("example") MmDailyaudittypeTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyaudittypeTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmDailyaudittypeTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyaudittypeTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmDailyaudittypeTc record);
}