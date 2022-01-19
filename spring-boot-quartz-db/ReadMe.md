 
 
#### Quartz 持久化配置

---------------------

数据库表说明

| Tables_in_quartz         | 表说明                          |
|--------------------------|--------------------------------|
| qrtz_blob_triggers       |## blog类型存储triggers           |
| qrtz_calendars           |## 以blog类型存储Calendar信息      |
| qrtz_cron_triggers       |## 存储cron trigger信息           |
| qrtz_fired_triggers      |## 存储已触发的 trigger相关信息     |
| qrtz_job_details         |## 存储每一个已配置的job details    |
| qrtz_locks               |## 存储悲观锁的信息                 |
| qrtz_paused_trigger_grps |## 存储已暂停的trigger 组信息       |
| qrtz_scheduler_state     |## 存储Scheduler状态信息           |
| qrtz_simple_triggers     |## 存储simple trigger信息         |
| qrtz_simprop_triggers    |## 存储其他几种trigger信息         |
| qrtz_triggers            |## 存储已配置的trigger信息         |

二、Quartz的触发时间的配置的三种方式：

2.1.cron 方式：采用cronExpression表达式配置时间。

2.2.simple 方式：和JavaTimer差不多，可以指定一个开始时间和结束时间外加一个循环时间。

2.3.calendars 方式：可以和cron配合使用，用cron表达式指定一个触发时间规律，用calendar指定一个范围。


注意：cron方式需要用到的4张数据表：

- qrtz_triggers
- qrtz_cron_triggers
- qrtz_fired_triggers
- qrtz_job_details

POM.XML

```xml
 <dependencies>
        <!-- 实现对 Spring MVC 的自动化配置 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <!-- 实现对 Quartz 的自动化配置 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-quartz</artifactId>
        </dependency>

        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
        <!-- 实现对数据库连接池的自动化配置 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-jdbc</artifactId>
        </dependency>
</dependencies>
```

YAML 配置

```yaml
spring:
  datasource:
    user: # 应用数据源
      url: jdbc:mysql://127.0.0.1:3306/db_quartz_zxc?serverTimezone=GMT%2b8&useSSL=false&Unicode=true&characterEncoding=utf8&autoReconnectForPools=true&allowMultiQueries=true&rewriteBatchedStatements=true
      driver-class-name: com.mysql.jdbc.Driver
      username: root
      password: 123456
    quartz: # 定时任务数据源
      #driver-class-name: com.mysql.cj.jdbc.Driver
      driver-class-name: com.mysql.jdbc.Driver
      url: jdbc:mysql://localhost:3306/db_quartz_zxc?serverTimezone=GMT%2b8&useSSL=false&Unicode=true&characterEncoding=utf8&autoReconnectForPools=true&allowMultiQueries=true&rewriteBatchedStatements=true
      username: root
      password: 123456
  quartz:
    job-store-type: jdbc #  Job 存储器类型。默认为 memory 表示内存，可选 jdbc 使用数据库。
    scheduler-name: zxcScheduler # 相同 Scheduler 名字的节点，形成一个 Quartz 集群。默认为 schedulerName
    auto-startup: true # Quartz 是否自动启动
    startup-delay: 10 # 延迟 N 秒启动
    wait-for-jobs-to-complete-on-shutdown: true # 应用关闭时，是否等待定时任务执行完成。默认为 false ，建议设置为 true
    overwrite-existing-jobs: false # 是否覆盖已有 Job 的配置
    jdbc:
      initialize-schema: never # 是否自动使用 SQL 初始化 Quartz 表结构。这里设置成 never ，我们手动创建表结构。always 开发测试环境随便搞,每次会清除数据，生产使用never
    properties: #添加 Quartz Scheduler 附加属性，更多可以看 http://www.quartz-scheduler.org/documentation/2.4.0-SNAPSHOT/configuration.html 文档
      org:
        quartz:
          # JobStore 相关配置
          jobStore:
            dataSource: quartzDataSource # 使用的数据源
            class: org.quartz.impl.jdbcjobstore.JobStoreTX # JobStore 实现类
            driverDelegateClass: org.quartz.impl.jdbcjobstore.StdJDBCDelegate
            tablePrefix: QRTZ_ # Quartz 表前缀
            isClustered: true # 是集群模式
            clusterCheckinInterval: 1000
            useProperties: false
          # 线程池相关配置
          threadPool:
            threadCount: 25 # 线程池大小。默认为 10 。
            threadPriority: 5 # 线程优先级
            class: org.quartz.simpl.SimpleThreadPool # 线程池类型
```

#### 注意

首次执行需要使用代码，持久化到数据库之后，可以注释代码，自动加载数据库的定时







 
 参考https://www.cnblogs.com/summerday152/p/14193968.html
 
 quartz 数据库表分析 https://blog.csdn.net/xiaoniu_888/article/details/83181078