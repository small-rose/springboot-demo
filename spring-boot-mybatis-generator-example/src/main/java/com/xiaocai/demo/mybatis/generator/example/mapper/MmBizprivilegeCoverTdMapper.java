package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmBizprivilegeCoverTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmBizprivilegeCoverTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmBizprivilegeCoverTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBizprivilegeCoverTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmBizprivilegeCoverTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBizprivilegeCoverTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmBizprivilegeCoverTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : opcode  String
     * @param : departmentcode  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("opcode") String opcode, @Param("departmentcode") String departmentcode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBizprivilegeCoverTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmBizprivilegeCoverTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBizprivilegeCoverTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmBizprivilegeCoverTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBizprivilegeCoverTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmBizprivilegeCoverTd> selectByExample(MmBizprivilegeCoverTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : opcode  String
     * @param : departmentcode  String
     * @modified by : 
     * @last-modify : 
     */
    MmBizprivilegeCoverTd selectByPrimaryKey(@Param("opcode") String opcode, @Param("departmentcode") String departmentcode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBizprivilegeCoverTd
     * @param : example  MmBizprivilegeCoverTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmBizprivilegeCoverTd record, @Param("example") MmBizprivilegeCoverTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBizprivilegeCoverTd
     * @param : example  MmBizprivilegeCoverTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmBizprivilegeCoverTd record, @Param("example") MmBizprivilegeCoverTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBizprivilegeCoverTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmBizprivilegeCoverTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBizprivilegeCoverTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmBizprivilegeCoverTd record);
}