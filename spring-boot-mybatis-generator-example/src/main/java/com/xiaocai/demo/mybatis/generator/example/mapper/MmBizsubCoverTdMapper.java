package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmBizsubCoverTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmBizsubCoverTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmBizsubCoverTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBizsubCoverTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmBizsubCoverTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBizsubCoverTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmBizsubCoverTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  String
     * @param : opcode  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("subcompany") String subcompany, @Param("opcode") String opcode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBizsubCoverTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmBizsubCoverTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBizsubCoverTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmBizsubCoverTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBizsubCoverTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmBizsubCoverTd> selectByExample(MmBizsubCoverTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : subcompany  String
     * @param : opcode  String
     * @modified by : 
     * @last-modify : 
     */
    MmBizsubCoverTd selectByPrimaryKey(@Param("subcompany") String subcompany, @Param("opcode") String opcode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBizsubCoverTd
     * @param : example  MmBizsubCoverTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmBizsubCoverTd record, @Param("example") MmBizsubCoverTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBizsubCoverTd
     * @param : example  MmBizsubCoverTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmBizsubCoverTd record, @Param("example") MmBizsubCoverTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBizsubCoverTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmBizsubCoverTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBizsubCoverTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmBizsubCoverTd record);
}