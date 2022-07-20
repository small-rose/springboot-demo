package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmPaymentinEventsTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmPaymentinEventsTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmPaymentinEventsTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPaymentinEventsTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmPaymentinEventsTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPaymentinEventsTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmPaymentinEventsTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : listno  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long listno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPaymentinEventsTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmPaymentinEventsTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPaymentinEventsTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmPaymentinEventsTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPaymentinEventsTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmPaymentinEventsTd> selectByExample(MmPaymentinEventsTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : listno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmPaymentinEventsTd selectByPrimaryKey(Long listno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPaymentinEventsTd
     * @param : example  MmPaymentinEventsTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmPaymentinEventsTd record, @Param("example") MmPaymentinEventsTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPaymentinEventsTd
     * @param : example  MmPaymentinEventsTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmPaymentinEventsTd record, @Param("example") MmPaymentinEventsTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPaymentinEventsTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmPaymentinEventsTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPaymentinEventsTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmPaymentinEventsTd record);
}