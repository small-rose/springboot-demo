package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.DUser;
import com.xiaocai.demo.mybatis.generator.example.entity.DUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUserMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  DUserExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(DUserExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  DUserExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(DUserExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : userid  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String userid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DUser
     * @modified by : 
     * @last-modify : 
     */
    int insert(DUser record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DUser
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(DUser record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  DUserExample
     * @modified by : 
     * @last-modify : 
     */
    List<DUser> selectByExample(DUserExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : userid  String
     * @modified by : 
     * @last-modify : 
     */
    DUser selectByPrimaryKey(String userid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DUser
     * @param : example  DUserExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") DUser record, @Param("example") DUserExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DUser
     * @param : example  DUserExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") DUser record, @Param("example") DUserExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DUser
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(DUser record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DUser
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(DUser record);
}