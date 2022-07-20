package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmHandoverTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmHandoverTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmHandoverTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmHandoverTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmHandoverTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmHandoverTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmHandoverTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqhandover  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long seqhandover);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmHandoverTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmHandoverTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmHandoverTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmHandoverTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmHandoverTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmHandoverTd> selectByExample(MmHandoverTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqhandover  Long
     * @modified by : 
     * @last-modify : 
     */
    MmHandoverTd selectByPrimaryKey(Long seqhandover);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmHandoverTd
     * @param : example  MmHandoverTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmHandoverTd record, @Param("example") MmHandoverTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmHandoverTd
     * @param : example  MmHandoverTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmHandoverTd record, @Param("example") MmHandoverTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmHandoverTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmHandoverTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmHandoverTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmHandoverTd record);
}