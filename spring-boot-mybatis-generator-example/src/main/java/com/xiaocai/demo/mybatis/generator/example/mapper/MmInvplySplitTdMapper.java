package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmInvplySplitTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmInvplySplitTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmInvplySplitTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvplySplitTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmInvplySplitTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvplySplitTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmInvplySplitTdExample example);

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
     * @param : record  MmInvplySplitTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmInvplySplitTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvplySplitTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmInvplySplitTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmInvplySplitTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmInvplySplitTd> selectByExample(MmInvplySplitTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqinvply  Long
     * @modified by : 
     * @last-modify : 
     */
    MmInvplySplitTd selectByPrimaryKey(Long seqinvply);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvplySplitTd
     * @param : example  MmInvplySplitTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmInvplySplitTd record, @Param("example") MmInvplySplitTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvplySplitTd
     * @param : example  MmInvplySplitTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmInvplySplitTd record, @Param("example") MmInvplySplitTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvplySplitTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmInvplySplitTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmInvplySplitTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmInvplySplitTd record);
}