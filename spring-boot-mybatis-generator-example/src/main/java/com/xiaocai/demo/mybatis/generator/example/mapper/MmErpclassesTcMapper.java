package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmErpclassesTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmErpclassesTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmErpclassesTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmErpclassesTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmErpclassesTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmErpclassesTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmErpclassesTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : erpclassescode  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String erpclassescode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErpclassesTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmErpclassesTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErpclassesTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmErpclassesTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmErpclassesTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmErpclassesTc> selectByExample(MmErpclassesTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : erpclassescode  String
     * @modified by : 
     * @last-modify : 
     */
    MmErpclassesTc selectByPrimaryKey(String erpclassescode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErpclassesTc
     * @param : example  MmErpclassesTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmErpclassesTc record, @Param("example") MmErpclassesTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErpclassesTc
     * @param : example  MmErpclassesTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmErpclassesTc record, @Param("example") MmErpclassesTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErpclassesTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmErpclassesTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErpclassesTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmErpclassesTc record);
}