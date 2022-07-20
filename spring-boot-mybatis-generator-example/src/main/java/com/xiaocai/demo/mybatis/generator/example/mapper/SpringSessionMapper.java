package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.SpringSession;
import com.xiaocai.demo.mybatis.generator.example.entity.SpringSessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpringSessionMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  SpringSessionExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(SpringSessionExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  SpringSessionExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(SpringSessionExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : sessionId  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String sessionId);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  SpringSession
     * @modified by : 
     * @last-modify : 
     */
    int insert(SpringSession record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  SpringSession
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(SpringSession record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  SpringSessionExample
     * @modified by : 
     * @last-modify : 
     */
    List<SpringSession> selectByExample(SpringSessionExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : sessionId  String
     * @modified by : 
     * @last-modify : 
     */
    SpringSession selectByPrimaryKey(String sessionId);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  SpringSession
     * @param : example  SpringSessionExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") SpringSession record, @Param("example") SpringSessionExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  SpringSession
     * @param : example  SpringSessionExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") SpringSession record, @Param("example") SpringSessionExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  SpringSession
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(SpringSession record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  SpringSession
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(SpringSession record);
}