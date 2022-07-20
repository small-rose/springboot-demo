package com.xiaocai.demo.mybatis.generator.example.mapper;

import com.xiaocai.demo.mybatis.generator.example.entity.AtsPayTransactionsHistory;
import com.xiaocai.demo.mybatis.generator.example.entity.AtsPayTransactionsHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AtsPayTransactionsHistoryMapper {
    /**
     * 
     * @description : 根据自定义Example条件查询总条数
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  AtsPayTransactionsHistoryExample
     * @modified by : 
     * @last-modify : 
     */
    long countByExample(AtsPayTransactionsHistoryExample example);

    /**
     * 
     * @description : 根据自定义Example条件判断删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  AtsPayTransactionsHistoryExample
     * @modified by : 
     * @last-modify : 
     */
    int deleteByExample(AtsPayTransactionsHistoryExample example);

    /**
     * 
     * @description : 根据主键删除
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : urid  Long
     * @modified by : 
     * @last-modify : 
     */
    int deleteByPrimaryKey(Long urid);

    /**
     * 
     * @description : 正常的insert全部的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  AtsPayTransactionsHistory
     * @modified by : 
     * @last-modify : 
     */
    int insert(AtsPayTransactionsHistory record);

    /**
     * 
     * @description : 仅insert有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  AtsPayTransactionsHistory
     * @modified by : 
     * @last-modify : 
     */
    int insertSelective(AtsPayTransactionsHistory record);

    /**
     * 
     * @description : 根据自定义Example条件查询对象列表
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : example  AtsPayTransactionsHistoryExample
     * @modified by : 
     * @last-modify : 
     */
    List<AtsPayTransactionsHistory> selectByExample(AtsPayTransactionsHistoryExample example);

    /**
     * 
     * @description : 根据主键条件查询对象
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : urid  Long
     * @modified by : 
     * @last-modify : 
     */
    AtsPayTransactionsHistory selectByPrimaryKey(Long urid);

    /**
     * 
     * @description : 根据自定义Example条件对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  AtsPayTransactionsHistory
     * @param : example  AtsPayTransactionsHistoryExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExampleSelective(@Param("record") AtsPayTransactionsHistory record, @Param("example") AtsPayTransactionsHistoryExample example);

    /**
     * 
     * @description : 根据自定义Example条件更新全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  AtsPayTransactionsHistory
     * @param : example  AtsPayTransactionsHistoryExample
     * @modified by : 
     * @last-modify : 
     */
    int updateByExample(@Param("record") AtsPayTransactionsHistory record, @Param("example") AtsPayTransactionsHistoryExample example);

    /**
     * 
     * @description : 根据主键更新对象参数有值的属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  AtsPayTransactionsHistory
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKeySelective(AtsPayTransactionsHistory record);

    /**
     * 
     * @description : 根据主键更新对象全部属性
     * @author : zzy
     * @date : 2022-03-11 15:37:37
     * @param : record  AtsPayTransactionsHistory
     * @modified by : 
     * @last-modify : 
     */
    int updateByPrimaryKey(AtsPayTransactionsHistory record);
}