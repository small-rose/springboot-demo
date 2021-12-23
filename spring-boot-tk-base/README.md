
## 说明

spring-boot-tkbase 工程是基于springboot的一个基础工程。

由SpringBoot + Mybatis + TK.Mybatis 组成主体结构，方便自动生成代码。

不知不觉内容在增加，大概列举一下：

## 自定义通用操作

同时，包中包含一条龙式的通用操作示例

- 通用TK的Mapper

- 通用支持CURD的Service

- 通用支持CURD的Controller

如果需要自定义，在自己对应的 XxxMapper/XxxService/XxxController 里直接写自定义的方法即可。

## TK.Mybatis 代码生成

参考 `generator/generatorConfig.xml`


## 增加自定义注解的

 
2、AOP方式

- AOP 拦截 完成自定义注解限制接口在时间窗口内的访问次数

- AOP 切面 完成自定义注解日志切面

 

