package com.xiaocai.demo.excel.oracle.dao;

import com.xiaocai.demo.excel.oracle.vo.TableColumn;
import com.xiaocai.demo.excel.oracle.vo.TableInfo;
import com.xiaocai.demo.excel.oracle.vo.TablePrimary;
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

        String querySQL = "SELECT distinct t1.TABLE_NAME as tableName, t.COMMENTS as tableComment, T1.TABLESPACE_NAME as tableSpaceName " +
                "FROM DBA_TAB_COMMENTS t, DBA_TABLES t1 WHERE t.TABLE_NAME = t1.TABLE_NAME AND t.OWNER = ? ";
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
                "       a.TABLE_NAME AS TABLE_NAME,\n" +
                "       a.constraint_name AS PK_NAME,\n" +
                "       a.column_name AS COLUMN_NAME,\n" +
                "       b.constraint_type " +
                "FROM user_cons_columns a, user_constraints b \n" +
                "WHERE a.constraint_name = b.constraint_name \n" +
                "AND b.constraint_type = 'P'  \n" +
                "AND a.OWNER = ? AND a.TABLE_NAME IN (\n" +
                "    SELECT TABLE_NAME FROM DBA_TABLES WHERE OWNER=? \n" +
                "    )  ;";
        RowMapper<TablePrimary> rowMapper = new BeanPropertyRowMapper<>(TablePrimary.class);
        List<TablePrimary> voList = jdbcTemplate.query(querySQL, new Object[] { schema }, new int[] {Types.CHAR}, rowMapper);

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
     * 查表的列信息
     * @param schema
     * @param tableName
     * @return
     */
    public List<TableColumn> getColumnInfo(String schema, String tableName){

        String querySQL = "SELECT distinct\n" +
                //"        T.TABLE_NAME,\n" +
                "        TC.COLUMN_NAME as columnName, \n" +
                "        CASE TC.DATA_TYPE WHEN 'DATE' THEN  TC.DATA_TYPE\n" +
                "            ELSE    TC.DATA_TYPE || '(' || TC.DATA_LENGTH || ')'\n" +
                "        END columnType ,\n" +
                "        U.COMMENTS as columnComment,\n" +
                "        TC.NULLABLE \n" +
                "FROM DBA_TAB_COLS TC,\n" +
                "     DBA_TABLES T,\n" +
                "     USER_COL_COMMENTS U\n" +
                "WHERE TC.TABLE_NAME = T.TABLE_NAME AND T.TABLE_NAME=U.TABLE_NAME\n" +
                "  AND TC.COLUMN_NAME = U.COLUMN_NAME\n" +
                "  AND TC.OWNER = ?  \n" +
                "  AND U.TABLE_NAME = ? \n" +
                ";";
        RowMapper<TableColumn> rowMapper = new BeanPropertyRowMapper<>(TableColumn.class);
        List<TableColumn> voList = jdbcTemplate.query(querySQL, new Object[] { schema, tableName }, new int[] {Types.CHAR, Types.CHAR }, rowMapper);

        return voList ;
    }


}
