package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmVoucherheadTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmVoucherheadTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmVoucherheadTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVoucherheadTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmVoucherheadTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVoucherheadTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmVoucherheadTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherheadTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmVoucherheadTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherheadTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmVoucherheadTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVoucherheadTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmVoucherheadTd> selectByExample(MmVoucherheadTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmVoucherheadTd selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherheadTd
     * @param : example  MmVoucherheadTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmVoucherheadTd record, @Param("example") MmVoucherheadTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherheadTd
     * @param : example  MmVoucherheadTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmVoucherheadTd record, @Param("example") MmVoucherheadTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherheadTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmVoucherheadTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherheadTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmVoucherheadTd record);
}