package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmBatchInvoicelistTi;
import com.xiaocai.demo.mybatis.generator.example.entity.MmBatchInvoicelistTiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmBatchInvoicelistTiMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBatchInvoicelistTiExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmBatchInvoicelistTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBatchInvoicelistTiExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmBatchInvoicelistTiExample example);

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
     * @param : record  MmBatchInvoicelistTi
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmBatchInvoicelistTi record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoicelistTi
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmBatchInvoicelistTi record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBatchInvoicelistTiExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmBatchInvoicelistTi> selectByExample(MmBatchInvoicelistTiExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  String
     * @modified by : 
     * @last-modify : 
     */
    MmBatchInvoicelistTi selectByPrimaryKey(String id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoicelistTi
     * @param : example  MmBatchInvoicelistTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmBatchInvoicelistTi record, @Param("example") MmBatchInvoicelistTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoicelistTi
     * @param : example  MmBatchInvoicelistTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmBatchInvoicelistTi record, @Param("example") MmBatchInvoicelistTiExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoicelistTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmBatchInvoicelistTi record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoicelistTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmBatchInvoicelistTi record);
}