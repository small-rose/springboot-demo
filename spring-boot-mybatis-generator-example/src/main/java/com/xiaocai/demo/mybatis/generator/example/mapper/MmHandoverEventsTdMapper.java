package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmHandoverEventsTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmHandoverEventsTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmHandoverEventsTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmHandoverEventsTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmHandoverEventsTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmHandoverEventsTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmHandoverEventsTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqdthandover  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long seqdthandover);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmHandoverEventsTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmHandoverEventsTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmHandoverEventsTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmHandoverEventsTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmHandoverEventsTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmHandoverEventsTd> selectByExample(MmHandoverEventsTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqdthandover  Long
     * @modified by : 
     * @last-modify : 
     */
    MmHandoverEventsTd selectByPrimaryKey(Long seqdthandover);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmHandoverEventsTd
     * @param : example  MmHandoverEventsTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmHandoverEventsTd record, @Param("example") MmHandoverEventsTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmHandoverEventsTd
     * @param : example  MmHandoverEventsTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmHandoverEventsTd record, @Param("example") MmHandoverEventsTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmHandoverEventsTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmHandoverEventsTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmHandoverEventsTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmHandoverEventsTd record);
}