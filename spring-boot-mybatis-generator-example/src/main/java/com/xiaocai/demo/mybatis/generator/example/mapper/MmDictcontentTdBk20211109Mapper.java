package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmDictcontentTdBk20211109;
import com.xiaocai.demo.mybatis.generator.example.entity.MmDictcontentTdBk20211109Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmDictcontentTdBk20211109Mapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDictcontentTdBk20211109Example
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmDictcontentTdBk20211109Example example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDictcontentTdBk20211109Example
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmDictcontentTdBk20211109Example example);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDictcontentTdBk20211109
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmDictcontentTdBk20211109 record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDictcontentTdBk20211109
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmDictcontentTdBk20211109 record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDictcontentTdBk20211109Example
     * @modified by : 
     * @last-modify : 
     */
    List<MmDictcontentTdBk20211109> selectByExample(MmDictcontentTdBk20211109Example example);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDictcontentTdBk20211109
     * @param : example  MmDictcontentTdBk20211109Example
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmDictcontentTdBk20211109 record, @Param("example") MmDictcontentTdBk20211109Example example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDictcontentTdBk20211109
     * @param : example  MmDictcontentTdBk20211109Example
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmDictcontentTdBk20211109 record, @Param("example") MmDictcontentTdBk20211109Example example);
}