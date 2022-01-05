package cn.xiaocia.demo.netty.bio;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ ServerDemo ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/7/26 12:29
 * @Version ： 1.0
 **/
@Slf4j
public class ServerDemo {
    //创建一个缓存线程池
    private static ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    public static void main(String[] args) throws IOException {
        //serverSocket
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(6666);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true){
            final Socket socket = serverSocket.accept();//等待客户端进来
            log.info("连接到一个线程");
            // 加载到线程池里
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        handler(socket);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private static void handler(Socket socket) throws IOException{
        // 接收数据
        byte[] bytes = new byte[1024];
        // 通过socket 获取输入流
        InputStream inputStream = null;
        int read = 0;
        try {
            inputStream = socket.getInputStream();
            read = inputStream.read(bytes);
            while (true){
                if(read != -1 ){
                    log.info("获取到客户端数据的数据"+new String(bytes,0,read) );
                }else{
                    break; // 退出
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
