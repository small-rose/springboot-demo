package com.xiaocai.mybatis.test.core.mybatis.support;

public class ExecutorSwitchHelper {

    private static final ThreadLocal<Boolean> NO_EXECUTE = new ThreadLocal<>();

    private static final ThreadLocal<String> SQL = new ThreadLocal<>();

    public static void setNoExecute(){
        NO_EXECUTE.set(Boolean.TRUE);
    }
    public static boolean noExecute(){
        return Boolean.TRUE.equals(NO_EXECUTE.get());
    }

    public static void clearNoExecute(){
        NO_EXECUTE.remove();
    }

    public static void setSQL(String sql){
        SQL.set(sql);
    }

    public static void clearSQL(){
        SQL.remove();
    }

    public static String getSQL(){
        return SQL.get();
    }

}
