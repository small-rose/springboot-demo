package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmOpcodepowerTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmOpcodepowerTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmOpcodepowerTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmOpcodepowerTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmOpcodepowerTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmOpcodepowerTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmOpcodepowerTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  Long
     * @param : powercode  Long
     * @param : objectcode  Long
     * @param : opcode  Long
     * @param : powerlevel  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("subcompany") Long subcompany, @Param("powercode") Long powercode, @Param("objectcode") Long objectcode, @Param("opcode") Long opcode, @Param("powerlevel") Long powerlevel);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmOpcodepowerTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmOpcodepowerTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmOpcodepowerTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmOpcodepowerTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmOpcodepowerTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmOpcodepowerTc> selectByExample(MmOpcodepowerTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  Long
     * @param : powercode  Long
     * @param : objectcode  Long
     * @param : opcode  Long
     * @param : powerlevel  Long
     * @modified by : 
     * @last-modify : 
     */
    MmOpcodepowerTc selectByPrimaryKey(@Param("subcompany") Long subcompany, @Param("powercode") Long powercode, @Param("objectcode") Long objectcode, @Param("opcode") Long opcode, @Param("powerlevel") Long powerlevel);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmOpcodepowerTc
     * @param : example  MmOpcodepowerTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmOpcodepowerTc record, @Param("example") MmOpcodepowerTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmOpcodepowerTc
     * @param : example  MmOpcodepowerTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmOpcodepowerTc record, @Param("example") MmOpcodepowerTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmOpcodepowerTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmOpcodepowerTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmOpcodepowerTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmOpcodepowerTc record);
}