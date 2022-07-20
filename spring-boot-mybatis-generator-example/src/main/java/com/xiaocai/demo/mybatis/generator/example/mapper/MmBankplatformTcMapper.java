package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmBankplatformTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmBankplatformTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmBankplatformTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBankplatformTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmBankplatformTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBankplatformTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmBankplatformTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : platformid  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String platformid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankplatformTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmBankplatformTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankplatformTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmBankplatformTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBankplatformTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmBankplatformTc> selectByExample(MmBankplatformTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : platformid  String
     * @modified by : 
     * @last-modify : 
     */
    MmBankplatformTc selectByPrimaryKey(String platformid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankplatformTc
     * @param : example  MmBankplatformTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmBankplatformTc record, @Param("example") MmBankplatformTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankplatformTc
     * @param : example  MmBankplatformTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmBankplatformTc record, @Param("example") MmBankplatformTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankplatformTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmBankplatformTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBankplatformTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmBankplatformTc record);
}