package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmFinancecheckTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmFinancecheckTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmFinancecheckTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmFinancecheckTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmFinancecheckTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmFinancecheckTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmFinancecheckTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : applyno  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String applyno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmFinancecheckTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmFinancecheckTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmFinancecheckTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmFinancecheckTd> selectByExample(MmFinancecheckTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : applyno  String
     * @modified by : 
     * @last-modify : 
     */
    MmFinancecheckTd selectByPrimaryKey(String applyno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckTd
     * @param : example  MmFinancecheckTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmFinancecheckTd record, @Param("example") MmFinancecheckTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckTd
     * @param : example  MmFinancecheckTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmFinancecheckTd record, @Param("example") MmFinancecheckTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmFinancecheckTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmFinancecheckTd record);
}