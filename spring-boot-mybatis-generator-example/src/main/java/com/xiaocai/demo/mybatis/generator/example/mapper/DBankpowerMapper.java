package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.DBankpower;
import com.xiaocai.demo.mybatis.generator.example.entity.DBankpowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DBankpowerMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  DBankpowerExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(DBankpowerExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  DBankpowerExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(DBankpowerExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : userid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long userid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DBankpower
     * @modified by : 
     * @last-modify : 
     */
    int insert(DBankpower record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DBankpower
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(DBankpower record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  DBankpowerExample
     * @modified by : 
     * @last-modify : 
     */
    List<DBankpower> selectByExample(DBankpowerExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : userid  Long
     * @modified by : 
     * @last-modify : 
     */
    DBankpower selectByPrimaryKey(Long userid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DBankpower
     * @param : example  DBankpowerExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") DBankpower record, @Param("example") DBankpowerExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DBankpower
     * @param : example  DBankpowerExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") DBankpower record, @Param("example") DBankpowerExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DBankpower
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(DBankpower record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DBankpower
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(DBankpower record);
}