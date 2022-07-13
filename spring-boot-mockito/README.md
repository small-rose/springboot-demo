
## mockito 单元测试框架

- @InjectMocks
- @Spy
- @Mock



## Jmockdata

Jmockdta是一款实现模拟JAVA类型或对象的实例化并随机初始化对象的数据的工具框架。单元测试的利器。
The plug-in of Jmockdata what through random algorithm mock java data.
Jmockdata插件通过随机算法模拟Java数据.

具体介绍和用法可以参考如下：

模拟数据入口方法 JMockData.mock(JmockDataWrapper)
被模拟数据必须继承JmockDataWrapper经过它的包装
被模拟的数据最好是plain bean,只提供getter,setter,has,is方法的才可以被模拟

框架默认实现了40个元数据类型的数据模拟器包括：

        short.class,Short.class,short[].class,Short[].class,  
        int.class,Integer.class,int[].class,Integer[].class,  
        long.class,Long.class,long[].class,Long[].class,  
        float.class,Float.class,float[].class,Float[].class,  
        double.class,Double.class,double[].class,Double[].class,  
        boolean.class,Boolean.class,boolean[].class,Boolean[].class,  
        char.class,Character.class,char[].class,Character[].class,  
        String.class,String[].class,  
        BigDecimal.class,BigDecimal[].class,  
        BigInteger.class,BigInteger[].class,  
        Date.class,Date[].class

通过对以上基本元数据类型的模拟实现，能够进一步实现BEAN，LIST,SET,ARRAY等结构的模拟。
- 可以通过JmockDataContext 获取模拟过程的所有上下文信息，甚至可以打印整个模拟类型树
- 可以通过JMockDataManager 注册模拟数据类型，重写模拟数据算法，注册模拟数据类拦截器等
- 可以通过实现MockData来实现一个模拟数据类型
- 可以通过实现JmockDataTemplate，或者继承JmockDataTemplateDefault来重写模拟数据算法
- 可以通过实现JmockDataInterceptor来实现一个拦截器

相关地址：

- 源码地址：https://github.com/jsonzou/jmockdata
- 示例参考：https://github.com/jsonzou/jmockdata-demo

传统项目下载包： https://github.com/jsonzou/jmockdata/releases

Maven 依赖

```xml
  <dependency>
     <groupId>com.github.jsonzou</groupId>
     <artifactId>jmockdata</artifactId>
     <version>4.3.0</version>
   </dependency>
```


## Java Faker

Maven 依赖

```xml
<dependency>
    <groupId>com.github.javafaker</groupId>
    <artifactId>javafaker</artifactId>
    <version>1.0.2</version>
</dependency>
```

