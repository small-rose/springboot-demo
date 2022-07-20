package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmPayablemoneydetailTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmPayablemoneydetailTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmPayablemoneydetailTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPayablemoneydetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmPayablemoneydetailTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPayablemoneydetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmPayablemoneydetailTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqpayabledetail  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long seqpayabledetail);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayablemoneydetailTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmPayablemoneydetailTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayablemoneydetailTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmPayablemoneydetailTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPayablemoneydetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmPayablemoneydetailTd> selectByExample(MmPayablemoneydetailTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqpayabledetail  Long
     * @modified by : 
     * @last-modify : 
     */
    MmPayablemoneydetailTd selectByPrimaryKey(Long seqpayabledetail);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayablemoneydetailTd
     * @param : example  MmPayablemoneydetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmPayablemoneydetailTd record, @Param("example") MmPayablemoneydetailTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayablemoneydetailTd
     * @param : example  MmPayablemoneydetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmPayablemoneydetailTd record, @Param("example") MmPayablemoneydetailTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayablemoneydetailTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmPayablemoneydetailTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPayablemoneydetailTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmPayablemoneydetailTd record);
}