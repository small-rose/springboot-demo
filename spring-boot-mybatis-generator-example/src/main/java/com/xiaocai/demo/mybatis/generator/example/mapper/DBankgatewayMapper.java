package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.DBankgateway;
import com.xiaocai.demo.mybatis.generator.example.entity.DBankgatewayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DBankgatewayMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  DBankgatewayExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(DBankgatewayExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  DBankgatewayExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(DBankgatewayExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long seqid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DBankgateway
     * @modified by : 
     * @last-modify : 
     */
    int insert(DBankgateway record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DBankgateway
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(DBankgateway record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  DBankgatewayExample
     * @modified by : 
     * @last-modify : 
     */
    List<DBankgateway> selectByExample(DBankgatewayExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqid  Long
     * @modified by : 
     * @last-modify : 
     */
    DBankgateway selectByPrimaryKey(Long seqid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DBankgateway
     * @param : example  DBankgatewayExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") DBankgateway record, @Param("example") DBankgatewayExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DBankgateway
     * @param : example  DBankgatewayExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") DBankgateway record, @Param("example") DBankgatewayExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DBankgateway
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(DBankgateway record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DBankgateway
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(DBankgateway record);
}