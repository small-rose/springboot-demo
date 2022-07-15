package com.xiaocai.mybatis.test.core.mybatis.plugin;


import com.xiaocai.mybatis.test.core.mybatis.support.PrivilegeMapping;
import com.xiaocai.mybatis.test.core.mybatis.support.PrivilegeMode;
import com.xiaocai.mybatis.test.core.mybatis.support.PrivilegeParam;
import com.xiaocai.mybatis.test.core.mybatis.support.PrivilegeParamHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 数据权限拦截器
 */
@Slf4j
@Intercepts({@Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class})})
public class DataPrivilegeInterceptor implements Interceptor {

    private static Pattern NUMBER_PATTERN = Pattern.compile("group\\s*by[\\w|\\W|\\s|\\S]*",Pattern.CASE_INSENSITIVE);


    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        Object[] args = invocation.getArgs();
        MappedStatement ms = (MappedStatement) args[0];
        Object parameter = args[1];
        RowBounds rowBounds = (RowBounds) args[2];
        ResultHandler<?> resultHandler = (ResultHandler<?>) args[3];
        Executor executor = (Executor) invocation.getTarget();
        CacheKey cacheKey;
        BoundSql boundSql;
        // query方法的不同入口
        if (args.length == 4) {
            boundSql = ms.getBoundSql(parameter);
            cacheKey = executor.createCacheKey(ms, parameter, rowBounds, boundSql);
        } else {
            //6个参数
            cacheKey = (CacheKey) args[4];
            boundSql = (BoundSql) args[5];
        }

        // 权限查询参数
        PrivilegeParam param = PrivilegeParamHelper.getPrivilegeParam();
        if (param == null) {
            return invocation.proceed();
        }
        // 获取表映射关系
        PrivilegeMapping mapping = getPrivilegeMapping(ms);
        if (mapping == null) {
            return invocation.proceed();
        }

        // 修改参数
        parameter = getParameterObject(ms, parameter, boundSql, cacheKey);

