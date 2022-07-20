package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmAccperiodTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmAccperiodTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmAccperiodTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccperiodTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmAccperiodTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccperiodTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmAccperiodTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  String
     * @param : accountyear  Long
     * @param : accountmonth  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("subcompany") String subcompany, @Param("accountyear") Long accountyear, @Param("accountmonth") Long accountmonth);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccperiodTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmAccperiodTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccperiodTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmAccperiodTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccperiodTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmAccperiodTd> selectByExample(MmAccperiodTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  String
     * @param : accountyear  Long
     * @param : accountmonth  Long
     * @modified by : 
     * @last-modify : 
     */
    MmAccperiodTd selectByPrimaryKey(@Param("subcompany") String subcompany, @Param("accountyear") Long accountyear, @Param("accountmonth") Long accountmonth);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccperiodTd
     * @param : example  MmAccperiodTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmAccperiodTd record, @Param("example") MmAccperiodTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccperiodTd
     * @param : example  MmAccperiodTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmAccperiodTd record, @Param("example") MmAccperiodTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccperiodTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmAccperiodTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccperiodTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmAccperiodTd record);
}