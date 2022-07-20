package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmBadDebtsFlag;
import com.xiaocai.demo.mybatis.generator.example.entity.MmBadDebtsFlagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmBadDebtsFlagMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBadDebtsFlagExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmBadDebtsFlagExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBadDebtsFlagExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmBadDebtsFlagExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : badType  Long
     * @param : seqcharge  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("badType") Long badType, @Param("seqcharge") Long seqcharge);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBadDebtsFlag
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmBadDebtsFlag record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBadDebtsFlag
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmBadDebtsFlag record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBadDebtsFlagExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmBadDebtsFlag> selectByExample(MmBadDebtsFlagExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : badType  Long
     * @param : seqcharge  Long
     * @modified by : 
     * @last-modify : 
     */
    MmBadDebtsFlag selectByPrimaryKey(@Param("badType") Long badType, @Param("seqcharge") Long seqcharge);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBadDebtsFlag
     * @param : example  MmBadDebtsFlagExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmBadDebtsFlag record, @Param("example") MmBadDebtsFlagExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBadDebtsFlag
     * @param : example  MmBadDebtsFlagExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmBadDebtsFlag record, @Param("example") MmBadDebtsFlagExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBadDebtsFlag
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmBadDebtsFlag record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBadDebtsFlag
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmBadDebtsFlag record);
}