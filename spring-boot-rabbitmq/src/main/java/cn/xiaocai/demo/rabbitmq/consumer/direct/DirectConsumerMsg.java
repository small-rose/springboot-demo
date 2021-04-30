package cn.xiaocai.demo.rabbitmq.consumer.direct;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @program: bp-paystation-client
 * @description
 * @function:    RabbitListener 监听队列名称
 * @author: zzy
 * @create: 2021-04-30 09:48
 **/
@Component
@RabbitListener(queues = "TestDirectQueue")
public class DirectConsumerMsg {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("DirectReceiver消费者收到消息  : " + testMessage.toString());
    }
}
