package cn.xiaocai.demo.jsoup.mutisprider.handlers;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ BaseHandler ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/27 14:21
 * @Version ： 1.0
 **/
public abstract class BaseHandler {

    protected CatchHandler catchHandler = new  CatchHandler();
    static volatile boolean flag = true;
    //protected boolean OVER_FLAG = Boolean.FALSE ;

    public abstract void setInterrupted();
}
