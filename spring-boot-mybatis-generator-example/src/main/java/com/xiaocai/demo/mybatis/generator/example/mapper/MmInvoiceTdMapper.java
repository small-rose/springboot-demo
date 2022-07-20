package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmInvoiceTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmInvoiceTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmInvoiceTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvoiceTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmInvoiceTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvoiceTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmInvoiceTdExample example);

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
     * @param : record  MmInvoiceTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmInvoiceTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmInvoiceTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvoiceTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmInvoiceTd> selectByExample(MmInvoiceTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqinvoice  Long
     * @modified by : 
     * @last-modify : 
     */
    MmInvoiceTd selectByPrimaryKey(Long seqinvoice);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceTd
     * @param : example  MmInvoiceTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmInvoiceTd record, @Param("example") MmInvoiceTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceTd
     * @param : example  MmInvoiceTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmInvoiceTd record, @Param("example") MmInvoiceTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmInvoiceTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmInvoiceTd record);
}