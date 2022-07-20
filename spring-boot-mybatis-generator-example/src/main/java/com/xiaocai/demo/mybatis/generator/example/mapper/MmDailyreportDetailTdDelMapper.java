package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmDailyreportDetailTdDel;
import com.xiaocai.demo.mybatis.generator.example.entity.MmDailyreportDetailTdDelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmDailyreportDetailTdDelMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDailyreportDetailTdDelExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmDailyreportDetailTdDelExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDailyreportDetailTdDelExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmDailyreportDetailTdDelExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqreportno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long seqreportno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyreportDetailTdDel
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmDailyreportDetailTdDel record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyreportDetailTdDel
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmDailyreportDetailTdDel record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDailyreportDetailTdDelExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmDailyreportDetailTdDel> selectByExample(MmDailyreportDetailTdDelExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqreportno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmDailyreportDetailTdDel selectByPrimaryKey(Long seqreportno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyreportDetailTdDel
     * @param : example  MmDailyreportDetailTdDelExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmDailyreportDetailTdDel record, @Param("example") MmDailyreportDetailTdDelExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyreportDetailTdDel
     * @param : example  MmDailyreportDetailTdDelExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmDailyreportDetailTdDel record, @Param("example") MmDailyreportDetailTdDelExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyreportDetailTdDel
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmDailyreportDetailTdDel record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyreportDetailTdDel
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmDailyreportDetailTdDel record);
}