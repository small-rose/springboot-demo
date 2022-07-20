package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmBankflowauthorizationTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmBankflowauthorizationTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmBankflowauthorizationTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBankflowauthorizationTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmBankflowauthorizationTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBankflowauthorizationTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmBankflowauthorizationTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : authorizaedid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long authorizaedid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankflowauthorizationTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmBankflowauthorizationTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankflowauthorizationTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmBankflowauthorizationTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBankflowauthorizationTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmBankflowauthorizationTd> selectByExample(MmBankflowauthorizationTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : authorizaedid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmBankflowauthorizationTd selectByPrimaryKey(Long authorizaedid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankflowauthorizationTd
     * @param : example  MmBankflowauthorizationTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmBankflowauthorizationTd record, @Param("example") MmBankflowauthorizationTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankflowauthorizationTd
     * @param : example  MmBankflowauthorizationTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmBankflowauthorizationTd record, @Param("example") MmBankflowauthorizationTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankflowauthorizationTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmBankflowauthorizationTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankflowauthorizationTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmBankflowauthorizationTd record);
}