package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmBankareaTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmBankareaTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmBankareaTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBankareaTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmBankareaTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBankareaTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmBankareaTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : bankcode  Long
     * @param : areacode  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("bankcode") Long bankcode, @Param("areacode") Long areacode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankareaTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmBankareaTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankareaTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmBankareaTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBankareaTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmBankareaTc> selectByExample(MmBankareaTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : bankcode  Long
     * @param : areacode  Long
     * @modified by : 
     * @last-modify : 
     */
    MmBankareaTc selectByPrimaryKey(@Param("bankcode") Long bankcode, @Param("areacode") Long areacode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankareaTc
     * @param : example  MmBankareaTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmBankareaTc record, @Param("example") MmBankareaTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankareaTc
     * @param : example  MmBankareaTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmBankareaTc record, @Param("example") MmBankareaTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankareaTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmBankareaTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankareaTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmBankareaTc record);
}