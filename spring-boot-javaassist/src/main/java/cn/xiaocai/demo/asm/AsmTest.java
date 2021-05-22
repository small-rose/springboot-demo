package cn.xiaocai.demo.asm;


import org.junit.Test;
import org.objectweb.asm.*;
import org.objectweb.asm.util.ASMifier;
import org.objectweb.asm.util.TraceClassVisitor;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/22 20:36
 * @version: v1.0
 */
public class AsmTest {

    @Test
    public void classNameReadTest() throws IOException {
        ClassReader reader = new ClassReader("cn.xiaocai.demo.asm.HelloAsm");
        reader.accept(new ClassPrinterVisitor(1), 0);
    }

    @Test
    public void classNameWriteTest() throws IOException {
        // 读取 String 类
        ClassReader reader = new ClassReader("java.lang.String");
        //  重新写到新的位置
        ClassWriter writer = new ClassWriter(Opcodes.ASM5);
        reader.accept(writer, 0);
        byte[] bytes = writer.toByteArray();
        Files.write(new File(System.getProperty("user.dir")+"/target/String.class").toPath(), bytes);

    }

    @Test
    public void updateTest() throws IOException {
        // 读取
        ClassReader reader = new ClassReader("cn.xiaocai.demo.asm.HelloAsm");
        // 写
        ClassWriter writer = new ClassWriter(Opcodes.ASM5);
        //修改类名
        ClassVisitor updater = new RenameClassVisitor(Opcodes.ASM5, writer);
        // 打印
        ClassVisitor printer = new ClassPrinterVisitor(Opcodes.ASM5, updater);

        // 修改之后再次写到新的类 String$Proxy.class
        reader.accept(printer, 0);

        byte[] bytes = writer.toByteArray();
        Files.write(new File(System.getProperty("user.dir")+"/target/HelloAsm$Proxy.class").toPath(), bytes);
    }

    @Test
    public void traceTest() throws IOException {
        // 读取
        ClassReader reader = new ClassReader("cn.xiaocai.demo.asm.HelloAsm");
        ClassVisitor traceVisitor = new TraceClassVisitor(new PrintWriter(System.out));
        reader.accept(traceVisitor, 0);
    }

    @Test
    public void typeTest() throws IOException {
        System.out.println(Type.getDescriptor(String.class));
        System.out.println(Type.getDescriptor(int.class));
        System.out.println(Type.getDescriptor(long.class));
        System.out.println(Type.getDescriptor(boolean.class));
        System.out.println(Type.getDescriptor(char.class));
        System.out.println(Type.getDescriptor(byte.class));
        System.out.println(Type.getDescriptor(String[].class));
        System.out.println(Type.getDescriptor(Boolean[].class));
        System.out.println(Type.getDescriptor(AsmTest.class));
        System.out.println(Type.getDescriptor(Boolean[].class));
        System.out.println(Type.getMethodDescriptor(AsmTest.class.getDeclaredMethods()[1]));
    }

    @Test
    public void createClassTest() throws IOException {
        // 写
        ClassWriter writer = new ClassWriter(Opcodes.ASM5);
        writer.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC + Opcodes.ACC_ABSTRACT+ Opcodes.ACC_INTERFACE,
                "cn.xiaocai.demo.asm.HelloService", null,"java/lang/Object", new String[]{"java/lang/Runnable"});
        writer.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "userName", "Ljava/lang/String", "", "zhangsan");
        writer.visitEnd();

        byte[] bytes = writer.toByteArray();
        Files.write(new File(System.getProperty("user.dir")+"/target/HelloService.class").toPath(), bytes);
    }

    @Test
    public void asmIfierTest() throws IOException {
        ClassReader reader = new ClassReader("cn.xiaocai.demo.asm.HelloAsm");
        ASMifier asMifier = new ASMifier();
        ClassVisitor traceClassVisitor = new TraceClassVisitor( null, asMifier, new PrintWriter(System.out));
        reader.accept(traceClassVisitor, 0 );


    }

    @Test
    public void create2Test() throws Exception {
        byte[] bytes = HelloAsmDump.dump();
        Files.write(new File(System.getProperty("user.dir")+"/target/HelloAsm.class").toPath(), bytes);

    }
}
