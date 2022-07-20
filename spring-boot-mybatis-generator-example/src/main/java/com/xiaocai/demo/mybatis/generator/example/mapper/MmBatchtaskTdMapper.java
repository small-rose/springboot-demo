package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmBatchtaskTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmBatchtaskTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmBatchtaskTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBatchtaskTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmBatchtaskTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBatchtaskTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmBatchtaskTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : batchtaskid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long batchtaskid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchtaskTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmBatchtaskTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchtaskTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmBatchtaskTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBatchtaskTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmBatchtaskTd> selectByExample(MmBatchtaskTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : batchtaskid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmBatchtaskTd selectByPrimaryKey(Long batchtaskid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchtaskTd
     * @param : example  MmBatchtaskTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmBatchtaskTd record, @Param("example") MmBatchtaskTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchtaskTd
     * @param : example  MmBatchtaskTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmBatchtaskTd record, @Param("example") MmBatchtaskTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchtaskTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmBatchtaskTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBatchtaskTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmBatchtaskTd record);
}