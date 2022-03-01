# 说明

##  版本

基于spingBoot 2.2.2.release 


# Mybatis 分页比较






|          | 数组分页                             | SQL分页                        | 拦截器分页                            | RowBound                               |
| -------- | ------------------------------------ | ------------------------------ | ------------------------------------- | -------------------------------------- |
| 分页方式 | 逻辑分页                             | 物理分页                       | 物理分页                              | 逻辑分页                               |
| 优       | 对查询结果集进行分页，编码简单       | 只差分页结果<br/>与SQL方言绑定 | 只差分页结果<br/>常用插件多，使用简单 | ResultSet结果集进行分页，编码简单      |
| 劣       | 需要查全部数据集<br />大数据量不实用 |                                | 依赖第三方                            | 需要查全部数据集<br />大数据量相对较慢 |



## 数组分页

查询出全部数据，然后再list中截取需要的部分。



mybatis接口

```
List<Student> queryStudentsByArray();
```

xml配置文件

```xml
 <select id="queryStudentsByArray"  resultMap="studentmapper">
        select * from student
 </select>
```

service

```java
接口
List<Student> queryStudentsByArray(int currPage, int pageSize);
实现接口
 @Override
    public List<Student> queryStudentsByArray(int currPage, int pageSize) {
        //查询全部数据
        List<Student> students = studentMapper.queryStudentsByArray();
        //从第几条数据开始
        int firstIndex = (currPage - 1) * pageSize;
        //到第几条数据结束
        int lastIndex = currPage * pageSize;
        return students.subList(firstIndex, lastIndex); //直接在list中截取
    }
```

controller

```java
    @ResponseBody
    @RequestMapping("/student/array/{currPage}/{pageSize}")
    public List<Student> getStudentByArray(@PathVariable("currPage") int currPage, @PathVariable("pageSize") int pageSize) {
        List<Student> student = StuServiceIml.queryStudentsByArray(currPage, pageSize);
        return student;
    }
```



## sql分页

mybatis接口

```
List<Student> queryStudentsBySql(Map<String,Object> data);
```

xml文件

```
<select id="queryStudentsBySql" parameterType="map" resultMap="studentmapper">
        select * from student limit #{currIndex} , #{pageSize}
</select>
```

service

```
接口
List<Student> queryStudentsBySql(int currPage, int pageSize);
实现类
public List<Student> queryStudentsBySql(int currPage, int pageSize) {
        Map<String, Object> data = new HashedMap();
        data.put("currIndex", (currPage-1)*pageSize);
        data.put("pageSize", pageSize);
        return studentMapper.queryStudentsBySql(data);
    }
```

## 拦截器分页

创建拦截器，拦截mybatis接口方法id以ByPage结束的语句

```java
package com.autumn.interceptor;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.sql.Connection;
import java.util.Map;
import java.util.Properties;

/**
 * @Intercepts 说明是一个拦截器
 * @Signature 拦截器的签名
 * type 拦截的类型 四大对象之一( Executor,ResultSetHandler,ParameterHandler,StatementHandler)
 * method 拦截的方法
 * args 参数,高版本需要加个Integer.class参数,不然会报错
 */
@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class})})
public class MyPageInterceptor implements Interceptor {

    //每页显示的条目数
    private int pageSize;
    //当前现实的页数
    private int currPage;
    //数据库类型
    private String dbType;


    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        //获取StatementHandler，默认是RoutingStatementHandler
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        //获取statementHandler包装类
        MetaObject MetaObjectHandler = SystemMetaObject.forObject(statementHandler);

        //分离代理对象链
        while (MetaObjectHandler.hasGetter("h")) {
            Object obj = MetaObjectHandler.getValue("h");
            MetaObjectHandler = SystemMetaObject.forObject(obj);
        }

        while (MetaObjectHandler.hasGetter("target")) {
            Object obj = MetaObjectHandler.getValue("target");
            MetaObjectHandler = SystemMetaObject.forObject(obj);
        }

        //获取连接对象
        //Connection connection = (Connection) invocation.getArgs()[0];


        //object.getValue("delegate");  获取StatementHandler的实现类

        //获取查询接口映射的相关信息
        MappedStatement mappedStatement = (MappedStatement) MetaObjectHandler.getValue("delegate.mappedStatement");
        String mapId = mappedStatement.getId();

        //statementHandler.getBoundSql().getParameterObject();

        //拦截以.ByPage结尾的请求，分页功能的统一实现
        if (mapId.matches(".+ByPage$")) {
            //获取进行数据库操作时管理参数的handler
            ParameterHandler parameterHandler = (ParameterHandler) MetaObjectHandler.getValue("delegate.parameterHandler");
            //获取请求时的参数
            Map<String, Object> paraObject = (Map<String, Object>) parameterHandler.getParameterObject();
            //也可以这样获取
            //paraObject = (Map<String, Object>) statementHandler.getBoundSql().getParameterObject();

            //参数名称和在service中设置到map中的名称一致
            currPage = (int) paraObject.get("currPage");
            pageSize = (int) paraObject.get("pageSize");

            String sql = (String) MetaObjectHandler.getValue("delegate.boundSql.sql");
            //也可以通过statementHandler直接获取
            //sql = statementHandler.getBoundSql().getSql();

            //构建分页功能的sql语句
            String limitSql;
            sql = sql.trim();
            limitSql = sql + " limit " + (currPage - 1) * pageSize + "," + pageSize;

            //将构建完成的分页sql语句赋值个体'delegate.boundSql.sql'，偷天换日
            MetaObjectHandler.setValue("delegate.boundSql.sql", limitSql);
        }
        //调用原对象的方法，进入责任链的下一级
        return invocation.proceed();
    }


    //获取代理对象
    @Override
    public Object plugin(Object o) {
        //生成object对象的动态代理对象
        return Plugin.wrap(o, this);
    }

    //设置代理对象的参数
    @Override
    public void setProperties(Properties properties) {
        //如果项目中分页的pageSize是统一的，也可以在这里统一配置和获取，这样就不用每次请求都传递pageSize参数了。参数是在配置拦截器时配置的。
        String limit1 = properties.getProperty("limit", "10");
        this.pageSize = Integer.valueOf(limit1);
        this.dbType = properties.getProperty("dbType", "mysql");
    }
}
```

