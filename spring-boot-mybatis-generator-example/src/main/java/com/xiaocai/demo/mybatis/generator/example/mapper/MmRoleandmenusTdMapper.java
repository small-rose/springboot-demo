package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmRoleandmenusTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmRoleandmenusTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmRoleandmenusTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmRoleandmenusTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmRoleandmenusTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmRoleandmenusTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmRoleandmenusTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : roleid  String
     * @param : menuid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("roleid") String roleid, @Param("menuid") Long menuid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmRoleandmenusTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmRoleandmenusTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmRoleandmenusTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmRoleandmenusTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmRoleandmenusTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmRoleandmenusTd> selectByExample(MmRoleandmenusTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : roleid  String
     * @param : menuid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmRoleandmenusTd selectByPrimaryKey(@Param("roleid") String roleid, @Param("menuid") Long menuid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmRoleandmenusTd
     * @param : example  MmRoleandmenusTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmRoleandmenusTd record, @Param("example") MmRoleandmenusTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmRoleandmenusTd
     * @param : example  MmRoleandmenusTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmRoleandmenusTd record, @Param("example") MmRoleandmenusTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmRoleandmenusTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmRoleandmenusTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmRoleandmenusTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmRoleandmenusTd record);
}