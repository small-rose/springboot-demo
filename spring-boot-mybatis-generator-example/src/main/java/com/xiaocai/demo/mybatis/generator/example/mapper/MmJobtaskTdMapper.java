package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmJobtaskTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmJobtaskTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmJobtaskTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmJobtaskTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmJobtaskTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmJobtaskTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmJobtaskTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : businessno  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String businessno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmJobtaskTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmJobtaskTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmJobtaskTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmJobtaskTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmJobtaskTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmJobtaskTd> selectByExample(MmJobtaskTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : businessno  String
     * @modified by : 
     * @last-modify : 
     */
    MmJobtaskTd selectByPrimaryKey(String businessno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmJobtaskTd
     * @param : example  MmJobtaskTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmJobtaskTd record, @Param("example") MmJobtaskTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmJobtaskTd
     * @param : example  MmJobtaskTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmJobtaskTd record, @Param("example") MmJobtaskTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmJobtaskTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmJobtaskTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmJobtaskTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmJobtaskTd record);
}