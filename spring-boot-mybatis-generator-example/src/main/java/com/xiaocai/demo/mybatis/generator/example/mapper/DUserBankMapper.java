package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.DUserBank;
import com.xiaocai.demo.mybatis.generator.example.entity.DUserBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUserBankMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  DUserBankExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(DUserBankExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  DUserBankExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(DUserBankExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DUserBank
     * @modified by : 
     * @last-modify : 
     */
    int insert(DUserBank record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DUserBank
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(DUserBank record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  DUserBankExample
     * @modified by : 
     * @last-modify : 
     */
    List<DUserBank> selectByExample(DUserBankExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    DUserBank selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DUserBank
     * @param : example  DUserBankExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") DUserBank record, @Param("example") DUserBankExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DUserBank
     * @param : example  DUserBankExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") DUserBank record, @Param("example") DUserBankExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DUserBank
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(DUserBank record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  DUserBank
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(DUserBank record);
}