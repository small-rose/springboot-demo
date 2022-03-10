 

### Mybatis Generator 个性化使用

本工程实现的是补充了数据库表的自定义注释、

基于使用版本

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

使用时，引入个性化的依赖

```xml
                    <dependency>
                        <groupId>com.xiaocai</groupId>
                        <artifactId>small-rose-mybatis-generator</artifactId>
                        <version>1.0.0</version>
                    </dependency>
```

在 generatorConfig.xml 中引入注释组件

```xml
<context id="Mysql" targetRuntime="MyBatis3Simple" defaultModelType="flat">
 
        <!-- 自定义的注释规则，继承 DefaultCommentGenerator 重写 一些方法 -->
        <commentGenerator type="com.xiaocai.mybatis.generator.MyCommentGenerator">
            <!-- 是否去除自动生成日期的注释 true：是 ： false:否 -->
            <property name="suppressDate" value="true"/>
            <!-- 是否去除所有自动生成的注释 true：是 ： false:否 -->
            <property name="suppressAllComments" value="false"/>
            <property name="author" value="zzy"/>
        </commentGenerator>

</context>
```

其他配置省略