package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmInvoicevatinTiFnd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmInvoicevatinTiFndExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmInvoicevatinTiFndMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvoicevatinTiFndExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmInvoicevatinTiFndExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvoicevatinTiFndExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmInvoicevatinTiFndExample example);

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
     * @param : record  MmInvoicevatinTiFnd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmInvoicevatinTiFnd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoicevatinTiFnd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmInvoicevatinTiFnd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvoicevatinTiFndExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmInvoicevatinTiFnd> selectByExample(MmInvoicevatinTiFndExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmInvoicevatinTiFnd selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoicevatinTiFnd
     * @param : example  MmInvoicevatinTiFndExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmInvoicevatinTiFnd record, @Param("example") MmInvoicevatinTiFndExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoicevatinTiFnd
     * @param : example  MmInvoicevatinTiFndExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmInvoicevatinTiFnd record, @Param("example") MmInvoicevatinTiFndExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoicevatinTiFnd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmInvoicevatinTiFnd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoicevatinTiFnd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmInvoicevatinTiFnd record);
}