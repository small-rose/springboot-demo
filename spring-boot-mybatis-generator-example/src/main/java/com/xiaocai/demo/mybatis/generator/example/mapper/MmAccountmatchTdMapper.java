package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmAccountmatchTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmAccountmatchTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmAccountmatchTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccountmatchTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmAccountmatchTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccountmatchTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmAccountmatchTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : matchid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long matchid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountmatchTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmAccountmatchTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountmatchTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmAccountmatchTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccountmatchTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmAccountmatchTd> selectByExample(MmAccountmatchTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : matchid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmAccountmatchTd selectByPrimaryKey(Long matchid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountmatchTd
     * @param : example  MmAccountmatchTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmAccountmatchTd record, @Param("example") MmAccountmatchTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountmatchTd
     * @param : example  MmAccountmatchTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmAccountmatchTd record, @Param("example") MmAccountmatchTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountmatchTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmAccountmatchTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountmatchTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmAccountmatchTd record);
}