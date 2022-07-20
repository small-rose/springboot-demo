package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmVouchernoTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmVouchernoTdExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmVouchernoTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVouchernoTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmVouchernoTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVouchernoTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmVouchernoTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : voucherkind  String
     * @param : unitcode  String
     * @param : periodname  Date
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("voucherkind") String voucherkind, @Param("unitcode") String unitcode, @Param("periodname") Date periodname);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchernoTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmVouchernoTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchernoTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmVouchernoTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVouchernoTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmVouchernoTd> selectByExample(MmVouchernoTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : voucherkind  String
     * @param : unitcode  String
     * @param : periodname  Date
     * @modified by : 
     * @last-modify : 
     */
    MmVouchernoTd selectByPrimaryKey(@Param("voucherkind") String voucherkind, @Param("unitcode") String unitcode, @Param("periodname") Date periodname);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchernoTd
     * @param : example  MmVouchernoTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmVouchernoTd record, @Param("example") MmVouchernoTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchernoTd
     * @param : example  MmVouchernoTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmVouchernoTd record, @Param("example") MmVouchernoTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchernoTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmVouchernoTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchernoTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmVouchernoTd record);
}