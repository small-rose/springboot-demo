package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmTempTaxdetailinfoTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmTempTaxdetailinfoTdExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmTempTaxdetailinfoTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempTaxdetailinfoTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmTempTaxdetailinfoTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempTaxdetailinfoTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmTempTaxdetailinfoTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqpolicy  BigDecimal
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(BigDecimal seqpolicy);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempTaxdetailinfoTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmTempTaxdetailinfoTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempTaxdetailinfoTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmTempTaxdetailinfoTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempTaxdetailinfoTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmTempTaxdetailinfoTd> selectByExample(MmTempTaxdetailinfoTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqpolicy  BigDecimal
     * @modified by : 
     * @last-modify : 
     */
    MmTempTaxdetailinfoTd selectByPrimaryKey(BigDecimal seqpolicy);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempTaxdetailinfoTd
     * @param : example  MmTempTaxdetailinfoTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmTempTaxdetailinfoTd record, @Param("example") MmTempTaxdetailinfoTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempTaxdetailinfoTd
     * @param : example  MmTempTaxdetailinfoTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmTempTaxdetailinfoTd record, @Param("example") MmTempTaxdetailinfoTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempTaxdetailinfoTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmTempTaxdetailinfoTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempTaxdetailinfoTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmTempTaxdetailinfoTd record);
}