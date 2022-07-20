package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmWriteoutPolicycardTo;
import com.xiaocai.demo.mybatis.generator.example.entity.MmWriteoutPolicycardToExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmWriteoutPolicycardToMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmWriteoutPolicycardToExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmWriteoutPolicycardToExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmWriteoutPolicycardToExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmWriteoutPolicycardToExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmWriteoutPolicycardTo
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmWriteoutPolicycardTo record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmWriteoutPolicycardTo
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmWriteoutPolicycardTo record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmWriteoutPolicycardToExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmWriteoutPolicycardTo> selectByExample(MmWriteoutPolicycardToExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmWriteoutPolicycardTo selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmWriteoutPolicycardTo
     * @param : example  MmWriteoutPolicycardToExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmWriteoutPolicycardTo record, @Param("example") MmWriteoutPolicycardToExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmWriteoutPolicycardTo
     * @param : example  MmWriteoutPolicycardToExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmWriteoutPolicycardTo record, @Param("example") MmWriteoutPolicycardToExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmWriteoutPolicycardTo
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmWriteoutPolicycardTo record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmWriteoutPolicycardTo
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmWriteoutPolicycardTo record);
}