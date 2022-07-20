package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmAccountageTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmAccountageTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmAccountageTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccountageTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmAccountageTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccountageTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmAccountageTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : unitcode  Long
     * @param : periodname  Long
     * @param : accountcode  Long
     * @param : classescode  Long
     * @param : currencycode  Long
     * @param : accountage  Long
     * @param : agetype  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("unitcode") Long unitcode, @Param("periodname") Long periodname, @Param("accountcode") Long accountcode, @Param("classescode") Long classescode, @Param("currencycode") Long currencycode, @Param("accountage") Long accountage, @Param("agetype") Long agetype);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountageTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmAccountageTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountageTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmAccountageTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccountageTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmAccountageTd> selectByExample(MmAccountageTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : unitcode  Long
     * @param : periodname  Long
     * @param : accountcode  Long
     * @param : classescode  Long
     * @param : currencycode  Long
     * @param : accountage  Long
     * @param : agetype  Long
     * @modified by : 
     * @last-modify : 
     */
    MmAccountageTd selectByPrimaryKey(@Param("unitcode") Long unitcode, @Param("periodname") Long periodname, @Param("accountcode") Long accountcode, @Param("classescode") Long classescode, @Param("currencycode") Long currencycode, @Param("accountage") Long accountage, @Param("agetype") Long agetype);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountageTd
     * @param : example  MmAccountageTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmAccountageTd record, @Param("example") MmAccountageTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountageTd
     * @param : example  MmAccountageTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmAccountageTd record, @Param("example") MmAccountageTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountageTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmAccountageTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountageTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmAccountageTd record);
}