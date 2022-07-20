package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.HicmiMidAccDetail;
import com.xiaocai.demo.mybatis.generator.example.entity.HicmiMidAccDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HicmiMidAccDetailMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  HicmiMidAccDetailExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(HicmiMidAccDetailExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  HicmiMidAccDetailExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(HicmiMidAccDetailExample example);

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
     * @param : record  HicmiMidAccDetail
     * @modified by : 
     * @last-modify : 
     */
    int insert(HicmiMidAccDetail record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  HicmiMidAccDetail
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(HicmiMidAccDetail record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  HicmiMidAccDetailExample
     * @modified by : 
     * @last-modify : 
     */
    List<HicmiMidAccDetail> selectByExample(HicmiMidAccDetailExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    HicmiMidAccDetail selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  HicmiMidAccDetail
     * @param : example  HicmiMidAccDetailExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") HicmiMidAccDetail record, @Param("example") HicmiMidAccDetailExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  HicmiMidAccDetail
     * @param : example  HicmiMidAccDetailExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") HicmiMidAccDetail record, @Param("example") HicmiMidAccDetailExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  HicmiMidAccDetail
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(HicmiMidAccDetail record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  HicmiMidAccDetail
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(HicmiMidAccDetail record);
}