package cn.xiaocai.demo.asm;

import org.objectweb.asm.ClassVisitor;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/22 21:02
 * @version: v1.0
 */
public class RenameClassVisitor extends ClassVisitor {
    public RenameClassVisitor(int api) {
        super(api);
    }

    public RenameClassVisitor(int api, ClassVisitor cv) {
        super(api, cv);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        super.visit(version, access, name+"$Proxy", signature, superName, interfaces);
    }

}
