package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmTaxpayResultTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmTaxpayResultTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmTaxpayResultTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxpayResultTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmTaxpayResultTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxpayResultTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmTaxpayResultTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : resultno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long resultno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayResultTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmTaxpayResultTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayResultTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmTaxpayResultTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxpayResultTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmTaxpayResultTd> selectByExample(MmTaxpayResultTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : resultno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmTaxpayResultTd selectByPrimaryKey(Long resultno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayResultTd
     * @param : example  MmTaxpayResultTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmTaxpayResultTd record, @Param("example") MmTaxpayResultTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayResultTd
     * @param : example  MmTaxpayResultTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmTaxpayResultTd record, @Param("example") MmTaxpayResultTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayResultTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmTaxpayResultTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayResultTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmTaxpayResultTd record);
}