配置文件SqlMapConfig.xml

```xml
<configuration>

    <plugins>
        <plugin interceptor="com.autumn.interceptor.MyPageInterceptor">
            <property name="limit" value="10"/>
            <property name="dbType" value="mysql"/>
        </plugin>
    </plugins>

</configuration>
```

mybatis配置

mapper接口

```java
<!--接口-->
List<AccountExt> getAllBookByPage(@Param("currPage")Integer pageNo,@Param("pageSize")Integer pageSize);
```

xml查询

```xml

<!--xml配置文件-->
  <sql id="getAllBooksql" >
    acc.id, acc.cateCode, cate_name, user_id,u.name as user_name, money, remark, time
  </sql>
  <select id="getAllBook" resultType="com.autumn.pojo.AccountExt" >
    select
    <include refid="getAllBooksql" />
    from account as acc
  </select>
```

service

```
    public List<AccountExt> getAllBookByPage(String pageNo,String pageSize) {
        return accountMapper.getAllBookByPage(Integer.parseInt(pageNo),Integer.parseInt(pageSize));
    }
```

controller

```
    @RequestMapping("/getAllBook")
    @ResponseBody
    public Page getAllBook(String pageNo,String pageSize,HttpServletRequest request,HttpServletResponse response){
        pageNo=pageNo==null?"1":pageNo;   //当前页码
        pageSize=pageSize==null?"5":pageSize;   //页面大小
        //获取当前页数据
        List<AccountExt> list = bookService.getAllBookByPage(pageNo,pageSize);
        //获取总数据大小
        int totals = bookService.getAllBook();
        //封装返回结果
        Page page = new Page();
        page.setTotal(totals+"");
        page.setRows(list);
        return page;
    }
```

Page实体类

```
package com.autumn.pojo;

import java.util.List;

/**
 * Created by Autumn on 2018/6/21.
 */
public class Page {
    private String pageNo = null;
    private String pageSize = null;
    private String total = null;
    private List rows = null;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

}
```

前端

bootstrap-table接受数据格式

```
{
  "total": 3,
  "rows": [
    {
      "id": 0,
      "name": "Item 0",
      "price": "$0"
    },
    {
      "id": 1,
      "name": "Item 1",
      "price": "$1"
    }
  ]
}
```

boostrap-table用法

```
        var $table = $('#table');
        $table.bootstrapTable({
        url: "/${appName}/manager/bookController/getAllBook",
        method: 'post',
        contentType: "application/x-www-form-urlencoded",
        dataType: "json",
        pagination: true, //分页
        sidePagination: "server", //服务端处理分页
        pageList: [5, 10, 25],
        pageSize: 5,
        pageNumber:1,
        //toolbar:"#tb",
        singleSelect: false,
        queryParamsType : "limit",
        queryParams: function queryParams(params) {   //设置查询参数
          var param = {
            pageNo: params.offset/params.limit+1,  //offset为数据开始索引,转换为显示当前页
            pageSize: params.limit  //页面大小
          };
          console.info(params);   //查看参数是什么
          console.info(param);   //查看自定义的参数
          return param;
        },
        cache: false,
        //data-locale: "zh-CN", //表格汉化
        //search: true, //显示搜索框
        columns: [
                {
                    checkbox: true
                },
                {
                    title: '消费类型',
                    field: 'cate_name',
                    valign: 'middle'
                },
                {
                    title: '消费金额',
                    field: 'money',
                    valign: 'middle',
                    formatter:function(value,row,index){
                        if(!isNaN(value)){   //是数字
                            return value/100;
                        }
                    }
                },
                {
                    title: '备注',
                    field: 'remark',
                    valign: 'middle'
                },
                {
                    title: '消费时间',
                    field: 'time',
                    valign: 'middle'
                },
                {
                    title: '操作',
                    field: '',
                    formatter:function(value,row,index){
                        var f = '<a href="#" class="btn btn-gmtx-define1" onclick="delBook(\''+ row.id +'\')">删除</a> ';
                        return f;
                       }
                }
            ]
          });
      });
```

## RowBounds分页

数据量小时，RowBounds不失为一种好办法。但是数据量大时，实现拦截器就很有必要了。

mybatis接口加入RowBounds参数

public List<UserBean> queryUsersByPage(String userName, RowBounds rowBounds);

service

```
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.SUPPORTS)
    public List<RoleBean> queryRolesByPage(String roleName, int start, int limit) {
        return roleDao.queryRolesByPage(roleName, new RowBounds(start, limit));
    }
```

​    