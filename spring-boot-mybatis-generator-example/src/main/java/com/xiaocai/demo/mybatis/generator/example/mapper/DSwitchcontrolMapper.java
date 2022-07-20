package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.DSwitchcontrol;
import com.xiaocai.demo.mybatis.generator.example.entity.DSwitchcontrolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DSwitchcontrolMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  DSwitchcontrolExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(DSwitchcontrolExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  DSwitchcontrolExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(DSwitchcontrolExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String id);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DSwitchcontrol
     * @modified by : 
     * @last-modify : 
     */
    int insert(DSwitchcontrol record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DSwitchcontrol
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(DSwitchcontrol record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  DSwitchcontrolExample
     * @modified by : 
     * @last-modify : 
     */
    List<DSwitchcontrol> selectByExample(DSwitchcontrolExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  String
     * @modified by : 
     * @last-modify : 
     */
    DSwitchcontrol selectByPrimaryKey(String id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DSwitchcontrol
     * @param : example  DSwitchcontrolExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") DSwitchcontrol record, @Param("example") DSwitchcontrolExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DSwitchcontrol
     * @param : example  DSwitchcontrolExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") DSwitchcontrol record, @Param("example") DSwitchcontrolExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DSwitchcontrol
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(DSwitchcontrol record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DSwitchcontrol
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(DSwitchcontrol record);
}