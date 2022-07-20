package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmCitycodeTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmCitycodeTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmCitycodeTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCitycodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmCitycodeTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCitycodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmCitycodeTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : addrcode  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String addrcode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCitycodeTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmCitycodeTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCitycodeTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmCitycodeTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCitycodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmCitycodeTc> selectByExample(MmCitycodeTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : addrcode  String
     * @modified by : 
     * @last-modify : 
     */
    MmCitycodeTc selectByPrimaryKey(String addrcode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCitycodeTc
     * @param : example  MmCitycodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmCitycodeTc record, @Param("example") MmCitycodeTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCitycodeTc
     * @param : example  MmCitycodeTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmCitycodeTc record, @Param("example") MmCitycodeTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCitycodeTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmCitycodeTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCitycodeTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmCitycodeTc record);
}