package com.xiaocai.demo.poi.oracle.dao;


import com.xiaocai.demo.poi.oracle.vo.TableColumn;
import com.xiaocai.demo.poi.oracle.vo.TableInfo;
import com.xiaocai.demo.poi.oracle.vo.TableLastDDLTime;
import com.xiaocai.demo.poi.oracle.vo.TablePrimary;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.Types;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/14 21:05
 * @version: v1.0
 */
@Repository
public class OracleSelectDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    /**
     * 查表和表注释
     * @param schema
     * @return
     */
    public List<TableInfo> getAllTables(String schema){

        String querySQL = "SELECT distinct t1.TABLE_NAME as tableName, nvl(t.COMMENTS, '')as tableComment, T1.TABLESPACE_NAME as tableSpaceName " +
                "FROM DBA_TAB_COMMENTS t, DBA_TABLES t1 WHERE t.TABLE_NAME = t1.TABLE_NAME AND t.OWNER = ? ";
        //System.out.println("=====SQL: "+ querySQL);
        //System.out.println("=====schema: "+ schema);
        RowMapper<TableInfo> rowMapper = new BeanPropertyRowMapper<>(TableInfo.class);
        List<TableInfo> voList = jdbcTemplate.query(querySQL, new Object[] { schema }, new int[] {Types.CHAR}, rowMapper);
        return voList ;
    }


    /**
     * 找到表里的主键字段
     * @param schema
     * @return
     */
    public Map<String, String> getTablePrimaryKey(String schema){

        String querySQL = "SELECT\n" +
                "       a.TABLE_NAME AS tableName,\n" +
                "       a.constraint_name AS PK_NAME,\n" +
                "       a.column_name AS primaryKey,\n" +
                "       b.constraint_type " +
                "FROM user_cons_columns a, user_constraints b \n" +
                "WHERE a.constraint_name = b.constraint_name \n" +
                "AND b.constraint_type = 'P'  \n" +
                "AND a.OWNER = ? AND a.TABLE_NAME IN (\n" +
                "    SELECT TABLE_NAME FROM DBA_TABLES WHERE OWNER=? \n" +
                "    )  ";
        System.out.println("=====SQL: "+ querySQL);
        //System.out.println("=====schema: "+ schema);
        RowMapper<TablePrimary> rowMapper = new BeanPropertyRowMapper<>(TablePrimary.class);
        List<TablePrimary> voList = jdbcTemplate.query(querySQL, new Object[] { schema, schema }, new int[] {Types.CHAR, Types.CHAR}, rowMapper);

        if (null == voList || voList.isEmpty()){
            return new HashMap<>(0);
        }
        Map<String, String> result = new HashMap<>(voList.size());
        voList.forEach((tablePrimary -> {
            result.put(tablePrimary.getTableName(), tablePrimary.getPrimaryKey());
        }));
        return result ;
    }

    /**
     * 找到表里的主键字段
     * @param schema
     * @return
     */
    public Map<String, String> getTableLastDDLTime(String schema){

        String querySQL = "select uat.table_name as tableName,(select last_ddl_time from user_objects where OBJECT_TYPE='TABLE' AND object_name = uat.table_name ) as lastDDLTime " +
                "  from user_all_tables uat ";
        //System.out.println("=====SQL: "+ querySQL);
        RowMapper<TableLastDDLTime> rowMapper = new BeanPropertyRowMapper<>(TableLastDDLTime.class);
        List<TableLastDDLTime> voList = jdbcTemplate.query(querySQL, rowMapper);

        if (voList.isEmpty()){
            return new HashMap<>(0);
        }
        Map<String, String> result = new HashMap<>(voList.size());
        voList.forEach((tablePrimary -> {
            result.put(tablePrimary.getTableName(), tablePrimary.getLastDDLTime());
        }));
        return result ;
    }


    /**
     * 查表的列信息
     * @param schema
     * @param tableName
     * @return
     */
    public List<TableColumn> getColumnInfo(String schema, String tableName){

        String querySQL = "SELECT UTC.COLUMN_NAME as columnName,\n" +
                "       CASE UTC.DATA_TYPE WHEN 'DATE' THEN  UTC.DATA_TYPE\n" +
                "            ELSE    UTC.DATA_TYPE || '(' || UTC.DATA_LENGTH || ')'\n" +
                "       END columnType,\n" +
                "       UCC.COMMENTS as columnComment,\n" +
                "       UTC.NULLABLE\n" +
                "FROM USER_TAB_COLUMNS  UTC ,\n" +
                "     DBA_TABLES T,\n" +
                "     USER_COL_COMMENTS UCC\n" +
                "WHERE UTC.TABLE_NAME = T.TABLE_NAME AND T.TABLE_NAME=UCC.TABLE_NAME\n" +
                "  AND UTC.COLUMN_NAME = UCC.COLUMN_NAME\n" +
                "  AND T.OWNER= ?  " +
                "  AND UTC.TABLE_NAME= ?  " +
                "ORDER BY UTC.COLUMN_ID ASC  " ;
        System.out.println("=====SQL: "+ querySQL);
        //System.out.println("=====schema: "+ schema);
        System.out.println("=====tableName: "+ tableName);
        RowMapper<TableColumn> rowMapper = new BeanPropertyRowMapper<>(TableColumn.class);
        List<TableColumn> voList = jdbcTemplate.query(querySQL, new Object[] { schema, tableName }, new int[] {Types.CHAR, Types.CHAR }, rowMapper);

        return voList ;
    }


}
