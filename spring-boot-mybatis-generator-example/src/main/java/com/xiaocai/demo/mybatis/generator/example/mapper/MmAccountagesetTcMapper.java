package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmAccountagesetTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmAccountagesetTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmAccountagesetTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccountagesetTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmAccountagesetTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccountagesetTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmAccountagesetTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : agekind  Long
     * @param : accountage  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("agekind") Long agekind, @Param("accountage") Long accountage);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountagesetTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmAccountagesetTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountagesetTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmAccountagesetTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccountagesetTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmAccountagesetTc> selectByExample(MmAccountagesetTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : agekind  Long
     * @param : accountage  Long
     * @modified by : 
     * @last-modify : 
     */
    MmAccountagesetTc selectByPrimaryKey(@Param("agekind") Long agekind, @Param("accountage") Long accountage);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountagesetTc
     * @param : example  MmAccountagesetTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmAccountagesetTc record, @Param("example") MmAccountagesetTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountagesetTc
     * @param : example  MmAccountagesetTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmAccountagesetTc record, @Param("example") MmAccountagesetTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountagesetTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmAccountagesetTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountagesetTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmAccountagesetTc record);
}