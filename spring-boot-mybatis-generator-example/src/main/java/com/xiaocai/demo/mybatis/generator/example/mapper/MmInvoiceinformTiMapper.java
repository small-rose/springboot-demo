package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmInvoiceinformTi;
import com.xiaocai.demo.mybatis.generator.example.entity.MmInvoiceinformTiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmInvoiceinformTiMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvoiceinformTiExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmInvoiceinformTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvoiceinformTiExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmInvoiceinformTiExample example);

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
     * @param : record  MmInvoiceinformTi
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmInvoiceinformTi record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceinformTi
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmInvoiceinformTi record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvoiceinformTiExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmInvoiceinformTi> selectByExample(MmInvoiceinformTiExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : informid  String
     * @modified by : 
     * @last-modify : 
     */
    MmInvoiceinformTi selectByPrimaryKey(String informid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceinformTi
     * @param : example  MmInvoiceinformTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmInvoiceinformTi record, @Param("example") MmInvoiceinformTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceinformTi
     * @param : example  MmInvoiceinformTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmInvoiceinformTi record, @Param("example") MmInvoiceinformTiExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceinformTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmInvoiceinformTi record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvoiceinformTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmInvoiceinformTi record);
}