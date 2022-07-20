package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.BfpBalanceTd;
import com.xiaocai.demo.mybatis.generator.example.entity.BfpBalanceTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BfpBalanceTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  BfpBalanceTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(BfpBalanceTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  BfpBalanceTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(BfpBalanceTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : balanceid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long balanceid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  BfpBalanceTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(BfpBalanceTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  BfpBalanceTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(BfpBalanceTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  BfpBalanceTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<BfpBalanceTd> selectByExample(BfpBalanceTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : balanceid  Long
     * @modified by : 
     * @last-modify : 
     */
    BfpBalanceTd selectByPrimaryKey(Long balanceid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  BfpBalanceTd
     * @param : example  BfpBalanceTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") BfpBalanceTd record, @Param("example") BfpBalanceTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  BfpBalanceTd
     * @param : example  BfpBalanceTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") BfpBalanceTd record, @Param("example") BfpBalanceTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  BfpBalanceTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(BfpBalanceTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  BfpBalanceTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(BfpBalanceTd record);
}