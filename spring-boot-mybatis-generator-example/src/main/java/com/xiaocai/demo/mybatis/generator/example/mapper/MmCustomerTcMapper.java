package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmCustomerTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmCustomerTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmCustomerTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCustomerTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmCustomerTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCustomerTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmCustomerTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : customercode  String
     * @param : customernamecn  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("customercode") String customercode, @Param("customernamecn") String customernamecn);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCustomerTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmCustomerTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCustomerTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmCustomerTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCustomerTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmCustomerTc> selectByExample(MmCustomerTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : customercode  String
     * @param : customernamecn  String
     * @modified by : 
     * @last-modify : 
     */
    MmCustomerTc selectByPrimaryKey(@Param("customercode") String customercode, @Param("customernamecn") String customernamecn);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCustomerTc
     * @param : example  MmCustomerTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmCustomerTc record, @Param("example") MmCustomerTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCustomerTc
     * @param : example  MmCustomerTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmCustomerTc record, @Param("example") MmCustomerTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCustomerTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmCustomerTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCustomerTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmCustomerTc record);
}