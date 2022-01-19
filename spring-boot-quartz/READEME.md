 
 ### QUARTZ

 -----------
 
1、动态操作定时任务增删改查
 
 - 建表 mm_batch_task_td （jpa操作可省）
 - JPA 操作表 mm_batch_task_td。
 - QuartzFactory反射调对应定时Job的bean
 - restful接口。参考 JobTaskController
 - 启动加载表里的任务。参考JobSchedule
 
2、memory 定时的配置
  
  - yaml 配置,相当于quartz.properties
  - java 配置,QuartzConfig
  
3、Job的实现方式
 
 - 继承 QuartzJobBean 类。 参考 FirstJob
 - 实现 Job 接口。参考 SecondJob
 
 
4、Job配置调度方式
 
 - SimpleScheduleBuilder 参考 FirstJobConfig
 - CronScheduleBuilder   参考 SecondJobConfig
 
(5) swagger 简单使用