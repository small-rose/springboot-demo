package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.MmAccesskeyidconfigureTd;
import com.xiaocai.demo.mybatis.generator.example.entity.MmAccesskeyidconfigureTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmAccesskeyidconfigureTdMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccesskeyidconfigureTdExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(MmAccesskeyidconfigureTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccesskeyidconfigureTdExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(MmAccesskeyidconfigureTdExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : accesskeyid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long accesskeyid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccesskeyidconfigureTd
     * @modified by : 
     * @last-modify : 
     */
    int insert(MmAccesskeyidconfigureTd record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccesskeyidconfigureTd
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(MmAccesskeyidconfigureTd record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  MmAccesskeyidconfigureTdExample
     * @modified by : 
     * @last-modify : 
     */
    List<MmAccesskeyidconfigureTd> selectByExample(MmAccesskeyidconfigureTdExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : accesskeyid  Long
     * @modified by : 
     * @last-modify : 
     */
    MmAccesskeyidconfigureTd selectByPrimaryKey(Long accesskeyid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccesskeyidconfigureTd
     * @param : example  MmAccesskeyidconfigureTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") MmAccesskeyidconfigureTd record, @Param("example") MmAccesskeyidconfigureTdExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccesskeyidconfigureTd
     * @param : example  MmAccesskeyidconfigureTdExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") MmAccesskeyidconfigureTd record, @Param("example") MmAccesskeyidconfigureTdExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccesskeyidconfigureTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(MmAccesskeyidconfigureTd record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  MmAccesskeyidconfigureTd
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(MmAccesskeyidconfigureTd record);
}