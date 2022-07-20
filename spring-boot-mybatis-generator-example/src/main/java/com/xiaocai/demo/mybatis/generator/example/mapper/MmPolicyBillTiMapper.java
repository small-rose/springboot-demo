package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmPolicyBillTi;
import com.xiaocai.demo.mybatis.generator.example.entity.MmPolicyBillTiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmPolicyBillTiMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicyBillTiExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmPolicyBillTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicyBillTiExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmPolicyBillTiExample example);

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
     * @param : record  MmPolicyBillTi
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmPolicyBillTi record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyBillTi
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmPolicyBillTi record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicyBillTiExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmPolicyBillTi> selectByExample(MmPolicyBillTiExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqbillno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmPolicyBillTi selectByPrimaryKey(Long seqbillno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyBillTi
     * @param : example  MmPolicyBillTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmPolicyBillTi record, @Param("example") MmPolicyBillTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyBillTi
     * @param : example  MmPolicyBillTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmPolicyBillTi record, @Param("example") MmPolicyBillTiExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyBillTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmPolicyBillTi record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicyBillTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmPolicyBillTi record);
}