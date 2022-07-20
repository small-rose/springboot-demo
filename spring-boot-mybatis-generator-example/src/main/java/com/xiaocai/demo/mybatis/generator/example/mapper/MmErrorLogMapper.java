package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmErrorLog;
import com.xiaocai.demo.mybatis.generator.example.entity.MmErrorLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmErrorLogMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmErrorLogExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmErrorLogExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmErrorLogExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmErrorLogExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : errorid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long errorid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErrorLog
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmErrorLog record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErrorLog
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmErrorLog record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmErrorLogExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmErrorLog> selectByExample(MmErrorLogExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : errorid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmErrorLog selectByPrimaryKey(Long errorid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErrorLog
     * @param : example  MmErrorLogExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmErrorLog record, @Param("example") MmErrorLogExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErrorLog
     * @param : example  MmErrorLogExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmErrorLog record, @Param("example") MmErrorLogExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErrorLog
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmErrorLog record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErrorLog
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmErrorLog record);
}