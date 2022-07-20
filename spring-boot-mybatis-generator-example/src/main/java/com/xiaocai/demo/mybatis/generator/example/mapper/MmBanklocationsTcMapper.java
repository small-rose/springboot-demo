package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmBanklocationsTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmBanklocationsTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmBanklocationsTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBanklocationsTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmBanklocationsTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBanklocationsTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmBanklocationsTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : urid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long urid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBanklocationsTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmBanklocationsTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBanklocationsTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmBanklocationsTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBanklocationsTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmBanklocationsTc> selectByExample(MmBanklocationsTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : urid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmBanklocationsTc selectByPrimaryKey(Long urid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBanklocationsTc
     * @param : example  MmBanklocationsTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmBanklocationsTc record, @Param("example") MmBanklocationsTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBanklocationsTc
     * @param : example  MmBanklocationsTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmBanklocationsTc record, @Param("example") MmBanklocationsTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBanklocationsTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmBanklocationsTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBanklocationsTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmBanklocationsTc record);
}