package cn.xiaocia.demo.netty.core.demo1;

import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.springframework.util.StringUtils;

import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ EchoServer ] 说明：Echo客户端
 * @Function :  功能说明：无
 * @Date ：2021/8/1 9:28
 * @Version ： 1.0
 **/
public class EchoClient {

    private final String host;
    private final int port;

    public EchoClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void start() throws Exception {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group).channel(NioSocketChannel.class)
                    .remoteAddress(new InetSocketAddress(host, port))
                    .handler(new ChannelInitializer<NioSocketChannel>() {
                        @Override
                        public void initChannel(NioSocketChannel ch)throws Exception {
                            ch.pipeline().addLast(new EchoClientHandler());
                        }
                    });
            ChannelFuture f = b.connect().sync();
            f.channel().closeFuture().sync();
        } finally {
            group.shutdownGracefully().sync();
        }
    }

    public static void main(String[] args) throws Exception {
        String  host = "127.0.0.1";
        int port = 6060;;
        if (args.length == 2) {
             host = args[0];
             port = Integer.parseInt(args[1]);
        }

        new EchoClient(host, port).start();
    }

}
