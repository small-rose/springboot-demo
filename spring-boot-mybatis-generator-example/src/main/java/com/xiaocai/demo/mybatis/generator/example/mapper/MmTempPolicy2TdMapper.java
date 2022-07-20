package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmTempPolicy2Td;
import com.xiaocai.demo.mybatis.generator.example.entity.MmTempPolicy2TdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmTempPolicy2TdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempPolicy2TdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmTempPolicy2TdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempPolicy2TdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmTempPolicy2TdExample example);

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
     * @param : record  MmTempPolicy2Td
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmTempPolicy2Td record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempPolicy2Td
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmTempPolicy2Td record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempPolicy2TdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmTempPolicy2Td> selectByExample(MmTempPolicy2TdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqpolicy  Long
     * @modified by : 
     * @last-modify : 
     */
    MmTempPolicy2Td selectByPrimaryKey(Long seqpolicy);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempPolicy2Td
     * @param : example  MmTempPolicy2TdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmTempPolicy2Td record, @Param("example") MmTempPolicy2TdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempPolicy2Td
     * @param : example  MmTempPolicy2TdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmTempPolicy2Td record, @Param("example") MmTempPolicy2TdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempPolicy2Td
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmTempPolicy2Td record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempPolicy2Td
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmTempPolicy2Td record);
}