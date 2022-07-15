package com.xiaocai.mybatis.test.core.datasource;

import com.xiaocai.mybatis.test.core.datasource.annotation.DataSourcesType;
import lombok.extern.slf4j.Slf4j;

/**
 * 在ThreadLocal中保存当前线程需要使用的String。
 * 
 * @see {@link DynamicRoutingDataSource}
 */
@Slf4j
public class DataSourceContextHolder {
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	public static void setDataSource(String dataSourceType) {
		contextHolder.set(dataSourceType);

	}


	
	public static String getDataSource() {
		String dbtype =  contextHolder.get();
		if(dbtype == null ){//获取默认数据源
			dbtype = getDefaultDataSource();
		}
		return dbtype;
	}
	
	public static String getDefaultDataSource() {
		//获取默认数据源
		return DataSourcesType.MASTER.name();
	}

	public static void removeDataSourceType() {
		contextHolder.remove();
	}
}
