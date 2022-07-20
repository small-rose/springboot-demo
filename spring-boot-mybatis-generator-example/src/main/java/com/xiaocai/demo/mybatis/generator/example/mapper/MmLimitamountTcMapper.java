package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmLimitamountTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmLimitamountTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmLimitamountTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmLimitamountTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmLimitamountTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmLimitamountTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmLimitamountTcExample example);

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
     * @param : record  MmLimitamountTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmLimitamountTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLimitamountTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmLimitamountTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmLimitamountTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmLimitamountTc> selectByExample(MmLimitamountTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmLimitamountTc selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLimitamountTc
     * @param : example  MmLimitamountTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmLimitamountTc record, @Param("example") MmLimitamountTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLimitamountTc
     * @param : example  MmLimitamountTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmLimitamountTc record, @Param("example") MmLimitamountTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLimitamountTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmLimitamountTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLimitamountTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmLimitamountTc record);
}