package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmReinsuranceTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmReinsuranceTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmReinsuranceTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmReinsuranceTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmReinsuranceTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmReinsuranceTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmReinsuranceTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqriinsurence  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long seqriinsurence);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReinsuranceTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmReinsuranceTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReinsuranceTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmReinsuranceTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmReinsuranceTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmReinsuranceTd> selectByExample(MmReinsuranceTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqriinsurence  Long
     * @modified by : 
     * @last-modify : 
     */
    MmReinsuranceTd selectByPrimaryKey(Long seqriinsurence);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReinsuranceTd
     * @param : example  MmReinsuranceTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmReinsuranceTd record, @Param("example") MmReinsuranceTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReinsuranceTd
     * @param : example  MmReinsuranceTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmReinsuranceTd record, @Param("example") MmReinsuranceTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReinsuranceTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmReinsuranceTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReinsuranceTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmReinsuranceTd record);
}