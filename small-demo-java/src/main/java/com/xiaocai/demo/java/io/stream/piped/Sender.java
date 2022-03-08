package com.xiaocai.demo.java.io.stream.piped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ Sender ] 说明：无
 * @Function :  功能说明：  发送消息的线程.
 * @Date ：2022/3/8 10:59
 * @Version ： 1.0
 **/

public class Sender extends Thread {

    private static final Logger log = LoggerFactory.getLogger(Sender.class);

    /** 管道输出流对象,它和管道输入流(PipedInputStream)对象绑定.从而可以将数据发送给“管道输入流”. */
    private PipedOutputStream pipedOut;

    public Sender(PipedOutputStream pipedOut) {
        this.pipedOut = pipedOut;
    }

    public PipedOutputStream getPipedOut() {
        return pipedOut;
    }

    @Override
    public void run() {
        String strInfo = "Hello World!" ;
        try {
            pipedOut.write(strInfo.getBytes());
            pipedOut.close();
        } catch (IOException e) {
            log.error("向管道中写入数据出错!", e);
        }
    }

}