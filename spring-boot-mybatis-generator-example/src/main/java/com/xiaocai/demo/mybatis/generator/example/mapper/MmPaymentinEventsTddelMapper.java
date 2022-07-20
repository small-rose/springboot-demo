package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmPaymentinEventsTddel;
import com.xiaocai.demo.mybatis.generator.example.entity.MmPaymentinEventsTddelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmPaymentinEventsTddelMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPaymentinEventsTddelExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmPaymentinEventsTddelExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPaymentinEventsTddelExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmPaymentinEventsTddelExample example);

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
     * @param : record  MmPaymentinEventsTddel
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmPaymentinEventsTddel record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPaymentinEventsTddel
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmPaymentinEventsTddel record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmPaymentinEventsTddelExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmPaymentinEventsTddel> selectByExample(MmPaymentinEventsTddelExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : listno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmPaymentinEventsTddel selectByPrimaryKey(Long listno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPaymentinEventsTddel
     * @param : example  MmPaymentinEventsTddelExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmPaymentinEventsTddel record, @Param("example") MmPaymentinEventsTddelExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPaymentinEventsTddel
     * @param : example  MmPaymentinEventsTddelExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmPaymentinEventsTddel record, @Param("example") MmPaymentinEventsTddelExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPaymentinEventsTddel
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmPaymentinEventsTddel record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmPaymentinEventsTddel
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmPaymentinEventsTddel record);
}