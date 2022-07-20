package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmTempSumEventTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmTempSumEventTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmTempSumEventTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempSumEventTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmTempSumEventTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempSumEventTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmTempSumEventTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : policyno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long policyno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempSumEventTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmTempSumEventTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempSumEventTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmTempSumEventTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempSumEventTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmTempSumEventTd> selectByExample(MmTempSumEventTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : policyno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmTempSumEventTd selectByPrimaryKey(Long policyno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempSumEventTd
     * @param : example  MmTempSumEventTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmTempSumEventTd record, @Param("example") MmTempSumEventTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempSumEventTd
     * @param : example  MmTempSumEventTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmTempSumEventTd record, @Param("example") MmTempSumEventTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempSumEventTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmTempSumEventTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempSumEventTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmTempSumEventTd record);
}