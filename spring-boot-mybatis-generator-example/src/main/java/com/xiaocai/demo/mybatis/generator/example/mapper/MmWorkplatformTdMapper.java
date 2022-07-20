package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmWorkplatformTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmWorkplatformTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmWorkplatformTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmWorkplatformTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmWorkplatformTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmWorkplatformTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmWorkplatformTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : workid  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String workid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmWorkplatformTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmWorkplatformTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmWorkplatformTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmWorkplatformTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmWorkplatformTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmWorkplatformTd> selectByExample(MmWorkplatformTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : workid  String
     * @modified by : 
     * @last-modify : 
     */
    MmWorkplatformTd selectByPrimaryKey(String workid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmWorkplatformTd
     * @param : example  MmWorkplatformTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmWorkplatformTd record, @Param("example") MmWorkplatformTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmWorkplatformTd
     * @param : example  MmWorkplatformTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmWorkplatformTd record, @Param("example") MmWorkplatformTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmWorkplatformTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmWorkplatformTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmWorkplatformTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmWorkplatformTd record);
}