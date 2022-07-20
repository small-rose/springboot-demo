package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmPlatformfileTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmPlatformfileTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmPlatformfileTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPlatformfileTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmPlatformfileTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPlatformfileTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmPlatformfileTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String id);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPlatformfileTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmPlatformfileTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPlatformfileTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmPlatformfileTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPlatformfileTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmPlatformfileTd> selectByExample(MmPlatformfileTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  String
     * @modified by : 
     * @last-modify : 
     */
    MmPlatformfileTd selectByPrimaryKey(String id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPlatformfileTd
     * @param : example  MmPlatformfileTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmPlatformfileTd record, @Param("example") MmPlatformfileTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPlatformfileTd
     * @param : example  MmPlatformfileTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmPlatformfileTd record, @Param("example") MmPlatformfileTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPlatformfileTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmPlatformfileTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPlatformfileTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmPlatformfileTd record);
}