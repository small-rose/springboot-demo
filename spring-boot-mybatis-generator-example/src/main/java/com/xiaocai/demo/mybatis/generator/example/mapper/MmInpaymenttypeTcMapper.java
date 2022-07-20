package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmInpaymenttypeTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmInpaymenttypeTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmInpaymenttypeTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInpaymenttypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmInpaymenttypeTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInpaymenttypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmInpaymenttypeTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : processtype1  String
     * @param : processtype2  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("processtype1") String processtype1, @Param("processtype2") String processtype2);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInpaymenttypeTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmInpaymenttypeTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInpaymenttypeTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmInpaymenttypeTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInpaymenttypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmInpaymenttypeTc> selectByExample(MmInpaymenttypeTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : processtype1  String
     * @param : processtype2  String
     * @modified by : 
     * @last-modify : 
     */
    MmInpaymenttypeTc selectByPrimaryKey(@Param("processtype1") String processtype1, @Param("processtype2") String processtype2);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInpaymenttypeTc
     * @param : example  MmInpaymenttypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmInpaymenttypeTc record, @Param("example") MmInpaymenttypeTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInpaymenttypeTc
     * @param : example  MmInpaymenttypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmInpaymenttypeTc record, @Param("example") MmInpaymenttypeTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInpaymenttypeTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmInpaymenttypeTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInpaymenttypeTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmInpaymenttypeTc record);
}