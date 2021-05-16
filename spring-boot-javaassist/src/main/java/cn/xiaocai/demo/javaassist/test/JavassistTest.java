package cn.xiaocai.demo.javaassist.test;
/**
 * @Copyright 源码阅读网 http://coderead.cn
 */

import javassist.*;
import javassist.expr.ExprEditor;
import javassist.expr.MethodCall;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.file.Files;

/**
 * @author 鲁班大叔
 * @date 2021
 */
public class JavassistTest {
    // 如果已toBytecode,不能在继续修改 ctClass
    @Test
    public void test1() throws Exception {
//        new HelloWorld();
        ClassPool pool = new ClassPool();//1. 类池 ，会缓存类，可能导致内存溢出
        // 1.jar 2.class目录  3.classLoader 4.jar 目录 5.字节数组 bytes[] 6.直接指定class
        pool.appendSystemPath();// 系统路径
//       pool.insertClassPath("/Users/tommy/git/coderead-bytecode/target/classes2");
//        CtClass ctClass = pool.get("coderead.bytecode.HelloWorld2");// 加载字节码 解析成ctClass
        CtClass ctClass = pool.get("coderead.bytecode.HelloWorld");// 加载字节码 解析成ctClass

        CtMethod method = ctClass.getDeclaredMethods()[0];

        // 4. 在方法前插入代码
        method.insertBefore("System.out.println(System.currentTimeMillis());");
        byte[] bytes = ctClass.toBytecode(); // 生成class字节码
        ctClass.toClass();//  动态加载到 ClassLoader，这个类没有被加载过才可以
        Files.write(new File(System.getProperty("user.dir") + "/target/hello.class").toPath(), bytes);

        new HelloWorld().hello("sex uncle");

    }

    @Test
    public void test2() throws Exception {
        ClassPool pool = new ClassPool();//1. 类池 ，会缓存类，可能导致内存溢出
        pool.appendSystemPath();// 系统路径
        CtClass ctClass = pool.get("coderead.bytecode.HelloWorld");// 加载字节码 解析成ctClass
        CtMethod method = ctClass.getDeclaredMethods()[0];
        method.insertBefore("System.out.println(System.currentTimeMillis());");
        method.insertAfter("System.out.println(System.currentTimeMillis());");
        method.insertAt(12, "System.out.println(\"12行\");");
        ctClass.toClass();//  动态加载到 ClassLoader，这个类没有被加载过才可以
        Files.write(new File(System.getProperty("user.dir") + "/target/hello.class").toPath(), ctClass.toBytecode());
        new HelloWorld().hello("sex uncle");
    }

    // 获取执行时间
    @Test
    public void test3() throws Exception {
        ClassPool pool = new ClassPool();//1. 类池 ，会缓存类，可能导致内存溢出
        pool.appendSystemPath();// 系统路径
        CtClass ctClass = pool.get("coderead.bytecode.HelloWorld");// 加载字节码 解析成ctClass
        CtMethod method = ctClass.getDeclaredMethods()[0];
        method.addLocalVariable("begin", CtClass.longType);
        method.insertBefore("begin = System.currentTimeMillis();");
        method.insertAfter(" long end = System.currentTimeMillis();\n" +
                "        System.out.println(end - begin);");
        ctClass.toClass();//  动态加载到 ClassLoader，这个类没有被加载过才可以
        Files.write(new File(System.getProperty("user.dir") + "/target/hello.class").toPath(), ctClass.toBytecode());
        new HelloWorld().hello("sex uncle");
    }

    // 添加try catch  不能添加finally
    @Test
    public void test4() throws Exception {
        ClassPool pool = new ClassPool();//1. 类池 ，会缓存类，可能导致内存溢出
        pool.appendSystemPath();// 系统路径
        CtClass ctClass = pool.get("coderead.bytecode.HelloWorld");// 加载字节码 解析成ctClass
        CtMethod method = ctClass.getDeclaredMethods()[0];
//        method.addLocalVariable("begin",CtClass.longType);
        method.addParameter(CtClass.longType);
        method.insertBefore("$2 = System.currentTimeMillis();");
        method.addCatch("$e.printStackTrace();" +
                        "long end = System.currentTimeMillis();\n" +
                        "System.out.println(end - $2);\n" +
                        " throw $e;",
                pool.get(Throwable.class.getName()));
        method.insertAfter(" long end = System.currentTimeMillis();\n" +
                "        System.out.println(end - $2);");
        ctClass.toClass();//  动态加载到 ClassLoader，这个类没有被加载过才可以
        Files.write(new File(System.getProperty("user.dir") + "/target/hello.class").toPath(), ctClass.toBytecode());
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.getClass()
                .getDeclaredMethods()[0].invoke(helloWorld, "sex", 0l);
    }

    // copy method
    @Test
    public void test5() throws Exception {
        ClassPool pool = new ClassPool();//1. 类池 ，会缓存类，可能导致内存溢出
        pool.appendSystemPath();// 系统路径
        CtClass ctClass = pool.get("coderead.bytecode.HelloWorld");// 加载字节码 解析成ctClass
        CtMethod method = ctClass.getDeclaredMethods()[1];

        //1. 拷贝新方法
        CtMethod newMethod = CtNewMethod.copy(method, ctClass, null);
        // 2.  改个名字
        newMethod.setName(method.getName() + "$agent");
        ctClass.addMethod(newMethod);
        // 3.添加 监控代码
        method.setBody(String.format("{long begin = System.currentTimeMillis();\n" +
                "        try{\n" +
                "           return ($r)%s$agent($$);\n" +
                "        }finally {\n" +
                "            System.out.println(System.currentTimeMillis()-begin);\n" +
                "        }}", method.getName()));

        ctClass.toClass();//  动态加载到 ClassLoader，这个类没有被加载过才可以
        Files.write(new File(System.getProperty("user.dir") + "/target/hello.class").toPath(), ctClass.toBytecode());
        new HelloWorld().hi("sex uncle", 1, true);


    }

