package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmVoucherToErr;
import com.xiaocai.demo.mybatis.generator.example.entity.MmVoucherToErrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmVoucherToErrMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVoucherToErrExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmVoucherToErrExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVoucherToErrExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmVoucherToErrExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : businessno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long businessno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherToErr
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmVoucherToErr record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherToErr
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmVoucherToErr record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVoucherToErrExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmVoucherToErr> selectByExample(MmVoucherToErrExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : businessno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmVoucherToErr selectByPrimaryKey(Long businessno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherToErr
     * @param : example  MmVoucherToErrExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmVoucherToErr record, @Param("example") MmVoucherToErrExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherToErr
     * @param : example  MmVoucherToErrExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmVoucherToErr record, @Param("example") MmVoucherToErrExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherToErr
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmVoucherToErr record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherToErr
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmVoucherToErr record);
}