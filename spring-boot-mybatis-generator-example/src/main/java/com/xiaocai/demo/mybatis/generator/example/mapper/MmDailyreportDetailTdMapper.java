package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmDailyreportDetailTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmDailyreportDetailTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmDailyreportDetailTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDailyreportDetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmDailyreportDetailTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDailyreportDetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmDailyreportDetailTdExample example);

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
     * @param : record  MmDailyreportDetailTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmDailyreportDetailTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyreportDetailTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmDailyreportDetailTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDailyreportDetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmDailyreportDetailTd> selectByExample(MmDailyreportDetailTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqreportno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmDailyreportDetailTd selectByPrimaryKey(Long seqreportno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyreportDetailTd
     * @param : example  MmDailyreportDetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmDailyreportDetailTd record, @Param("example") MmDailyreportDetailTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyreportDetailTd
     * @param : example  MmDailyreportDetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmDailyreportDetailTd record, @Param("example") MmDailyreportDetailTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyreportDetailTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmDailyreportDetailTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDailyreportDetailTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmDailyreportDetailTd record);
}