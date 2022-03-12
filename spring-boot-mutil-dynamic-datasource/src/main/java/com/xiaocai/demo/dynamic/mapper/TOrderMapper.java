package com.xiaocai.demo.dynamic.mapper;

import com.xiaocai.demo.dynamic.entity.TOrder;
import com.xiaocai.demo.dynamic.entity.TOrderExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TOrderMapper {
    /**
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : example  TOrderExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(TOrderExample example);

    /**
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : example  TOrderExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(TOrderExample example);

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
     * @param : record  TOrder
     * @modified by : 
     * @last-modify : 
     */
    int insert(TOrder record);

    /**
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : record  TOrder
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(TOrder record);

    /**
     * @description : 根据自定义Example条件查询对象列表（含大字段）
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : example  TOrderExample
     * @modified by : 
     * @last-modify : 
     */
    List<TOrder> selectByExampleWithBLOBs(TOrderExample example);

    /**
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : example  TOrderExample
     * @modified by : 
     * @last-modify : 
     */
    List<TOrder> selectByExample(TOrderExample example);

    /**
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    TOrder selectByPrimaryKey(Long id);

    /**
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : record  TOrder
     * @param : example  TOrderExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") TOrder record, @Param("example") TOrderExample example);

    /**
     * @description : 根据自定义Example条件更新参数有值的属性（含大字段）
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : record  TOrder
     * @param : example  TOrderExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleWithBLOBs(@Param("record") TOrder record, @Param("example") TOrderExample example);

    /**
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : record  TOrder
     * @param : example  TOrderExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") TOrder record, @Param("example") TOrderExample example);

    /**
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : record  TOrder
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(TOrder record);

    /**
     * @description : 根据主键更新对象全部属性（含大字段）
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : record  TOrder
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeyWithBLOBs(TOrder record);

    /**
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-12 15:51:51
     * @param : record  TOrder
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(TOrder record);
}