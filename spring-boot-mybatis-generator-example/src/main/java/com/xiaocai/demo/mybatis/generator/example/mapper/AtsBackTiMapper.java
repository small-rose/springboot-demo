package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.AtsBackTi;
import com.xiaocai.demo.mybatis.generator.example.entity.AtsBackTiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AtsBackTiMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  AtsBackTiExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(AtsBackTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  AtsBackTiExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(AtsBackTiExample example);

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
     * @param : record  AtsBackTi
     * @modified by : 
     * @last-modify : 
     */
    int insert(AtsBackTi record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  AtsBackTi
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(AtsBackTi record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  AtsBackTiExample
     * @modified by : 
     * @last-modify : 
     */
    List<AtsBackTi> selectByExample(AtsBackTiExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    AtsBackTi selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  AtsBackTi
     * @param : example  AtsBackTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") AtsBackTi record, @Param("example") AtsBackTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  AtsBackTi
     * @param : example  AtsBackTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") AtsBackTi record, @Param("example") AtsBackTiExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  AtsBackTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(AtsBackTi record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  AtsBackTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(AtsBackTi record);
}