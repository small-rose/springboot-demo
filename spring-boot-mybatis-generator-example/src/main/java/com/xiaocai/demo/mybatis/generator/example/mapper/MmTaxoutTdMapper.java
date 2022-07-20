package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmTaxoutTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmTaxoutTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmTaxoutTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxoutTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmTaxoutTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxoutTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmTaxoutTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqtaxout  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String seqtaxout);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxoutTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmTaxoutTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxoutTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmTaxoutTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaxoutTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmTaxoutTd> selectByExample(MmTaxoutTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqtaxout  String
     * @modified by : 
     * @last-modify : 
     */
    MmTaxoutTd selectByPrimaryKey(String seqtaxout);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxoutTd
     * @param : example  MmTaxoutTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmTaxoutTd record, @Param("example") MmTaxoutTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxoutTd
     * @param : example  MmTaxoutTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmTaxoutTd record, @Param("example") MmTaxoutTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxoutTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmTaxoutTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaxoutTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmTaxoutTd record);
}