package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmProcesslevelTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmProcesslevelTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmProcesslevelTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmProcesslevelTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmProcesslevelTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmProcesslevelTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmProcesslevelTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : type  String
     * @param : level  String
     * @param : roleid  String
     * @param : datasource  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("type") String type, @Param("level") String level, @Param("roleid") String roleid, @Param("datasource") String datasource);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmProcesslevelTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmProcesslevelTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmProcesslevelTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmProcesslevelTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmProcesslevelTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmProcesslevelTc> selectByExample(MmProcesslevelTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : type  String
     * @param : level  String
     * @param : roleid  String
     * @param : datasource  String
     * @modified by : 
     * @last-modify : 
     */
    MmProcesslevelTc selectByPrimaryKey(@Param("type") String type, @Param("level") String level, @Param("roleid") String roleid, @Param("datasource") String datasource);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmProcesslevelTc
     * @param : example  MmProcesslevelTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmProcesslevelTc record, @Param("example") MmProcesslevelTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmProcesslevelTc
     * @param : example  MmProcesslevelTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmProcesslevelTc record, @Param("example") MmProcesslevelTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmProcesslevelTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmProcesslevelTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmProcesslevelTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmProcesslevelTc record);
}