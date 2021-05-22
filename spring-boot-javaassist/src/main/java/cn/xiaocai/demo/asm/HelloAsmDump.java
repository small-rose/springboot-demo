package cn.xiaocai.demo.asm;

import org.objectweb.asm.*;

public class HelloAsmDump implements Opcodes {

    public static byte[] dump () throws Exception {

        ClassWriter cw = new ClassWriter(0);
        FieldVisitor fv;
        MethodVisitor mv;
        AnnotationVisitor av0;

        cw.visit(52, ACC_PUBLIC + ACC_SUPER, "cn/xiaocai/demo/asm/HelloAsm", null, "java/lang/Object", null);

        cw.visitSource("HelloAsm.java", null);

        {
            fv = cw.visitField(ACC_PRIVATE, "name", "Ljava/lang/String;", null, null);
            fv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(10, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(12, l1);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitLdcInsn("hello world ");
            mv.visitFieldInsn(PUTFIELD, "cn/xiaocai/demo/asm/HelloAsm", "name", "Ljava/lang/String;");
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcn/xiaocai/demo/asm/HelloAsm;", null, l0, l2, 0);
            mv.visitMaxs(2, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
            mv.visitParameter("args", 0);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(15, l0);
            mv.visitLdcInsn(new Long(123L));
            mv.visitVarInsn(LSTORE, 1);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(17, l1);
            mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            mv.visitLdcInsn("hello asm");
            mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLineNumber(20, l2);
            mv.visitInsn(RETURN);
            Label l3 = new Label();
            mv.visitLabel(l3);
            mv.visitLocalVariable("args", "[Ljava/lang/String;", null, l0, l3, 0);
            mv.visitLocalVariable("abc", "J", null, l1, l3, 1);
            mv.visitMaxs(2, 3);
            mv.visitEnd();
        }
        cw.visitEnd();

        return cw.toByteArray();
    }
}

