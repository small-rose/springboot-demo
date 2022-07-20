package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmInvoiceinformTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmInvoiceinformTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmInvoiceinformTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvoiceinformTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmInvoiceinformTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvoiceinformTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmInvoiceinformTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : informid  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String informid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceinformTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmInvoiceinformTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceinformTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmInvoiceinformTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvoiceinformTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmInvoiceinformTd> selectByExample(MmInvoiceinformTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : informid  String
     * @modified by : 
     * @last-modify : 
     */
    MmInvoiceinformTd selectByPrimaryKey(String informid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceinformTd
     * @param : example  MmInvoiceinformTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmInvoiceinformTd record, @Param("example") MmInvoiceinformTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceinformTd
     * @param : example  MmInvoiceinformTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmInvoiceinformTd record, @Param("example") MmInvoiceinformTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceinformTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmInvoiceinformTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceinformTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmInvoiceinformTd record);
}