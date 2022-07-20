package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmVoucherdetailTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmVoucherdetailTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmVoucherdetailTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVoucherdetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmVoucherdetailTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVoucherdetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmVoucherdetailTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqreport  Long
     * @param : moduleno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("seqreport") Long seqreport, @Param("moduleno") Long moduleno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherdetailTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmVoucherdetailTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherdetailTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmVoucherdetailTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVoucherdetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmVoucherdetailTd> selectByExample(MmVoucherdetailTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqreport  Long
     * @param : moduleno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmVoucherdetailTd selectByPrimaryKey(@Param("seqreport") Long seqreport, @Param("moduleno") Long moduleno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherdetailTd
     * @param : example  MmVoucherdetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmVoucherdetailTd record, @Param("example") MmVoucherdetailTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherdetailTd
     * @param : example  MmVoucherdetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmVoucherdetailTd record, @Param("example") MmVoucherdetailTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherdetailTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmVoucherdetailTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherdetailTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmVoucherdetailTd record);
}