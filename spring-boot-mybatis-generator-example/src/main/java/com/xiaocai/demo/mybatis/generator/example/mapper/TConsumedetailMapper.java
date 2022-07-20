package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.TConsumedetail;
import com.xiaocai.demo.mybatis.generator.example.entity.TConsumedetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TConsumedetailMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TConsumedetailExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(TConsumedetailExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TConsumedetailExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(TConsumedetailExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : circpaymentno  Long
     * @param : proconfirmsequenceno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("circpaymentno") Long circpaymentno, @Param("proconfirmsequenceno") Long proconfirmsequenceno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConsumedetail
     * @modified by : 
     * @last-modify : 
     */
    int insert(TConsumedetail record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConsumedetail
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(TConsumedetail record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TConsumedetailExample
     * @modified by : 
     * @last-modify : 
     */
    List<TConsumedetail> selectByExample(TConsumedetailExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : circpaymentno  Long
     * @param : proconfirmsequenceno  Long
     * @modified by : 
     * @last-modify : 
     */
    TConsumedetail selectByPrimaryKey(@Param("circpaymentno") Long circpaymentno, @Param("proconfirmsequenceno") Long proconfirmsequenceno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConsumedetail
     * @param : example  TConsumedetailExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") TConsumedetail record, @Param("example") TConsumedetailExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConsumedetail
     * @param : example  TConsumedetailExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") TConsumedetail record, @Param("example") TConsumedetailExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConsumedetail
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(TConsumedetail record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TConsumedetail
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(TConsumedetail record);
}