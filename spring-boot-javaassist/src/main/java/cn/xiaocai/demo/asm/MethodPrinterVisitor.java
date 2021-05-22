package cn.xiaocai.demo.asm;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/22 20:46
 * @version: v1.0
 */
public class MethodPrinterVisitor extends MethodVisitor {
    public MethodPrinterVisitor(int api) {
        super(Opcodes.ASM5);
    }

    @Override
    public void visitLocalVariable(String name, String desc, String signature, Label start, Label end, int index) {
        super.visitLocalVariable(name, desc, signature, start, end, index);
        System.out.println(" 局部变量："+name);
    }
}
