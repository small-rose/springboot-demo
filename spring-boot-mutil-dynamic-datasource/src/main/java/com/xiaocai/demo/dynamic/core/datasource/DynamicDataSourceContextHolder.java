package com.xiaocai.demo.dynamic.core.datasource;

import com.xiaocai.demo.dynamic.common.enums.DataSourcesType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/3/12 15:20
 * @version: v1.0
 */
public class DynamicDataSourceContextHolder {

    public static final Logger log = LoggerFactory.getLogger(DynamicDataSourceContextHolder.class);

    /**
     *此类提供线程局部变量。这些变量不同于它们的正常对应关系是每个线程访问一个线程(通过get、set方法),有自己的独立初始化变量的副本。
     */
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    /**
     * 设置当前线程的数据源变量
     */
    public static void setDataSourceType(String dataSourceType) {
        log.info("已切换到{}数据源", dataSourceType);
        contextHolder.set(dataSourceType);
    }

    /**
     * 获取当前线程的数据源变量
     */
    public static String getDataSourceType() {
        String key = contextHolder.get();
        return  key ==null ? DataSourcesType.MASTER.name() : key;
    }

    /**
     * 删除与当前线程绑定的数据源变量
     */
    public static void removeDataSourceType() {
        //log.info("移除{}数据源", getDataSourceType());
        if (!DataSourcesType.MASTER.name().equals(getDataSourceType())) {
            contextHolder.remove();
        }

    }

}
