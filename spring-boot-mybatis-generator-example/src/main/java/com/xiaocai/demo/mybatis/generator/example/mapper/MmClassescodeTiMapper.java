package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmClassescodeTi;
import com.xiaocai.demo.mybatis.generator.example.entity.MmClassescodeTiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmClassescodeTiMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmClassescodeTiExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmClassescodeTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmClassescodeTiExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmClassescodeTiExample example);

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
     * @param : record  MmClassescodeTi
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmClassescodeTi record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmClassescodeTi
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmClassescodeTi record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmClassescodeTiExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmClassescodeTi> selectByExample(MmClassescodeTiExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmClassescodeTi selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmClassescodeTi
     * @param : example  MmClassescodeTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmClassescodeTi record, @Param("example") MmClassescodeTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmClassescodeTi
     * @param : example  MmClassescodeTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmClassescodeTi record, @Param("example") MmClassescodeTiExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmClassescodeTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmClassescodeTi record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmClassescodeTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmClassescodeTi record);
}