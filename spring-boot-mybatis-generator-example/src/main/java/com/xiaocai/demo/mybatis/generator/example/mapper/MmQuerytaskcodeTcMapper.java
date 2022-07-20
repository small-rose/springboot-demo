package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmQuerytaskcodeTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmQuerytaskcodeTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmQuerytaskcodeTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmQuerytaskcodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmQuerytaskcodeTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmQuerytaskcodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmQuerytaskcodeTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : taskcode  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String taskcode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQuerytaskcodeTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmQuerytaskcodeTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQuerytaskcodeTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmQuerytaskcodeTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmQuerytaskcodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmQuerytaskcodeTc> selectByExample(MmQuerytaskcodeTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : taskcode  String
     * @modified by : 
     * @last-modify : 
     */
    MmQuerytaskcodeTc selectByPrimaryKey(String taskcode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQuerytaskcodeTc
     * @param : example  MmQuerytaskcodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmQuerytaskcodeTc record, @Param("example") MmQuerytaskcodeTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQuerytaskcodeTc
     * @param : example  MmQuerytaskcodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmQuerytaskcodeTc record, @Param("example") MmQuerytaskcodeTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQuerytaskcodeTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmQuerytaskcodeTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQuerytaskcodeTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmQuerytaskcodeTc record);
}