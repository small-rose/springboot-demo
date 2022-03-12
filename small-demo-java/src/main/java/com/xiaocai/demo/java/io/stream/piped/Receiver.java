package com.xiaocai.demo.java.io.stream.piped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ Receiver ] 说明：无
 * @Function :  功能说明：  接收消息的线程.
 * @Date ：2022/3/8 11:00
 * @Version ： 1.0
 **/
public class Receiver extends Thread {

    private static final Logger log = LoggerFactory.getLogger(Receiver.class);

    /** 管道输入流对象,它和管道输出流(PipedOutputStream)对象绑定.从而可以接收“管道输出流”的数据. */
    private PipedInputStream pipedIn;

    public Receiver(PipedInputStream pipedIn) {
        this.pipedIn = pipedIn;
    }

    public PipedInputStream getPipedIn() {
        return pipedIn;
    }

    @Override
    public void run() {
        byte[] buf = new byte[2048];
        try {
            int len = pipedIn.read(buf);
            log.info("{}", new String(buf, 0, len));
            pipedIn.close();
        } catch (IOException e) {
            log.error("从管道中读取数据出错!", e);
        }
    }

}
