package com.xiaocai.demo.mybatis.datascope.interceptor;

import com.xiaocai.demo.mybatis.datascope.core.support.ExecutorSwitchHelper;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.ParameterMode;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 控制executor是否执行
 */
@Intercepts({@Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class})})
public class ExecutorSwitchInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        //正常执行
        if(!ExecutorSwitchHelper.noExecute()){
            return invocation.proceed();
        }

        Object[] args = invocation.getArgs();
        MappedStatement ms = (MappedStatement) args[0];
        Object parameter = args[1];
        BoundSql boundSql;
        // query方法的不同入口
        if (args.length == 4) {
            boundSql = ms.getBoundSql(parameter);
        } else {
            //6个参数
            boundSql = (BoundSql) args[5];
        }

        ExecutorSwitchHelper.setSQL(setParameters(boundSql, parameter, ms));

        return new ArrayList<>();
    }

    /**
     * 参考 org.apache.ibatis.scripting.defaults.DefaultParameterHandler
     */
    private String setParameters(BoundSql boundSql, Object parameterObject, MappedStatement ms) {
        List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
        if (parameterMappings != null) {
            StringBuilder sqlBuilder = new StringBuilder(boundSql.getSql());

            for (ParameterMapping parameterMapping : parameterMappings) {
                if (parameterMapping.getMode() != ParameterMode.OUT) {
                    Object value;
                    String propertyName = parameterMapping.getProperty();
                    if (boundSql.hasAdditionalParameter(propertyName)) {
                        value = boundSql.getAdditionalParameter(propertyName);
                    } else if (parameterObject == null) {
                        value = null;
                    } else if (ms.getConfiguration().getTypeHandlerRegistry().hasTypeHandler(parameterObject.getClass())) {
                        value = parameterObject;
                    } else {
                        MetaObject metaObject = ms.getConfiguration().newMetaObject(parameterObject);
                        value = metaObject.getValue(propertyName);
                    }

                    replaceParameter(sqlBuilder, value);
                }
            }
            return sqlBuilder.toString();
        }
        return null;
    }

    private void replaceParameter(StringBuilder sqlBuilder, Object value){
        int index = sqlBuilder.indexOf("?");
        if(index == -1){
            return;
        }
        sqlBuilder.replace(index, index + 1, format(value));
    }

    private String format(Object val){
        //TODO 兼容不同database
        if (val instanceof List<?>) {
            StringBuilder str = new StringBuilder();
            for(Object o : (List<?>)val){
                str.append(format(o)).append(",");
            }
            return str.substring(0, str.length() - 1);
        } else if (val instanceof Date) {
            DateFormatUtils.format((Date)val, "yyyy-MM-dd HH:mm:ss");
        } else if (val instanceof BigDecimal) {
            return ((BigDecimal) val).toPlainString();
        } else if (val instanceof String) {
            return "'" + val + "'";
        } else{
            return String.valueOf(val);
        }
        return null;
    }


}
