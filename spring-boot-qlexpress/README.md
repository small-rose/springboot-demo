# Getting Started



**调用入参**

对于runner.execute执行方法的参数入参说明

```
/**
 * 执行一段文本
 * @param expressString 程序文本
 * @param context 执行上下文，可以扩展为包含ApplicationContext
 * @param errorList 输出的错误信息List
 * @param isCache 是否使用Cache中的指令集,建议为true
 * @param isTrace 是否输出详细的执行指令信息，建议为false
 * @param aLog 输出的log
 * @return
 * @throws Exception
 */
Object execute(String expressString, IExpressContext<String,Object> context,List<String> errorList, boolean isCache, boolean isTrace, Log aLog);

```


**function相关API**

```
//通过name获取function的定义
OperatorBase getFunciton(String name);

//通过自定义的Operator来实现类似：fun(a,b,c)
void addFunction(String name, OperatorBase op);
//fun(a,b,c) 绑定 object.function(a,b,c)对象方法
void addFunctionOfServiceMethod(String name, Object aServiceObject,
            String aFunctionName, Class<?>[] aParameterClassTypes,
            String errorInfo);
//fun(a,b,c) 绑定 Class.function(a,b,c)类方法
void addFunctionOfClassMethod(String name, String aClassName,
            String aFunctionName, Class<?>[] aParameterClassTypes,
            String errorInfo);
//给Class增加或者替换method，同时 支持a.fun(b) ，fun(a,b) 两种方法调用
//比如扩展String.class的isBlank方法:“abc”.isBlank()和isBlank("abc")都可以调用
void addFunctionAndClassMethod(String name,Class<?>bindingClass, OperatorBase op);
```

**Operator相关API**

提到脚本语言的操作符，优先级、运算的目数、覆盖原始的操作符(+,-,*,/等等)都是需要考虑的问题，QLExpress统统帮你搞定了。

```
//添加操作符号,可以设置优先级
void addOperator(String name,Operator op);
void addOperator(String name,String aRefOpername,Operator op);
    
//替换操作符处理
//比如将+替换成自定义的operator 见上面的例子
OperatorBase replaceOperator(String name,OperatorBase op);
    
//添加操作符和关键字的别名，比如 if..then..else -> 如果。。那么。。否则。。
//具体见上面的例子
void addOperatorWithAlias(String keyWordName, String realKeyWordName,
            String errorInfo);
```


**宏相关API**

QLExpress的宏定义比较简单，就是简单的用一个变量替换一段文本，和传统的函数替换有所区别。
见上面使用宏计算是否优秀的例子

```
//比如addMacro("天猫卖家","userDO.userTag &1024 ==1024")
void addMacro(String macroName,String express) 
```