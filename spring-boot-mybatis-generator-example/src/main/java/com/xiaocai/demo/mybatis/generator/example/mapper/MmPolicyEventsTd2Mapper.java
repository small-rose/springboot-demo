package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmPolicyEventsTd2;
import com.xiaocai.demo.mybatis.generator.example.entity.MmPolicyEventsTd2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmPolicyEventsTd2Mapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicyEventsTd2Example
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmPolicyEventsTd2Example example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicyEventsTd2Example
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmPolicyEventsTd2Example example);

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
     * @param : record  MmPolicyEventsTd2
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmPolicyEventsTd2 record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyEventsTd2
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmPolicyEventsTd2 record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicyEventsTd2Example
     * @modified by : 
     * @last-modify : 
     */
    List<MmPolicyEventsTd2> selectByExample(MmPolicyEventsTd2Example example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : listno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmPolicyEventsTd2 selectByPrimaryKey(Long listno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyEventsTd2
     * @param : example  MmPolicyEventsTd2Example
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmPolicyEventsTd2 record, @Param("example") MmPolicyEventsTd2Example example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyEventsTd2
     * @param : example  MmPolicyEventsTd2Example
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmPolicyEventsTd2 record, @Param("example") MmPolicyEventsTd2Example example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyEventsTd2
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmPolicyEventsTd2 record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyEventsTd2
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmPolicyEventsTd2 record);
}