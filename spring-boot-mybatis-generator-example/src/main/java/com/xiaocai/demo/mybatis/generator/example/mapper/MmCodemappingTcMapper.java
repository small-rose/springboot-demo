package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmCodemappingTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmCodemappingTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmCodemappingTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCodemappingTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmCodemappingTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCodemappingTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmCodemappingTcExample example);

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
     * @param : record  MmCodemappingTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmCodemappingTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCodemappingTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmCodemappingTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCodemappingTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmCodemappingTc> selectByExample(MmCodemappingTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmCodemappingTc selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCodemappingTc
     * @param : example  MmCodemappingTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmCodemappingTc record, @Param("example") MmCodemappingTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCodemappingTc
     * @param : example  MmCodemappingTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmCodemappingTc record, @Param("example") MmCodemappingTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCodemappingTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmCodemappingTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCodemappingTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmCodemappingTc record);
}