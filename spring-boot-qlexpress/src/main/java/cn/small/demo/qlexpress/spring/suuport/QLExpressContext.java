package cn.small.demo.qlexpress.spring.suuport;

import com.ql.util.express.IExpressContext;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/11/4 23:22
 * @version: v1.0
 */
@Component
public class QLExpressContext extends HashMap<String,Object> implements IExpressContext<String,Object> {

    private ApplicationContext applicationContext;

    public QLExpressContext(Map<String,Object> aProperties, ApplicationContext applicationContext)
    {
        super(aProperties);
        this.applicationContext = applicationContext;
    }
    /**
     * 根据key从容器里面获取对象
     *
     * @param key
     * @return
     */
    @Override
    public Object get(Object key) {
        Object object = super.get(key);
        try {
            if (object == null && this.applicationContext != null
                    && this.applicationContext.containsBean((String)key))
            {
                object = this.applicationContext.getBean((String)key);
            }
        } catch (Exception e) {
            throw new RuntimeException("表达式容器获取对象失败", e);
        }
        return object;
    }
    /**
     * 把key-value放到容器里面去
     *
     * @param key
     * @param value
     */
    @Override
    public Object put(String key, Object value) {
        return super.put(key, value);
    }
}
