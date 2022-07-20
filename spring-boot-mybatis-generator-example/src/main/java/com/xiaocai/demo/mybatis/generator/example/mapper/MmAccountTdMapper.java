package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmAccountTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmAccountTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmAccountTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccountTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmAccountTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccountTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmAccountTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : mmaccountid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long mmaccountid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmAccountTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmAccountTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccountTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmAccountTd> selectByExample(MmAccountTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : mmaccountid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmAccountTd selectByPrimaryKey(Long mmaccountid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountTd
     * @param : example  MmAccountTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmAccountTd record, @Param("example") MmAccountTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountTd
     * @param : example  MmAccountTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmAccountTd record, @Param("example") MmAccountTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmAccountTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmAccountTd record);
}