package com.xiaocai.mybatis.test.core.mybatis.support;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/5/31 14:34
 * @version: v1.0
 */
public enum  PrivilegeMode {
    /**
     * 数据权限模式:
     *      一种是在正常的SQL外包包裹一层查询，并带上相关数据权限查询条件，称之为嵌套模式 NESTED_CASE（默认使用的模式）
     *      另一种是在正常的SQL后面追加 and 相关的数据权限查询条件，称之为追加模式 APPEND_CASE
     * @return
     */
    NESTED_CASE("SQL数据权限嵌套模式"),
    APPEND_CASE("SQL数据权限追加模式");

    private String desc ;

    PrivilegeMode(String desc) {
        this.desc = desc ;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
