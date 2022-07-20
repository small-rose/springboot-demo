package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmOrganizationTi;
import com.xiaocai.demo.mybatis.generator.example.entity.MmOrganizationTiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmOrganizationTiMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmOrganizationTiExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmOrganizationTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmOrganizationTiExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmOrganizationTiExample example);

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
     * @param : record  MmOrganizationTi
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmOrganizationTi record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmOrganizationTi
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmOrganizationTi record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmOrganizationTiExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmOrganizationTi> selectByExample(MmOrganizationTiExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmOrganizationTi selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmOrganizationTi
     * @param : example  MmOrganizationTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmOrganizationTi record, @Param("example") MmOrganizationTiExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmOrganizationTi
     * @param : example  MmOrganizationTiExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmOrganizationTi record, @Param("example") MmOrganizationTiExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmOrganizationTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmOrganizationTi record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmOrganizationTi
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmOrganizationTi record);
}