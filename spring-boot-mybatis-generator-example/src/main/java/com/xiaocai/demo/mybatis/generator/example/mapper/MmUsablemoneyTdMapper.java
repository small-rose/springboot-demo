package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmUsablemoneyTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmUsablemoneyTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmUsablemoneyTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmUsablemoneyTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmUsablemoneyTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmUsablemoneyTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmUsablemoneyTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : usableno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long usableno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUsablemoneyTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmUsablemoneyTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUsablemoneyTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmUsablemoneyTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmUsablemoneyTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmUsablemoneyTd> selectByExample(MmUsablemoneyTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : usableno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmUsablemoneyTd selectByPrimaryKey(Long usableno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUsablemoneyTd
     * @param : example  MmUsablemoneyTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmUsablemoneyTd record, @Param("example") MmUsablemoneyTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUsablemoneyTd
     * @param : example  MmUsablemoneyTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmUsablemoneyTd record, @Param("example") MmUsablemoneyTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUsablemoneyTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmUsablemoneyTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUsablemoneyTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmUsablemoneyTd record);
}