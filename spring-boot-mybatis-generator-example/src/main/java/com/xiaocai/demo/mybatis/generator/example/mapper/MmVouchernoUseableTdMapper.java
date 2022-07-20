package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmVouchernoUseableTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmVouchernoUseableTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmVouchernoUseableTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVouchernoUseableTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmVouchernoUseableTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVouchernoUseableTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmVouchernoUseableTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : unitcode  String
     * @param : accountdate  String
     * @param : voucherno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("unitcode") String unitcode, @Param("accountdate") String accountdate, @Param("voucherno") Long voucherno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchernoUseableTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmVouchernoUseableTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchernoUseableTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmVouchernoUseableTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmVouchernoUseableTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmVouchernoUseableTd> selectByExample(MmVouchernoUseableTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : unitcode  String
     * @param : accountdate  String
     * @param : voucherno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmVouchernoUseableTd selectByPrimaryKey(@Param("unitcode") String unitcode, @Param("accountdate") String accountdate, @Param("voucherno") Long voucherno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchernoUseableTd
     * @param : example  MmVouchernoUseableTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmVouchernoUseableTd record, @Param("example") MmVouchernoUseableTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchernoUseableTd
     * @param : example  MmVouchernoUseableTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmVouchernoUseableTd record, @Param("example") MmVouchernoUseableTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchernoUseableTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmVouchernoUseableTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmVouchernoUseableTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmVouchernoUseableTd record);
}