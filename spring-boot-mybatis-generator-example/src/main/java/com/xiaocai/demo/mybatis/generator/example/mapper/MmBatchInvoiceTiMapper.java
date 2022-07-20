package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmBatchInvoiceTi;
import com.xiaocai.demo.mybatis.generator.example.entity.MmBatchInvoiceTiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmBatchInvoiceTiMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBatchInvoiceTiExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmBatchInvoiceTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBatchInvoiceTiExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmBatchInvoiceTiExample example);

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
     * @param : record  MmBatchInvoiceTi
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmBatchInvoiceTi record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoiceTi
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmBatchInvoiceTi record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBatchInvoiceTiExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmBatchInvoiceTi> selectByExample(MmBatchInvoiceTiExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  String
     * @modified by : 
     * @last-modify : 
     */
    MmBatchInvoiceTi selectByPrimaryKey(String id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoiceTi
     * @param : example  MmBatchInvoiceTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmBatchInvoiceTi record, @Param("example") MmBatchInvoiceTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoiceTi
     * @param : example  MmBatchInvoiceTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmBatchInvoiceTi record, @Param("example") MmBatchInvoiceTiExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoiceTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmBatchInvoiceTi record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoiceTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmBatchInvoiceTi record);
}