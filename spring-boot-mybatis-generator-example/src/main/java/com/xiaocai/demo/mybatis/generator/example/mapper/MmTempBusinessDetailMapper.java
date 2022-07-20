package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmTempBusinessDetail;
import com.xiaocai.demo.mybatis.generator.example.entity.MmTempBusinessDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmTempBusinessDetailMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempBusinessDetailExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmTempBusinessDetailExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempBusinessDetailExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmTempBusinessDetailExample example);

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
     * @param : record  MmTempBusinessDetail
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmTempBusinessDetail record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempBusinessDetail
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmTempBusinessDetail record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmTempBusinessDetailExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmTempBusinessDetail> selectByExample(MmTempBusinessDetailExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : listno  Long
     * @modified by : 
     * @last-modify : 
     */
    MmTempBusinessDetail selectByPrimaryKey(Long listno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempBusinessDetail
     * @param : example  MmTempBusinessDetailExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmTempBusinessDetail record, @Param("example") MmTempBusinessDetailExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempBusinessDetail
     * @param : example  MmTempBusinessDetailExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmTempBusinessDetail record, @Param("example") MmTempBusinessDetailExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempBusinessDetail
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmTempBusinessDetail record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmTempBusinessDetail
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmTempBusinessDetail record);
}