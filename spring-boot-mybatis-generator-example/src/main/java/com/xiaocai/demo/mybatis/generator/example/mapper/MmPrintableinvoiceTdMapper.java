package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmPrintableinvoiceTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmPrintableinvoiceTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmPrintableinvoiceTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPrintableinvoiceTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmPrintableinvoiceTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPrintableinvoiceTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmPrintableinvoiceTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : printableno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long printableno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPrintableinvoiceTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmPrintableinvoiceTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPrintableinvoiceTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmPrintableinvoiceTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPrintableinvoiceTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmPrintableinvoiceTd> selectByExample(MmPrintableinvoiceTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : printableno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmPrintableinvoiceTd selectByPrimaryKey(Long printableno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPrintableinvoiceTd
     * @param : example  MmPrintableinvoiceTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmPrintableinvoiceTd record, @Param("example") MmPrintableinvoiceTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPrintableinvoiceTd
     * @param : example  MmPrintableinvoiceTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmPrintableinvoiceTd record, @Param("example") MmPrintableinvoiceTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPrintableinvoiceTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmPrintableinvoiceTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPrintableinvoiceTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmPrintableinvoiceTd record);
}