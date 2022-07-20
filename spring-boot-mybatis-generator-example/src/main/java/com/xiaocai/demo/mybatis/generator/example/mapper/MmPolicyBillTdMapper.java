package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmPolicyBillTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmPolicyBillTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmPolicyBillTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicyBillTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmPolicyBillTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicyBillTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmPolicyBillTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqbillno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long seqbillno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyBillTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmPolicyBillTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyBillTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmPolicyBillTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicyBillTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmPolicyBillTd> selectByExample(MmPolicyBillTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqbillno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmPolicyBillTd selectByPrimaryKey(Long seqbillno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyBillTd
     * @param : example  MmPolicyBillTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmPolicyBillTd record, @Param("example") MmPolicyBillTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyBillTd
     * @param : example  MmPolicyBillTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmPolicyBillTd record, @Param("example") MmPolicyBillTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyBillTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmPolicyBillTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyBillTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmPolicyBillTd record);
}