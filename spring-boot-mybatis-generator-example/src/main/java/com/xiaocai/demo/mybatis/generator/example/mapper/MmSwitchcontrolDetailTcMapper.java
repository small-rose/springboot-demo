package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmSwitchcontrolDetailTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmSwitchcontrolDetailTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmSwitchcontrolDetailTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSwitchcontrolDetailTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmSwitchcontrolDetailTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSwitchcontrolDetailTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmSwitchcontrolDetailTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : name  String
     * @param : value  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("name") String name, @Param("value") String value);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSwitchcontrolDetailTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmSwitchcontrolDetailTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSwitchcontrolDetailTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmSwitchcontrolDetailTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSwitchcontrolDetailTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmSwitchcontrolDetailTc> selectByExample(MmSwitchcontrolDetailTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : name  String
     * @param : value  String
     * @modified by : 
     * @last-modify : 
     */
    MmSwitchcontrolDetailTc selectByPrimaryKey(@Param("name") String name, @Param("value") String value);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSwitchcontrolDetailTc
     * @param : example  MmSwitchcontrolDetailTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmSwitchcontrolDetailTc record, @Param("example") MmSwitchcontrolDetailTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSwitchcontrolDetailTc
     * @param : example  MmSwitchcontrolDetailTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmSwitchcontrolDetailTc record, @Param("example") MmSwitchcontrolDetailTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSwitchcontrolDetailTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmSwitchcontrolDetailTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSwitchcontrolDetailTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmSwitchcontrolDetailTc record);
}