package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmRolesTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmRolesTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmRolesTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmRolesTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmRolesTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmRolesTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmRolesTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : roleid  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String roleid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmRolesTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmRolesTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmRolesTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmRolesTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmRolesTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmRolesTc> selectByExample(MmRolesTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : roleid  String
     * @modified by : 
     * @last-modify : 
     */
    MmRolesTc selectByPrimaryKey(String roleid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmRolesTc
     * @param : example  MmRolesTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmRolesTc record, @Param("example") MmRolesTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmRolesTc
     * @param : example  MmRolesTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmRolesTc record, @Param("example") MmRolesTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmRolesTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmRolesTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmRolesTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmRolesTc record);
}