    // 特殊语法-基本信息
    @Test
    public void test6() throws NotFoundException, CannotCompileException, InterruptedException {
        ClassPool pool = new ClassPool();
        pool.importPackage("java.util");
        pool.appendSystemPath();
        CtClass ctClass = pool.get("coderead.bytecode.HelloWorld");
        CtMethod method = ctClass.getDeclaredMethods()[0];
        method.insertAfter("System.out.println(\"this：\"+$0);\n" +
                "        System.out.println(\"参数1：\"+$1);\n" +
                "        System.out.println(\"参数数组：\"+$args);\n" +
                "        System.out.println(\"参数类型数组：\"+$sig);\n" +
                "        System.out.println(\"方法返回类型：\"+$type);\n" +
                "        System.out.println(\"当前类：\"+$class);");
        ctClass.toClass();
        new HelloWorld().hello("sex uncle");
    }

    //特殊语法 $r
    @Test
    public void test7() throws Exception {
        ClassPool pool = new ClassPool();
        pool.importPackage("java.util");
        pool.appendSystemPath();
        CtClass ctClass = pool.get("coderead.bytecode.HelloWorld");
        CtMethod method = ctClass.getDeclaredMethods()[0];
        method.insertAfter("return ($r)hi(\"sex uncle\",1,true);");
        ctClass.toClass();//  动态加载到 ClassLoader，这个类没有被加载过才可以
        Files.write(new File(System.getProperty("user.dir") + "/target/hello.class").toPath(), ctClass.toBytecode());
//        new HelloWorld().hi("sex uncle",1,true);
        new HelloWorld().hello("sex uncle");

    }

    //特殊语法 $_ 只能在 After中启作用
    @Test
    public void test8() throws Exception {
        ClassPool pool = new ClassPool();
        pool.importPackage("java.util");
        pool.appendSystemPath();
        CtClass ctClass = pool.get("coderead.bytecode.HelloWorld");
        CtMethod method = ctClass.getDeclaredMethods()[1];
//        method.setBody("{System.out.println($_);}");
        method.insertAfter("System.out.println($_);");
        method.insertAfter("$_=$_+\"is sexy\";");
        ctClass.toClass();//  动态加载到 ClassLoader，这个类没有被加载过才可以
        Files.write(new File(System.getProperty("user.dir") + "/target/hello.class").toPath(), ctClass.toBytecode());
        new HelloWorld().hi("sexy uncle", 1, true);
    }

    //添加一个全新的类 属性  方法  dubbo
    @Test
    public void test9() throws Exception {
        UserSrviceImpl target = new UserSrviceImpl();
        InvocationHandler invoker = InvokerBuild.makeInvoker(target);
        UserSrvice server = (UserSrvice) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{UserSrvice.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                try {
                    System.out.println("代理  前置逻辑");
                    return invoker.invoke(proxy, method, args);
                } finally {
                    System.out.println("代理  后置逻辑");
                }
            }
        });
        server.getName(11);
    }


    @Test
    public void test10() throws Exception {
        ClassPool pool = new ClassPool();
        pool.importPackage("java.util");
        pool.appendSystemPath();
        CtClass ctClass = pool.get("coderead.bytecode.HelloWorld");
        CtMethod method = ctClass.getDeclaredMethods()[0];
        method.instrument(new ExprEditor() {
            //
            @Override
            public void edit(MethodCall m) throws CannotCompileException {
                if (m.getMethodName().equals("println") &&
                        m.getClassName().equals("java.io.PrintStream") && m.getLineNumber() == 16) {
                    m.replace("$1=$1+\" is good man\"; $proceed($1);");
                }
            }
        });

        ctClass.toClass();//  动态加载到 ClassLoader，这个类没有被加载过才可以
        Files.write(new File(System.getProperty("user.dir") + "/target/hello.class").toPath(), ctClass.toBytecode());
        new HelloWorld().hello("sexy uncle");
    }

    @Test
    public void test11() throws Exception {
        ClassPool pool = new ClassPool();
        pool.importPackage("java.util");
        pool.appendSystemPath();
        CtClass ctClass = pool.get("coderead.bytecode.HelloWorld");
        CtMethod method = ctClass.getDeclaredMethods()[0];

        method.instrument(new ExprEditor() {
            @Override
            public void edit(MethodCall m) throws CannotCompileException {
                if (m.getMethodName().equals("hi")) {
                    m.replace(" System.out.println($1);\n" +
                            "                    System.out.println($2);\n" +
                            "                    System.out.println($3);\n" +
                            "$_=\"子木\";" +
                            "$_=hi$agent($$); ");
                }
            }
            // 代码覆盖率
        });

        ctClass.toClass();//  动态加载到 ClassLoader，这个类没有被加载过才可以
        Files.write(new File(System.getProperty("user.dir") + "/target/hello.class").toPath(), ctClass.toBytecode());
        new HelloWorld().hello("sexy uncle");
    }


}
