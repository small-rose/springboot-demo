package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmPolicymirrorTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmPolicymirrorTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmPolicymirrorTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicymirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmPolicymirrorTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicymirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmPolicymirrorTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : listno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long listno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicymirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmPolicymirrorTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicymirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmPolicymirrorTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicymirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmPolicymirrorTd> selectByExample(MmPolicymirrorTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : listno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmPolicymirrorTd selectByPrimaryKey(Long listno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicymirrorTd
     * @param : example  MmPolicymirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmPolicymirrorTd record, @Param("example") MmPolicymirrorTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicymirrorTd
     * @param : example  MmPolicymirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmPolicymirrorTd record, @Param("example") MmPolicymirrorTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicymirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmPolicymirrorTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicymirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmPolicymirrorTd record);
}