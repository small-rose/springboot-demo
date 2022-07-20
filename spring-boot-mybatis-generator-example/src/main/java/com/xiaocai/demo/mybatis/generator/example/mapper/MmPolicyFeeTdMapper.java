package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmPolicyFeeTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmPolicyFeeTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmPolicyFeeTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicyFeeTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmPolicyFeeTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicyFeeTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmPolicyFeeTdExample example);

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
     * @param : record  MmPolicyFeeTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmPolicyFeeTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyFeeTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmPolicyFeeTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicyFeeTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmPolicyFeeTd> selectByExample(MmPolicyFeeTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqfeelist  Long
     * @modified by : 
     * @last-modify : 
     */
    MmPolicyFeeTd selectByPrimaryKey(Long seqfeelist);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyFeeTd
     * @param : example  MmPolicyFeeTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmPolicyFeeTd record, @Param("example") MmPolicyFeeTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyFeeTd
     * @param : example  MmPolicyFeeTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmPolicyFeeTd record, @Param("example") MmPolicyFeeTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyFeeTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmPolicyFeeTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyFeeTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmPolicyFeeTd record);
}