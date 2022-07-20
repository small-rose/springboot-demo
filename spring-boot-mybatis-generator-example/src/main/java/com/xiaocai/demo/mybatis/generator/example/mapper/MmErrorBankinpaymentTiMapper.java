package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmErrorBankinpaymentTi;
import com.xiaocai.demo.mybatis.generator.example.entity.MmErrorBankinpaymentTiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmErrorBankinpaymentTiMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmErrorBankinpaymentTiExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmErrorBankinpaymentTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmErrorBankinpaymentTiExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmErrorBankinpaymentTiExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : errorid  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String errorid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErrorBankinpaymentTi
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmErrorBankinpaymentTi record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErrorBankinpaymentTi
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmErrorBankinpaymentTi record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmErrorBankinpaymentTiExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmErrorBankinpaymentTi> selectByExample(MmErrorBankinpaymentTiExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : errorid  String
     * @modified by : 
     * @last-modify : 
     */
    MmErrorBankinpaymentTi selectByPrimaryKey(String errorid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErrorBankinpaymentTi
     * @param : example  MmErrorBankinpaymentTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmErrorBankinpaymentTi record, @Param("example") MmErrorBankinpaymentTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErrorBankinpaymentTi
     * @param : example  MmErrorBankinpaymentTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmErrorBankinpaymentTi record, @Param("example") MmErrorBankinpaymentTiExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErrorBankinpaymentTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmErrorBankinpaymentTi record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErrorBankinpaymentTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmErrorBankinpaymentTi record);
}