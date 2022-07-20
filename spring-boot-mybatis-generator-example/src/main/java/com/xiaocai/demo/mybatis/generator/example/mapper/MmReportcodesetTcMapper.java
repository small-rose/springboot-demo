package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmReportcodesetTc;
import com.xiaocai.demo.mybatis.generator.example.entity.MmReportcodesetTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmReportcodesetTcMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmReportcodesetTcExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmReportcodesetTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmReportcodesetTcExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmReportcodesetTcExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : classcode  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long classcode);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReportcodesetTc
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmReportcodesetTc record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReportcodesetTc
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmReportcodesetTc record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmReportcodesetTcExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmReportcodesetTc> selectByExample(MmReportcodesetTcExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : classcode  Long
     * @modified by : 
     * @last-modify : 
     */
    MmReportcodesetTc selectByPrimaryKey(Long classcode);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReportcodesetTc
     * @param : example  MmReportcodesetTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmReportcodesetTc record, @Param("example") MmReportcodesetTcExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReportcodesetTc
     * @param : example  MmReportcodesetTcExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmReportcodesetTc record, @Param("example") MmReportcodesetTcExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReportcodesetTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmReportcodesetTc record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmReportcodesetTc
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmReportcodesetTc record);
}