package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmTaxoutbackTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmTaxoutbackTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmTaxoutbackTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxoutbackTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmTaxoutbackTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxoutbackTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmTaxoutbackTdExample example);

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
     * @param : record  MmTaxoutbackTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmTaxoutbackTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxoutbackTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmTaxoutbackTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxoutbackTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmTaxoutbackTd> selectByExample(MmTaxoutbackTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmTaxoutbackTd selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxoutbackTd
     * @param : example  MmTaxoutbackTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmTaxoutbackTd record, @Param("example") MmTaxoutbackTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxoutbackTd
     * @param : example  MmTaxoutbackTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmTaxoutbackTd record, @Param("example") MmTaxoutbackTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxoutbackTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmTaxoutbackTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxoutbackTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmTaxoutbackTd record);
}