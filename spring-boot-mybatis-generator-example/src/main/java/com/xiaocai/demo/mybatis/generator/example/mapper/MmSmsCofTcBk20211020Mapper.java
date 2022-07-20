package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmSmsCofTcBk20211020;
import com.xiaocai.demo.mybatis.generator.example.entity.MmSmsCofTcBk20211020Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmSmsCofTcBk20211020Mapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSmsCofTcBk20211020Example
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmSmsCofTcBk20211020Example example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSmsCofTcBk20211020Example
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmSmsCofTcBk20211020Example example);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSmsCofTcBk20211020
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmSmsCofTcBk20211020 record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSmsCofTcBk20211020
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmSmsCofTcBk20211020 record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmSmsCofTcBk20211020Example
     * @modified by : 
     * @last-modify : 
     */
    List<MmSmsCofTcBk20211020> selectByExample(MmSmsCofTcBk20211020Example example);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSmsCofTcBk20211020
     * @param : example  MmSmsCofTcBk20211020Example
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmSmsCofTcBk20211020 record, @Param("example") MmSmsCofTcBk20211020Example example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmSmsCofTcBk20211020
     * @param : example  MmSmsCofTcBk20211020Example
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmSmsCofTcBk20211020 record, @Param("example") MmSmsCofTcBk20211020Example example);
}