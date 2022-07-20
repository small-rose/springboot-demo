package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmCurrencycodeTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmCurrencycodeTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmCurrencycodeTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCurrencycodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmCurrencycodeTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCurrencycodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmCurrencycodeTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : currencycode  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String currencycode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCurrencycodeTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmCurrencycodeTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCurrencycodeTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmCurrencycodeTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCurrencycodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmCurrencycodeTc> selectByExample(MmCurrencycodeTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : currencycode  String
     * @modified by : 
     * @last-modify : 
     */
    MmCurrencycodeTc selectByPrimaryKey(String currencycode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCurrencycodeTc
     * @param : example  MmCurrencycodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmCurrencycodeTc record, @Param("example") MmCurrencycodeTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCurrencycodeTc
     * @param : example  MmCurrencycodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmCurrencycodeTc record, @Param("example") MmCurrencycodeTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCurrencycodeTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmCurrencycodeTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCurrencycodeTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmCurrencycodeTc record);
}