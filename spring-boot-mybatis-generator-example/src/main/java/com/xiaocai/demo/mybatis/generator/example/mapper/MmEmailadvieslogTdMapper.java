package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmEmailadvieslogTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmEmailadvieslogTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmEmailadvieslogTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmEmailadvieslogTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmEmailadvieslogTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmEmailadvieslogTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmEmailadvieslogTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : emailid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long emailid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmEmailadvieslogTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmEmailadvieslogTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmEmailadvieslogTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmEmailadvieslogTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmEmailadvieslogTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmEmailadvieslogTd> selectByExample(MmEmailadvieslogTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : emailid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmEmailadvieslogTd selectByPrimaryKey(Long emailid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmEmailadvieslogTd
     * @param : example  MmEmailadvieslogTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmEmailadvieslogTd record, @Param("example") MmEmailadvieslogTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmEmailadvieslogTd
     * @param : example  MmEmailadvieslogTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmEmailadvieslogTd record, @Param("example") MmEmailadvieslogTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmEmailadvieslogTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmEmailadvieslogTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmEmailadvieslogTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmEmailadvieslogTd record);
}