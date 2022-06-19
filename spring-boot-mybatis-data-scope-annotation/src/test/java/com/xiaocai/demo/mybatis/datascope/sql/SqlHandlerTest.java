package com.xiaocai.demo.mybatis.datascope.sql;


import com.alibaba.druid.DbType;
import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLExpr;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.expr.SQLIdentifierExpr;
import com.alibaba.druid.sql.ast.statement.*;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
import com.alibaba.druid.sql.parser.SQLStatementParser;
import com.alibaba.druid.util.JdbcConstants;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/4/18 10:40
 * @version: v1.0
 */
public class SqlHandlerTest {

    // 需要动态添加条件的表名
    static String filterTable = "student";
    // 由于有些时候表名会使用 ` 符号包裹，暂时不知道 druid sql parser 如何格式化表名
    static String filterTableSymbol = "`student`";

    // 需要动态添加条件的列名
    static String columnName = "name";
    static List<String> list = new ArrayList<>();

    @Test
    public void test(){
        DbType dbType = JdbcConstants.MYSQL; // 可以是ORACLE、POSTGRESQL、SQLSERVER、ODPS等
        String sql = "select t.subcompany, t.classescode, t.classeskind, t.classesname from mm_paycontr_tc t where t.isvalid=? ";
        //String sql = "select t.subcompany, t.classescode, t.classeskind, t.classesname from mm_paycontr_tc t, mm_abc where t.isvalid=? ";
        //String sql = "select t.subcompany, t.classescode, t.classeskind, t.classesname from mm_paycontr_tc t  inner join mm_abc x on t.a = x.b where t.isvalid=? ";


        List<SQLStatement> stmtList = SQLUtils.parseStatements(sql, dbType);
        System.out.println(stmtList);

        SQLStatementParser parser = new MySqlStatementParser(sql);
        // 使用Parser解析生成AST，这里SQLStatement就是AST
        SQLSelectStatement selectStatement = (SQLSelectStatement) parser.parseStatement();
        // 取出SELECT 信息
        SQLSelect select = selectStatement.getSelect();
        SQLSelectQuery sqlSelectQuery = select.getQuery();


        // 如果是查询语句块
        SQLSelectQueryBlock sqlSelectQueryBlock = (SQLSelectQueryBlock) sqlSelectQuery;
        // 获取 from 和 where 里包含的东西
        SQLTableSource from = sqlSelectQueryBlock.getFrom();
        // 如果是表名（已到终点）
        //SQLExpr expr = ((SQLExprTableSource) from).getExpr();
        if (from instanceof SQLExprTableSource) {
            // 如果是表名（已到终点）
            SQLExpr expr = ((SQLExprTableSource) from).getExpr();
            if (expr instanceof SQLIdentifierExpr) {
                SQLIdentifierExpr sqlIdentifierExpr = (SQLIdentifierExpr) expr;
                String lowerName = sqlIdentifierExpr.getLowerName();
                // 如果是指定的表名
                System.out.println("----lowerName----" + lowerName);
            }


        }else if (from instanceof SQLJoinTableSource) {
            SQLTableSource left = ((SQLJoinTableSource) from).getLeft();
            SQLTableSource right = ((SQLJoinTableSource) from).getRight();
            System.out.println("----------left ----------" + left );
            System.out.println("----------right----------" + right);
        }
        System.out.println("--------------------" );
        System.out.println("--------------------" + from.getAlias());
        SQLExpr where = sqlSelectQueryBlock.getWhere();
        System.out.println("--------------------"+where.getChildren());
        System.out.println("--------------------");
        // 分析 select 语句
        //getTable(sqlSelectQuery);
        //System.out.println(select.toString())
        //String lastSql = SQLUtils.toSQLString(stmtList, dbType);
    }



    private void setFilterTable(SQLSelectQueryBlock sqlSelectQueryBlock){
        // 获取表
        SQLTableSource table = sqlSelectQueryBlock.getFrom();
        // 普通单表
        if (table instanceof SQLExprTableSource) {
            // 处理---------------------


            // join多表
        } else if (table instanceof SQLJoinTableSource) {
            // 处理---------------------


            // 子查询作为表
        } else if (table instanceof SQLSubqueryTableSource) {
            // 处理---------------------


        }
    }
}
