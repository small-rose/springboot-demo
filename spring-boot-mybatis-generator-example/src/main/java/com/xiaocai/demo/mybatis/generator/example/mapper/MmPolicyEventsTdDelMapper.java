package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmPolicyEventsTdDel;
import com.xiaocai.demo.mybatis.generator.example.entity.MmPolicyEventsTdDelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MmPolicyEventsTdDelMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicyEventsTdDelExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmPolicyEventsTdDelExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicyEventsTdDelExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmPolicyEventsTdDelExample example);

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
     * @param : record  MmPolicyEventsTdDel
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmPolicyEventsTdDel record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyEventsTdDel
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmPolicyEventsTdDel record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicyEventsTdDelExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmPolicyEventsTdDel> selectByExample(MmPolicyEventsTdDelExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : listno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmPolicyEventsTdDel selectByPrimaryKey(Long listno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyEventsTdDel
     * @param : example  MmPolicyEventsTdDelExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmPolicyEventsTdDel record, @Param("example") MmPolicyEventsTdDelExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyEventsTdDel
     * @param : example  MmPolicyEventsTdDelExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmPolicyEventsTdDel record, @Param("example") MmPolicyEventsTdDelExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyEventsTdDel
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmPolicyEventsTdDel record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyEventsTdDel
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmPolicyEventsTdDel record);
}