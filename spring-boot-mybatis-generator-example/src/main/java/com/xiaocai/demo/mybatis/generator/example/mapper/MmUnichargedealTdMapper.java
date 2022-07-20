package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmUnichargedealTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmUnichargedealTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmUnichargedealTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmUnichargedealTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmUnichargedealTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmUnichargedealTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmUnichargedealTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqchargedeal  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long seqchargedeal);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUnichargedealTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmUnichargedealTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUnichargedealTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmUnichargedealTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmUnichargedealTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmUnichargedealTd> selectByExample(MmUnichargedealTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqchargedeal  Long
     * @modified by : 
     * @last-modify : 
     */
    MmUnichargedealTd selectByPrimaryKey(Long seqchargedeal);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUnichargedealTd
     * @param : example  MmUnichargedealTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmUnichargedealTd record, @Param("example") MmUnichargedealTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUnichargedealTd
     * @param : example  MmUnichargedealTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmUnichargedealTd record, @Param("example") MmUnichargedealTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUnichargedealTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmUnichargedealTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUnichargedealTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmUnichargedealTd record);
}