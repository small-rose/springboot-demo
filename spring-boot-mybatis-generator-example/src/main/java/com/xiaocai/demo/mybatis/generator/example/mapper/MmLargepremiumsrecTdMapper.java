package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmLargepremiumsrecTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmLargepremiumsrecTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmLargepremiumsrecTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmLargepremiumsrecTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmLargepremiumsrecTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmLargepremiumsrecTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmLargepremiumsrecTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  Long
     * @param : unitcode  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("subcompany") Long subcompany, @Param("unitcode") Long unitcode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLargepremiumsrecTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmLargepremiumsrecTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLargepremiumsrecTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmLargepremiumsrecTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmLargepremiumsrecTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmLargepremiumsrecTd> selectByExample(MmLargepremiumsrecTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  Long
     * @param : unitcode  Long
     * @modified by : 
     * @last-modify : 
     */
    MmLargepremiumsrecTd selectByPrimaryKey(@Param("subcompany") Long subcompany, @Param("unitcode") Long unitcode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLargepremiumsrecTd
     * @param : example  MmLargepremiumsrecTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmLargepremiumsrecTd record, @Param("example") MmLargepremiumsrecTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLargepremiumsrecTd
     * @param : example  MmLargepremiumsrecTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmLargepremiumsrecTd record, @Param("example") MmLargepremiumsrecTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLargepremiumsrecTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmLargepremiumsrecTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLargepremiumsrecTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmLargepremiumsrecTd record);
}