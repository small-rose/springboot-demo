 

### 多数据源，动态切换配置

#### 准备工作：

1、创建2个schema: master和slave
2、分别执行建表脚本
3、分别插入对应的测试数据

对应的工程：spring-boot-mutil-dynamic-datasource

#### 主要步骤
- 1、添加自定义注解，通过注解指定数据源关键字
- 2、使用AOP解析对应的注解，获取数据源关键字
- 3、当进行访问时，将解析到的数据源关键字，首先通过 DynamicDataSourceContextHolder.setDataSourceType(dataSource.source().name());设置需要使用的数据源。DynamicDataSourceContextHolder 就是一个用来存储数据源信息的类，其中通过ThreadLocal来记录当前线程使用的数据源信息。 
- 4、DynamicDataSource类借助 Spring的AbstractRoutingDataSource类，通过determineCurrentLookupKey方法来获取数据源类型，如果没有对应的数据源则使用defaultTargetDataSource配置。 
- 5、springboot 默认开启事务的，因为数据源连接有缓存导致无法正常切换真正的连接，因此（借助参考2）使用 MultiDataSourceTransaction 类重写数据库连接操作，根据当前数据源来进行开启响应的数据源
- 6、注意、如果在一个事务中同时操作多个数据源，跨数据库使用事务需要使用分布式事务思维解决
- 7、使用测试类DynamicDsServiceTest 可以直接进行测试 



#### 遇到的问题：

配置多数据源启动是时候遇到循环依赖的问题

在启动类上面@SpringBootApplication注解后排除数据自动化配置可解决循环依赖问题，如下：
```java
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = {"com.xiaocai.demo.dynamic.mapper"})
public class MutilDynamicDatasourceApp {

    public static void main(String[] args) {
        SpringApplication.run(MutilDynamicDatasourceApp.class, args);
    }

}
```


#### 参考与感谢


参考1 ：https://www.cnblogs.com/fuzongle/p/13335304.html

参考2 ：https://www.itdaan.com/blog/2018/02/26/3240547e0ae1152944efb10ae2b5371c.html
 