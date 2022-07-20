package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmAccperiodopcodeTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmAccperiodopcodeTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmAccperiodopcodeTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccperiodopcodeTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmAccperiodopcodeTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccperiodopcodeTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmAccperiodopcodeTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  String
     * @param : accountyearmonth  Long
     * @param : opcode  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("subcompany") String subcompany, @Param("accountyearmonth") Long accountyearmonth, @Param("opcode") String opcode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccperiodopcodeTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmAccperiodopcodeTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccperiodopcodeTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmAccperiodopcodeTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccperiodopcodeTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmAccperiodopcodeTd> selectByExample(MmAccperiodopcodeTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  String
     * @param : accountyearmonth  Long
     * @param : opcode  String
     * @modified by : 
     * @last-modify : 
     */
    MmAccperiodopcodeTd selectByPrimaryKey(@Param("subcompany") String subcompany, @Param("accountyearmonth") Long accountyearmonth, @Param("opcode") String opcode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccperiodopcodeTd
     * @param : example  MmAccperiodopcodeTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmAccperiodopcodeTd record, @Param("example") MmAccperiodopcodeTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccperiodopcodeTd
     * @param : example  MmAccperiodopcodeTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmAccperiodopcodeTd record, @Param("example") MmAccperiodopcodeTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccperiodopcodeTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmAccperiodopcodeTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccperiodopcodeTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmAccperiodopcodeTd record);
}