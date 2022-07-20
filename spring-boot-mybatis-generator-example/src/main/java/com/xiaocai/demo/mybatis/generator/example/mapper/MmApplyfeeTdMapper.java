package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmApplyfeeTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmApplyfeeTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmApplyfeeTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmApplyfeeTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmApplyfeeTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmApplyfeeTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmApplyfeeTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqfeelist  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long seqfeelist);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmApplyfeeTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmApplyfeeTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmApplyfeeTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmApplyfeeTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmApplyfeeTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmApplyfeeTd> selectByExample(MmApplyfeeTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqfeelist  Long
     * @modified by : 
     * @last-modify : 
     */
    MmApplyfeeTd selectByPrimaryKey(Long seqfeelist);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmApplyfeeTd
     * @param : example  MmApplyfeeTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmApplyfeeTd record, @Param("example") MmApplyfeeTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmApplyfeeTd
     * @param : example  MmApplyfeeTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmApplyfeeTd record, @Param("example") MmApplyfeeTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmApplyfeeTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmApplyfeeTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmApplyfeeTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmApplyfeeTd record);
}