package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmFormatComponentTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmFormatComponentTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmFormatComponentTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmFormatComponentTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmFormatComponentTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmFormatComponentTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmFormatComponentTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : componentid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long componentid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFormatComponentTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmFormatComponentTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFormatComponentTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmFormatComponentTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmFormatComponentTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmFormatComponentTc> selectByExample(MmFormatComponentTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : componentid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmFormatComponentTc selectByPrimaryKey(Long componentid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFormatComponentTc
     * @param : example  MmFormatComponentTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmFormatComponentTc record, @Param("example") MmFormatComponentTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFormatComponentTc
     * @param : example  MmFormatComponentTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmFormatComponentTc record, @Param("example") MmFormatComponentTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFormatComponentTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmFormatComponentTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFormatComponentTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmFormatComponentTc record);
}