package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmSwitchcontrolTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmSwitchcontrolTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmSwitchcontrolTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSwitchcontrolTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmSwitchcontrolTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSwitchcontrolTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmSwitchcontrolTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  String
     * @param : switchedsys  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("subcompany") String subcompany, @Param("switchedsys") String switchedsys);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSwitchcontrolTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmSwitchcontrolTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSwitchcontrolTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmSwitchcontrolTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSwitchcontrolTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmSwitchcontrolTc> selectByExample(MmSwitchcontrolTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  String
     * @param : switchedsys  String
     * @modified by : 
     * @last-modify : 
     */
    MmSwitchcontrolTc selectByPrimaryKey(@Param("subcompany") String subcompany, @Param("switchedsys") String switchedsys);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSwitchcontrolTc
     * @param : example  MmSwitchcontrolTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmSwitchcontrolTc record, @Param("example") MmSwitchcontrolTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSwitchcontrolTc
     * @param : example  MmSwitchcontrolTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmSwitchcontrolTc record, @Param("example") MmSwitchcontrolTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSwitchcontrolTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmSwitchcontrolTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSwitchcontrolTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmSwitchcontrolTc record);
}