package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmPolicydetailTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmPolicydetailTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmPolicydetailTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicydetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmPolicydetailTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicydetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmPolicydetailTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqpolicydetail  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long seqpolicydetail);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicydetailTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmPolicydetailTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicydetailTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmPolicydetailTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPolicydetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmPolicydetailTd> selectByExample(MmPolicydetailTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqpolicydetail  Long
     * @modified by : 
     * @last-modify : 
     */
    MmPolicydetailTd selectByPrimaryKey(Long seqpolicydetail);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicydetailTd
     * @param : example  MmPolicydetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmPolicydetailTd record, @Param("example") MmPolicydetailTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicydetailTd
     * @param : example  MmPolicydetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmPolicydetailTd record, @Param("example") MmPolicydetailTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicydetailTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmPolicydetailTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPolicydetailTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmPolicydetailTd record);
}