package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmBadDebtsHead;
import com.xiaocai.demo.mybatis.generator.example.entity.MmBadDebtsHeadExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmBadDebtsHeadMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBadDebtsHeadExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmBadDebtsHeadExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBadDebtsHeadExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmBadDebtsHeadExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : extractDate  Date
     * @param : mirrorid  Long
     * @param : subcompany  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("extractDate") Date extractDate, @Param("mirrorid") Long mirrorid, @Param("subcompany") String subcompany);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBadDebtsHead
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmBadDebtsHead record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBadDebtsHead
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmBadDebtsHead record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBadDebtsHeadExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmBadDebtsHead> selectByExample(MmBadDebtsHeadExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : extractDate  Date
     * @param : mirrorid  Long
     * @param : subcompany  String
     * @modified by : 
     * @last-modify : 
     */
    MmBadDebtsHead selectByPrimaryKey(@Param("extractDate") Date extractDate, @Param("mirrorid") Long mirrorid, @Param("subcompany") String subcompany);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBadDebtsHead
     * @param : example  MmBadDebtsHeadExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmBadDebtsHead record, @Param("example") MmBadDebtsHeadExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBadDebtsHead
     * @param : example  MmBadDebtsHeadExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmBadDebtsHead record, @Param("example") MmBadDebtsHeadExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBadDebtsHead
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmBadDebtsHead record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBadDebtsHead
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmBadDebtsHead record);
}