package cn.xiaocai.demo.tkbase.annotation;

import java.lang.annotation.*;

/**
 * @author Xiaocai.Zhang
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface MyLog {


}
