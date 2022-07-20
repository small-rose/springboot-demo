package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.TConfirmBack;
import com.xiaocai.demo.mybatis.generator.example.entity.TConfirmBackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TConfirmBackMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TConfirmBackExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(TConfirmBackExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TConfirmBackExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(TConfirmBackExample example);

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
     * @param : record  TConfirmBack
     * @modified by : 
     * @last-modify : 
     */
    int insert(TConfirmBack record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConfirmBack
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(TConfirmBack record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TConfirmBackExample
     * @modified by : 
     * @last-modify : 
     */
    List<TConfirmBack> selectByExample(TConfirmBackExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : no  Long
     * @modified by : 
     * @last-modify : 
     */
    TConfirmBack selectByPrimaryKey(Long no);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConfirmBack
     * @param : example  TConfirmBackExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") TConfirmBack record, @Param("example") TConfirmBackExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConfirmBack
     * @param : example  TConfirmBackExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") TConfirmBack record, @Param("example") TConfirmBackExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConfirmBack
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(TConfirmBack record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConfirmBack
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(TConfirmBack record);
}