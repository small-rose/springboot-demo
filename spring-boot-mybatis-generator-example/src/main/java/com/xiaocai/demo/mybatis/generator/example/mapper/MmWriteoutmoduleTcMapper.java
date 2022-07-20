package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmWriteoutmoduleTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmWriteoutmoduleTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmWriteoutmoduleTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmWriteoutmoduleTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmWriteoutmoduleTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmWriteoutmoduleTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmWriteoutmoduleTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : businesstype  String
     * @param : moduleno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("businesstype") String businesstype, @Param("moduleno") Long moduleno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmWriteoutmoduleTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmWriteoutmoduleTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmWriteoutmoduleTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmWriteoutmoduleTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmWriteoutmoduleTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmWriteoutmoduleTc> selectByExample(MmWriteoutmoduleTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : businesstype  String
     * @param : moduleno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmWriteoutmoduleTc selectByPrimaryKey(@Param("businesstype") String businesstype, @Param("moduleno") Long moduleno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmWriteoutmoduleTc
     * @param : example  MmWriteoutmoduleTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmWriteoutmoduleTc record, @Param("example") MmWriteoutmoduleTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmWriteoutmoduleTc
     * @param : example  MmWriteoutmoduleTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmWriteoutmoduleTc record, @Param("example") MmWriteoutmoduleTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmWriteoutmoduleTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmWriteoutmoduleTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmWriteoutmoduleTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmWriteoutmoduleTc record);
}