package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmBankInpaymentHistory;
import com.xiaocai.demo.mybatis.generator.example.entity.MmBankInpaymentHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmBankInpaymentHistoryMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBankInpaymentHistoryExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmBankInpaymentHistoryExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBankInpaymentHistoryExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmBankInpaymentHistoryExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : urid  String
     * @param : batchid  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("urid") String urid, @Param("batchid") String batchid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankInpaymentHistory
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmBankInpaymentHistory record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankInpaymentHistory
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmBankInpaymentHistory record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBankInpaymentHistoryExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmBankInpaymentHistory> selectByExample(MmBankInpaymentHistoryExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : urid  String
     * @param : batchid  String
     * @modified by : 
     * @last-modify : 
     */
    MmBankInpaymentHistory selectByPrimaryKey(@Param("urid") String urid, @Param("batchid") String batchid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankInpaymentHistory
     * @param : example  MmBankInpaymentHistoryExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmBankInpaymentHistory record, @Param("example") MmBankInpaymentHistoryExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankInpaymentHistory
     * @param : example  MmBankInpaymentHistoryExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmBankInpaymentHistory record, @Param("example") MmBankInpaymentHistoryExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankInpaymentHistory
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmBankInpaymentHistory record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankInpaymentHistory
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmBankInpaymentHistory record);
}