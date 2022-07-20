package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.TConfirmBackError;
import com.xiaocai.demo.mybatis.generator.example.entity.TConfirmBackErrorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TConfirmBackErrorMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TConfirmBackErrorExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(TConfirmBackErrorExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TConfirmBackErrorExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(TConfirmBackErrorExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : no  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long no);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConfirmBackError
     * @modified by : 
     * @last-modify : 
     */
    int insert(TConfirmBackError record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConfirmBackError
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(TConfirmBackError record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TConfirmBackErrorExample
     * @modified by : 
     * @last-modify : 
     */
    List<TConfirmBackError> selectByExample(TConfirmBackErrorExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : no  Long
     * @modified by : 
     * @last-modify : 
     */
    TConfirmBackError selectByPrimaryKey(Long no);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConfirmBackError
     * @param : example  TConfirmBackErrorExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") TConfirmBackError record, @Param("example") TConfirmBackErrorExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConfirmBackError
     * @param : example  TConfirmBackErrorExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") TConfirmBackError record, @Param("example") TConfirmBackErrorExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConfirmBackError
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(TConfirmBackError record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConfirmBackError
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(TConfirmBackError record);
}