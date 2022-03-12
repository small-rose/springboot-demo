 

### Mybatis Generator 个性化使用

本工程实现的是补充了数据库表的自定义注释

使用版本

spring-boot 2.2.2.REALEASE

 ```xml
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.2.2.RELEASE</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
```

mybatis-Generator

```xml
        <!-- mybatis生成 jar包 -->
        <dependency>
            <groupId>org.mybatis.generator</groupId>
            <artifactId>mybatis-generator-core</artifactId>
            <version>1.3.7</version>
        </dependency>
```

实现参考 https://www.cnblogs.com/zhian/p/15243796.html

参考2 https://github.com/supergaga/generator