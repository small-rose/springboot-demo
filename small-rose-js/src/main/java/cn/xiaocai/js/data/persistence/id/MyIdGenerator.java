package cn.xiaocai.js.data.persistence.id;

import cn.xiaocai.js.data.config.IDService;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/7/30 23:50
 * @version: v1.0
 */
public class MyIdGenerator  implements IdentifierGenerator {


    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        return IDService.getNextId();
    }
}
