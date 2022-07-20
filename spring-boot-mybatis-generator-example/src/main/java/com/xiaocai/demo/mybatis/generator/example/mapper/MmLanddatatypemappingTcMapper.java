package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmLanddatatypemappingTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmLanddatatypemappingTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmLanddatatypemappingTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmLanddatatypemappingTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmLanddatatypemappingTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmLanddatatypemappingTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmLanddatatypemappingTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : businessone  String
     * @param : businesstwo  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("businessone") String businessone, @Param("businesstwo") String businesstwo);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLanddatatypemappingTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmLanddatatypemappingTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLanddatatypemappingTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmLanddatatypemappingTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmLanddatatypemappingTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmLanddatatypemappingTc> selectByExample(MmLanddatatypemappingTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : businessone  String
     * @param : businesstwo  String
     * @modified by : 
     * @last-modify : 
     */
    MmLanddatatypemappingTc selectByPrimaryKey(@Param("businessone") String businessone, @Param("businesstwo") String businesstwo);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLanddatatypemappingTc
     * @param : example  MmLanddatatypemappingTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmLanddatatypemappingTc record, @Param("example") MmLanddatatypemappingTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLanddatatypemappingTc
     * @param : example  MmLanddatatypemappingTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmLanddatatypemappingTc record, @Param("example") MmLanddatatypemappingTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLanddatatypemappingTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmLanddatatypemappingTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmLanddatatypemappingTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmLanddatatypemappingTc record);
}