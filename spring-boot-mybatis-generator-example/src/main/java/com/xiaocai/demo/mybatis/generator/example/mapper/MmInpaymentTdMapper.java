package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmInpaymentTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmInpaymentTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmInpaymentTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInpaymentTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmInpaymentTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInpaymentTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmInpaymentTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : inpaymentid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long inpaymentid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInpaymentTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmInpaymentTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInpaymentTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmInpaymentTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInpaymentTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmInpaymentTd> selectByExample(MmInpaymentTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : inpaymentid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmInpaymentTd selectByPrimaryKey(Long inpaymentid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInpaymentTd
     * @param : example  MmInpaymentTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmInpaymentTd record, @Param("example") MmInpaymentTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInpaymentTd
     * @param : example  MmInpaymentTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmInpaymentTd record, @Param("example") MmInpaymentTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInpaymentTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmInpaymentTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInpaymentTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmInpaymentTd record);
}