package cn.xiaocai.demo.servlet.config;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springboot-servlet
 * @description  注册方式 二  : 直接使用 @ServletComponentScan 的方式扫描 @WebServlet 注解，[可指定路径]
 * @function:
 * @author: zzy
 * @create: 2021-05-11 17:30
 **/
@ServletComponentScan("cn.xiaocai.demo.servlet.scan")
@Configuration
public class ServletConfigSecond {


}
