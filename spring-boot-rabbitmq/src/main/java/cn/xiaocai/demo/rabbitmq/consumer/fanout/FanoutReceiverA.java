package cn.xiaocai.demo.rabbitmq.consumer.fanout;

import cn.xiaocai.demo.rabbitmq.producer.config.exchange.fanout.FanoutRabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-04-30 14:50
 **/
@Component
@RabbitListener(queues = FanoutRabbitConfig.FANOUT_A)
public class FanoutReceiverA {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("FanoutReceiverA 消费者收到消息  : " +testMessage.toString());
    }
}
