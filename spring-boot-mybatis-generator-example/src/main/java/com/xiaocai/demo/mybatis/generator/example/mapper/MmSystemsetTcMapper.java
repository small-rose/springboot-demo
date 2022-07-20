package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmSystemsetTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmSystemsetTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmSystemsetTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSystemsetTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmSystemsetTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSystemsetTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmSystemsetTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : customername  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String customername);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSystemsetTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmSystemsetTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSystemsetTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmSystemsetTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSystemsetTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmSystemsetTc> selectByExample(MmSystemsetTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : customername  String
     * @modified by : 
     * @last-modify : 
     */
    MmSystemsetTc selectByPrimaryKey(String customername);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSystemsetTc
     * @param : example  MmSystemsetTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmSystemsetTc record, @Param("example") MmSystemsetTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSystemsetTc
     * @param : example  MmSystemsetTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmSystemsetTc record, @Param("example") MmSystemsetTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSystemsetTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmSystemsetTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSystemsetTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmSystemsetTc record);
}