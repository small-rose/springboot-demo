package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmAccAddTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmAccAddTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmAccAddTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccAddTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmAccAddTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccAddTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmAccAddTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqno  Long
     * @param : sourcetable  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("seqno") Long seqno, @Param("sourcetable") String sourcetable);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccAddTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmAccAddTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccAddTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmAccAddTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccAddTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmAccAddTd> selectByExample(MmAccAddTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqno  Long
     * @param : sourcetable  String
     * @modified by : 
     * @last-modify : 
     */
    MmAccAddTd selectByPrimaryKey(@Param("seqno") Long seqno, @Param("sourcetable") String sourcetable);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccAddTd
     * @param : example  MmAccAddTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmAccAddTd record, @Param("example") MmAccAddTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccAddTd
     * @param : example  MmAccAddTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmAccAddTd record, @Param("example") MmAccAddTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccAddTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmAccAddTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccAddTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmAccAddTd record);
}