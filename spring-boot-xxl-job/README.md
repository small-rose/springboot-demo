 

### xxl-Job

--------------

官方文档：https://www.xuxueli.com/xxl-job/

调度中心

（1）下载源码，修改数据库配置




执行器开发的基本步骤

(1)引包

```xml
        <dependency>
            <groupId>com.xuxueli</groupId>
            <artifactId>xxl-job-core</artifactId>
            <version>2.3.0</version>
        </dependency>
```

(2) 配置

```YAML
xxl:
  job:
    admin:
      addresses: http://127.0.0.1:8080/xxl-job-admin  # 调度中心注册地址
      #addresses: http://10.72.2.10:9999/xxl-job-admin
    accessToken: ""
    executor:
      appname: small-rose-executor   # 本执行器的名字，名字相同是一个集群的
      address: ""
      ip: ""
      port: 9996
      logpath: /home/apps/logs/xxl-job/executors/log
      logretentiondays: 30   # 日志保留天数，大于7生效，-1 表示不清理日志

```

java 配置

```java
@Configuration
public class XxlJobConfig {
    @Bean
    public XxlJobSpringExecutor xxlJobExecutor() {
        logger.info(">>>>>>>>>>> xxl-job config init.");
        XxlJobSpringExecutor  xxlJobSpringExecutor = new XxlJobSpringExecutor();
        xxlJobSpringExecutor.setAdminAddresses(adminAddresses);
        xxlJobSpringExecutor.setAppname(appname);
        xxlJobSpringExecutor.setAddress(address);
        xxlJobSpringExecutor.setIp(ip);
        xxlJobSpringExecutor.setPort(port);
        xxlJobSpringExecutor.setAccessToken(accessToken);
        xxlJobSpringExecutor.setLogPath(logPath);
        xxlJobSpringExecutor.setLogRetentionDays(logRetentionDays);

        return xxlJobSpringExecutor;
    }
}
```

(3)执行业务开发

(3.1)基于类的开发，扩展 IJobHandler 类来实现

```java
@Component
public class DemoJob01Handler extends IJobHandler {

    @Autowired
    private DemoService demoService ;

    @Override
    public void execute() {

        demoService.demoWork01();
    }
}
```
然后手工注册一下

```java

```

(3.2)基于方法开发，使用  @XxlJob 注解调度任务方法


1、任务开发：在Spring Bean实例中，开发Job方法；
2、注解配置：为Job方法添加注解 "@XxlJob(value="自定义jobhandler名称", init = "JobHandler初始化方法", destroy = "JobHandler销毁方法")"，注解value值对应的是调度中心新建任务的JobHandler属性的值。
3、执行日志：需要通过 "XxlJobHelper.log" 打印执行日志；
4、任务结果：默认任务结果为 "成功" 状态，不需要主动设置；如有诉求，比如设置任务结果为失败，可以通过 "XxlJobHelper.handleFail/handleSuccess" 自主设置任务结果；

```java
public  class demoJob01 {

    // 可参考Sample示例执行器中的 "com.xxl.job.executor.service.jobhandler.SampleXxlJob" ，如下：
    @XxlJob("demoJobHandler")
    public void demoJobHandler() throws Exception {
        XxlJobHelper.log("XXL-JOB, Hello World.");
    }
}
```




(4) 在调度中心添加调度任务配置

运行模式选中 “BEAN模式”，JobHandler属性填写任务注解“@XxlJob”中定义的值；
