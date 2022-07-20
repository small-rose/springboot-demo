package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmPayablemirrorTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmPayablemirrorTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmPayablemirrorTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPayablemirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmPayablemirrorTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPayablemirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmPayablemirrorTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : listno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long listno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayablemirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmPayablemirrorTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayablemirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmPayablemirrorTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPayablemirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmPayablemirrorTd> selectByExample(MmPayablemirrorTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : listno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmPayablemirrorTd selectByPrimaryKey(Long listno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayablemirrorTd
     * @param : example  MmPayablemirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmPayablemirrorTd record, @Param("example") MmPayablemirrorTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayablemirrorTd
     * @param : example  MmPayablemirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmPayablemirrorTd record, @Param("example") MmPayablemirrorTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayablemirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmPayablemirrorTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayablemirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmPayablemirrorTd record);
}