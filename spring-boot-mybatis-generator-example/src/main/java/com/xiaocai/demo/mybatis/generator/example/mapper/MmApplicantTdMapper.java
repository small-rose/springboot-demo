package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmApplicantTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmApplicantTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmApplicantTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmApplicantTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmApplicantTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmApplicantTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmApplicantTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : rcptno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long rcptno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmApplicantTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmApplicantTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmApplicantTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmApplicantTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmApplicantTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmApplicantTd> selectByExample(MmApplicantTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : rcptno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmApplicantTd selectByPrimaryKey(Long rcptno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmApplicantTd
     * @param : example  MmApplicantTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmApplicantTd record, @Param("example") MmApplicantTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmApplicantTd
     * @param : example  MmApplicantTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmApplicantTd record, @Param("example") MmApplicantTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmApplicantTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmApplicantTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmApplicantTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmApplicantTd record);
}