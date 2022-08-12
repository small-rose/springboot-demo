package com.xiaocai.demo.mybatisplusbatch.injector;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import com.xiaocai.demo.mybatisplusbatch.batch.InsertBatchMethod;
import com.xiaocai.demo.mybatisplusbatch.batch.UpdateBatchMethod;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/4/26 15:55
 * @version: v1.0
 */
public class CustomizedSqlInjector  extends DefaultSqlInjector {
    /**
     * 如果只需增加方法，保留mybatis plus自带方法，
     * 可以先获取super.getMethodList()，再添加add
     */
    @Override
    public List<AbstractMethod> getMethodList(Class<?> mapperClass, TableInfo tableInfo) {
        List<AbstractMethod> methodList = super.getMethodList(mapperClass, tableInfo);
        methodList.add(new InsertBatchMethod(InsertBatchMethod.methodName));
        methodList.add(new UpdateBatchMethod(UpdateBatchMethod.methodName));
        return methodList;
    }
}
