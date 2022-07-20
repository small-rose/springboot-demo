package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmBjapplyfeeErrlog;
import com.xiaocai.demo.mybatis.generator.example.entity.MmBjapplyfeeErrlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmBjapplyfeeErrlogMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBjapplyfeeErrlogExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmBjapplyfeeErrlogExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBjapplyfeeErrlogExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmBjapplyfeeErrlogExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : owner  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long owner);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBjapplyfeeErrlog
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmBjapplyfeeErrlog record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBjapplyfeeErrlog
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmBjapplyfeeErrlog record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBjapplyfeeErrlogExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmBjapplyfeeErrlog> selectByExample(MmBjapplyfeeErrlogExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : owner  Long
     * @modified by : 
     * @last-modify : 
     */
    MmBjapplyfeeErrlog selectByPrimaryKey(Long owner);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBjapplyfeeErrlog
     * @param : example  MmBjapplyfeeErrlogExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmBjapplyfeeErrlog record, @Param("example") MmBjapplyfeeErrlogExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBjapplyfeeErrlog
     * @param : example  MmBjapplyfeeErrlogExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmBjapplyfeeErrlog record, @Param("example") MmBjapplyfeeErrlogExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBjapplyfeeErrlog
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmBjapplyfeeErrlog record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBjapplyfeeErrlog
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmBjapplyfeeErrlog record);
}