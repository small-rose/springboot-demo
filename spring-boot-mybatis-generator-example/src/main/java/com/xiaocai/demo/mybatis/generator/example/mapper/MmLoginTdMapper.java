package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmLoginTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmLoginTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmLoginTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmLoginTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmLoginTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmLoginTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmLoginTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : opcode  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long opcode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLoginTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmLoginTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLoginTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmLoginTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmLoginTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmLoginTd> selectByExample(MmLoginTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : opcode  Long
     * @modified by : 
     * @last-modify : 
     */
    MmLoginTd selectByPrimaryKey(Long opcode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLoginTd
     * @param : example  MmLoginTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmLoginTd record, @Param("example") MmLoginTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLoginTd
     * @param : example  MmLoginTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmLoginTd record, @Param("example") MmLoginTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLoginTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmLoginTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLoginTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmLoginTd record);
}