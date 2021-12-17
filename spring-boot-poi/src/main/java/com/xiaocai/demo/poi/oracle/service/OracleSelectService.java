package com.xiaocai.demo.poi.oracle.service;


import com.xiaocai.demo.poi.oracle.dao.OracleSelectDao;
import com.xiaocai.demo.poi.oracle.vo.TableColumn;
import com.xiaocai.demo.poi.oracle.vo.TableInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/14 21:02
 * @version: v1.0
 */
@Service
public class OracleSelectService {

    @Resource
    private OracleSelectDao oracleSelectDao;

    /**
     * 查表信息
     * @param schema
     * @return
     */
    public List<TableInfo> getAllTables(String schema){
        return  oracleSelectDao.getAllTables(schema);
    }

    /**
     * 查表和主键
     * @param schema
     * @return
     */
    public Map<String, String> getTablePrimaryKey(String schema){
        return  oracleSelectDao.getTablePrimaryKey(schema);
    }

    /**
     * 查列信息
     * @param schema
     * @param tableName
     * @return
     */
    public List<TableColumn> getColumnInfo(String schema, String tableName){
        return  oracleSelectDao.getColumnInfo(schema, tableName);
    }


    /**
     * 查表 的最后更时间
     * @return
     */
    public Map<String, String> getTableLastDDLTime(String schema){
        return  oracleSelectDao.getTableLastDDLTime(schema);
    }

}
