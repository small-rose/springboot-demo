package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmBankInpaymentTiBak;
import com.xiaocai.demo.mybatis.generator.example.entity.MmBankInpaymentTiBakExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmBankInpaymentTiBakMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBankInpaymentTiBakExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmBankInpaymentTiBakExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBankInpaymentTiBakExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmBankInpaymentTiBakExample example);

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
     * @param : record  MmBankInpaymentTiBak
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmBankInpaymentTiBak record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankInpaymentTiBak
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmBankInpaymentTiBak record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBankInpaymentTiBakExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmBankInpaymentTiBak> selectByExample(MmBankInpaymentTiBakExample example);

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
    MmBankInpaymentTiBak selectByPrimaryKey(@Param("yqid") String yqid, @Param("batchid") String batchid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankInpaymentTiBak
     * @param : example  MmBankInpaymentTiBakExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmBankInpaymentTiBak record, @Param("example") MmBankInpaymentTiBakExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankInpaymentTiBak
     * @param : example  MmBankInpaymentTiBakExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmBankInpaymentTiBak record, @Param("example") MmBankInpaymentTiBakExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankInpaymentTiBak
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmBankInpaymentTiBak record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankInpaymentTiBak
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmBankInpaymentTiBak record);
}