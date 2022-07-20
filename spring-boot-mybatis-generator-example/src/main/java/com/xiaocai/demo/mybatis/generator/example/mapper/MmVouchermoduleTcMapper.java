package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmVouchermoduleTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmVouchermoduleTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmVouchermoduleTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVouchermoduleTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmVouchermoduleTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVouchermoduleTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmVouchermoduleTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : businesstype  String
     * @param : moduleno  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("businesstype") String businesstype, @Param("moduleno") String moduleno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchermoduleTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmVouchermoduleTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchermoduleTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmVouchermoduleTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVouchermoduleTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmVouchermoduleTc> selectByExample(MmVouchermoduleTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : businesstype  String
     * @param : moduleno  String
     * @modified by : 
     * @last-modify : 
     */
    MmVouchermoduleTc selectByPrimaryKey(@Param("businesstype") String businesstype, @Param("moduleno") String moduleno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchermoduleTc
     * @param : example  MmVouchermoduleTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmVouchermoduleTc record, @Param("example") MmVouchermoduleTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchermoduleTc
     * @param : example  MmVouchermoduleTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmVouchermoduleTc record, @Param("example") MmVouchermoduleTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchermoduleTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmVouchermoduleTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchermoduleTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmVouchermoduleTc record);
}