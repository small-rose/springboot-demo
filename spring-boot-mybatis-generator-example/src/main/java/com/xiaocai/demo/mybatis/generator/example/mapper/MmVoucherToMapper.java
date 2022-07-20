package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmVoucherTo;
import com.xiaocai.demo.mybatis.generator.example.entity.MmVoucherToExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmVoucherToMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVoucherToExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmVoucherToExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVoucherToExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmVoucherToExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : attribute4  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long attribute4);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherTo
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmVoucherTo record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherTo
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmVoucherTo record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVoucherToExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmVoucherTo> selectByExample(MmVoucherToExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : attribute4  Long
     * @modified by : 
     * @last-modify : 
     */
    MmVoucherTo selectByPrimaryKey(Long attribute4);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherTo
     * @param : example  MmVoucherToExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmVoucherTo record, @Param("example") MmVoucherToExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherTo
     * @param : example  MmVoucherToExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmVoucherTo record, @Param("example") MmVoucherToExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherTo
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmVoucherTo record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherTo
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmVoucherTo record);
}