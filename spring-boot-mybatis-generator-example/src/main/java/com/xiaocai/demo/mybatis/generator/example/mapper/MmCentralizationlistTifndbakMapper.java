package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmCentralizationlistTifndbak;
import com.xiaocai.demo.mybatis.generator.example.entity.MmCentralizationlistTifndbakExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmCentralizationlistTifndbakMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCentralizationlistTifndbakExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmCentralizationlistTifndbakExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCentralizationlistTifndbakExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmCentralizationlistTifndbakExample example);

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
     * @param : record  MmCentralizationlistTifndbak
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmCentralizationlistTifndbak record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCentralizationlistTifndbak
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmCentralizationlistTifndbak record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmCentralizationlistTifndbakExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmCentralizationlistTifndbak> selectByExample(MmCentralizationlistTifndbakExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmCentralizationlistTifndbak selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCentralizationlistTifndbak
     * @param : example  MmCentralizationlistTifndbakExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmCentralizationlistTifndbak record, @Param("example") MmCentralizationlistTifndbakExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCentralizationlistTifndbak
     * @param : example  MmCentralizationlistTifndbakExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmCentralizationlistTifndbak record, @Param("example") MmCentralizationlistTifndbakExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCentralizationlistTifndbak
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmCentralizationlistTifndbak record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmCentralizationlistTifndbak
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmCentralizationlistTifndbak record);
}