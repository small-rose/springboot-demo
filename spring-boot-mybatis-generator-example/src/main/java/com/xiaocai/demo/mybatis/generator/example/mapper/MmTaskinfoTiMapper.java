package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmTaskinfoTi;
import com.xiaocai.demo.mybatis.generator.example.entity.MmTaskinfoTiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmTaskinfoTiMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaskinfoTiExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmTaskinfoTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaskinfoTiExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmTaskinfoTiExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : taskid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long taskid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaskinfoTi
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmTaskinfoTi record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaskinfoTi
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmTaskinfoTi record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTaskinfoTiExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmTaskinfoTi> selectByExample(MmTaskinfoTiExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : taskid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmTaskinfoTi selectByPrimaryKey(Long taskid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaskinfoTi
     * @param : example  MmTaskinfoTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmTaskinfoTi record, @Param("example") MmTaskinfoTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaskinfoTi
     * @param : example  MmTaskinfoTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmTaskinfoTi record, @Param("example") MmTaskinfoTiExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaskinfoTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmTaskinfoTi record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTaskinfoTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmTaskinfoTi record);
}