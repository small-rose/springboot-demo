package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmQuerysettlementTemp;
import com.xiaocai.demo.mybatis.generator.example.entity.MmQuerysettlementTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmQuerysettlementTempMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmQuerysettlementTempExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmQuerysettlementTempExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmQuerysettlementTempExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmQuerysettlementTempExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQuerysettlementTemp
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmQuerysettlementTemp record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQuerysettlementTemp
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmQuerysettlementTemp record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmQuerysettlementTempExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmQuerysettlementTemp> selectByExample(MmQuerysettlementTempExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmQuerysettlementTemp selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQuerysettlementTemp
     * @param : example  MmQuerysettlementTempExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmQuerysettlementTemp record, @Param("example") MmQuerysettlementTempExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQuerysettlementTemp
     * @param : example  MmQuerysettlementTempExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmQuerysettlementTemp record, @Param("example") MmQuerysettlementTempExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQuerysettlementTemp
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmQuerysettlementTemp record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmQuerysettlementTemp
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmQuerysettlementTemp record);
}