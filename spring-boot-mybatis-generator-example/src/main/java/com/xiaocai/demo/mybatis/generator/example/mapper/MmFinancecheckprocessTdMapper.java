package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmFinancecheckprocessTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmFinancecheckprocessTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmFinancecheckprocessTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmFinancecheckprocessTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmFinancecheckprocessTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmFinancecheckprocessTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmFinancecheckprocessTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : processid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long processid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckprocessTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmFinancecheckprocessTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckprocessTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmFinancecheckprocessTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmFinancecheckprocessTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmFinancecheckprocessTd> selectByExample(MmFinancecheckprocessTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : processid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmFinancecheckprocessTd selectByPrimaryKey(Long processid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckprocessTd
     * @param : example  MmFinancecheckprocessTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmFinancecheckprocessTd record, @Param("example") MmFinancecheckprocessTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckprocessTd
     * @param : example  MmFinancecheckprocessTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmFinancecheckprocessTd record, @Param("example") MmFinancecheckprocessTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckprocessTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmFinancecheckprocessTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckprocessTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmFinancecheckprocessTd record);
}