package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmDailyreportTdDel;
import com.xiaocai.demo.mybatis.generator.example.entity.MmDailyreportTdDelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmDailyreportTdDelMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDailyreportTdDelExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmDailyreportTdDelExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDailyreportTdDelExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmDailyreportTdDelExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : dailyauditno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long dailyauditno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyreportTdDel
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmDailyreportTdDel record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyreportTdDel
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmDailyreportTdDel record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDailyreportTdDelExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmDailyreportTdDel> selectByExample(MmDailyreportTdDelExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : dailyauditno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmDailyreportTdDel selectByPrimaryKey(Long dailyauditno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyreportTdDel
     * @param : example  MmDailyreportTdDelExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmDailyreportTdDel record, @Param("example") MmDailyreportTdDelExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyreportTdDel
     * @param : example  MmDailyreportTdDelExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmDailyreportTdDel record, @Param("example") MmDailyreportTdDelExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyreportTdDel
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmDailyreportTdDel record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyreportTdDel
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmDailyreportTdDel record);
}