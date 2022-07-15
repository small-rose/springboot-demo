package com.xiaocai.mybatis.test.core.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态路由DataSource，根据在ThreadLocal中设置的DataSourceType动态取得不同的数据源。
 * 
 */
public class DynamicRoutingDataSource extends AbstractRoutingDataSource {

	public static  DynamicRoutingDataSource build() {
		return new DynamicRoutingDataSource();
	}

	@Override
	protected Object determineCurrentLookupKey() {
		return DataSourceContextHolder.getDataSource();
	}
}
