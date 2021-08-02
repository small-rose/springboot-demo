package cn.xiaocia.demo.netty.core.demo1;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ EchoServerHandler ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/8/1 9:22
 * @Version ： 1.0
 **/
public class EchoServerHandler extends ChannelInboundHandlerAdapter {

    /**
     * -对于每个传入的消息都要调用；可以将数据简单地回送给了远程节点。
     * @param ctx
     * @param msg
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        System.out.println("Server received: "+msg);
        ctx.write(msg);
    }

    /**
     * —通知ChannelInboundHandler最后一次对channelRead()的调用是当前批量读取中的最后一条消
     * @param ctx
     */
    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.writeAndFlush(Unpooled.EMPTY_BUFFER).addListener(ChannelFutureListener.CLOSE);
    }

    /**
     * —在读取操作期间，有异常抛出时会调用。
     * 允许对 Throwable 的任何子类型做出反应，在这里记录了异常并关闭了连接。
     * @param ctx
     * @param cause
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}
