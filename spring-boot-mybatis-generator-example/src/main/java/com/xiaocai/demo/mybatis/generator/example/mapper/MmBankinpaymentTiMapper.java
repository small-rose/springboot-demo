package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmBankInpaymentTi;
import com.xiaocai.demo.mybatis.generator.example.entity.MmBankInpaymentTiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmBankInpaymentTiMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBankInpaymentTiExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmBankInpaymentTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBankInpaymentTiExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmBankInpaymentTiExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : yqid  String
     * @param : batchid  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("yqid") String yqid, @Param("batchid") String batchid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankInpaymentTi
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmBankInpaymentTi record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankInpaymentTi
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmBankInpaymentTi record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBankInpaymentTiExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmBankInpaymentTi> selectByExample(MmBankInpaymentTiExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : yqid  String
     * @param : batchid  String
     * @modified by : 
     * @last-modify : 
     */
    MmBankInpaymentTi selectByPrimaryKey(@Param("yqid") String yqid, @Param("batchid") String batchid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankInpaymentTi
     * @param : example  MmBankInpaymentTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmBankInpaymentTi record, @Param("example") MmBankInpaymentTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankInpaymentTi
     * @param : example  MmBankInpaymentTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmBankInpaymentTi record, @Param("example") MmBankInpaymentTiExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankInpaymentTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmBankInpaymentTi record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankInpaymentTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmBankInpaymentTi record);
}