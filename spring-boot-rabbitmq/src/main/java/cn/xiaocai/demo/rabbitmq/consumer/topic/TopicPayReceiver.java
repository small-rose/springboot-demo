package cn.xiaocai.demo.rabbitmq.consumer.topic;

import cn.xiaocai.demo.rabbitmq.producer.config.exchange.topic.TopicRabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-04-30 13:49
 **/
@Component
@RabbitListener(queues = TopicRabbitConfig.man)
public class TopicPayReceiver {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("TopicPayReceiver 消费者收到消息  : " + testMessage.toString());
    }
}
