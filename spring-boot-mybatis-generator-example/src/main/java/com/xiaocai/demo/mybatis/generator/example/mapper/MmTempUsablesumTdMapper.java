package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmTempUsablesumTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmTempUsablesumTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmTempUsablesumTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempUsablesumTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmTempUsablesumTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempUsablesumTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmTempUsablesumTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempUsablesumTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmTempUsablesumTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempUsablesumTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmTempUsablesumTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempUsablesumTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmTempUsablesumTd> selectByExample(MmTempUsablesumTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmTempUsablesumTd selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempUsablesumTd
     * @param : example  MmTempUsablesumTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmTempUsablesumTd record, @Param("example") MmTempUsablesumTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempUsablesumTd
     * @param : example  MmTempUsablesumTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmTempUsablesumTd record, @Param("example") MmTempUsablesumTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempUsablesumTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmTempUsablesumTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempUsablesumTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmTempUsablesumTd record);
}