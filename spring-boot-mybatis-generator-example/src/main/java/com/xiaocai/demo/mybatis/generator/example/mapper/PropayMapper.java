package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.Propay;
import com.xiaocai.demo.mybatis.generator.example.entity.PropayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PropayMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  PropayExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(PropayExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  PropayExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(PropayExample example);

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
     * @param : record  Propay
     * @modified by : 
     * @last-modify : 
     */
    int insert(Propay record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  Propay
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(Propay record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  PropayExample
     * @modified by : 
     * @last-modify : 
     */
    List<Propay> selectByExample(PropayExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    Propay selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  Propay
     * @param : example  PropayExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") Propay record, @Param("example") PropayExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  Propay
     * @param : example  PropayExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") Propay record, @Param("example") PropayExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  Propay
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(Propay record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  Propay
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(Propay record);
}