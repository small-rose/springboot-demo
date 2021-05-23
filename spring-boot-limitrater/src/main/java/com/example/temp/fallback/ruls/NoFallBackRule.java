package com.example.temp.fallback.ruls;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 降级时，不执行降级异常规则类
 * @author: 张小菜
 * @date: 2021/5/23 18:40
 * @version: v1.0
 */
public class NoFallBackRule extends FallBackRule{

    public NoFallBackRule(Class<?> clazz) {
        super(clazz);
    }

    public NoFallBackRule(String exceptionName) {
        super(exceptionName);
    }

    @Override
    public String toString() {
        return "No" + super.toString();
    }
}
