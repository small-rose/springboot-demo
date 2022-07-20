package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmDefaultsetTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmDefaultsetTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmDefaultsetTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDefaultsetTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmDefaultsetTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDefaultsetTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmDefaultsetTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String subcompany);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDefaultsetTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmDefaultsetTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDefaultsetTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmDefaultsetTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDefaultsetTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmDefaultsetTc> selectByExample(MmDefaultsetTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  String
     * @modified by : 
     * @last-modify : 
     */
    MmDefaultsetTc selectByPrimaryKey(String subcompany);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDefaultsetTc
     * @param : example  MmDefaultsetTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmDefaultsetTc record, @Param("example") MmDefaultsetTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDefaultsetTc
     * @param : example  MmDefaultsetTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmDefaultsetTc record, @Param("example") MmDefaultsetTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDefaultsetTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmDefaultsetTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDefaultsetTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmDefaultsetTc record);
}