package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmPermissionsTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmPermissionsTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmPermissionsTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPermissionsTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmPermissionsTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPermissionsTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmPermissionsTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : permissionsid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long permissionsid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPermissionsTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmPermissionsTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPermissionsTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmPermissionsTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPermissionsTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmPermissionsTd> selectByExample(MmPermissionsTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : permissionsid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmPermissionsTd selectByPrimaryKey(Long permissionsid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPermissionsTd
     * @param : example  MmPermissionsTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmPermissionsTd record, @Param("example") MmPermissionsTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPermissionsTd
     * @param : example  MmPermissionsTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmPermissionsTd record, @Param("example") MmPermissionsTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPermissionsTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmPermissionsTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPermissionsTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmPermissionsTd record);
}