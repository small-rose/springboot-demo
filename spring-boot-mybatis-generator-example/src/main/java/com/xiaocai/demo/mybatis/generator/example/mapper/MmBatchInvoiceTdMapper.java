package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmBatchInvoiceTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmBatchInvoiceTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmBatchInvoiceTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBatchInvoiceTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmBatchInvoiceTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBatchInvoiceTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmBatchInvoiceTdExample example);

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
     * @param : record  MmBatchInvoiceTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmBatchInvoiceTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoiceTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmBatchInvoiceTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBatchInvoiceTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmBatchInvoiceTd> selectByExample(MmBatchInvoiceTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  String
     * @modified by : 
     * @last-modify : 
     */
    MmBatchInvoiceTd selectByPrimaryKey(String id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoiceTd
     * @param : example  MmBatchInvoiceTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmBatchInvoiceTd record, @Param("example") MmBatchInvoiceTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoiceTd
     * @param : example  MmBatchInvoiceTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmBatchInvoiceTd record, @Param("example") MmBatchInvoiceTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoiceTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmBatchInvoiceTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchInvoiceTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmBatchInvoiceTd record);
}