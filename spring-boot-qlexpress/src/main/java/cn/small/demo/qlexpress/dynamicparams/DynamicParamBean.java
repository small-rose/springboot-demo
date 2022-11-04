package cn.small.demo.qlexpress.dynamicparams;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ DynamicParamBean ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/11/4 16:51
 * @Version ： 1.0
 **/
public class DynamicParamBean {


    //等价于getTemplate(Object[] params)
    public Object getTemplate(Object... params) throws Exception{
        String result = "";
        for(Object obj:params){
            result = result + obj + ",";
        }
        return result;
    }
}
