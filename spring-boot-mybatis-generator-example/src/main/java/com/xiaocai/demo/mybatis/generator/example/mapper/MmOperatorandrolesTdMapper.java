package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmOperatorandrolesTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmOperatorandrolesTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmOperatorandrolesTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmOperatorandrolesTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmOperatorandrolesTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmOperatorandrolesTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmOperatorandrolesTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : opcode  String
     * @param : roleid  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("opcode") String opcode, @Param("roleid") String roleid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmOperatorandrolesTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmOperatorandrolesTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmOperatorandrolesTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmOperatorandrolesTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmOperatorandrolesTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmOperatorandrolesTd> selectByExample(MmOperatorandrolesTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : opcode  String
     * @param : roleid  String
     * @modified by : 
     * @last-modify : 
     */
    MmOperatorandrolesTd selectByPrimaryKey(@Param("opcode") String opcode, @Param("roleid") String roleid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmOperatorandrolesTd
     * @param : example  MmOperatorandrolesTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmOperatorandrolesTd record, @Param("example") MmOperatorandrolesTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmOperatorandrolesTd
     * @param : example  MmOperatorandrolesTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmOperatorandrolesTd record, @Param("example") MmOperatorandrolesTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmOperatorandrolesTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmOperatorandrolesTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmOperatorandrolesTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmOperatorandrolesTd record);
}