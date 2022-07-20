package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmUserTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmUserTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmUserTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmUserTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmUserTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmUserTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmUserTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : opcode  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String opcode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUserTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmUserTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUserTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmUserTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmUserTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmUserTc> selectByExample(MmUserTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : opcode  String
     * @modified by : 
     * @last-modify : 
     */
    MmUserTc selectByPrimaryKey(String opcode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUserTc
     * @param : example  MmUserTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmUserTc record, @Param("example") MmUserTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUserTc
     * @param : example  MmUserTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmUserTc record, @Param("example") MmUserTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUserTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmUserTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUserTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmUserTc record);
}