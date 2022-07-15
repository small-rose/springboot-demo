package com.xiaocai.mybatis.test.core.mybatis.support;

public abstract class PrivilegeParamHelper {

    private static final ThreadLocal<PrivilegeParam> LOCAL = new ThreadLocal<>();

    public static void setPrivilegeParam(PrivilegeParam param){
        LOCAL.set(param);
    }

    public static PrivilegeParam getPrivilegeParam(){
        return LOCAL.get();
    }

    public static void clear(){
        LOCAL.remove();
    }
}
