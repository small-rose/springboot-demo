package com.xiaocai.demo.mybatis.datascope.sql;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLExpr;
import com.alibaba.druid.sql.ast.SQLObject;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.expr.*;
import com.alibaba.druid.sql.ast.statement.*;
import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSelectQueryBlock;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlASTVisitorAdapter;
import com.alibaba.druid.util.JdbcConstants;
import lombok.Getter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/4/18 15:30
 * @version: v1.0
 */
@Getter
public class TestVisitor extends MySqlASTVisitorAdapter {

    private final List<String> tableNameList = new ArrayList<>();

    /**
     * visit的返回值代表访问器是否还需要继续向下遍历，
     * 若返回值为false则访问器将停止于此visit方法。
     * @param x
     * @return
     */
    @Override
    public boolean visit(SQLSelectStatement x) {
        System.out.println("SQLSelectStatement");
        //x.accept(this);
        return super.visit(x);
    }

    @Override
    public boolean visit(SQLSelect x) {
        System.out.println("SQLSelect");
        //x.accept(this);
        return super.visit(x);
    }

    @Override
    public boolean visit(MySqlSelectQueryBlock x) {
        System.out.println("MySqlSelectQueryBlock");
        //x.accept(this);
        return super.visit(x);
    }

    @Override
    public boolean visit(SQLSelectItem x) {
        System.out.println("SQLSelectItem");
        //x.accept(this);
        return super.visit(x);

    }

    @Override
    public boolean visit(SQLExprTableSource x) {
        System.out.println("SQLExprTableSource");
        tableNameList.add(x.getName().getSimpleName());
        SQLExpr sqlExpr = new SQLBinaryOpExpr();
        x.setAlias("t");
        x.setExpr("aaaaaa");
        //x.accept(this);
        return super.visit(x);
    }

    @Override
    public boolean visit(SQLBinaryOpExpr x) {
        System.out.println("SQLBinaryOpExpr");
        //x.accept(this);
        List children = x.getChildren();
        SQLExpr left = new SQLVariantRefExpr( "abc");
        SQLExpr right = new SQLCharExpr("1234", x);
        children.add(new SQLBinaryOpExpr(left, SQLBinaryOperator.Equality, right ));
        System.out.println(children);
        return super.visit(x);
    }

    @Override
    public boolean visit(SQLAllColumnExpr x) {
        System.out.println("SQLAllColumnExpr");
        //x.accept(this);
        return super.visit(x);
    }

    @Override
    public boolean visit(SQLIdentifierExpr x) {
        System.out.println("SQLIdentifierExpr");
        System.out.println("simple name : " + x.getSimpleName());
        //x.accept(this);

        List<SQLObject> attributes = x.getChildren();
        System.out.println(attributes);
        SQLTableSource source = new SQLExprTableSource();
        source.setAlias(" N");

        SQLExpr left = new SQLPropertyExpr(x.getSimpleName(), "abc");
        SQLExpr right = new SQLCharExpr("1234", x);

        SQLExpr expr = new SQLBinaryOpExpr(left, SQLBinaryOperator.Equality, right);
        source.setParent(expr);
        x.setParent(source);
        return super.visit(x);
    }

    @Override
    public boolean visit(SQLCharExpr x) {
        System.out.println("SQLCharExpr");
        //x.accept(this);
        return super.visit(x);
    }


    @Test
    public void testSql() {
        TestVisitor testVisitor = new TestVisitor();
        String sql = "select * from test where name = 'maple' ";
        List<SQLStatement> sqlStatements = SQLUtils.parseStatements(sql, JdbcConstants.MYSQL);
        for (SQLStatement sqlStatement : sqlStatements){
            sqlStatement.accept(testVisitor);
        }
        String sqlString = SQLUtils.toSQLString(sqlStatements, JdbcConstants.MYSQL);
        System.out.println("-----------------------------------");
        System.out.println(sqlString);
    }
}
