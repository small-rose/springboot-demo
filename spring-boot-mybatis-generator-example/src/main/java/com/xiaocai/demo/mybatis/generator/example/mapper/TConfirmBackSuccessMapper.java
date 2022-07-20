package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.TConfirmBackSuccess;
import com.xiaocai.demo.mybatis.generator.example.entity.TConfirmBackSuccessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TConfirmBackSuccessMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TConfirmBackSuccessExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(TConfirmBackSuccessExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TConfirmBackSuccessExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(TConfirmBackSuccessExample example);

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
     * @param : record  TConfirmBackSuccess
     * @modified by : 
     * @last-modify : 
     */
    int insert(TConfirmBackSuccess record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConfirmBackSuccess
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(TConfirmBackSuccess record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TConfirmBackSuccessExample
     * @modified by : 
     * @last-modify : 
     */
    List<TConfirmBackSuccess> selectByExample(TConfirmBackSuccessExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : no  Long
     * @modified by : 
     * @last-modify : 
     */
    TConfirmBackSuccess selectByPrimaryKey(Long no);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConfirmBackSuccess
     * @param : example  TConfirmBackSuccessExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") TConfirmBackSuccess record, @Param("example") TConfirmBackSuccessExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConfirmBackSuccess
     * @param : example  TConfirmBackSuccessExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") TConfirmBackSuccess record, @Param("example") TConfirmBackSuccessExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConfirmBackSuccess
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(TConfirmBackSuccess record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConfirmBackSuccess
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(TConfirmBackSuccess record);
}