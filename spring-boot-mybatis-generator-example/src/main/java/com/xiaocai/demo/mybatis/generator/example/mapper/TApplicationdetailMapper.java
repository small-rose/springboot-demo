package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.TApplicationdetail;
import com.xiaocai.demo.mybatis.generator.example.entity.TApplicationdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TApplicationdetailMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TApplicationdetailExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(TApplicationdetailExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TApplicationdetailExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(TApplicationdetailExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : appdetailno  String
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(String appdetailno);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TApplicationdetail
     * @modified by : 
     * @last-modify : 
     */
    int insert(TApplicationdetail record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TApplicationdetail
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(TApplicationdetail record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  TApplicationdetailExample
     * @modified by : 
     * @last-modify : 
     */
    List<TApplicationdetail> selectByExample(TApplicationdetailExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : appdetailno  String
     * @modified by : 
     * @last-modify : 
     */
    TApplicationdetail selectByPrimaryKey(String appdetailno);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TApplicationdetail
     * @param : example  TApplicationdetailExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") TApplicationdetail record, @Param("example") TApplicationdetailExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TApplicationdetail
     * @param : example  TApplicationdetailExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") TApplicationdetail record, @Param("example") TApplicationdetailExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TApplicationdetail
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(TApplicationdetail record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  TApplicationdetail
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(TApplicationdetail record);
}