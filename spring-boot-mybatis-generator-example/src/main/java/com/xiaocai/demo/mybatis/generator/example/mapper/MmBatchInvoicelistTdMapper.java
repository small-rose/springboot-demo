package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmBatchInvoicelistTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmBatchInvoicelistTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmBatchInvoicelistTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBatchInvoicelistTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmBatchInvoicelistTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBatchInvoicelistTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmBatchInvoicelistTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String id);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoicelistTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmBatchInvoicelistTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoicelistTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmBatchInvoicelistTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBatchInvoicelistTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmBatchInvoicelistTd> selectByExample(MmBatchInvoicelistTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  String
     * @modified by : 
     * @last-modify : 
     */
    MmBatchInvoicelistTd selectByPrimaryKey(String id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoicelistTd
     * @param : example  MmBatchInvoicelistTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmBatchInvoicelistTd record, @Param("example") MmBatchInvoicelistTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoicelistTd
     * @param : example  MmBatchInvoicelistTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmBatchInvoicelistTd record, @Param("example") MmBatchInvoicelistTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoicelistTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmBatchInvoicelistTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoicelistTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmBatchInvoicelistTd record);
}