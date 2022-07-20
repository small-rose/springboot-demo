package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmTaxpayerTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmTaxpayerTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmTaxpayerTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxpayerTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmTaxpayerTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxpayerTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmTaxpayerTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : taxpayerid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long taxpayerid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayerTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmTaxpayerTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayerTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmTaxpayerTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxpayerTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmTaxpayerTc> selectByExample(MmTaxpayerTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : taxpayerid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmTaxpayerTc selectByPrimaryKey(Long taxpayerid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayerTc
     * @param : example  MmTaxpayerTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmTaxpayerTc record, @Param("example") MmTaxpayerTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayerTc
     * @param : example  MmTaxpayerTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmTaxpayerTc record, @Param("example") MmTaxpayerTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayerTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmTaxpayerTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayerTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmTaxpayerTc record);
}