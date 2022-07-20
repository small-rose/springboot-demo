package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmCentralizationlistTi;
import com.xiaocai.demo.mybatis.generator.example.entity.MmCentralizationlistTiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmCentralizationlistTiMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCentralizationlistTiExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmCentralizationlistTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCentralizationlistTiExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmCentralizationlistTiExample example);

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
     * @param : record  MmCentralizationlistTi
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmCentralizationlistTi record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCentralizationlistTi
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmCentralizationlistTi record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCentralizationlistTiExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmCentralizationlistTi> selectByExample(MmCentralizationlistTiExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmCentralizationlistTi selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCentralizationlistTi
     * @param : example  MmCentralizationlistTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmCentralizationlistTi record, @Param("example") MmCentralizationlistTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCentralizationlistTi
     * @param : example  MmCentralizationlistTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmCentralizationlistTi record, @Param("example") MmCentralizationlistTiExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCentralizationlistTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmCentralizationlistTi record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCentralizationlistTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmCentralizationlistTi record);
}