package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmRulesConf;
import com.xiaocai.demo.mybatis.generator.example.entity.MmRulesConfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmRulesConfMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmRulesConfExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmRulesConfExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmRulesConfExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmRulesConfExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : code  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String code);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmRulesConf
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmRulesConf record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmRulesConf
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmRulesConf record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmRulesConfExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmRulesConf> selectByExample(MmRulesConfExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : code  String
     * @modified by : 
     * @last-modify : 
     */
    MmRulesConf selectByPrimaryKey(String code);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmRulesConf
     * @param : example  MmRulesConfExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmRulesConf record, @Param("example") MmRulesConfExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmRulesConf
     * @param : example  MmRulesConfExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmRulesConf record, @Param("example") MmRulesConfExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmRulesConf
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmRulesConf record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmRulesConf
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmRulesConf record);
}