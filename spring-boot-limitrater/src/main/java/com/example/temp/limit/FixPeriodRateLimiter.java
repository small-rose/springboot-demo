package com.example.temp.limit;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/20 22:59
 * @version: v1.0
 */
public class FixPeriodRateLimiter  implements IRateLimiter{



    @Override
    public boolean isOverLimit() {
        return false;
    }

    @Override
    public Long currentQps() {
        return null;
    }
}
