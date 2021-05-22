package cn.xiaocai.demo.asm;

import org.objectweb.asm.*;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/22 20:38
 * @version: v1.0
 */
public class ClassPrinterVisitor extends ClassVisitor {

    public ClassPrinterVisitor(int api) {
        super(Opcodes.ASM5); //版本
    }

    public ClassPrinterVisitor(int api, ClassVisitor cv) {
        super(api, cv);
    }


    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        super.visit(version, access, name, signature, superName, interfaces);
        System.out.println(" 类名 ： "+name);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        System.out.println(" 方法名称："+name);
        MethodVisitor nextVisitor = super.visitMethod(access, name, desc, signature, exceptions);
        return new MethodPrinterVisitor(Opcodes.ASM5, nextVisitor);

    }

    @Override
    public FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {
        System.out.println(" 属性 ： "+name);
        return super.visitField(access, name, desc, signature, value);
    }

    @Override
    public void visitEnd() {
        System.out.println(" end !!!");
        super.visitEnd();
    }

    static class MethodPrinterVisitor extends MethodVisitor {
        public MethodPrinterVisitor(int api, MethodVisitor methodVisitor) {
            super(api, methodVisitor);
        }

        @Override
        public void visitLocalVariable(String name, String desc, String signature, Label start, Label end, int index) {
            super.visitLocalVariable(name, desc, signature, start, end, index);

        }
    }
}
