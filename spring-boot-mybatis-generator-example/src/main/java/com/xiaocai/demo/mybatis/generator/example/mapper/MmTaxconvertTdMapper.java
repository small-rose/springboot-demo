package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmTaxconvertTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmTaxconvertTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmTaxconvertTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxconvertTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmTaxconvertTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxconvertTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmTaxconvertTdExample example);

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
     * @param : record  MmTaxconvertTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmTaxconvertTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxconvertTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmTaxconvertTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxconvertTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmTaxconvertTd> selectByExample(MmTaxconvertTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmTaxconvertTd selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxconvertTd
     * @param : example  MmTaxconvertTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmTaxconvertTd record, @Param("example") MmTaxconvertTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxconvertTd
     * @param : example  MmTaxconvertTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmTaxconvertTd record, @Param("example") MmTaxconvertTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxconvertTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmTaxconvertTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxconvertTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmTaxconvertTd record);
}