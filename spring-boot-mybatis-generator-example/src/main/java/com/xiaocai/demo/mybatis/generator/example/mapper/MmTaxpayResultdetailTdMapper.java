package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmTaxpayResultdetailTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmTaxpayResultdetailTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmTaxpayResultdetailTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxpayResultdetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmTaxpayResultdetailTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxpayResultdetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmTaxpayResultdetailTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayResultdetailTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmTaxpayResultdetailTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayResultdetailTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmTaxpayResultdetailTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxpayResultdetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmTaxpayResultdetailTd> selectByExample(MmTaxpayResultdetailTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmTaxpayResultdetailTd selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayResultdetailTd
     * @param : example  MmTaxpayResultdetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmTaxpayResultdetailTd record, @Param("example") MmTaxpayResultdetailTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayResultdetailTd
     * @param : example  MmTaxpayResultdetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmTaxpayResultdetailTd record, @Param("example") MmTaxpayResultdetailTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayResultdetailTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmTaxpayResultdetailTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxpayResultdetailTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmTaxpayResultdetailTd record);
}