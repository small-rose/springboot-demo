package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmMailCofTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmMailCofTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmMailCofTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmMailCofTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmMailCofTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmMailCofTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmMailCofTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : mailcode  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String mailcode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMailCofTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmMailCofTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMailCofTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmMailCofTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmMailCofTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmMailCofTc> selectByExample(MmMailCofTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : mailcode  String
     * @modified by : 
     * @last-modify : 
     */
    MmMailCofTc selectByPrimaryKey(String mailcode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMailCofTc
     * @param : example  MmMailCofTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmMailCofTc record, @Param("example") MmMailCofTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMailCofTc
     * @param : example  MmMailCofTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmMailCofTc record, @Param("example") MmMailCofTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMailCofTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmMailCofTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMailCofTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmMailCofTc record);
}