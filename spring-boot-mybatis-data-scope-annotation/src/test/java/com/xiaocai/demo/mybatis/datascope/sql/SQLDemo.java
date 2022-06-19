package com.xiaocai.demo.mybatis.datascope.sql;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLExpr;
import org.junit.Test;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/4/18 15:24
 * @version: v1.0
 */
public class SQLDemo {

    @Test
    public void demo(){
        String sql = "select t.subcompany, t.classescode, t.classeskind, t.classesname from mm_paycontr_tc t where t.isvalid=? ";
        SQLExpr sqlExpr = SQLUtils.toSQLExpr(sql);
        System.out.println("---sqlExpr---" + sqlExpr.getAttributes());
    }
}
