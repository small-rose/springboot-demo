package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmDictcontentTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmDictcontentTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmDictcontentTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDictcontentTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmDictcontentTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDictcontentTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmDictcontentTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : busintypeid  String
     * @param : businid  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("busintypeid") String busintypeid, @Param("businid") String businid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDictcontentTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmDictcontentTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDictcontentTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmDictcontentTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmDictcontentTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmDictcontentTd> selectByExample(MmDictcontentTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : busintypeid  String
     * @param : businid  String
     * @modified by : 
     * @last-modify : 
     */
    MmDictcontentTd selectByPrimaryKey(@Param("busintypeid") String busintypeid, @Param("businid") String businid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDictcontentTd
     * @param : example  MmDictcontentTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmDictcontentTd record, @Param("example") MmDictcontentTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDictcontentTd
     * @param : example  MmDictcontentTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmDictcontentTd record, @Param("example") MmDictcontentTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDictcontentTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmDictcontentTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmDictcontentTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmDictcontentTd record);
}