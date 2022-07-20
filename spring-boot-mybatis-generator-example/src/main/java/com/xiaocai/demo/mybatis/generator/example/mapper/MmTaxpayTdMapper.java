package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmTaxpayTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmTaxpayTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmTaxpayTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxpayTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmTaxpayTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxpayTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmTaxpayTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : payid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long payid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmTaxpayTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmTaxpayTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxpayTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmTaxpayTd> selectByExample(MmTaxpayTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : payid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmTaxpayTd selectByPrimaryKey(Long payid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayTd
     * @param : example  MmTaxpayTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmTaxpayTd record, @Param("example") MmTaxpayTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayTd
     * @param : example  MmTaxpayTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmTaxpayTd record, @Param("example") MmTaxpayTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmTaxpayTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmTaxpayTd record);
}