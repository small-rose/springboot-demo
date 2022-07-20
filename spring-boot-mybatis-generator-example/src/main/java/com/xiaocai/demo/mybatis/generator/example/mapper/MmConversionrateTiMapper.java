package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmConversionrateTi;
import com.xiaocai.demo.mybatis.generator.example.entity.MmConversionrateTiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmConversionrateTiMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmConversionrateTiExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmConversionrateTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmConversionrateTiExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmConversionrateTiExample example);

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
     * @param : record  MmConversionrateTi
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmConversionrateTi record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmConversionrateTi
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmConversionrateTi record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmConversionrateTiExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmConversionrateTi> selectByExample(MmConversionrateTiExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmConversionrateTi selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmConversionrateTi
     * @param : example  MmConversionrateTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmConversionrateTi record, @Param("example") MmConversionrateTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmConversionrateTi
     * @param : example  MmConversionrateTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmConversionrateTi record, @Param("example") MmConversionrateTiExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmConversionrateTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmConversionrateTi record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmConversionrateTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmConversionrateTi record);
}