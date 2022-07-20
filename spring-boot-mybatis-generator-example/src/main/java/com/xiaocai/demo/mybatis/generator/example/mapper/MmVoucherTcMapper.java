package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmVoucherTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmVoucherTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmVoucherTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVoucherTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmVoucherTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVoucherTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmVoucherTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : processtype1  String
     * @param : processtype2  String
     * @param : ifinternalcontact  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("processtype1") String processtype1, @Param("processtype2") String processtype2, @Param("ifinternalcontact") Long ifinternalcontact);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmVoucherTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmVoucherTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVoucherTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmVoucherTc> selectByExample(MmVoucherTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : processtype1  String
     * @param : processtype2  String
     * @param : ifinternalcontact  Long
     * @modified by : 
     * @last-modify : 
     */
    MmVoucherTc selectByPrimaryKey(@Param("processtype1") String processtype1, @Param("processtype2") String processtype2, @Param("ifinternalcontact") Long ifinternalcontact);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherTc
     * @param : example  MmVoucherTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmVoucherTc record, @Param("example") MmVoucherTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherTc
     * @param : example  MmVoucherTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmVoucherTc record, @Param("example") MmVoucherTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmVoucherTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVoucherTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmVoucherTc record);
}