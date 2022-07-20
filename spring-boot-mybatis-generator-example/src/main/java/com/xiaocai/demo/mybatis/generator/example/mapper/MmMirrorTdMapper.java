package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmMirrorTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmMirrorTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmMirrorTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmMirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmMirrorTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmMirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmMirrorTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : mirrorid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long mirrorid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmMirrorTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmMirrorTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmMirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmMirrorTd> selectByExample(MmMirrorTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : mirrorid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmMirrorTd selectByPrimaryKey(Long mirrorid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMirrorTd
     * @param : example  MmMirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmMirrorTd record, @Param("example") MmMirrorTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMirrorTd
     * @param : example  MmMirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmMirrorTd record, @Param("example") MmMirrorTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmMirrorTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmMirrorTd record);
}