        // 修改sql
        BoundSql newBoundSql = getBoundSql(ms, parameter, boundSql, mapping);
        log.info("-- PrivilegeMapping SQL -- :" +newBoundSql.getSql());
        //执行修改后的sql
        return executor.query(ms, parameter, rowBounds, resultHandler, cacheKey, newBoundSql);
    }

    private BoundSql getBoundSql(MappedStatement ms, Object parameter, BoundSql boundSql, PrivilegeMapping mapping) {

        String newSql = "";
        PrivilegeParam param = PrivilegeParamHelper.getPrivilegeParam();
        // 判断数据权限使用的模式-zzy add
        if (PrivilegeMode.APPEND_CASE.equals(param.getMode())){
            newSql = getNewSqlAppend(boundSql.getSql(), mapping);
        }else {
            //默认使用追加模式
            newSql = getNewSql(boundSql.getSql(), mapping);
        }
        BoundSql newBoundSql = new BoundSql(ms.getConfiguration(), newSql, boundSql.getParameterMappings(), parameter);

        //设置动态参数
        Map<String, Object> additionalParameters = (Map<String, Object>) SystemMetaObject.forObject(boundSql).getValue("additionalParameters");
        additionalParameters.forEach(newBoundSql::setAdditionalParameter);

        return newBoundSql;
    }

    /**
     *  嵌套模式下-变子查询式拼接
     * @param sql
     * @param mapping
     * @return
     */
    private String getNewSql(String sql, PrivilegeMapping mapping) {
        StringBuilder sb = new StringBuilder();
        sb.append(" SELECT * FROM (").append(sql).append(") t ")
            .append(" WHERE (t.").append(mapping.colSubCompany())
            .append(", t.").append(mapping.colDepartmentCode()).append(") IN")
            .append(" (SELECT biz.subcompany, biz.departmentcode FROM MM_BIZPRIVILEGE_COVER_TD biz")
            .append(" WHERE 1=1");
        //根据查询条件
        PrivilegeParam param = PrivilegeParamHelper.getPrivilegeParam();
        if (param != null && param.getOpCode() != null) {
            sb.append(" AND biz.opcode = ?");
        }
        if (param != null && param.getPowerMark() != null) {
            sb.append(" AND biz.powermark ").append(param.getPowerMark());
        }
        sb.append(")");
        return sb.toString();
    }

    /**
     * 追加模式的 权限条件的拼接
     * @param sql
     * @param mapping
     * @return
     */
    private String getNewSqlAppend(String sql, PrivilegeMapping mapping) {
        Pattern p = NUMBER_PATTERN;
        Matcher m = p.matcher(sql);
        StringBuffer sb = new StringBuffer();
        if (m.find()) {
            m.appendReplacement(sb, "");
        } else {
            sb.append(sql);
        }
        //根据查询条件
        PrivilegeParam param = PrivilegeParamHelper.getPrivilegeParam();

        //拼接权限控制
        /** 原追加sql
        sb.append(" and  exists( select 1 from MM_BIZPRIVILEGE_COVER_TD biz where biz.opcode =  ").append(param.getOpCode());
        sb.append(" and biz.powermark ").append(param.getPowerMark());
        sb.append(" and biz.subcompany = ");
        sb.append(param.getTableAlis()).append(".subcompany");
        sb.append(" and biz.departmentcode= ");
        sb.append(param.getTableAlis()).append(".departmentcode)");
        */
        //zzy add  将 exists 更换成 in 条件  --20220531
        sb.append(" and ");
        sb.append(param.getTableAlis()).append(".subcompany, ");
        sb.append(param.getTableAlis()).append(".departmentcode");
        // 不管何种模式，使用业务权限表，一定有opcode，这里保留opcode占位符和默认模式保留一个opcode占位符 来实现处理参数方式一致。
        sb.append(" in ( select biz.subcompany, biz.departmentcode from MM_BIZPRIVILEGE_COVER_TD biz where biz.opcode = ? "); //.append(param.getOpCode());
        sb.append(" and biz.powermark ").append(param.getPowerMark());

        try {//拼接 group by 部分
            if (m.group() != null) {
                sb.append(" " + m.group());
            }
        } catch (RuntimeException e) {
            // TODO Auto-generated catch block
        }
        return sb.toString();
    }


    private PrivilegeMapping getPrivilegeMapping(MappedStatement ms) throws ClassNotFoundException {
        //xxx.xxx.xxx.XXMapper.method
        String methodId = ms.getId();
        String className = methodId.substring(0, methodId.lastIndexOf("."));
        String methodName = methodId.substring(methodId.lastIndexOf(".") + 1);

        Class<?> cl = Class.forName(className);
        Method[] methods = cl.getMethods();
        for(Method m : methods){
            // mybatis 的 mapper方法不支持重载，不存在重名
            if(m.getName().equals(methodName) && m.isAnnotationPresent(PrivilegeMapping.class)){
                return m.getAnnotation(PrivilegeMapping.class);
            }
        }
        return null;
    }

    /**
     * 处理参数
     * 参见 com.github.pagehelper.dialect.AbstractHelperDialect#getParameterObject
     */
    private Object getParameterObject(MappedStatement ms, Object parameterObject, BoundSql boundSql, CacheKey cacheKey) {

        Map<String, Object> paramMap;
        if (parameterObject == null) {
            paramMap = new HashMap<>();
        } else if (parameterObject instanceof Map) {
            paramMap = new HashMap<>();
            paramMap.putAll((Map) parameterObject);
        } else {
            paramMap = new HashMap<>();

            MetaObject metaObject = SystemMetaObject.forObject(parameterObject);
            boolean hasTypeHandler = ms.getConfiguration().getTypeHandlerRegistry().hasTypeHandler(parameterObject.getClass());
            if (!hasTypeHandler) {
                for (String name : metaObject.getGetterNames()) {
                    paramMap.put(name, metaObject.getValue(name));
                }
            }

            if (boundSql.getParameterMappings() != null) {
                for (ParameterMapping parameterMapping : boundSql.getParameterMappings()) {
                    String name = parameterMapping.getProperty();
                    if (paramMap.get(name) == null) {
                        if (hasTypeHandler
                                || parameterMapping.getJavaType().equals(parameterObject.getClass())) {
                            paramMap.put(name, parameterObject);
                            break;
                        }
                    }
                }
            }
        }

        return setParameter(ms, paramMap, boundSql, cacheKey);
    }

    private Object setParameter(MappedStatement ms, Map<String, Object> paramMap, BoundSql boundSql, CacheKey cacheKey) {

        PrivilegeParam param = PrivilegeParamHelper.getPrivilegeParam();
        if (param.getOpCode() != null) {
            paramMap.put("opcode", param.getOpCode());
            cacheKey.update(param.getOpCode());
        }
        /*
        zzy  comment  powermark 已经带上运算符，不使用参数赋值
        if (param.getPowerMark() != null) {
            paramMap.put("powermark", param.getPowerMark());
            cacheKey.update(param.getPowerMark());
        }
        */


        if (boundSql.getParameterMappings() != null) {
            List<ParameterMapping> newParameterMappings = new ArrayList<>(boundSql.getParameterMappings());
            //注意顺序与sql中占位符顺序一致
            if (param.getOpCode() != null) {
                newParameterMappings.add(new ParameterMapping.Builder(ms.getConfiguration(), "opcode", String.class).build());
            }
            /*
             zzy  comment  powermark 已经带上运算符，直接拼接。不使用占位符参数赋值
            if (param.getPowerMark() != null) {
                newParameterMappings.add(new ParameterMapping.Builder(ms.getConfiguration(), "powermark", String.class).build());
            }
            */
            MetaObject metaObject = SystemMetaObject.forObject(boundSql);
            metaObject.setValue("parameterMappings", newParameterMappings);
        }
        return paramMap;
    }
}
