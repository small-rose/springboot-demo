package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmSapVoucherDetailTo;
import com.xiaocai.demo.mybatis.generator.example.entity.MmSapVoucherDetailToExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmSapVoucherDetailToMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSapVoucherDetailToExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmSapVoucherDetailToExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSapVoucherDetailToExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmSapVoucherDetailToExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : sequenceno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long sequenceno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSapVoucherDetailTo
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmSapVoucherDetailTo record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSapVoucherDetailTo
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmSapVoucherDetailTo record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSapVoucherDetailToExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmSapVoucherDetailTo> selectByExample(MmSapVoucherDetailToExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : sequenceno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmSapVoucherDetailTo selectByPrimaryKey(Long sequenceno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSapVoucherDetailTo
     * @param : example  MmSapVoucherDetailToExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmSapVoucherDetailTo record, @Param("example") MmSapVoucherDetailToExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSapVoucherDetailTo
     * @param : example  MmSapVoucherDetailToExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmSapVoucherDetailTo record, @Param("example") MmSapVoucherDetailToExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSapVoucherDetailTo
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmSapVoucherDetailTo record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSapVoucherDetailTo
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmSapVoucherDetailTo record);
}