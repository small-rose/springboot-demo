package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmUseporpertyTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmUseporpertyTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmUseporpertyTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmUseporpertyTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmUseporpertyTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmUseporpertyTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmUseporpertyTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : useporperty  Long
     * @param : erpuseporperty  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(@Param("useporperty") Long useporperty, @Param("erpuseporperty") Long erpuseporperty);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUseporpertyTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmUseporpertyTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUseporpertyTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmUseporpertyTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmUseporpertyTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmUseporpertyTd> selectByExample(MmUseporpertyTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : useporperty  Long
     * @param : erpuseporperty  Long
     * @modified by : 
     * @last-modify : 
     */
    MmUseporpertyTd selectByPrimaryKey(@Param("useporperty") Long useporperty, @Param("erpuseporperty") Long erpuseporperty);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUseporpertyTd
     * @param : example  MmUseporpertyTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmUseporpertyTd record, @Param("example") MmUseporpertyTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUseporpertyTd
     * @param : example  MmUseporpertyTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmUseporpertyTd record, @Param("example") MmUseporpertyTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUseporpertyTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmUseporpertyTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmUseporpertyTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmUseporpertyTd record);
}