package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmPayPlanTi;
import com.xiaocai.demo.mybatis.generator.example.entity.MmPayPlanTiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmPayPlanTiMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPayPlanTiExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmPayPlanTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPayPlanTiExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmPayPlanTiExample example);

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
     * @param : record  MmPayPlanTi
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmPayPlanTi record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayPlanTi
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmPayPlanTi record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPayPlanTiExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmPayPlanTi> selectByExample(MmPayPlanTiExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmPayPlanTi selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayPlanTi
     * @param : example  MmPayPlanTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmPayPlanTi record, @Param("example") MmPayPlanTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayPlanTi
     * @param : example  MmPayPlanTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmPayPlanTi record, @Param("example") MmPayPlanTiExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayPlanTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmPayPlanTi record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayPlanTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmPayPlanTi record);
}