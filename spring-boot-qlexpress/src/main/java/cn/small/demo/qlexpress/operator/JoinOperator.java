package cn.small.demo.qlexpress.operator;

import com.ql.util.express.Operator;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ JoinOperator ] 说明：无
 * @Function :  功能说明： 自定义扩展操作符
 * @Date ：2022/11/4 14:45
 * @Version ： 1.0
 **/
public class JoinOperator  extends Operator {


    @Override
    public Object executeInner(Object[] list) throws Exception {
        java.util.List result = new java.util.ArrayList();
        Object opdata1 = list[0];
        if(opdata1 instanceof java.util.List){
            result.addAll((java.util.List)opdata1);
        }else{
            result.add(opdata1);
        }
        for(int i=1;i<list.length;i++){
            result.add(list[i]);
        }
        return result;
    }
}
