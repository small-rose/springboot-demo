package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmTempPolicymirrorTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmTempPolicymirrorTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmTempPolicymirrorTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempPolicymirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmTempPolicymirrorTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempPolicymirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmTempPolicymirrorTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqpolicy  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long seqpolicy);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempPolicymirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmTempPolicymirrorTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempPolicymirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmTempPolicymirrorTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempPolicymirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmTempPolicymirrorTd> selectByExample(MmTempPolicymirrorTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqpolicy  Long
     * @modified by : 
     * @last-modify : 
     */
    MmTempPolicymirrorTd selectByPrimaryKey(Long seqpolicy);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempPolicymirrorTd
     * @param : example  MmTempPolicymirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmTempPolicymirrorTd record, @Param("example") MmTempPolicymirrorTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempPolicymirrorTd
     * @param : example  MmTempPolicymirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmTempPolicymirrorTd record, @Param("example") MmTempPolicymirrorTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempPolicymirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmTempPolicymirrorTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempPolicymirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmTempPolicymirrorTd record);
}