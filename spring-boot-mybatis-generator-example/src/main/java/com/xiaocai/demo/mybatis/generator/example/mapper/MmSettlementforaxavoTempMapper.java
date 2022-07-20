package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmSettlementforaxavoTemp;
import com.xiaocai.demo.mybatis.generator.example.entity.MmSettlementforaxavoTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmSettlementforaxavoTempMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSettlementforaxavoTempExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmSettlementforaxavoTempExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSettlementforaxavoTempExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmSettlementforaxavoTempExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Integer
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSettlementforaxavoTemp
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmSettlementforaxavoTemp record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSettlementforaxavoTemp
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmSettlementforaxavoTemp record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSettlementforaxavoTempExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmSettlementforaxavoTemp> selectByExample(MmSettlementforaxavoTempExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Integer
     * @modified by : 
     * @last-modify : 
     */
    MmSettlementforaxavoTemp selectByPrimaryKey(Integer id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSettlementforaxavoTemp
     * @param : example  MmSettlementforaxavoTempExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmSettlementforaxavoTemp record, @Param("example") MmSettlementforaxavoTempExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSettlementforaxavoTemp
     * @param : example  MmSettlementforaxavoTempExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmSettlementforaxavoTemp record, @Param("example") MmSettlementforaxavoTempExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSettlementforaxavoTemp
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmSettlementforaxavoTemp record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSettlementforaxavoTemp
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmSettlementforaxavoTemp record);
}