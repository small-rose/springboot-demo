package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmInvoiceSplitPlanTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmInvoiceSplitPlanTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmInvoiceSplitPlanTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvoiceSplitPlanTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmInvoiceSplitPlanTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvoiceSplitPlanTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmInvoiceSplitPlanTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqinvoice  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long seqinvoice);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceSplitPlanTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmInvoiceSplitPlanTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceSplitPlanTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmInvoiceSplitPlanTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvoiceSplitPlanTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmInvoiceSplitPlanTd> selectByExample(MmInvoiceSplitPlanTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqinvoice  Long
     * @modified by : 
     * @last-modify : 
     */
    MmInvoiceSplitPlanTd selectByPrimaryKey(Long seqinvoice);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceSplitPlanTd
     * @param : example  MmInvoiceSplitPlanTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmInvoiceSplitPlanTd record, @Param("example") MmInvoiceSplitPlanTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceSplitPlanTd
     * @param : example  MmInvoiceSplitPlanTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmInvoiceSplitPlanTd record, @Param("example") MmInvoiceSplitPlanTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceSplitPlanTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmInvoiceSplitPlanTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceSplitPlanTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmInvoiceSplitPlanTd record);
}