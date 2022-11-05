package cn.small.demo.qlexpress.spring.engine;

import cn.small.demo.qlexpress.spring.suuport.SpringBeanRunner;
import com.ql.util.express.ExpressRunner;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ EngineFactory ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/11/5 11:38
 * @Version ： 1.0
 **/

@Component
public class EngineFactory implements InitializingBean {


    public static ExpressRunner expressRunner ;


    @Autowired
    private SpringBeanRunner springBeanRunner ;


    public Object executeExpress(String express, Map<String,Object> context){
        return springBeanRunner.executeExpress(express, context);
    }


    public Object executeExpress(String express, Map<String,Object> context, List<String> errorList) {
        return springBeanRunner.executeExpress(express, context, errorList);
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        expressRunner = springBeanRunner.getRunner() ;
    }
}
