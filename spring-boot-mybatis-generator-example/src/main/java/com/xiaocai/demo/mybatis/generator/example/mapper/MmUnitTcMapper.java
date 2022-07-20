package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmUnitTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmUnitTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmUnitTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmUnitTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmUnitTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmUnitTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmUnitTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : unitcode  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String unitcode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUnitTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmUnitTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUnitTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmUnitTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmUnitTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmUnitTc> selectByExample(MmUnitTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : unitcode  String
     * @modified by : 
     * @last-modify : 
     */
    MmUnitTc selectByPrimaryKey(String unitcode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUnitTc
     * @param : example  MmUnitTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmUnitTc record, @Param("example") MmUnitTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUnitTc
     * @param : example  MmUnitTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmUnitTc record, @Param("example") MmUnitTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUnitTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmUnitTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUnitTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmUnitTc record);
}