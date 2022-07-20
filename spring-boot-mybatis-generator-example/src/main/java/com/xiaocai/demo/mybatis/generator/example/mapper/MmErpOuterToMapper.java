package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmErpOuterTo;
import com.xiaocai.demo.mybatis.generator.example.entity.MmErpOuterToExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmErpOuterToMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmErpOuterToExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmErpOuterToExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmErpOuterToExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmErpOuterToExample example);

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
     * @param : record  MmErpOuterTo
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmErpOuterTo record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErpOuterTo
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmErpOuterTo record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmErpOuterToExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmErpOuterTo> selectByExample(MmErpOuterToExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmErpOuterTo selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErpOuterTo
     * @param : example  MmErpOuterToExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmErpOuterTo record, @Param("example") MmErpOuterToExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErpOuterTo
     * @param : example  MmErpOuterToExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmErpOuterTo record, @Param("example") MmErpOuterToExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErpOuterTo
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmErpOuterTo record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErpOuterTo
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmErpOuterTo record);
}