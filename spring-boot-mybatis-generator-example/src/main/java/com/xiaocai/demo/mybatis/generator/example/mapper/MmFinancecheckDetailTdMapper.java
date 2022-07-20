package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmFinancecheckDetailTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmFinancecheckDetailTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmFinancecheckDetailTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmFinancecheckDetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmFinancecheckDetailTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmFinancecheckDetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmFinancecheckDetailTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : applyno  String
     * @param : applydataid  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("applyno") String applyno, @Param("applydataid") String applydataid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckDetailTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmFinancecheckDetailTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckDetailTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmFinancecheckDetailTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmFinancecheckDetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmFinancecheckDetailTd> selectByExample(MmFinancecheckDetailTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : applyno  String
     * @param : applydataid  String
     * @modified by : 
     * @last-modify : 
     */
    MmFinancecheckDetailTd selectByPrimaryKey(@Param("applyno") String applyno, @Param("applydataid") String applydataid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckDetailTd
     * @param : example  MmFinancecheckDetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmFinancecheckDetailTd record, @Param("example") MmFinancecheckDetailTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckDetailTd
     * @param : example  MmFinancecheckDetailTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmFinancecheckDetailTd record, @Param("example") MmFinancecheckDetailTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckDetailTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmFinancecheckDetailTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmFinancecheckDetailTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmFinancecheckDetailTd record);
}