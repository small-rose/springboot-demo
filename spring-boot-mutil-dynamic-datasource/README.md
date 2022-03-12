 

### 多数据源，动态切换配置

#### 准备工作：

1、创建2个schema: master和slave
2、分别执行建表脚本
3、分别插入对应的测试数据

对应的工程：spring-boot-mutil-dynamic-datasource

#### 主要步骤
- 1、添加自定义注解，通过注解指定数据源关键字
- 2、使用AOP解析对应的注解，获取数据源关键字
- 3、当进行访问时，将解析到的数据源关键字，首先通过 DynamicDataSourceContextHolder.setDataSourceType(dataSource.source().name());设置需要使用的数据源。DynamicDataSourceContextHolder 就是一个用来存储数据源信息的类，其中通过ThreadLocal来记录当前线程使用的数据源信息。执行完毕对于非主数据源会移除。 
- 4、DynamicDataSource类借助 Spring的AbstractRoutingDataSource类，通过determineCurrentLookupKey方法来获取数据源类型，如果没有对应的数据源则使用defaultTargetDataSource配置。 
- 5、springboot 默认开启事务的，测试使用@Transactional发生了无法切换数据源的情况，因为事务的数据源连接有缓存导致无法正常切换真正的连接，因此（借助参考2）使用 MultiDataSourceTransaction 类重写数据库连接操作，根据当前数据源来进行开启响应的数据源。如果不使用事务或者将不同数据源的操作写在不同的service，可以去掉sqlSessionFactorys注入和数据库连接操作的重写。
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


#### 相关工程


多数据动态切换注解+AOP： spring-boot-mutil-dynamic-datasource

多数据源配置分包方式：spring-boot-mybatis-mutil-datasource


#### 相关实现方式

https://blog.csdn.net/Java6888/article/details/108730853

- 分包方式。分包的前提是在编写代码的时候，就已经知道当前业务模型需要用哪个数据源
- 参数化切换。  参数化切换数据源，意思是，业务侧需要根据当前业务参数，动态的切换到不同的数据源。
- 注解+AOP
- 动态添加


 ##### 分包方式

 mapper接口、xml文件，需要按照不同的数据源分包。在操作数据库时，根据需要在service类中注入dao层。

 优点

 实现起来简单，只需要编写数据源配置文件和配置类，mapper接口和xml文件注意分包即可。

 缺点

 很明显，如果后面要增加或删除数据源，不仅要修改数据源配置文件，还需要修改配置类。
 例如增加一个数据源，同时还需要新写一个该数据源的配置类，同时还要考虑新建mapper接口包、xml包等，没有实现 “热插拔” 效果。

 ##### 参数化切换

 参数化切换数据源，意思是，业务侧需要根据当前业务参数，动态的切换到不同的数据源。

 适合于在运行时才能确定用哪个数据源。需要手动执行切换数据源操作；

 无需分包，mapper和xml路径自由定义；

 增加数据源，无需修改java配置类，只需修改数据源配置文件即可。

 ##### 注解方式

  该方式利用注解+AOP思想，为需要切换数据源的方法标记自定义注解，注解属性指定数据源ID，然后利用AOP切面拦截注解标记的方法，在方法执行前，切换至相应数据源；在方法执行结束后，切换至默认数据源。

  需要注意的是，自定义切面的优先级需要高于@Transactional注解对应切面的优先级。

  否则，在自定义注解和@Transactional同时使用时，@Transactional切面会优先执行，切面在调用getConnection方法时，会去调用AbstractRoutingDataSource.determineCurrentLookupKey方法，此时获取到的是默认数据源master。这时@DataSource对应的切面即使再设置当前线程的数据源key，后面也不会再去调用determineCurrentLookupKey方法来切换数据源了。

 本质与参数化的方式相类似，区别是判断依据发生变化


 （1）生成当前线程数据源key

 （3）根据ID从数据源缓存池中获取数据源对象，并再次添加到backupTargetDataSources缓存池中；

 （4）threadLocal设置当前线程对应的数据源key；

 （5）在执行数据库操作前，spring会调用determineCurrentLookupKey方法获取key，然后根据key去数据源缓存池取出数据源，然后getConnection获取该数据源连接；

 （6）使用该数据源执行数据库操作；

 （7）释放缓存：threadLocal清理当前线程数据源信息、数据源缓存池清理当前线程数据源key和数据源对象。


  #####  动态添加方式


  项目里面只配置了1个默认的数据源，而具体运行时需要动态的添加新的数据源，非已配置好的静态的多数据源。

  例如需要去服务器实时读取数据源配置信息（非配置在本地），然后再执行数据库操作。

  除了第6步外，利用之前写好的代码就可以实现。

  思路是：

  （1）创建新数据源；

  （2）DynamicDataSource注册新数据源；

  （3）切换：设置当前线程数据源key；添加临时数据源；

  （4）数据库操作（必须在另一个service实现，否则无法控制事务）；

  （5）清理当前线程数据源key、清理临时数据源；

  （6）清理刚刚注册的数据源；

  （7）此时已返回至默认数据源。



  四种方式对比

| 分包方式 | 参数化切换 | 注解方式 | 动态添加方式 |
| -------- | ---------- | -------- | ------------ |
| 适用场景  | 编码时便知道用哪个数据源	运行时才能确定用哪个数据源  | 编码时便知道用哪个数据源  |  运行时动态添加新数据源  |
| 切换模式  | 自动  | 手动  | 自动  | 手动  |
| mapper路径  | 需要分包  | 无要求  | 无要求  | 无要求  |
| 增加数据源是否需要修改配置类  | 需要  | 不需要  | 不需要	  |  \    |
| 实现复杂度  | 简单  | 复杂  | 复杂  | 复杂  |