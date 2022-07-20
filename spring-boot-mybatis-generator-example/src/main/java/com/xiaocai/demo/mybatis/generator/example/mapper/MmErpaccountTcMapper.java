package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmErpaccountTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmErpaccountTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmErpaccountTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmErpaccountTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmErpaccountTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmErpaccountTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmErpaccountTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : erpaccountcode  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long erpaccountcode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErpaccountTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmErpaccountTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErpaccountTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmErpaccountTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmErpaccountTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmErpaccountTc> selectByExample(MmErpaccountTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : erpaccountcode  Long
     * @modified by : 
     * @last-modify : 
     */
    MmErpaccountTc selectByPrimaryKey(Long erpaccountcode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErpaccountTc
     * @param : example  MmErpaccountTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmErpaccountTc record, @Param("example") MmErpaccountTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErpaccountTc
     * @param : example  MmErpaccountTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmErpaccountTc record, @Param("example") MmErpaccountTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErpaccountTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmErpaccountTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErpaccountTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmErpaccountTc record);
}