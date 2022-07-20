package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmVoucherdetailTdErr;
import com.xiaocai.demo.mybatis.generator.example.entity.MmVoucherdetailTdErrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmVoucherdetailTdErrMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVoucherdetailTdErrExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmVoucherdetailTdErrExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVoucherdetailTdErrExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmVoucherdetailTdErrExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqreport  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long seqreport);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherdetailTdErr
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmVoucherdetailTdErr record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherdetailTdErr
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmVoucherdetailTdErr record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVoucherdetailTdErrExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmVoucherdetailTdErr> selectByExample(MmVoucherdetailTdErrExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqreport  Long
     * @modified by : 
     * @last-modify : 
     */
    MmVoucherdetailTdErr selectByPrimaryKey(Long seqreport);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherdetailTdErr
     * @param : example  MmVoucherdetailTdErrExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmVoucherdetailTdErr record, @Param("example") MmVoucherdetailTdErrExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherdetailTdErr
     * @param : example  MmVoucherdetailTdErrExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmVoucherdetailTdErr record, @Param("example") MmVoucherdetailTdErrExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherdetailTdErr
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmVoucherdetailTdErr record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherdetailTdErr
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmVoucherdetailTdErr record);
}