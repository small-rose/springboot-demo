package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmSmsCofTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmSmsCofTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmSmsCofTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSmsCofTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmSmsCofTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSmsCofTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmSmsCofTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : smstype  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String smstype);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSmsCofTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmSmsCofTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSmsCofTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmSmsCofTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSmsCofTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmSmsCofTc> selectByExample(MmSmsCofTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : smstype  String
     * @modified by : 
     * @last-modify : 
     */
    MmSmsCofTc selectByPrimaryKey(String smstype);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSmsCofTc
     * @param : example  MmSmsCofTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmSmsCofTc record, @Param("example") MmSmsCofTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSmsCofTc
     * @param : example  MmSmsCofTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmSmsCofTc record, @Param("example") MmSmsCofTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSmsCofTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmSmsCofTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSmsCofTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmSmsCofTc record);
}