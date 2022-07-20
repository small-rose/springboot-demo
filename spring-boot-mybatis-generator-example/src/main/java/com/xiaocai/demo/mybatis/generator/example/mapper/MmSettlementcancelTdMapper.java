package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmSettlementcancelTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmSettlementcancelTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmSettlementcancelTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSettlementcancelTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmSettlementcancelTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSettlementcancelTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmSettlementcancelTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : settlementid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long settlementid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSettlementcancelTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmSettlementcancelTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSettlementcancelTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmSettlementcancelTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSettlementcancelTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmSettlementcancelTd> selectByExample(MmSettlementcancelTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : settlementid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmSettlementcancelTd selectByPrimaryKey(Long settlementid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSettlementcancelTd
     * @param : example  MmSettlementcancelTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmSettlementcancelTd record, @Param("example") MmSettlementcancelTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSettlementcancelTd
     * @param : example  MmSettlementcancelTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmSettlementcancelTd record, @Param("example") MmSettlementcancelTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSettlementcancelTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmSettlementcancelTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSettlementcancelTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmSettlementcancelTd record);
}