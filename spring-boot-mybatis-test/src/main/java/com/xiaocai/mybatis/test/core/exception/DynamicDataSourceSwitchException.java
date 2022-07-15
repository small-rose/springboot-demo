package com.xiaocai.mybatis.test.core.exception;

/**
 * 动态数据源切换异常
 */
public class DynamicDataSourceSwitchException extends RuntimeException {
	public DynamicDataSourceSwitchException() {
	}

	public DynamicDataSourceSwitchException(String message) {
		super(message);
	}

	public DynamicDataSourceSwitchException(String message, Throwable cause) {
		super(message, cause);
	}

	public DynamicDataSourceSwitchException(Throwable cause) {
		super(cause);
	}
}
