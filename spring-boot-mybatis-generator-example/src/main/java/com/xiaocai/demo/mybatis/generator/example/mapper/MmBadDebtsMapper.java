package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmBadDebts;
import com.xiaocai.demo.mybatis.generator.example.entity.MmBadDebtsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmBadDebtsMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBadDebtsExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmBadDebtsExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBadDebtsExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmBadDebtsExample example);

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
     * @param : record  MmBadDebts
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmBadDebts record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBadDebts
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmBadDebts record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmBadDebtsExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmBadDebts> selectByExample(MmBadDebtsExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmBadDebts selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBadDebts
     * @param : example  MmBadDebtsExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmBadDebts record, @Param("example") MmBadDebtsExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBadDebts
     * @param : example  MmBadDebtsExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmBadDebts record, @Param("example") MmBadDebtsExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBadDebts
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmBadDebts record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmBadDebts
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmBadDebts record);
}