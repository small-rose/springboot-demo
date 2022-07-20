package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmLandResultTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmLandResultTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmLandResultTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmLandResultTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmLandResultTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmLandResultTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmLandResultTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqland  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long seqland);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLandResultTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmLandResultTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLandResultTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmLandResultTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmLandResultTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmLandResultTd> selectByExample(MmLandResultTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqland  Long
     * @modified by : 
     * @last-modify : 
     */
    MmLandResultTd selectByPrimaryKey(Long seqland);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLandResultTd
     * @param : example  MmLandResultTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmLandResultTd record, @Param("example") MmLandResultTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLandResultTd
     * @param : example  MmLandResultTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmLandResultTd record, @Param("example") MmLandResultTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLandResultTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmLandResultTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLandResultTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmLandResultTd record);
}