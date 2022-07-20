package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmReinsurancemirrorTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmReinsurancemirrorTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmReinsurancemirrorTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmReinsurancemirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmReinsurancemirrorTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmReinsurancemirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmReinsurancemirrorTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : listno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long listno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReinsurancemirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmReinsurancemirrorTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReinsurancemirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmReinsurancemirrorTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmReinsurancemirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmReinsurancemirrorTd> selectByExample(MmReinsurancemirrorTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : listno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmReinsurancemirrorTd selectByPrimaryKey(Long listno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReinsurancemirrorTd
     * @param : example  MmReinsurancemirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmReinsurancemirrorTd record, @Param("example") MmReinsurancemirrorTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReinsurancemirrorTd
     * @param : example  MmReinsurancemirrorTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmReinsurancemirrorTd record, @Param("example") MmReinsurancemirrorTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReinsurancemirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmReinsurancemirrorTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReinsurancemirrorTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmReinsurancemirrorTd record);
}