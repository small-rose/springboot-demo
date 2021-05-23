package com.example.temp.fallback.ruls;

import org.springframework.util.Assert;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 降级时，执行降级异常规则类
 * @author: 张小菜
 * @date: 2021/5/23 18:40
 * @version: v1.0
 */
public class FallBackRule {

    public static final FallBackRule FALLBACK_ON_RUNTIME_EXCEPTIONS =
            new FallBackRule(RuntimeException.class);

    private final String exceptionName;

    public FallBackRule(Class<?> clazz) {
        Assert.notNull(clazz, "'clazz' cannot be null");
        if (!Throwable.class.isAssignableFrom(clazz)) {
            throw new IllegalArgumentException(
                    "Cannot construct fallback rule from [" + clazz.getName() + "]: it's not a Throwable");
        }
        this.exceptionName = clazz.getName();
    }

    public FallBackRule(String exceptionName) {
        Assert.hasText(exceptionName, "'exceptionName' cannot be null or empty");
        this.exceptionName = exceptionName;
    }

    public String getExceptionName() {
        return this.exceptionName;
    }


    public int getDepth(Throwable ex) {
        return getDepth(ex.getClass(), 0);
    }


    private int getDepth(Class<?> exceptionClass, int depth) {
        if (exceptionClass.getName().contains(this.exceptionName)) {
            // Found it!
            return depth;
        }
        // If we've gone as far as we can go and haven't found it...
        if (exceptionClass == Throwable.class) {
            return -1;
        }
        return getDepth(exceptionClass.getSuperclass(), depth + 1);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FallBackRule)) {
            return false;
        }
        FallBackRule rhs = (FallBackRule) other;
        return this.exceptionName.equals(rhs.exceptionName);
    }

    @Override
    public int hashCode() {
        return this.exceptionName.hashCode();
    }

    @Override
    public String toString() {
        return "FallBackRule with pattern [" + this.exceptionName + "]";
    }


}
