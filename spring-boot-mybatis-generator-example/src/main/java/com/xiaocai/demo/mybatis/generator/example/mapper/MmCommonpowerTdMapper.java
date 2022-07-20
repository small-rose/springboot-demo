package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmCommonpowerTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmCommonpowerTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmCommonpowerTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCommonpowerTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmCommonpowerTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCommonpowerTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmCommonpowerTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : powertype  String
     * @param : owner  Long
     * @param : powerobj  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("powertype") String powertype, @Param("owner") Long owner, @Param("powerobj") String powerobj);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCommonpowerTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmCommonpowerTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCommonpowerTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmCommonpowerTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCommonpowerTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmCommonpowerTd> selectByExample(MmCommonpowerTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : powertype  String
     * @param : owner  Long
     * @param : powerobj  String
     * @modified by : 
     * @last-modify : 
     */
    MmCommonpowerTd selectByPrimaryKey(@Param("powertype") String powertype, @Param("owner") Long owner, @Param("powerobj") String powerobj);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCommonpowerTd
     * @param : example  MmCommonpowerTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmCommonpowerTd record, @Param("example") MmCommonpowerTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCommonpowerTd
     * @param : example  MmCommonpowerTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmCommonpowerTd record, @Param("example") MmCommonpowerTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCommonpowerTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmCommonpowerTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCommonpowerTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmCommonpowerTd record);
}