package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmAccountpowerTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmAccountpowerTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmAccountpowerTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccountpowerTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmAccountpowerTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccountpowerTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmAccountpowerTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : opcode  String
     * @param : mmaccountid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("opcode") String opcode, @Param("mmaccountid") Long mmaccountid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountpowerTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmAccountpowerTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountpowerTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmAccountpowerTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccountpowerTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmAccountpowerTd> selectByExample(MmAccountpowerTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : opcode  String
     * @param : mmaccountid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmAccountpowerTd selectByPrimaryKey(@Param("opcode") String opcode, @Param("mmaccountid") Long mmaccountid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountpowerTd
     * @param : example  MmAccountpowerTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmAccountpowerTd record, @Param("example") MmAccountpowerTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountpowerTd
     * @param : example  MmAccountpowerTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmAccountpowerTd record, @Param("example") MmAccountpowerTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountpowerTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmAccountpowerTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccountpowerTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmAccountpowerTd record);
}