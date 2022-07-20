package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmTempRiinsurenceTi;
import com.xiaocai.demo.mybatis.generator.example.entity.MmTempRiinsurenceTiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmTempRiinsurenceTiMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempRiinsurenceTiExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmTempRiinsurenceTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempRiinsurenceTiExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmTempRiinsurenceTiExample example);

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
     * @param : record  MmTempRiinsurenceTi
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmTempRiinsurenceTi record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempRiinsurenceTi
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmTempRiinsurenceTi record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempRiinsurenceTiExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmTempRiinsurenceTi> selectByExample(MmTempRiinsurenceTiExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmTempRiinsurenceTi selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempRiinsurenceTi
     * @param : example  MmTempRiinsurenceTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmTempRiinsurenceTi record, @Param("example") MmTempRiinsurenceTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempRiinsurenceTi
     * @param : example  MmTempRiinsurenceTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmTempRiinsurenceTi record, @Param("example") MmTempRiinsurenceTiExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempRiinsurenceTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmTempRiinsurenceTi record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempRiinsurenceTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmTempRiinsurenceTi record);
}