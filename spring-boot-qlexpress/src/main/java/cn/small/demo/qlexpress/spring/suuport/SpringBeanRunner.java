package cn.small.demo.qlexpress.spring.suuport;

import com.ql.util.express.ExpressRunner;
import com.ql.util.express.IExpressContext;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/11/4 23:25
 * @version: v1.0
 */
@Slf4j
@Service
public class SpringBeanRunner implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Getter
    private ExpressRunner runner;


    @Override
    public void setApplicationContext(ApplicationContext context) {
        this.applicationContext = context;
        runner = new ExpressRunner();
    }


    public Object executeExpress(String express, Map<String,Object> context)
    {
        IExpressContext<String,Object> expressContext = new QLExpressContext(context,this.applicationContext);
        try{
            //return runner.execute(express, expressContext, null, true, false);
            return runner.execute(express, expressContext, null, false, true);

        }catch(Exception e){
            log.error("qlExpress运行出错！",e);
        }
        return null;

    }

    public Object executeExpress(String express, Map<String,Object> context, List<String> errorList)
    {
        IExpressContext<String,Object> expressContext = new QLExpressContext(context,this.applicationContext);
        try{
            //return runner.execute(express, expressContext, errorList, true, false);
            return runner.execute(express, expressContext, errorList, false, true);
        }catch(Exception e){
            e.printStackTrace();
            log.error("qlExpress运行出错！",e);
        }
        return null;

    }
}
