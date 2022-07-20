package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmVouchertypeTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmVouchertypeTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmVouchertypeTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVouchertypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmVouchertypeTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVouchertypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmVouchertypeTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : typeid  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String typeid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchertypeTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmVouchertypeTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchertypeTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmVouchertypeTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVouchertypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmVouchertypeTc> selectByExample(MmVouchertypeTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : typeid  String
     * @modified by : 
     * @last-modify : 
     */
    MmVouchertypeTc selectByPrimaryKey(String typeid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchertypeTc
     * @param : example  MmVouchertypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmVouchertypeTc record, @Param("example") MmVouchertypeTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchertypeTc
     * @param : example  MmVouchertypeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmVouchertypeTc record, @Param("example") MmVouchertypeTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchertypeTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmVouchertypeTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchertypeTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmVouchertypeTc record);
}