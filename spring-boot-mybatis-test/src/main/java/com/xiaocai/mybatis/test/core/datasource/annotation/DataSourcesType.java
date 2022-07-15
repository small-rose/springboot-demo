package com.xiaocai.mybatis.test.core.datasource.annotation;

/**
 * 数据源类型
 */
public enum DataSourcesType {

    MASTER("01", "主数据源"),

    SLAVE ("02", "读数据源"),

    BPJYOPR("03", "交易库"),

    BPTZOPR("04", "凭证台账库"),

    BPDZOPR("05", "报表对账库");

    private DataSourcesType(String value, String desc) {

    }

}
