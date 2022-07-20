package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.SpringSessionAttributes;
import com.xiaocai.demo.mybatis.generator.example.entity.SpringSessionAttributesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpringSessionAttributesMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  SpringSessionAttributesExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(SpringSessionAttributesExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  SpringSessionAttributesExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(SpringSessionAttributesExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : sessionId  String
     * @param : attributeName  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("sessionId") String sessionId, @Param("attributeName") String attributeName);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  SpringSessionAttributes
     * @modified by : 
     * @last-modify : 
     */
    int insert(SpringSessionAttributes record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  SpringSessionAttributes
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(SpringSessionAttributes record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表（含大字段）
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  SpringSessionAttributesExample
     * @modified by : 
     * @last-modify : 
     */
    List<SpringSessionAttributes> selectByExampleWithBLOBs(SpringSessionAttributesExample example);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  SpringSessionAttributesExample
     * @modified by : 
     * @last-modify : 
     */
    List<SpringSessionAttributes> selectByExample(SpringSessionAttributesExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : sessionId  String
     * @param : attributeName  String
     * @modified by : 
     * @last-modify : 
     */
    SpringSessionAttributes selectByPrimaryKey(@Param("sessionId") String sessionId, @Param("attributeName") String attributeName);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  SpringSessionAttributes
     * @param : example  SpringSessionAttributesExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") SpringSessionAttributes record, @Param("example") SpringSessionAttributesExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新参数有值的属性（含大字段）
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  SpringSessionAttributes
     * @param : example  SpringSessionAttributesExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleWithBLOBs(@Param("record") SpringSessionAttributes record, @Param("example") SpringSessionAttributesExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  SpringSessionAttributes
     * @param : example  SpringSessionAttributesExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") SpringSessionAttributes record, @Param("example") SpringSessionAttributesExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  SpringSessionAttributes
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(SpringSessionAttributes record);

    /**
     * 
     * @description : 根据主键更新对象全部属性（含大字段）
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  SpringSessionAttributes
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeyWithBLOBs(SpringSessionAttributes record);
}