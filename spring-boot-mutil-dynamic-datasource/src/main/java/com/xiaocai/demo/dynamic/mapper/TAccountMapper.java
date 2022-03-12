package com.xiaocai.demo.dynamic.mapper;

import com.xiaocai.demo.dynamic.entity.TAccount;
import com.xiaocai.demo.dynamic.entity.TAccountExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TAccountMapper {
    /**
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : example  TAccountExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(TAccountExample example);

    /**
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : example  TAccountExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(TAccountExample example);

    /**
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : record  TAccount
     * @modified by : 
     * @last-modify : 
     */
    int insert(TAccount record);

    /**
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : record  TAccount
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(TAccount record);

    /**
     * @description : 根据自定义Example条件查询对象列表（含大字段）
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : example  TAccountExample
     * @modified by : 
     * @last-modify : 
     */
    List<TAccount> selectByExampleWithBLOBs(TAccountExample example);

    /**
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : example  TAccountExample
     * @modified by : 
     * @last-modify : 
     */
    List<TAccount> selectByExample(TAccountExample example);

    /**
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    TAccount selectByPrimaryKey(Long id);

    /**
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : record  TAccount
     * @param : example  TAccountExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") TAccount record, @Param("example") TAccountExample example);

    /**
     * @description : 根据自定义Example条件更新参数有值的属性（含大字段）
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : record  TAccount
     * @param : example  TAccountExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleWithBLOBs(@Param("record") TAccount record, @Param("example") TAccountExample example);

    /**
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : record  TAccount
     * @param : example  TAccountExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") TAccount record, @Param("example") TAccountExample example);

    /**
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : record  TAccount
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(TAccount record);

    /**
     * @description : 根据主键更新对象全部属性（含大字段）
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : record  TAccount
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeyWithBLOBs(TAccount record);

    /**
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : record  TAccount
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(TAccount record);
}