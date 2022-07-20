package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmQueryfileTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmQueryfileTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmQueryfileTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmQueryfileTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmQueryfileTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmQueryfileTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmQueryfileTdExample example);

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
     * @param : record  MmQueryfileTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmQueryfileTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQueryfileTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmQueryfileTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmQueryfileTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmQueryfileTd> selectByExample(MmQueryfileTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : applyno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmQueryfileTd selectByPrimaryKey(Long applyno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQueryfileTd
     * @param : example  MmQueryfileTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmQueryfileTd record, @Param("example") MmQueryfileTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQueryfileTd
     * @param : example  MmQueryfileTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmQueryfileTd record, @Param("example") MmQueryfileTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQueryfileTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmQueryfileTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQueryfileTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmQueryfileTd record);
}