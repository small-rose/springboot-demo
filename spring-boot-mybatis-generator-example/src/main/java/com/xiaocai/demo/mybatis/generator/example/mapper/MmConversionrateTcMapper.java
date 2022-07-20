package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmConversionrateTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmConversionrateTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmConversionrateTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmConversionrateTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmConversionrateTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmConversionrateTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmConversionrateTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqrate  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long seqrate);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmConversionrateTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmConversionrateTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmConversionrateTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmConversionrateTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmConversionrateTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmConversionrateTc> selectByExample(MmConversionrateTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : seqrate  Long
     * @modified by : 
     * @last-modify : 
     */
    MmConversionrateTc selectByPrimaryKey(Long seqrate);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmConversionrateTc
     * @param : example  MmConversionrateTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmConversionrateTc record, @Param("example") MmConversionrateTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmConversionrateTc
     * @param : example  MmConversionrateTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmConversionrateTc record, @Param("example") MmConversionrateTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmConversionrateTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmConversionrateTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmConversionrateTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmConversionrateTc record);
}