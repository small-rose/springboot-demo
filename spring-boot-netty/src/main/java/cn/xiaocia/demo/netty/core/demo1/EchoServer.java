package cn.xiaocia.demo.netty.core.demo1;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ EchoServer ] 说明：Echo服务端
 * @Function :  功能说明：无
 * @Date ：2021/8/1 9:28
 * @Version ： 1.0
 **/
public class EchoServer {

    private final int port;

    public EchoServer(int port) {
        this.port=port;
    }

    public void start() throws Exception {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            //create ServerBootstrap instance
            ServerBootstrap boot = new ServerBootstrap();
            //Specifies NIO transport,local socket address
            //Adds handler to channel pipeline
            boot.group(group).channel(NioServerSocketChannel.class).localAddress(port)
                    .childHandler(new ChannelInitializer<Channel>() {
                        @Override
                        protected void initChannel(Channel ch) throws Exception {
                            ch.pipeline().addLast(new EchoServerHandler());
                        }
                    });
            //Binds server,waits for server to close,and release resources
            ChannelFuture f = boot.bind().sync();
            System.out.println(EchoServer.class.getName()+"started and listen on "+f.channel().localAddress());
            f.channel().closeFuture().sync();
        }
        finally {
            group.shutdownGracefully().sync();
        }
    }

    public static void main(String[] agrs) throws Exception {
        new EchoServer(6060).start();
    }

}
