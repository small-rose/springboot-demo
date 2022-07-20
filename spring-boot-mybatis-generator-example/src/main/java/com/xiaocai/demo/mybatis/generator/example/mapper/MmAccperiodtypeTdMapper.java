package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmAccperiodtypeTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmAccperiodtypeTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmAccperiodtypeTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccperiodtypeTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmAccperiodtypeTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccperiodtypeTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmAccperiodtypeTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : certitype  String
     * @param : datatype  String
     * @param : flag  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("certitype") String certitype, @Param("datatype") String datatype, @Param("flag") String flag);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccperiodtypeTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmAccperiodtypeTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccperiodtypeTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmAccperiodtypeTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccperiodtypeTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmAccperiodtypeTd> selectByExample(MmAccperiodtypeTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : certitype  String
     * @param : datatype  String
     * @param : flag  String
     * @modified by : 
     * @last-modify : 
     */
    MmAccperiodtypeTd selectByPrimaryKey(@Param("certitype") String certitype, @Param("datatype") String datatype, @Param("flag") String flag);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccperiodtypeTd
     * @param : example  MmAccperiodtypeTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmAccperiodtypeTd record, @Param("example") MmAccperiodtypeTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccperiodtypeTd
     * @param : example  MmAccperiodtypeTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmAccperiodtypeTd record, @Param("example") MmAccperiodtypeTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccperiodtypeTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmAccperiodtypeTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccperiodtypeTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmAccperiodtypeTd record);
}