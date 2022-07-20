package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmEmailadvieslistTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmEmailadvieslistTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmEmailadvieslistTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmEmailadvieslistTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmEmailadvieslistTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmEmailadvieslistTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmEmailadvieslistTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : emailid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long emailid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmEmailadvieslistTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmEmailadvieslistTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmEmailadvieslistTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmEmailadvieslistTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmEmailadvieslistTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmEmailadvieslistTd> selectByExample(MmEmailadvieslistTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : emailid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmEmailadvieslistTd selectByPrimaryKey(Long emailid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmEmailadvieslistTd
     * @param : example  MmEmailadvieslistTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmEmailadvieslistTd record, @Param("example") MmEmailadvieslistTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmEmailadvieslistTd
     * @param : example  MmEmailadvieslistTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmEmailadvieslistTd record, @Param("example") MmEmailadvieslistTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmEmailadvieslistTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmEmailadvieslistTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmEmailadvieslistTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmEmailadvieslistTd record);
}