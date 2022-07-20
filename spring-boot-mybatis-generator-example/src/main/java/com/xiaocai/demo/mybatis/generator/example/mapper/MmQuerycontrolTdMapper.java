package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmQuerycontrolTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmQuerycontrolTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmQuerycontrolTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmQuerycontrolTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmQuerycontrolTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmQuerycontrolTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmQuerycontrolTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : applyno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long applyno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQuerycontrolTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmQuerycontrolTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQuerycontrolTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmQuerycontrolTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmQuerycontrolTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmQuerycontrolTd> selectByExample(MmQuerycontrolTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : applyno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmQuerycontrolTd selectByPrimaryKey(Long applyno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQuerycontrolTd
     * @param : example  MmQuerycontrolTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmQuerycontrolTd record, @Param("example") MmQuerycontrolTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQuerycontrolTd
     * @param : example  MmQuerycontrolTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmQuerycontrolTd record, @Param("example") MmQuerycontrolTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQuerycontrolTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmQuerycontrolTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQuerycontrolTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmQuerycontrolTd record);
}