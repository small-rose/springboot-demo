package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmErrorpolicyEventsTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmErrorpolicyEventsTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmErrorpolicyEventsTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmErrorpolicyEventsTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmErrorpolicyEventsTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmErrorpolicyEventsTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmErrorpolicyEventsTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqerror  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long seqerror);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErrorpolicyEventsTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmErrorpolicyEventsTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErrorpolicyEventsTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmErrorpolicyEventsTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmErrorpolicyEventsTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmErrorpolicyEventsTd> selectByExample(MmErrorpolicyEventsTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqerror  Long
     * @modified by : 
     * @last-modify : 
     */
    MmErrorpolicyEventsTd selectByPrimaryKey(Long seqerror);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErrorpolicyEventsTd
     * @param : example  MmErrorpolicyEventsTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmErrorpolicyEventsTd record, @Param("example") MmErrorpolicyEventsTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErrorpolicyEventsTd
     * @param : example  MmErrorpolicyEventsTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmErrorpolicyEventsTd record, @Param("example") MmErrorpolicyEventsTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErrorpolicyEventsTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmErrorpolicyEventsTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmErrorpolicyEventsTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmErrorpolicyEventsTd record);
}