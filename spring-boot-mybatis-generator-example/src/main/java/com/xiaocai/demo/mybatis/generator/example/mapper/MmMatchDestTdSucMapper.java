package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmMatchDestTdSuc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmMatchDestTdSucExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmMatchDestTdSucMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmMatchDestTdSucExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmMatchDestTdSucExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmMatchDestTdSucExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmMatchDestTdSucExample example);

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
     * @param : record  MmMatchDestTdSuc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmMatchDestTdSuc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMatchDestTdSuc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmMatchDestTdSuc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmMatchDestTdSucExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmMatchDestTdSuc> selectByExample(MmMatchDestTdSucExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : id  Long
     * @modified by : 
     * @last-modify : 
     */
    MmMatchDestTdSuc selectByPrimaryKey(Long id);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMatchDestTdSuc
     * @param : example  MmMatchDestTdSucExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmMatchDestTdSuc record, @Param("example") MmMatchDestTdSucExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMatchDestTdSuc
     * @param : example  MmMatchDestTdSucExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmMatchDestTdSuc record, @Param("example") MmMatchDestTdSucExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMatchDestTdSuc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmMatchDestTdSuc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmMatchDestTdSuc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmMatchDestTdSuc record);
}