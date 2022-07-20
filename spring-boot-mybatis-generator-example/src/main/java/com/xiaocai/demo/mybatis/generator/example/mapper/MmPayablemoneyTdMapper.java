package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmPayablemoneyTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmPayablemoneyTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmPayablemoneyTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPayablemoneyTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmPayablemoneyTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPayablemoneyTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmPayablemoneyTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : payableno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long payableno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayablemoneyTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmPayablemoneyTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayablemoneyTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmPayablemoneyTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPayablemoneyTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmPayablemoneyTd> selectByExample(MmPayablemoneyTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : payableno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmPayablemoneyTd selectByPrimaryKey(Long payableno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayablemoneyTd
     * @param : example  MmPayablemoneyTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmPayablemoneyTd record, @Param("example") MmPayablemoneyTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayablemoneyTd
     * @param : example  MmPayablemoneyTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmPayablemoneyTd record, @Param("example") MmPayablemoneyTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayablemoneyTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmPayablemoneyTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayablemoneyTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmPayablemoneyTd record);
}