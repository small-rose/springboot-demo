package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmInvplyTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmInvplyTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmInvplyTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvplyTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmInvplyTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvplyTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmInvplyTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqinvply  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long seqinvply);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvplyTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmInvplyTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvplyTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmInvplyTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvplyTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmInvplyTd> selectByExample(MmInvplyTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqinvply  Long
     * @modified by : 
     * @last-modify : 
     */
    MmInvplyTd selectByPrimaryKey(Long seqinvply);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvplyTd
     * @param : example  MmInvplyTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmInvplyTd record, @Param("example") MmInvplyTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvplyTd
     * @param : example  MmInvplyTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmInvplyTd record, @Param("example") MmInvplyTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvplyTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmInvplyTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvplyTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmInvplyTd record);
}