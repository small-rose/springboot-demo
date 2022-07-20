package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmFinancecheckpowerTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmFinancecheckpowerTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmFinancecheckpowerTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmFinancecheckpowerTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmFinancecheckpowerTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmFinancecheckpowerTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmFinancecheckpowerTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  Long
     * @param : opcode  Long
     * @param : unitcode  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("subcompany") Long subcompany, @Param("opcode") Long opcode, @Param("unitcode") Long unitcode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckpowerTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmFinancecheckpowerTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckpowerTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmFinancecheckpowerTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmFinancecheckpowerTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmFinancecheckpowerTc> selectByExample(MmFinancecheckpowerTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  Long
     * @param : opcode  Long
     * @param : unitcode  Long
     * @modified by : 
     * @last-modify : 
     */
    MmFinancecheckpowerTc selectByPrimaryKey(@Param("subcompany") Long subcompany, @Param("opcode") Long opcode, @Param("unitcode") Long unitcode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckpowerTc
     * @param : example  MmFinancecheckpowerTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmFinancecheckpowerTc record, @Param("example") MmFinancecheckpowerTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckpowerTc
     * @param : example  MmFinancecheckpowerTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmFinancecheckpowerTc record, @Param("example") MmFinancecheckpowerTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckpowerTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmFinancecheckpowerTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckpowerTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmFinancecheckpowerTc record);
}